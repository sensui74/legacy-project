package et.po;

/**
 * OperAddress generated by MyEclipse Persistence Tools
 */

public class OperAddress implements java.io.Serializable {

	// Fields

	private Integer id;

	private String city;

	private String cityNum;

	private String sectionCounty;

	private String sectionCountyNum;

	private String villagesAndTowns;

	private String villagesAndTownsNum;

	private String communityVillage;

	private String communityVillageNum;

	private String postalcode;

	// Constructors

	/** default constructor */
	public OperAddress() {
	}

	/** minimal constructor */
	public OperAddress(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public OperAddress(Integer id, String city, String cityNum,
			String sectionCounty, String sectionCountyNum,
			String villagesAndTowns, String villagesAndTownsNum,
			String communityVillage, String communityVillageNum,
			String postalcode) {
		this.id = id;
		this.city = city;
		this.cityNum = cityNum;
		this.sectionCounty = sectionCounty;
		this.sectionCountyNum = sectionCountyNum;
		this.villagesAndTowns = villagesAndTowns;
		this.villagesAndTownsNum = villagesAndTownsNum;
		this.communityVillage = communityVillage;
		this.communityVillageNum = communityVillageNum;
		this.postalcode = postalcode;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCityNum() {
		return this.cityNum;
	}

	public void setCityNum(String cityNum) {
		this.cityNum = cityNum;
	}

	public String getSectionCounty() {
		return this.sectionCounty;
	}

	public void setSectionCounty(String sectionCounty) {
		this.sectionCounty = sectionCounty;
	}

	public String getSectionCountyNum() {
		return this.sectionCountyNum;
	}

	public void setSectionCountyNum(String sectionCountyNum) {
		this.sectionCountyNum = sectionCountyNum;
	}

	public String getVillagesAndTowns() {
		return this.villagesAndTowns;
	}

	public void setVillagesAndTowns(String villagesAndTowns) {
		this.villagesAndTowns = villagesAndTowns;
	}

	public String getVillagesAndTownsNum() {
		return this.villagesAndTownsNum;
	}

	public void setVillagesAndTownsNum(String villagesAndTownsNum) {
		this.villagesAndTownsNum = villagesAndTownsNum;
	}

	public String getCommunityVillage() {
		return this.communityVillage;
	}

	public void setCommunityVillage(String communityVillage) {
		this.communityVillage = communityVillage;
	}

	public String getCommunityVillageNum() {
		return this.communityVillageNum;
	}

	public void setCommunityVillageNum(String communityVillageNum) {
		this.communityVillageNum = communityVillageNum;
	}

	public String getPostalcode() {
		return this.postalcode;
	}

	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}

}