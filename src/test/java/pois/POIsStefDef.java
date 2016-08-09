package pois;

import org.junit.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

public class POIsStefDef {

	@Dado("^el Negocio “Turismo” con (\\d+) POIs$")
	public void el_Negocio_Turismo_con_POIs(int cantidadPOIs) throws Throwable {
		throw new PendingException();
	}

	@Cuando("^solicito sus POIs$")
	public void solicito_sus_POIs() throws Throwable {
	    
	}

	@Entonces("^el servicio devuelve una lista vacía$")
	public void el_servicio_devuelve_una_lista_vacía() throws Throwable {
		Assert.fail();
	}
}
