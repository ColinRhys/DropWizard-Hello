package com.world.hello.helloworld.resources;

import com.world.hello.helloworld.api.Saying;
import com.codahale.metrics.annotation.Timed;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.concurrent.atomic.AtomicLong;

//From the tutorial here https://www.dropwizard.io/en/latest/manual/core.html
@Path("/hello-world-json")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorldResource {
    private final String template;
    private final AtomicLong counter;

    public HelloWorldResource(String template) {
        this.template = template;
        this.counter = new AtomicLong();
    }

    @GET
    @Timed
    public Saying sayHello() {
        final String value = String.format(template);
        return new Saying(counter.incrementAndGet(), value);
    }

}
