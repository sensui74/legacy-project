package et.po;



/**
 * SysRightGroup generated by MyEclipse - Hibernate Tools
 */

public class SysRightGroup  implements java.io.Serializable {


    // Fields    

     private String id;
     private SysModule sysModule;
     private SysGroup sysGroup;


    // Constructors

    /** default constructor */
    public SysRightGroup() {
    }

	/** minimal constructor */
    public SysRightGroup(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public SysRightGroup(String id, SysModule sysModule, SysGroup sysGroup) {
        this.id = id;
        this.sysModule = sysModule;
        this.sysGroup = sysGroup;
    }

   
    // Property accessors

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public SysModule getSysModule() {
        return this.sysModule;
    }
    
    public void setSysModule(SysModule sysModule) {
        this.sysModule = sysModule;
    }

    public SysGroup getSysGroup() {
        return this.sysGroup;
    }
    
    public void setSysGroup(SysGroup sysGroup) {
        this.sysGroup = sysGroup;
    }
   








}