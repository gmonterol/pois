package pois;


import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/negocio")
public class ServicioNegocio {
	
	@GET
	@Path("/turismo/pois")
	@Produces("application/xml")
	public Capa getPoisList(){
		Capa capa = new Capa(); 
		capa.setPois( new ArrayList<Poi>() ) ;
//		Poi poi = new Poi();
//		poi.
//		capa.getPois().add( poi );
		return capa;
	}
}
