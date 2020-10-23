package io.quarkus.resource;

import io.quarkus.service.ExampleService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/example")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ExampleResource {

    @Inject
    private ExampleService exampleService;

    @GET
    public String hello() {
        return "hello";
    }

    @GET
    @Path("/{name}")
    public String hello(@PathParam("name") String name) {
        return exampleService.hello(name);
    }

    @GET
    @Path("/list")
    public Response list() {
        return Response.ok(exampleService.list()).build();
    }

}