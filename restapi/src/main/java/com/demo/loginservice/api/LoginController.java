package com.demo.loginservice.api;


import com.demo.loginservice.models.LoginEnity;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/api")

public interface LoginController {
    @Path("/login")
    @GET
    @Consumes("application/json")
   @Produces("application/json")
    public LoginEnity login();


}
