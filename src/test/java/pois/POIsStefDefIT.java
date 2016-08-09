package pois;

import java.util.List;

import org.jboss.resteasy.client.ClientRequest;
import org.jboss.resteasy.client.ClientResponse;
import org.junit.Assert;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

public class POIsStefDefIT {

	private ClientResponse<List> response;

	@Dado("^el Negocio “Turismo” con (\\d+) POIs$")
	public void el_Negocio_Turismo_con_POIs(int cantidadPOIs) throws Throwable {
	
	}

	@Cuando("^solicito sus POIs$")
	public void solicito_sus_POIs() throws Throwable {
		//ClientRequest request = new ClientRequest("http://localhost:8080/pois/negocio/getPois/turismo");
		ClientRequest request = new ClientRequest("http://localhost:8080/pois/negocio/pois/turismo");
		request.accept("application/json");
		response = request.get(List.class);	
	}

	@Entonces("^el servicio devuelve una lista vacía$")
	public void el_servicio_devuelve_una_lista_vacía() throws Throwable {
		Assert.assertEquals( 200, response.getStatus() );
	}
}
