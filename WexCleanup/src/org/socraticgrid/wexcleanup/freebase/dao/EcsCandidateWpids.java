package org.socraticgrid.wexcleanup.freebase.dao;
// Generated Nov 9, 2010 10:16:51 PM by Hibernate Tools 3.2.1.GA



/**
 * EcsCandidateWpids generated by hbm2java
 */
public class EcsCandidateWpids  implements java.io.Serializable {


     private int id;
     private String guid;
     private int wpid;
     private String scheme;

    public EcsCandidateWpids() {
    }

    public EcsCandidateWpids(int id, String guid, int wpid, String scheme) {
       this.id = id;
       this.guid = guid;
       this.wpid = wpid;
       this.scheme = scheme;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getGuid() {
        return this.guid;
    }
    
    public void setGuid(String guid) {
        this.guid = guid;
    }
    public int getWpid() {
        return this.wpid;
    }
    
    public void setWpid(int wpid) {
        this.wpid = wpid;
    }
    public String getScheme() {
        return this.scheme;
    }
    
    public void setScheme(String scheme) {
        this.scheme = scheme;
    }




}


