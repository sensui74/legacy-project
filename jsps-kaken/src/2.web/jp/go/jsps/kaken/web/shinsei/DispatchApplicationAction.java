/*======================================================================
 *    SYSTEM      : 
 *    Source name : 
 *    Description : 
 *
 *    Author      : takano
 *    Date        : 2004/01/09
 *
 *    Revision history
 *    Date          Revision    Author         Description
 *
 *====================================================================== 
 */
package jp.go.jsps.kaken.web.shinsei;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.go.jsps.kaken.model.exceptions.ApplicationException;
import jp.go.jsps.kaken.web.common.UserContainer;
import jp.go.jsps.kaken.web.struts.BaseAction;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 * �\�������͉�ʐU�蕪���A�N�V�����N���X�B
 * �t�H�[���ɃZ�b�g����Ă���l����ʁi���ƃR�[�h���Q�P�^�j�œ]������B
 * 
 * ID RCSfile="$RCSfile: DispatchApplicationAction.java,v $"
 * Revision="$Revision: 1.5 $"
 * Date="$Date: 2007/07/20 09:39:32 $"
 */
public class DispatchApplicationAction extends BaseAction {

	/* (�� Javadoc)
	 * @see jp.go.jsps.kaken.web.struts.BaseAction#doMainProcessing(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, jp.go.jsps.kaken.web.common.UserContainer)
	 */
	public ActionForward doMainProcessing(
		ActionMapping mapping,
		ActionForm form,
		HttpServletRequest request,
		HttpServletResponse response,
		UserContainer container)
		throws ApplicationException {
			
		//-----ActionErrors�̐錾�i��^�����j-----
		ActionErrors errors = new ActionErrors();
		
		//-----�\�������̓t�H�[���̎擾
		ShinseiForm shinseiForm = (ShinseiForm)form;
		
		//-----��ʑJ�ځi��^�����j-----
		if (!errors.isEmpty()) {
			saveErrors(request, errors);
			return forwardFailure(mapping);
		}
		
		//�l����ʁi���ƃR�[�h�̈ꕔ�j���Ƃɓ]�����ύX
		//return mapping.findForward(shinseiForm.getYoshikiShubetu());
		
		//���ƃR�[�h���Ƃɓ]�����ύX
		return mapping.findForward(shinseiForm.getShinseiDataInfo().getJigyoCd());
	}
}