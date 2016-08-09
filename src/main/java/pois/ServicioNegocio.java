package pois;


import javax.ws.rs.*;

@Path("/negocio")
public class ServicioNegocio {
	
	//http://localhost:8080/pois/negocio/getPois/turismo
	@GET
	@Path("/pois/turismo")
	public PoisList getPoisList(){
		return new PoisList();
	}
	
	

}
