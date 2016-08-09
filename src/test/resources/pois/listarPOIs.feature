# language: es

Característica: Listar los POIs
	Como usuario quiero poder listar los POIs dado mi negocio
	Para saber todos los POIs de ese negocio

Escenario: Listado de POIs vacío
	Dado el Negocio “Turismo” con 0 POIs
	Cuando solicito sus POIs
	Entonces el servicio devuelve una lista vacía

#Escenario: 
#	Dado Negocio “Turismo” 
#	Cuando solicito sus POIs
#	Entonces el servicio devuelve los POIs
#	| latitud | longitud | nombre | descripción | categoría |
#	| 34,4 | 35,5 | nombre | descripción | categoría |
#	| 34,4 | 35,5 | nombre | descripción | categoría |
#	| 34,4 | 35,5 | nombre | descripción | categoría |
