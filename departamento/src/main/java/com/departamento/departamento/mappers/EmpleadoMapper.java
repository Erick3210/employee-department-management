package com.departamento.departamento.mappers;

import com.departamento.departamento.models.Empleado;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface EmpleadoMapper {

    // Metodo para Insertar un nuevo empleado en la tabla "empleado"
    @Insert("INSERT INTO empleado (numero_empleado, nombre, apellidos, fecha_nacimiento, fecha_ingreso, area_trabajo) " +
            "VALUES (#{numeroEmpleado}, #{nombre}, #{apellidos}, #{fechaNacimiento}, #{fechaIngreso}, #{areaTrabajo})")
    void insertEmpleado(Empleado empleado);



    // Metodo para Consultar un empleado por su número de empleado
    @Select("SELECT * FROM empleado WHERE numero_empleado = #{numeroEmpleado}")
    @Results({
        @Result(property = "numeroEmpleado", column = "numero_empleado"),
        @Result(property = "nombre", column = "nombre"),
        @Result(property = "apellidos", column = "apellidos"),
        @Result(property = "fechaNacimiento", column = "fecha_nacimiento"),
        @Result(property = "fechaIngreso", column = "fecha_ingreso"),
        @Result(property = "areaTrabajo", column = "area_trabajo")
    })
    Empleado getEmpleadoById(int numeroEmpleado);

    // Metodo para  Consultar todos los empleados
    @Select("SELECT * FROM empleado")
    @Results({
        @Result(property = "numeroEmpleado", column = "numero_empleado"),
        @Result(property = "nombre", column = "nombre"),
        @Result(property = "apellidos", column = "apellidos"),
        @Result(property = "fechaNacimiento", column = "fecha_nacimiento"),
        @Result(property = "fechaIngreso", column = "fecha_ingreso"),
        @Result(property = "areaTrabajo", column = "area_trabajo")
    })
    List<Empleado> getAllEmpleados();




    // Metodo para Actualizar un empleado existente
    @Update("UPDATE empleado SET nombre = #{nombre}, apellidos = #{apellidos}, " +
            "fecha_nacimiento = #{fechaNacimiento}, fecha_ingreso = #{fechaIngreso}, area_trabajo = #{areaTrabajo} " +
            "WHERE numero_empleado = #{numeroEmpleado}")
    void updateEmpleado(Empleado empleado);


    
    // Metodo para Eliminar un empleado por su número de empleado
    @Delete("DELETE FROM empleado WHERE numero_empleado = #{numeroEmpleado}")
    void deleteEmpleado(int numeroEmpleado);
}
