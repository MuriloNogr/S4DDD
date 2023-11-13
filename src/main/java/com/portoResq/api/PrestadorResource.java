package com.portoResq.api;

import com.portoResq.model.Prestador;
import com.portoResq.service.PrestadorService;

import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.PathParam;

@Path("/api/prestadores")
public class PrestadorResource {
    private PrestadorService service = new PrestadorService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Prestador> getPrestadores() {
        return service.getPrestadores();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addPrestador(Prestador prestador) {
        service.addPrestador(prestador);
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void updatePrestador(@PathParam("id") int id, Prestador prestador) {
        service.updatePrestador(id, prestador);
    }

    @DELETE
    @Path("/{id}")
    public void deletePrestador(@PathParam("id") int id) {
        service.deletePrestador(id);
    }
}
