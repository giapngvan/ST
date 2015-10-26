package org.test1.test1.core;
import org.test1.test1.core.component.model.Footer;

import com.adobe.cq.sightly.WCMUse;

public class FooterComponent extends WCMUse {

    public Footer footer;

    @Override
    public void activate() {
    	footer = getResource().adaptTo(Footer.class);
        int a=10;
        a++;
        
    }

}