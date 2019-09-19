Primera iteracion:
-Postulante guarda lista de listas a las que se presenta. OK.
-Agregar atributo anio a eleccion. OK.
-La eleccion da la informacion de que cargos se pueden votar. [Validar que lista tenga los mismos campos que eleccion]
-Clase abstracta Estado en vez de interfaz. OK.

Segunda iteracion:
-La persona tiene un atributo fecha de nacimiento. De ahi calculo la edad. OK.
-Redisenar validez de voto. [bool esApto, bool yaVoto]
-SumarVotoPorCargo recibe cargo. [Uso lo de abajo y elimino el problema.]
-Postulante apunta a lista. [Cuando suma voto, suma el voto de la lista.]

