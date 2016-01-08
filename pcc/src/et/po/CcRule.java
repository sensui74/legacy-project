package et.po;

import java.util.Date;


/**
 * CcRule generated by MyEclipse - Hibernate Tools
 */

public class CcRule  implements java.io.Serializable {


    // Fields    

     private String id;
     private String ruleAct;
     private String tagMark;
     private String tagType;
     private String msgFormat;
     private String argNum;
     private Date createTime;
     private String ver;
     private String tagFreeze;
     private String remark;


    // Constructors

    /** default constructor */
    public CcRule() {
    }

	/** minimal constructor */
    public CcRule(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public CcRule(String id, String ruleAct, String tagMark, String tagType, String msgFormat, String argNum, Date createTime, String ver, String tagFreeze, String remark) {
        this.id = id;
        this.ruleAct = ruleAct;
        this.tagMark = tagMark;
        this.tagType = tagType;
        this.msgFormat = msgFormat;
        this.argNum = argNum;
        this.createTime = createTime;
        this.ver = ver;
        this.tagFreeze = tagFreeze;
        this.remark = remark;
    }

   
    // Property accessors

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public String getRuleAct() {
        return this.ruleAct;
    }
    
    public void setRuleAct(String ruleAct) {
        this.ruleAct = ruleAct;
    }

    public String getTagMark() {
        return this.tagMark;
    }
    
    public void setTagMark(String tagMark) {
        this.tagMark = tagMark;
    }

    public String getTagType() {
        return this.tagType;
    }
    
    public void setTagType(String tagType) {
        this.tagType = tagType;
    }

    public String getMsgFormat() {
        return this.msgFormat;
    }
    
    public void setMsgFormat(String msgFormat) {
        this.msgFormat = msgFormat;
    }

    public String getArgNum() {
        return this.argNum;
    }
    
    public void setArgNum(String argNum) {
        this.argNum = argNum;
    }

    public Date getCreateTime() {
        return this.createTime;
    }
    
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getVer() {
        return this.ver;
    }
    
    public void setVer(String ver) {
        this.ver = ver;
    }

    public String getTagFreeze() {
        return this.tagFreeze;
    }
    
    public void setTagFreeze(String tagFreeze) {
        this.tagFreeze = tagFreeze;
    }

    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }
   








}