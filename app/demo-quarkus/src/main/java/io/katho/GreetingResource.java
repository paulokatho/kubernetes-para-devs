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
        return "Hello Katho New Action Reactive And Atomic! Agora todo mundo em casa, família reunida depois de 2 anos separados... TOOOOOP!!!.";
    }
}