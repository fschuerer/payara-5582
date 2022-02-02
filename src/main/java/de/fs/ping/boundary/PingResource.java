package de.fs.ping.boundary;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("ping")
public class PingResource {

    @GET
    public String ping() {
        return "everybody is authorized";
    }
    
    @GET
    @Path("internal")
    @RolesAllowed("chief")
    public String internal() {
        return "Hi Chief";
    }
}
