/*
 * Created on 2005/04/14
 *
 */
package jp.go.jsps.kaken.web.bukyoku.bukyokuKanri;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.go.jsps.kaken.model.common.IServiceName;
import jp.go.jsps.kaken.model.exceptions.ApplicationException;
import jp.go.jsps.kaken.model.vo.BukyokutantoInfo;
import jp.go.jsps.kaken.web.common.UserContainer;
import jp.go.jsps.kaken.web.struts.BaseAction;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 * 登録済み部局担当者情報取得アクション
 * 
 * @author masuo_t
 *
 */
public class BukyokuKanriAction extends BaseAction {

	public ActionForward doMainProcessing(
		ActionMapping mapping,
		ActionForm form,
		HttpServletRequest request,
		HttpServletResponse response,
		UserContainer container)
		throws ApplicationException {

		//部局担当者ID取得	
		BukyokutantoInfo info = new BukyokutantoInfo();
		info.setBukyokutantoId(container.getUserInfo().getBukyokutantoInfo().getBukyokutantoId());	
		
		//部局担当者情報を取得する
		info =
			getSystemServise(
			IServiceName.BUKYOKUTANTO_MAINTENANCE_SERVICE).selectBukyokuData(
			container.getUserInfo(),
			info);
		
		//部局担当者情報をセッションに登録。
		container.setBukyokutantoInfo(info);
		
		return forwardSuccess(mapping);
	}

}
