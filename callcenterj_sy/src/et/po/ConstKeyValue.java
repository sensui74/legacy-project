package et.po;

import java.util.Date;

/**
 * ConstKeyValue generated by MyEclipse Persistence Tools
 */

public class ConstKeyValue implements java.io.Serializable {

	// Fields

	private Integer id;

	private String type;

	private String constKey;

	private String constValue;

	private Date addtime;

	private String deleteMark;

	private String remark;

	// Constructors

	/** default constructor */
	public ConstKeyValue() {
	}

	/** full constructor */
	public ConstKeyValue(String type, String constKey, String constValue,
			Date addtime, String deleteMark, String remark) {
		this.type = type;
		this.constKey = constKey;
		this.constValue = constValue;
		this.addtime = addtime;
		this.deleteMark = deleteMark;
		this.remark = remark;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getConstKey() {
		return this.constKey;
	}

	public void setConstKey(String constKey) {
		this.constKey = constKey;
	}

	public String getConstValue() {
		return this.constValue;
	}

	public void setConstValue(String constValue) {
		this.constValue = constValue;
	}

	public Date getAddtime() {
		return this.addtime;
	}

	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public String getDeleteMark() {
		return this.deleteMark;
	}

	public void setDeleteMark(String deleteMark) {
		this.deleteMark = deleteMark;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}