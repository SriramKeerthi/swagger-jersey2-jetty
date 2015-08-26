package com.caffinc.swjrje.webservices;

import com.caffinc.swjrje.entities.Entity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/entities")
@Api (value = "/entities", description = "Web Services to browse entities")
public class EntityBrowser {
    @GET
    @Path("/any")
    @ApiOperation(value = "Return one entity", notes = "Returns one entity at random", response = Entity.class)
    @Produces(MediaType.APPLICATION_JSON)
    public Response getEntity() {
        Entity entity = new Entity();
        entity.setName("entity0");
        return Response.ok().entity(entity).build();
    }

    @GET
    @Path("/all")
    @ApiOperation (value = "Return all entities", notes = "Returns all entities in the collection", response = Entity.class, responseContainer = "List")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getResult() {
        List<Entity> entityList = new ArrayList<Entity>();
        for (int i = 0; i <10; i++) {
            Entity entity = new Entity();
            entity.setName("entity" + i);
            entityList.add(entity);
        }
        return Response.ok().entity(entityList).build();
    }
}
