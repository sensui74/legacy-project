package et.po;

import java.sql.Blob;
import java.util.Date;

/**
 * OperYznztj generated by MyEclipse Persistence Tools
 */

public class OperYznztj implements java.io.Serializable {

	// Fields

	private Integer id;

	private Blob photo;

	private String sort;

	private String productName;

	private String trait;

	private String scope;

	private String method;

	private Date addTime;

	private String addMan;

	// Constructors

	/** default constructor */
	public OperYznztj() {
	}

	/** full constructor */
	public OperYznztj(Blob photo, String sort, String productName,
			String trait, String scope, String method, Date addTime,
			String addMan) {
		this.photo = photo;
		this.sort = sort;
		this.productName = productName;
		this.trait = trait;
		this.scope = scope;
		this.method = method;
		this.addTime = addTime;
		this.addMan = addMan;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Blob getPhoto() {
		return this.photo;
	}

	public void setPhoto(Blob photo) {
		this.photo = photo;
	}

	public String getSort() {
		return this.sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getTrait() {
		return this.trait;
	}

	public void setTrait(String trait) {
		this.trait = trait;
	}

	public String getScope() {
		return this.scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getMethod() {
		return this.method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public Date getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	public String getAddMan() {
		return this.addMan;
	}

	public void setAddMan(String addMan) {
		this.addMan = addMan;
	}

}