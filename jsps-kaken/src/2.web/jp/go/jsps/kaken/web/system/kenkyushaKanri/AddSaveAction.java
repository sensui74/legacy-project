/*
 * Created on 2005/04/15
 */
package jp.go.jsps.kaken.web.system.kenkyushaKanri;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.go.jsps.kaken.model.ISystemServise;
import jp.go.jsps.kaken.model.common.IServiceName;
import jp.go.jsps.kaken.model.exceptions.ApplicationException;
import jp.go.jsps.kaken.model.vo.KenkyushaInfo;
import jp.go.jsps.kaken.web.common.IConstants;
import jp.go.jsps.kaken.web.common.UserContainer;
import jp.go.jsps.kaken.web.struts.BaseAction;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 * �����ғo�^���l�I�u�W�F�N�g��o�^����B
 * �t�H�[�����A�o�^�����N���A����B
 */
public class AddSaveAction extends BaseAction {

	public ActionForward doMainProcessing(
		ActionMapping mapping,
		ActionForm form,
		HttpServletRequest request,
		HttpServletResponse response,
		UserContainer container)
		throws ApplicationException {

		//-----ActionErrors�̐錾�i��^�����j-----
		ActionErrors errors = new ActionErrors();

		//------�L�����Z����		
		if (isCancelled(request)) {
			return forwardCancel(mapping);
		}

		//-----�擾�����g�[�N���������ł���Ƃ�
		if (!isTokenValid(request)) {
			errors.add(ActionErrors.GLOBAL_ERROR,
					   new ActionError("error.transaction.token"));
			saveErrors(request, errors);
			return forwardTokenError(mapping);
		}
		
		//------�Z�b�V�������V�K�o�^���̎擾
		KenkyushaInfo addInfo = container.getKenkyushaInfo();

		//DB�o�^
		ISystemServise servise = getSystemServise(
						IServiceName.KENKYUSHA_MAINTENANCE_SERVICE);
		servise.insert(container.getUserInfo(), addInfo);
		
		if(log.isDebugEnabled()){
			log.debug("�����ҏ��@�o�^��� '"+ request);
		}

		//�o�^���ʂ����N�G�X�g�����ɃZ�b�g���o�^�����p�X���[�h��񓙂�\�����邽�߁B
		request.setAttribute(IConstants.RESULT_INFO, addInfo);

		//------�g�[�N���̍폜	
		resetToken(request);
		//------�Z�b�V�������V�K�o�^���̍폜
		container.setKenkyushaInfo(null);
		//------�t�H�[�����̍폜
		removeFormBean(mapping,request);

		return forwardSuccess(mapping);
	}

}