package et.po;

import java.util.Date;

/**
 * GroupEgressive generated by MyEclipse Persistence Tools
 */

public class GroupEgressive implements java.io.Serializable {

	// Fields

	private Integer id;

	private CcMain ccMain;

	private String port;

	private Date begintime;

	private Date endtime;

	private String keeptime;

	private String ivrTreeInfoId;

	private String menuType;

	private String deleteMark;

	private String telnum;

	private String filepath;

	private String context;

	// Constructors

	/** default constructor */
	public GroupEgressive() {
	}

	/** full constructor */
	public GroupEgressive(CcMain ccMain, String port, Date begintime,
			Date endtime, String keeptime, String ivrTreeInfoId,
			String menuType, String deleteMark, String telnum, String filepath,
			String context) {
		this.ccMain = ccMain;
		this.port = port;
		this.begintime = begintime;
		this.endtime = endtime;
		this.keeptime = keeptime;
		this.ivrTreeInfoId = ivrTreeInfoId;
		this.menuType = menuType;
		this.deleteMark = deleteMark;
		this.telnum = telnum;
		this.filepath = filepath;
		this.context = context;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public CcMain getCcMain() {
		return this.ccMain;
	}

	public void setCcMain(CcMain ccMain) {
		this.ccMain = ccMain;
	}

	public String getPort() {
		return this.port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public Date getBegintime() {
		return this.begintime;
	}

	public void setBegintime(Date begintime) {
		this.begintime = begintime;
	}

	public Date getEndtime() {
		return this.endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	public String getKeeptime() {
		return this.keeptime;
	}

	public void setKeeptime(String keeptime) {
		this.keeptime = keeptime;
	}

	public String getIvrTreeInfoId() {
		return this.ivrTreeInfoId;
	}

	public void setIvrTreeInfoId(String ivrTreeInfoId) {
		this.ivrTreeInfoId = ivrTreeInfoId;
	}

	public String getMenuType() {
		return this.menuType;
	}

	public void setMenuType(String menuType) {
		this.menuType = menuType;
	}

	public String getDeleteMark() {
		return this.deleteMark;
	}

	public void setDeleteMark(String deleteMark) {
		this.deleteMark = deleteMark;
	}

	public String getTelnum() {
		return this.telnum;
	}

	public void setTelnum(String telnum) {
		this.telnum = telnum;
	}

	public String getFilepath() {
		return this.filepath;
	}

	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}

	public String getContext() {
		return this.context;
	}

	public void setContext(String context) {
		this.context = context;
	}

}