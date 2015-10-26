package org.test1.test1.core;

public class HeroTextBean {
    
    /** The heading text. */
    private String headingText;
     
    /** The description. */
    private String description;
    /**
     * @return the headingText
     */
    private String link;
    
    private String fileReference;
    private String icon;


	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getFileReference() {
		return fileReference;
	}
	public void setFileReference(String fileReference) {
		this.fileReference = fileReference;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	/**
     * @return the headingText
     */
        
    public String getHeadingText() {
        return headingText;
    }
    /**
     * @param headingText the headingText to set
     */
    public void setHeadingText(String headingText) {
        this.headingText = headingText;
    }
    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }
    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
 
}