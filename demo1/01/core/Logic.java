package org.test1.test1.core;

import javax.annotation.PostConstruct;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class)
public class Logic {
	private String hi;

	@PostConstruct
	protected void init() {
		hi = "Hello World AAAA";
	}

	public String getHi() {
		return hi;
	}
}