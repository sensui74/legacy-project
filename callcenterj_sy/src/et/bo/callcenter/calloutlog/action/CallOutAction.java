/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package et.bo.callcenter.calloutlog.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import et.bo.callcenter.calloutlog.service.CallOutService;
import excellence.common.page.PageInfo;
import excellence.common.page.PageTurning;
import excellence.framework.base.action.BaseAction;
import excellence.framework.base.dto.IBaseDTO;
import excellence.framework.base.dto.impl.DynaActionFormDTO;

/**
 * MyEclipse Struts Creation date: 06-24-2008
 * 
 * XDoclet definition:
 * 
 * @struts.action path="/callcenter/cclog/telQuery" name="TelForm"
 *                scope="request" validate="true"
 */
public class CallOutAction extends BaseAction {
	/*
	 * Generated Methods
	 */
	private CallOutService calloutService = null;
	

	/**
	 * Method execute
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward toCallOutList(ActionMapping map, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		DynaActionFormDTO formdto = (DynaActionFormDTO) form;
		String calloutType = formdto.get("calloutType").toString();
		
		String pageState = null;
		PageInfo pageInfo = null;
		pageState = (String) request.getParameter("pagestate");
		if (pageState == null) {
			pageInfo = new PageInfo();
		} else {
			PageTurning pageTurning = (PageTurning) request.getSession()
					.getAttribute("telQueryPageTurning");
			pageInfo = pageTurning.getPage();
			pageInfo.setState(pageState);
			formdto = (DynaActionFormDTO) pageInfo.getQl();
		}
		pageInfo.setPageSize(5);
		List list = new ArrayList();
		try {
			list = calloutService.telQuery(formdto, pageInfo);
			// list = telQueryService.getTel(formdto, pageInfo,pageState);
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
		int size = calloutService.getSize();
		// System.out.println(size);
		pageInfo.setRowCount(size);
		pageInfo.setQl(formdto);
		request.setAttribute("list", list);
		PageTurning pt = new PageTurning(pageInfo, "/cc_police_heb/", map,
				request);
		request.getSession().setAttribute("telQueryPageTurning", pt);
		
		if("voice".equals(calloutType)){
			request.setAttribute("ctType", "voice");
		} else{
			request.setAttribute("ctType", "message");
		}
		
		return map.findForward("list");
	}

	public ActionForward toCallOutQuery(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		DynaActionFormDTO TelForm = (DynaActionFormDTO) form;
//		List user = calloutService
//				.userQuery("select user_id from sys_user where group_id = 'SYS_GROUP_0000000001' or group_id = 'SYS_GROUP_0000000141'");
//		request.setAttribute("user", user);
		return mapping.findForward("query");
	}

	public ActionForward toCallOutMain(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		DynaActionFormDTO TelForm = (DynaActionFormDTO) form;

		return mapping.findForward("main");
	}

	public ActionForward toCallOutLoad(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		DynaActionFormDTO formdto = (DynaActionFormDTO) form;
		String id = request.getParameter("id");
		
		IBaseDTO dto = calloutService.getInfo(id);
		if("������Ŀ".equals(dto.get("calloutType").toString()))
			request.setAttribute("ctType", "voice");
		else
			request.setAttribute("ctType", "message");
		
		request.setAttribute(mapping.getName(), dto);
		return mapping.findForward("load");
	}

	public CallOutService getCalloutService() {
		return calloutService;
	}

	public void setCalloutService(CallOutService calloutService) {
		this.calloutService = calloutService;
	}

	
}