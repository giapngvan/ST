package org.test1.test1.core;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import javax.inject.Inject;

/**
 * Created by behera on 07-07-2014.
 */
@Model(adaptables = Resource.class)
public class Person {
    @Inject 
    private String firstName;
    
    @Inject 
    private String lastName;
    
	@Inject 
	private String email;
	
	@Inject 
	private String mobile;

    public String getMobile() {
		return mobile;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	
}