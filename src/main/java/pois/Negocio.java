package pois;

import java.util.HashMap;
import java.util.Map;

public class Negocio {

	private static Map<String,Capa> capas = new HashMap<String,Capa>();
	
	static{
		capas.put("Turismo", new Capa() );
		Capa capaHotel = new Capa();
		capaHotel.getPois().add( new Poi() );
		capaHotel.getPois().add( new Poi() );
		capas.put("Hotel", capaHotel );
	}
	
	public static Capa getCapaDefault(String negocio) {
		return capas.get(negocio);
		
	}
}
