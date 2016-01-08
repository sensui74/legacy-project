package et.po;

import java.util.Date;


/**
 * ResourceUse generated by MyEclipse - Hibernate Tools
 */

public class ResourceUse  implements java.io.Serializable {


    // Fields    

     private String id;
     private ResourceInfo resourceInfo;
     private Date dateArea;
     private Date dateEnd;
     private String timeArea;
     private String principalName;
     private String appointName;
     private String userName;
     private String resourceState;
     private String remark;
     private String applyState;


    // Constructors

    /** default constructor */
    public ResourceUse() {
    }

	/** minimal constructor */
    public ResourceUse(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public ResourceUse(String id, ResourceInfo resourceInfo, Date dateArea, Date dateEnd, String timeArea, String principalName, String appointName, String userName, String resourceState, String remark, String applyState) {
        this.id = id;
        this.resourceInfo = resourceInfo;
        this.dateArea = dateArea;
        this.dateEnd = dateEnd;
        this.timeArea = timeArea;
        this.principalName = principalName;
        this.appointName = appointName;
        this.userName = userName;
        this.resourceState = resourceState;
        this.remark = remark;
        this.applyState = applyState;
    }

   
    // Property accessors

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public ResourceInfo getResourceInfo() {
        return this.resourceInfo;
    }
    
    public void setResourceInfo(ResourceInfo resourceInfo) {
        this.resourceInfo = resourceInfo;
    }

    public Date getDateArea() {
        return this.dateArea;
    }
    
    public void setDateArea(Date dateArea) {
        this.dateArea = dateArea;
    }

    public Date getDateEnd() {
        return this.dateEnd;
    }
    
    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getTimeArea() {
        return this.timeArea;
    }
    
    public void setTimeArea(String timeArea) {
        this.timeArea = timeArea;
    }

    public String getPrincipalName() {
        return this.principalName;
    }
    
    public void setPrincipalName(String principalName) {
        this.principalName = principalName;
    }

    public String getAppointName() {
        return this.appointName;
    }
    
    public void setAppointName(String appointName) {
        this.appointName = appointName;
    }

    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getResourceState() {
        return this.resourceState;
    }
    
    public void setResourceState(String resourceState) {
        this.resourceState = resourceState;
    }

    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getApplyState() {
        return this.applyState;
    }
    
    public void setApplyState(String applyState) {
        this.applyState = applyState;
    }
   








}