package et.po;

import java.util.Date;


/**
 * LeavewordInfo generated by MyEclipse - Hibernate Tools
 */

public class LeavewordInfo  implements java.io.Serializable {


    // Fields    

     private String id;
     private String userId;
     private String name;
     private Date leaveDate;
     private String title;
     private String content;


    // Constructors

    /** default constructor */
    public LeavewordInfo() {
    }

	/** minimal constructor */
    public LeavewordInfo(String id, String userId, String name, Date leaveDate, String content) {
        this.id = id;
        this.userId = userId;
        this.name = name;
        this.leaveDate = leaveDate;
        this.content = content;
    }
    
    /** full constructor */
    public LeavewordInfo(String id, String userId, String name, Date leaveDate, String title, String content) {
        this.id = id;
        this.userId = userId;
        this.name = name;
        this.leaveDate = leaveDate;
        this.title = title;
        this.content = content;
    }

   
    // Property accessors

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public Date getLeaveDate() {
        return this.leaveDate;
    }
    
    public void setLeaveDate(Date leaveDate) {
        this.leaveDate = leaveDate;
    }

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
   








}