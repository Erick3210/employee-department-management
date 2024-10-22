package com.departamento.departamento.mappers;

import com.departamento.departamento.models.Departamento;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DepartamentoMapper {

    // Metodo para Insertar un nuevo departamento
    @Insert("INSERT INTO departamento (numero_area, departamento, nombre_corto, direccion) " +
            "VALUES (#{numeroArea}, #{departamento}, #{nombreCorto}, #{direccion})")
    void insertDepartamento(Departamento departamento);




    // Metodo para Consultar un departamento por su número de área
    @Select("SELECT * FROM departamento WHERE numero_area = #{numeroArea}")
    @Results({
        @Result(property = "numeroArea", column = "numero_area"),
        @Result(property = "departamento", column = "departamento"),
        @Result(property = "nombreCorto", column = "nombre_corto"),
        @Result(property = "direccion", column = "direccion")
    })
    Departamento getDepartamentoById(int numeroArea);


    // Metodo para Consultar todos los departamentos
    @Select("SELECT * FROM departamento")
    @Results({
        @Result(property = "numeroArea", column = "numero_area"),
        @Result(property = "departamento", column = "departamento"),
        @Result(property = "nombreCorto", column = "nombre_corto"),
        @Result(property = "direccion", column = "direccion")
    })
    List<Departamento> getAllDepartamentos();




    // Metodo para Actualizar un departamento existente
    @Update("UPDATE departamento SET departamento = #{departamento}, nombre_corto = #{nombreCorto}, " +
            "direccion = #{direccion} WHERE numero_area = #{numeroArea}")
    void updateDepartamento(Departamento departamento);




    // Metodo para Eliminar un departamento por su número de área
    @Delete("DELETE FROM departamento WHERE numero_area = #{numeroArea}")
    void deleteDepartamento(int numeroArea);
}
