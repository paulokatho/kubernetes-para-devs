package io.katho;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello Katho New Action Reactive And Atomic E AGORA COM O GRANDE MESTRE ELDER MORAES. E foi muito TOP!!!!";
    }
}