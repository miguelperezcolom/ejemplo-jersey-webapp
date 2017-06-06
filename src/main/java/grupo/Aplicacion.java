package grupo;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("recursos")
public class Aplicacion extends ResourceConfig {
    public Aplicacion() {
        //packages("org.foo.rest;org.bar.rest");
        packages("grupo");
        register(JacksonFeature.class);
        register(new CORSFilter());
    }
}