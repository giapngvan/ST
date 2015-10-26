package org.test1.test1.core.component.model;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

@Model(adaptables=Resource.class)
public class FooterColumn {
    @Inject
    public String header;

    @Inject @Named("links")
    private Resource linksResource;

    public List<Link> links;

    @PostConstruct
    protected void init() throws Exception {
        links = new ArrayList<Link>();
        if(linksResource != null) {
            Iterator<Resource> linkResources = linksResource.listChildren();
            while(linkResources.hasNext()) {
                Link link = linkResources.next().adaptTo(Link.class);
                if(link != null)
                    links.add(link);
            }
        }
    }
}