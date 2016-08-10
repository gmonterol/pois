package pois;

import java.util.List;

import javax.ws.rs.Path;

import org.jboss.resteasy.client.ClientRequest;
import org.jboss.resteasy.client.ClientResponse;
import org.jboss.resteasy.util.GenericType;
import org.junit.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

public class ListarPoisStepDefIT {

	private ClientResponse<Capa> response;
	private Capa capa;

	@Dado("^el Negocio Turismo con (\\d+) POIs$")
	public void el_Negocio_Turismo_con_POIs(int cantidadPOIs) throws Throwable {}

	@Cuando("^solicito sus POIs$")
	public void solicito_sus_POIs() throws Throwable {
		//ClientRequest request = new ClientRequest("http://localhost:8080/pois/negocio/turismo/pois");;
		ClientRequest request = new ClientRequest("http://localhost:8080/pois/negocio/Turismo/pois");

		request.accept("application/xml");
		response = (ClientResponse<Capa>)request.get();

		capa = response.getEntity(new GenericType<Capa>(){});	
	}

	@Entonces("^el servicio devuelve una lista vacia$")
	public void el_servicio_devuelve_una_lista_vacia() throws Throwable {
		Assert.assertEquals( 0, capa.getPois().size() );
	}
	
	
	@Dado("^el Negocio Hotel$")
	public void el_Negocio_Hotel() throws Throwable {
	}

	@Cuando("^solicito los POIs del Hotel$")
	public void solicito_los_POIs_del_Hotel() throws Throwable {
		
		//ClientRequest request = new ClientRequest("http://localhost:8080/pois/negocio/turismo/pois");;
		ClientRequest request = new ClientRequest("http://localhost:8080/pois/negocio/Hotel/pois");

		request.accept("application/xml");
		response = (ClientResponse<Capa>)request.get();

		capa = response.getEntity(new GenericType<Capa>(){});
	}

	@Entonces("^el servicio devuelve (\\d+) pois$")
	public void el_servicio_devuelve_pois(int cantidad) throws Throwable {
		Assert.assertEquals(cantidad, capa.getPois().size());
	}

}
