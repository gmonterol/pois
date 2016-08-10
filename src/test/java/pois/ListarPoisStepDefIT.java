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
	public void el_Negocio_Turismo_con_POIs(int cantidadPOIs) throws Throwable {
	
	}

	@Cuando("^solicito sus POIs$")
	public void solicito_sus_POIs() throws Throwable {
		//ClientRequest request = new ClientRequest("http://localhost:8080/pois/negocio/turismo/pois");;
		ClientRequest request = new ClientRequest("http://localhost:8080/pois/negocio/turismo/pois");

		request.accept("application/xml");
		response = (ClientResponse<Capa>)request.get();

		capa = response.getEntity(new GenericType<Capa>(){});	
	}

	@Entonces("^el servicio devuelve una lista vacia$")
	public void el_servicio_devuelve_una_lista_vacia() throws Throwable {
		Assert.assertEquals( 0, capa.getPois().size() );
		
	}
	
	@Dado("^el Negocio Hotel con (\\d+) POIs$")
	public void el_Negocio_Hotel_con_POIs(int arg1) throws Throwable {
	}

	@Cuando("^solicito los POIs del Hotel$")
	public void solicito_los_POIs_del_Hotel() throws Throwable {
	}

	@Entonces("^el servicio devuelve$")
	public void el_servicio_devuelve(DataTable arg1) throws Throwable {
		//Assert.fail();
	}
	
}
