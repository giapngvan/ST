package org.test1.test1.core;

import com.adobe.cq.sightly.WCMUse;

public class HeroTextComponent extends WCMUse {
	
    private Person person = null;
    
    public Person getPerson() {
		return person;
	}
	@Override
    public void activate() throws Exception {    		        
		person = getResource().adaptTo(Person.class);
    }
}