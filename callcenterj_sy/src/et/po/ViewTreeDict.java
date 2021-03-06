package et.po;

/**
 * ViewTreeDict generated by MyEclipse Persistence Tools
 */

public class ViewTreeDict implements java.io.Serializable {

	// Fields

	private String id;

	private String type;

	private String operator;

	private String remark;

	// Constructors

	/** default constructor */
	public ViewTreeDict() {
	}

	/** minimal constructor */
	public ViewTreeDict(String id) {
		this.id = id;
	}

	/** full constructor */
	public ViewTreeDict(String id, String type, String operator, String remark) {
		this.id = id;
		this.type = type;
		this.operator = operator;
		this.remark = remark;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}