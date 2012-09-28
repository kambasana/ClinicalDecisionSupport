package org.socraticgrid.ecs.hibernate.dao;
// Generated Nov 21, 2011 5:16:07 PM by Hibernate Tools 3.2.1.GA



/**
 * EcsCodesToWpids generated by hbm2java
 */
public class EcsCodesToWpids  implements java.io.Serializable {


     private int id;
     private String scheme;
     private String code;
     private int wpid;
     private Boolean disable;

    public EcsCodesToWpids() {
    }

	
    public EcsCodesToWpids(int id, String scheme, String code, int wpid) {
        this.id = id;
        this.scheme = scheme;
        this.code = code;
        this.wpid = wpid;
    }
    public EcsCodesToWpids(int id, String scheme, String code, int wpid, Boolean disable) {
       this.id = id;
       this.scheme = scheme;
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
    public String getScheme() {
        return this.scheme;
    }
    
    public void setScheme(String scheme) {
        this.scheme = scheme;
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


