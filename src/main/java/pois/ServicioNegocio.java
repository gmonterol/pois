package pois;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/negocio")
public class ServicioNegocio {
	
	@GET
	@Path("{negocio}/pois")
	@Produces("application/xml")
	public Capa getPoisList( @PathParam("negocio") String negocio ){
	
		Capa capa = Negocio.getCapaDefault( negocio );
		return capa;
	}
}
