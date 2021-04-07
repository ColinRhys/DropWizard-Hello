package com.world.hello.helloworld;

import com.world.hello.helloworld.resources.PlainTextResource;
import com.world.hello.helloworld.resources.PlainTextTemplateResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import com.world.hello.helloworld.resources.HelloWorldResource;
import com.world.hello.helloworld.health.TemplateHealthCheck;

public class HelloWorldApplication extends Application<HelloWorldConfiguration> {
    public static void main(String[] args) throws Exception {
        new HelloWorldApplication().run(args);
    }

    @Override
    public String getName() {
        return "hello-world";
    }

    @Override
    public void initialize(Bootstrap<HelloWorldConfiguration> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(HelloWorldConfiguration configuration,
                    Environment environment) {
        final HelloWorldResource resource1 = new HelloWorldResource(
                configuration.getTemplate()
        );
        final PlainTextResource resource2 = new PlainTextResource();
        final PlainTextTemplateResource resource3 = new PlainTextTemplateResource(
                configuration.getTemplate()
        );
        final TemplateHealthCheck healthCheck =
                new TemplateHealthCheck(configuration.getTemplate());
        environment.healthChecks().register("template", healthCheck);
        //Resource from the example from Dropwizard
        environment.jersey().register(resource1);
        //My "simplest way to return message
        environment.jersey().register(resource2);
        //Returning the template as a just text not JSON
        environment.jersey().register(resource3);
    }

}