package org.socraticgrid.wexcleanup.freebase.dao;
// Generated Nov 6, 2010 5:46:30 PM by Hibernate Tools 3.2.1.GA



/**
 * TemplateValues generated by hbm2java
 */
public class TemplateValues  implements java.io.Serializable {


     private TemplateValuesId id;
     private String xml;

    public TemplateValues() {
    }

	
    public TemplateValues(TemplateValuesId id) {
        this.id = id;
    }
    public TemplateValues(TemplateValuesId id, String xml) {
       this.id = id;
       this.xml = xml;
    }
   
    public TemplateValuesId getId() {
        return this.id;
    }
    
    public void setId(TemplateValuesId id) {
        this.id = id;
    }
    public String getXml() {
        return this.xml;
    }
    
    public void setXml(String xml) {
        this.xml = xml;
    }




}

