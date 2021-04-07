package com.world.hello.helloworld.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

//the simplest way to return "Hello! How are you today?"
@Path("/plain-text")
public class PlainTextResource {
    @GET
    public String plainText() {
        return "Hello! How are you today?";
    }
}
