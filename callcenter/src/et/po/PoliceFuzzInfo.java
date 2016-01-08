package et.po;

import java.util.Date;


/**
 * PoliceFuzzInfo generated by MyEclipse - Hibernate Tools
 */

public class PoliceFuzzInfo  implements java.io.Serializable {


    // Fields    

     private String id;
     private String fuzzNo;
     private String name;
     private String sex;
     private String birthday;
     private String password;
     private String mobileTel;
     private String tagPoliceKind;
     private Date workTime;
     private String tagUnit;
     private String tagArea;
     private String idCard;
     private String personType;
     private String duty;
     private String tagFreeze;
     private String tagDel;


    // Constructors

    /** default constructor */
    public PoliceFuzzInfo() {
    }

	/** minimal constructor */
    public PoliceFuzzInfo(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public PoliceFuzzInfo(String id, String fuzzNo, String name, String sex, String birthday, String password, String mobileTel, String tagPoliceKind, Date workTime, String tagUnit, String tagArea, String idCard, String personType, String duty, String tagFreeze, String tagDel) {
        this.id = id;
        this.fuzzNo = fuzzNo;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.password = password;
        this.mobileTel = mobileTel;
        this.tagPoliceKind = tagPoliceKind;
        this.workTime = workTime;
        this.tagUnit = tagUnit;
        this.tagArea = tagArea;
        this.idCard = idCard;
        this.personType = personType;
        this.duty = duty;
        this.tagFreeze = tagFreeze;
        this.tagDel = tagDel;
    }

   
    // Property accessors

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public String getFuzzNo() {
        return this.fuzzNo;
    }
    
    public void setFuzzNo(String fuzzNo) {
        this.fuzzNo = fuzzNo;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return this.sex;
    }
    
    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return this.birthday;
    }
    
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobileTel() {
        return this.mobileTel;
    }
    
    public void setMobileTel(String mobileTel) {
        this.mobileTel = mobileTel;
    }

    public String getTagPoliceKind() {
        return this.tagPoliceKind;
    }
    
    public void setTagPoliceKind(String tagPoliceKind) {
        this.tagPoliceKind = tagPoliceKind;
    }

    public Date getWorkTime() {
        return this.workTime;
    }
    
    public void setWorkTime(Date workTime) {
        this.workTime = workTime;
    }

    public String getTagUnit() {
        return this.tagUnit;
    }
    
    public void setTagUnit(String tagUnit) {
        this.tagUnit = tagUnit;
    }

    public String getTagArea() {
        return this.tagArea;
    }
    
    public void setTagArea(String tagArea) {
        this.tagArea = tagArea;
    }

    public String getIdCard() {
        return this.idCard;
    }
    
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPersonType() {
        return this.personType;
    }
    
    public void setPersonType(String personType) {
        this.personType = personType;
    }

    public String getDuty() {
        return this.duty;
    }
    
    public void setDuty(String duty) {
        this.duty = duty;
    }

    public String getTagFreeze() {
        return this.tagFreeze;
    }
    
    public void setTagFreeze(String tagFreeze) {
        this.tagFreeze = tagFreeze;
    }

    public String getTagDel() {
        return this.tagDel;
    }
    
    public void setTagDel(String tagDel) {
        this.tagDel = tagDel;
    }
   








}