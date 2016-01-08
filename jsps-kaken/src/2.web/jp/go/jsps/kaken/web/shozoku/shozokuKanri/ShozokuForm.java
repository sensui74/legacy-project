/*======================================================================
 *    SYSTEM      : 
 *    Source name : 
 *    Description : 
 *
 *    Author      : Admin
 *    Date        : 2003/11/14
 *
 *    Revision history
 *    Date          Revision    Author         Description
 *
 *====================================================================== 
 */
package jp.go.jsps.kaken.web.shozoku.shozokuKanri;

import javax.servlet.http.HttpServletRequest;

import jp.go.jsps.kaken.web.struts.BaseValidatorForm;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;

/**
 * ID RCSfile="$RCSfile: ShozokuForm.java,v $"
 * Revision="$Revision: 1.1 $"
 * Date="$Date: 2007/06/28 02:07:46 $"
 */
public class ShozokuForm extends BaseValidatorForm {

	//---------------------------------------------------------------------
	// Instance data
	//---------------------------------------------------------------------
	
	/** �����@�֒S����ID */
	private String shozokuTantoId;
	
	/** �@�֎�ʃR�[�h */
	private String shubetuCd;

	/** �����@�փR�[�h */
	private String shozokuCd;
	
	/** �����@�֖�(�a��) */
	private String shozokuName;

	/** �����@�֖�(�p��) */
	private String shozokuNameEigo;

	/** �p�X���[�h */
	private String password;

	/** �ӔC�ҁi���j */
	private String sekininshaNameSei;

	/** �ӔC�ҁi���j */
	private String sekininshaNameMei;

	/** �ӔC�Җ�E */
	private String sekininshaYaku;

	/** �ӔC�ғd�b�ԍ� */
	private String sekininshaTel;

	/** �S�����ǖ� */
	private String bukyokuName;

	/** �S���ۖ� */
	private String kaName;

	/** �S���W�� */
	private String kakariName;

	/** �S���Ҏ����i���j */
	private String tantoNameSei;

	/** �S���Ҏ����i���j */
	private String tantoNameMei;

	/** �S���ғd�b�ԍ� */
	private String tantoTel;

	/** �S����FAX�ԍ� */
	private String tantoFax;
	
	/** Email�A�h���X */
	private String tantoEmail;

	/** Email�A�h���X2 */
	private String tantoEmail2;

	/** �S���җX�֔ԍ� */
	private String tantoZip;

	/** �S���ҏZ�� */
	private String tantoAddress;

	/** ���l */
	private String biko;

	/** �L������(�N) */
	private String yukoDateYear;

	/** �L������(��) */
	private String yukoDateMonth;

	/** �L������(��) */
	private String yukoDateDay;

	//�E�E�E�E�E�E�E�E�E�E

	//---------------------------------------------------------------------
	// Constructors
	//---------------------------------------------------------------------

	/**
	 * �R���X�g���N�^�B
	 */
	public ShozokuForm() {
		super();
		init();
	}

	//---------------------------------------------------------------------
	// Public methods
	//---------------------------------------------------------------------

	/* 
	 * �����������B
	 * (�� Javadoc)
	 * @see org.apache.struts.action.ActionForm#reset(org.apache.struts.action.ActionMapping, javax.servlet.http.HttpServletRequest)
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		super.reset(mapping, request);
		//�E�E�E
	}

	/**
	 * ����������
	 */
	public void init() {
		shozokuTantoId = "";
		shubetuCd ="";
		shozokuCd = "";
		shozokuName = "";
		shozokuNameEigo = "";
		password = "";
		sekininshaNameSei = "";
		sekininshaNameMei = "";
		sekininshaYaku = "";
		sekininshaTel = "";
		bukyokuName = "";
		kaName = "";
		kakariName = "";
		tantoNameSei = "";
		tantoNameMei = "";
		tantoTel = "";
		tantoFax = "";
		tantoEmail = "";
		tantoEmail2 = "";
		tantoZip = "";
		tantoAddress = "";
		biko = "";
		yukoDateYear = "";
		yukoDateMonth = "";
		yukoDateDay = "";
	}

	/* 
	 * ���̓`�F�b�N�B
	 * (�� Javadoc)
	 * @see org.apache.struts.action.ActionForm#validate(org.apache.struts.action.ActionMapping, javax.servlet.http.HttpServletRequest)
	 */
	public ActionErrors validate(
		ActionMapping mapping,
		HttpServletRequest request) {

		//��^����----- 
		ActionErrors errors = super.validate(mapping, request);

		//---------------------------------------------
		// ��{�I�ȃ`�F�b�N(�K�{�A�`�����j��Validator���g�p����B
		//---------------------------------------------

		//��{���̓`�F�b�N�����܂�
		if (!errors.isEmpty()) {
			return errors;
		}

		//��^����----- 

		//�ǉ�����----- 

		//---------------------------------------------
		//�g�ݍ��킹�`�F�b�N	
		//---------------------------------------------

		return errors;
	}

	//---------------------------------------------------------------------
	// Properties
	//---------------------------------------------------------------------
	/**
	 * @return
	 */
	public String getBiko() {
		return biko;
	}

