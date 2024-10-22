**** PROBAR CRUD ENTIDAD EMPLEADO ****


METODO POST: http://localhost:8080/empleado/crear

{
  "numeroEmpleado": 1,
  "nombre": "Juan",
  "apellidos": "Pérez",
  "fechaNacimiento": "1990-01-01",
  "fechaIngreso": "2020-05-01",
  "areaTrabajo": "RH"
}

{
  "numeroEmpleado": 2,
  "nombre": "María",
  "apellidos": "Gómez",
  "fechaNacimiento": "1992-07-15",
  "fechaIngreso": "2019-09-10",
  "areaTrabajo": "IT"
}


METODO PUT: http://localhost:8080/empleado/actualizar/1

{
  "nombre": "Juan",
  "apellidos": "Pérez",
  "fechaNacimiento": "1990-01-01",
  "fechaIngreso": "2020-05-01",
  "areaTrabajo": "IT"
}

{
  "nombre": "María",
  "apellidos": "Gómez",
  "fechaNacimiento": "1992-07-15",
  "fechaIngreso": "2019-09-10",
  "areaTrabajo": "IT"
}


METODO GET: http://localhost:8080/empleado/consultarTodos //Consultar TODOS LOS REGISTROS

METODO GET: http://localhost:8080/empleado/consultar/1

http://localhost:8080/empleado/consultar/2



METODO DELETE: http://localhost:8080/empleado/eliminar/1

http://localhost:8080/empleado/eliminar/2



*******************************************
*******************************************
**** PROBAR CRUD ENTIDAD DEPARTAMENTO *****



METODO POST: http://localhost:8080/departamento/crear

{
  "numeroArea": 1,
  "departamento": "Recursos Humanos",
  "nombreCorto": "RH",
  "direccion": "Calle Azueta 85, Puebla, Puebla"
}
{
  "numeroArea": 2,
  "departamento": "Tecnología",
  "nombreCorto": "IT",
  "direccion": "Av. Reforma 100, CDMX"
}
{
  "numeroArea": 3,
  "departamento": "Ventas",
  "nombreCorto": "VNT",
  "direccion": "Av. Universidad 120, Monterrey, NL"
}



METODO PUT: http://localhost:8080/departamento/actualizar/1

{
  "departamento": "Recursos Humanos",
  "nombreCorto": "RH",
  "direccion": "Calle Revolución 75, Puebla, Puebla"
}


http://localhost:8080/departamento/actualizar/2

{
  "departamento": "Tecnologia",
  "nombreCorto": "RH",
  "direccion": "Calle Revolución 75, Puebla, Puebla"
}


METODO GET: http://localhost:8080/departamento/consultarTodos  //Consultar TODOS LOS REGISTROS

METODO GET: http://localhost:8080/departamento/consultar/1

http://localhost:8080/departamento/consultar/2



METODO DELETE: http://localhost:8080/departamento/eliminar/1

http://localhost:8080/departamento/eliminar/2