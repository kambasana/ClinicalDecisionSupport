package org.socraticgrid.wexcleanup.freebase.dao;
// Generated Nov 6, 2010 5:46:30 PM by Hibernate Tools 3.2.1.GA



/**
 * Sections generated by hbm2java
 */
public class Sections  implements java.io.Serializable {


     private long id;
     private Long parentId;
     private short ordinal;
     private int articleWpid;
     private String name;
     private String xml;

    public Sections() {
    }

	
    public Sections(long id, short ordinal, int articleWpid, String name) {
        this.id = id;
        this.ordinal = ordinal;
        this.articleWpid = articleWpid;
        this.name = name;
    }
    public Sections(long id, Long parentId, short ordinal, int articleWpid, String name, String xml) {
       this.id = id;
       this.parentId = parentId;
       this.ordinal = ordinal;
       this.articleWpid = articleWpid;
       this.name = name;
       this.xml = xml;
    }
   
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    public Long getParentId() {
        return this.parentId;
    }
    
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }
    public short getOrdinal() {
        return this.ordinal;
    }
    
    public void setOrdinal(short ordinal) {
        this.ordinal = ordinal;
    }
    public int getArticleWpid() {
        return this.articleWpid;
    }
    
    public void setArticleWpid(int articleWpid) {
        this.articleWpid = articleWpid;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getXml() {
        return this.xml;
    }
    
    public void setXml(String xml) {
        this.xml = xml;
    }




}


