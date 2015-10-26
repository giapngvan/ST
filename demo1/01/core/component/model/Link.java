package org.test1.test1.core.component.model;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import javax.inject.Inject;


@Model(adaptables=Resource.class)
public class Link {
    @Inject
    public String name;

    @Inject
    public String link;
}