# language: es

Característica: Encontrar el POI más cercano
	Como usuario quiero poder encontrar el POI más cercano a mi ubicación
	Para caminar menos

Escenario: Devolver el mismo POI cuando estoy en esa misma ubicación
#	Dada la ubicación -34.9091559, -56.1680753
	Dada la ubicación de la pizzería Venecia 
	Cuando solicito el POI más cercano
	Entonces me devuelve la pizzería Venecia 

Escenario: Devolver el POI más cercano dado un punto y dos POIs  
	Dada la ubicación del Hotel Palladium
	Cuando solicito la pizzería más cercana
	Entonces me devuelve la pizzería La Negra Tomasa
