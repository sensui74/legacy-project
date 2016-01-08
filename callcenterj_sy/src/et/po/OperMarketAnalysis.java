package et.po;

import java.util.Date;

/**
 * OperMarketAnalysis generated by MyEclipse Persistence Tools
 */

public class OperMarketAnalysis implements java.io.Serializable {

	// Fields

	private String id;

	private String typeTitle;

	private String subTitle;

	private String marketOverview;

	private String priceLeaderbord;

	private String quotesAnalysis;

	private String investorsOutlook;

	private String remark;

	private String analysisPerson;
	
	private String analysisPersonInfo;

	private Date addTime;

	private String addPerson;

	// Constructors

	/** default constructor */
	public OperMarketAnalysis() {
	}

	/** minimal constructor */
	public OperMarketAnalysis(String id) {
		this.id = id;
	}

	/** full constructor */
	public OperMarketAnalysis(String id, String typeTitle, String subTitle,
			String marketOverview, String priceLeaderbord,
			String quotesAnalysis, String investorsOutlook, String remark,
			String analysisPerson, String analysisPersonInfo, Date addTime, String addPerson) {
		this.id = id;
		this.typeTitle = typeTitle;
		this.subTitle = subTitle;
		this.marketOverview = marketOverview;
		this.priceLeaderbord = priceLeaderbord;
		this.quotesAnalysis = quotesAnalysis;
		this.investorsOutlook = investorsOutlook;
		this.remark = remark;
		this.analysisPerson = analysisPerson;
		this.analysisPersonInfo = analysisPersonInfo;
		this.addTime = addTime;
		this.addPerson = addPerson;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTypeTitle() {
		return this.typeTitle;
	}

	public void setTypeTitle(String typeTitle) {
		this.typeTitle = typeTitle;
	}

	public String getSubTitle() {
		return this.subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public String getMarketOverview() {
		return this.marketOverview;
	}

	public void setMarketOverview(String marketOverview) {
		this.marketOverview = marketOverview;
	}

	public String getPriceLeaderbord() {
		return this.priceLeaderbord;
	}

	public void setPriceLeaderbord(String priceLeaderbord) {
		this.priceLeaderbord = priceLeaderbord;
	}

	public String getQuotesAnalysis() {
		return this.quotesAnalysis;
	}

	public void setQuotesAnalysis(String quotesAnalysis) {
		this.quotesAnalysis = quotesAnalysis;
	}

	public String getInvestorsOutlook() {
		return this.investorsOutlook;
	}

	public void setInvestorsOutlook(String investorsOutlook) {
		this.investorsOutlook = investorsOutlook;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getAnalysisPerson() {
		return this.analysisPerson;
	}

	public void setAnalysisPerson(String analysisPerson) {
		this.analysisPerson = analysisPerson;
	}

	public Date getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	public String getAddPerson() {
		return this.addPerson;
	}

	public void setAddPerson(String addPerson) {
		this.addPerson = addPerson;
	}

	public String getAnalysisPersonInfo() {
		return analysisPersonInfo;
	}

	public void setAnalysisPersonInfo(String analysisPersonInfo) {
		this.analysisPersonInfo = analysisPersonInfo;
	}

}