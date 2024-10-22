package com.departamento.departamento.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Empleado { //SEGUNDO MODELO DE DATOS EL CUAL FUE HECHO ACORDE A LA TABLA EMPLEADO
    private int numeroEmpleado;        // Entero, clave primaria
    private String nombre;             // Nombre del empleado
    private String apellidos;          // Apellidos del empleado
    private String fechaNacimiento;    // Fecha como cadena
    private String fechaIngreso;       // Fecha como cadena
    private String areaTrabajo;        // Área de trabajo
}
