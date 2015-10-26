
package org.test1.test1.core;

import com.adobe.cq.sightly.WCMUse;

import javax.jcr.Node;
import javax.jcr.Property;

import org.apache.sling.api.resource.ValueMap;

public class HeroTextCom extends WCMUse {
	 
    /** The hero text bean. */
    private HeroTextBean heroTextBean = null;
         
    @Override
    public void activate() throws Exception {
        Node currentNode = getResource().adaptTo(Node.class);       
        heroTextBean = new HeroTextBean();         
        
        if(currentNode.hasProperty("jcr:Heading")){
            heroTextBean.setHeadingText(currentNode.getProperty("jcr:Heading").getString());            
        }

        if(currentNode.hasProperty("jcr:description")){
            heroTextBean.setDescription(currentNode.getProperty("jcr:description").getString());
        }
        
        if(currentNode.hasProperty("jcr:link")){
            heroTextBean.setLink(currentNode.getProperty("jcr:link").getString());
        }
        
        if(currentNode.hasProperty("jcr:image")){
            heroTextBean.setFileReference(currentNode.getProperty("jcr:image").getString()); 
        }
                             
        int a=10;
        int c=a+1;
    }
               
    public HeroTextBean getHeroTextBean() {
        return this.heroTextBean;
    }
}