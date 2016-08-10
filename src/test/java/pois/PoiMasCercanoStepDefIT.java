package pois;

import org.junit.Assert;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dada;
import cucumber.api.java.es.Entonces;

public class PoiMasCercanoStepDefIT {
	
	@Dada("^la ubicación de la pizzería Venecia$")
	public void la_ubicación_de_la_pizzería_Venecia() throws Throwable {
	}

	@Cuando("^solicito el POI más cercano$")
	public void solicito_el_POI_más_cercano() throws Throwable {
		
	}

	@Entonces("^me devuelve la pizzería Venecia$")
	public void me_devuelve_la_pizzería_Venecia() throws Throwable {
		Assert.fail();
	}
	
	@Dada("^la ubicación del Hotel Palladium$")
	public void la_ubicación_del_Hotel_Palladium() throws Throwable {
	}

	@Cuando("^solicito la pizzería más cercana$")
	public void solicito_la_pizzería_más_cercana() throws Throwable {
	}

	@Entonces("^me devuelve la pizzería La Negra Tomasa$")
	public void me_devuelve_la_pizzería_La_Negra_Tomasa() throws Throwable {
		Assert.fail();
	}
}
