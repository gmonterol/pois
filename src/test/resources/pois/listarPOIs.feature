# language: es

Característica: Listar los POIs
	Como usuario quiero poder listar los POIs dado mi negocio
	Para saber todos los POIs de ese negocio

Escenario: Listado de POIs vacio
	Dado el Negocio Turismo con 0 POIs
	Cuando solicito sus POIs
	Entonces el servicio devuelve una lista vacia

Escenario: Listado de 2 POIS 
	Dado el Negocio Hotel
	Cuando solicito los POIs del Hotel
	Entonces el servicio devuelve 2 pois
#	| latitud | longitud | nombre | descripción | categoría |
#	| -34.9045366 | -56.1349152 | La Negra Tomasa | Pizzería la Negra Tomasa | Pizzería |
#	| -34.9060305 | -56.1430202 | Pizzería Trouville | Pizzería Trouville | Pizzería |