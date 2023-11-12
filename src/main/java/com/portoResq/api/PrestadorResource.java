package com.portoResq.api;

import com.portoResq.model.Prestador;
import com.portoResq.service.PrestadorService;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/prestadores")
public class PrestadorResource {

    private PrestadorService service = new PrestadorService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Prestador> getPrestadores() {
        return service.getPrestadores();
    }

    // Endpoints para POST, PUT, DELETE...
}
