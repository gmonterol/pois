package pois;


import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/negocio")
public class ServicioNegocio {
	
	//http://localhost:8080/pois/negocio/getPois/turismo
	@GET
	@Path("/turismo/pois")
	@Produces(MediaType.APPLICATION_XML)
	public List<Poi> getPoisList(){
		return new ArrayList<Poi>();
	}
}
