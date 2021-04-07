package com.world.hello.helloworld.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//Return the template as just text
@Path("/hello-world")
@Produces(MediaType.TEXT_PLAIN)
public class PlainTextTemplateResource {
    private final String template;

    public PlainTextTemplateResource(String template){
        this.template = template;
    }

    @GET
    public String plainTextTemplate(){
        final String value = template;
        return value;
    }
}
