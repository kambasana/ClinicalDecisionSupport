package org.socraticgrid.ecs.hibernate.dao;
// Generated Nov 21, 2011 5:16:07 PM by Hibernate Tools 3.2.1.GA



/**
 * EcsIcd9Wpids generated by hbm2java
 */
public class EcsIcd9Wpids  implements java.io.Serializable {


     private int id;
     private String code;
     private int wpid;
     private Boolean disable;

    public EcsIcd9Wpids() {
    }

	
    public EcsIcd9Wpids(int id, String code, int wpid) {
        this.id = id;
        this.code = code;
        this.wpid = wpid;
    }
    public EcsIcd9Wpids(int id, String code, int wpid, Boolean disable) {
       this.id = id;
       this.code = code;
       this.wpid = wpid;
       this.disable = disable;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    public int getWpid() {
        return this.wpid;
    }
    
    public void setWpid(int wpid) {
        this.wpid = wpid;
    }
    public Boolean getDisable() {
        return this.disable;
    }
    
    public void setDisable(Boolean disable) {
        this.disable = disable;
    }




}


