package et.po;



/**
 * EmailBox generated by MyEclipse - Hibernate Tools
 */

public class EmailBox  implements java.io.Serializable {


    // Fields    

     private String id;
     private SysUser sysUser;
     private String name;
     private String smtp;
     private String pop3;
     private String pop3User;
     private String popPassword;
     private String remark;
     private String smtpUser;
     private String smtpPassword;
     private Integer smtpPort;
     private String smtpSsl;
     private Integer pop3Port;
     private String pop3Ssl;
     private String emailAddress;
     private String returnAdress;
     private String tagSmtpSsl;
     private String tagPop3Ssl;
     private String tagValidate;


    // Constructors

    /** default constructor */
    public EmailBox() {
    }

	/** minimal constructor */
    public EmailBox(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public EmailBox(String id, SysUser sysUser, String name, String smtp, String pop3, String pop3User, String popPassword, String remark, String smtpUser, String smtpPassword, Integer smtpPort, String smtpSsl, Integer pop3Port, String pop3Ssl, String emailAddress, String returnAdress, String tagSmtpSsl, String tagPop3Ssl, String tagValidate) {
        this.id = id;
        this.sysUser = sysUser;
        this.name = name;
        this.smtp = smtp;
        this.pop3 = pop3;
        this.pop3User = pop3User;
        this.popPassword = popPassword;
        this.remark = remark;
        this.smtpUser = smtpUser;
        this.smtpPassword = smtpPassword;
        this.smtpPort = smtpPort;
        this.smtpSsl = smtpSsl;
        this.pop3Port = pop3Port;
        this.pop3Ssl = pop3Ssl;
        this.emailAddress = emailAddress;
        this.returnAdress = returnAdress;
        this.tagSmtpSsl = tagSmtpSsl;
        this.tagPop3Ssl = tagPop3Ssl;
        this.tagValidate = tagValidate;
    }

   
    // Property accessors

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public SysUser getSysUser() {
        return this.sysUser;
    }
    
    public void setSysUser(SysUser sysUser) {
        this.sysUser = sysUser;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getSmtp() {
        return this.smtp;
    }
    
    public void setSmtp(String smtp) {
        this.smtp = smtp;
    }

    public String getPop3() {
        return this.pop3;
    }
    
    public void setPop3(String pop3) {
        this.pop3 = pop3;
    }

    public String getPop3User() {
        return this.pop3User;
    }
    
    public void setPop3User(String pop3User) {
        this.pop3User = pop3User;
    }

    public String getPopPassword() {
        return this.popPassword;
    }
    
    public void setPopPassword(String popPassword) {
        this.popPassword = popPassword;
    }

    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getSmtpUser() {
        return this.smtpUser;
    }
    
    public void setSmtpUser(String smtpUser) {
        this.smtpUser = smtpUser;
    }

    public String getSmtpPassword() {
        return this.smtpPassword;
    }
    
    public void setSmtpPassword(String smtpPassword) {
        this.smtpPassword = smtpPassword;
    }

    public Integer getSmtpPort() {
        return this.smtpPort;
    }
    
    public void setSmtpPort(Integer smtpPort) {
        this.smtpPort = smtpPort;
    }

    public String getSmtpSsl() {
        return this.smtpSsl;
    }
    
    public void setSmtpSsl(String smtpSsl) {
        this.smtpSsl = smtpSsl;
    }

    public Integer getPop3Port() {
        return this.pop3Port;
    }
    
    public void setPop3Port(Integer pop3Port) {
        this.pop3Port = pop3Port;
    }

    public String getPop3Ssl() {
        return this.pop3Ssl;
    }
    
    public void setPop3Ssl(String pop3Ssl) {
        this.pop3Ssl = pop3Ssl;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }
    
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getReturnAdress() {
        return this.returnAdress;
    }
    
    public void setReturnAdress(String returnAdress) {
        this.returnAdress = returnAdress;
    }

    public String getTagSmtpSsl() {
        return this.tagSmtpSsl;
    }
    
    public void setTagSmtpSsl(String tagSmtpSsl) {
        this.tagSmtpSsl = tagSmtpSsl;
    }

    public String getTagPop3Ssl() {
        return this.tagPop3Ssl;
    }
    
    public void setTagPop3Ssl(String tagPop3Ssl) {
        this.tagPop3Ssl = tagPop3Ssl;
    }

    public String getTagValidate() {
        return this.tagValidate;
    }
    
    public void setTagValidate(String tagValidate) {
        this.tagValidate = tagValidate;
    }
   








}