	/**
	 * @return
	 */
	public String getBukyokuName() {
		return bukyokuName;
	}

	/**
	 * @return
	 */
	public String getTantoEmail() {
		return tantoEmail;
	}

	/**
	 * @return
	 */
	public String getKakariName() {
		return kakariName;
	}

	/**
	 * @return
	 */
	public String getKaName() {
		return kaName;
	}

	/**
	 * @return
	 */
	public String getShozokuTantoId() {
		return shozokuTantoId;
	}

	/**
	 * @return
	 */
	public String getTantoNameSei() {
		return tantoNameSei;
	}

	/**
	 * @return
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @return
	 */
	public String getSekininshaNameSei() {
		return sekininshaNameSei;
	}

	/**
	 * @return
	 */
	public String getSekininshaTel() {
		return sekininshaTel;
	}

	/**
	 * @return
	 */
	public String getSekininshaYaku() {
		return sekininshaYaku;
	}

	/**
	 * @return
	 */
	public String getShozokuCd() {
		return shozokuCd;
	}

	/**
	 * @return
	 */
	public String getShozokuName() {
		return shozokuName;
	}

	/**
	 * @return
	 */
	public String getTantoAddress() {
		return tantoAddress;
	}

	/**
	 * @return
	 */
	public String getTantoFax() {
		return tantoFax;
	}

	/**
	 * @return
	 */
	public String getTantoTel() {
		return tantoTel;
	}

	/**
	 * @return
	 */
	public String getYukoDateDay() {
		return yukoDateDay;
	}

	/**
	 * @return
	 */
	public String getYukoDateMonth() {
		return yukoDateMonth;
	}

	/**
	 * @return
	 */
	public String getYukoDateYear() {
		return yukoDateYear;
	}

	/**
	 * @param string
	 */
	public void setBiko(String string) {
		biko = string;
	}

	/**
	 * @param string
	 */
	public void setBukyokuName(String string) {
		bukyokuName = string;
	}

	/**
	 * @param string
	 */
	public void setTantoEmail(String string) {
		tantoEmail = string;
	}

	/**
	 * @param string
	 */
	public void setKakariName(String string) {
		kakariName = string;
	}

	/**
	 * @param string
	 */
	public void setKaName(String string) {
		kaName = string;
	}

	/**
	 * @param string
	 */
	public void setShozokuTantoId(String string) {
		shozokuTantoId = string;
	}

	/**
	 * @param string
	 */
	public void setTantoNameSei(String string) {
		tantoNameSei = string;
	}

	/**
	 * @param string
	 */
	public void setPassword(String string) {
		password = string;
	}

	/**
	 * @param string
	 */
	public void setSekininshaNameSei(String string) {
		sekininshaNameSei = string;
	}

	/**
	 * @param string
	 */
	public void setSekininshaTel(String string) {
		sekininshaTel = string;
	}

	/**
	 * @param string
	 */
	public void setSekininshaYaku(String string) {
		sekininshaYaku = string;
	}

	/**
	 * @param string
	 */
	public void setShozokuCd(String string) {
		shozokuCd = string;
	}

	/**
	 * @param string
	 */
	public void setShozokuName(String string) {
		shozokuName = string;
	}

	/**
	 * @param string
	 */
	public void setTantoAddress(String string) {
		tantoAddress = string;
	}

	/**
	 * @param string
	 */
	public void setTantoFax(String string) {
		tantoFax = string;
	}

	/**
	 * @param string
	 */
	public void setTantoTel(String string) {
		tantoTel = string;
	}

	/**
	 * @param string
	 */
	public void setYukoDateDay(String string) {
		yukoDateDay = string;
	}

	/**
	 * @param string
	 */
	public void setYukoDateMonth(String string) {
		yukoDateMonth = string;
	}

	/**
	 * @param string
	 */
	public void setYukoDateYear(String string) {
		yukoDateYear = string;
	}

	/**
	 * @return
	 */
	public String getSekininshaNameMei() {
		return sekininshaNameMei;
	}

	/**
	 * @return
	 */
	public String getShozokuNameEigo() {
		return shozokuNameEigo;
	}

	/**
	 * @return
	 */
	public String getTantoNameMei() {
		return tantoNameMei;
	}

	/**
	 * @return
	 */
	public String getTantoZip() {
		return tantoZip;
	}

	/**
	 * @param string
	 */
	public void setSekininshaNameMei(String string) {
		sekininshaNameMei = string;
	}

	/**
	 * @param string
	 */
	public void setShozokuNameEigo(String string) {
		shozokuNameEigo = string;
	}

	/**
	 * @param string
	 */
	public void setTantoNameMei(String string) {
		tantoNameMei = string;
	}

	/**
	 * @param string
	 */
	public void setTantoZip(String string) {
		tantoZip = string;
	}


	/**
	 * @return
	 */
	public String getShubetuCd() {
		return shubetuCd;
	}

	/**
	 * @param string
	 */
	public void setShubetuCd(String string) {
		shubetuCd = string;
	}

	/**
	 * @return
	 */
	public String getTantoEmail2() {
		return tantoEmail2;
	}

	/**
	 * @param string
	 */
	public void setTantoEmail2(String string) {
		tantoEmail2 = string;
	}

}