package com.departamento.departamento.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Departamento {  //PRIMER MODELO DE DATOS EL CUAL FUE HECHO ACORDE A LA TABLA DEPARTAMENTO
    private int numeroArea;        // Corresponde a numero_area en la tabla
    private String departamento;   // Corresponde a departamento en la tabla
    private String nombreCorto;    // Corresponde a nombre_corto en la tabla
    private String direccion;      // Corresponde a direccion en la tabla
}


//NO FUE NECESARIO CREAR GETTERS AND SETTERS DEBIDO A QUE SE ESTA USANDO LA DEPENDENCIA LOMBOOK 
//(LOS GENERA AUTOMATICAMENTE)