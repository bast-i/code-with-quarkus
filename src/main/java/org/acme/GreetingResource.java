package org.acme;

import java.sql.Date;

import javax.print.attribute.standard.DateTimeAtCompleted;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/hello")
public class GreetingResource {

    @ConfigProperty(name = "kundenname")
    String kundenname;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Webpage für " + kundenname;
    }


}