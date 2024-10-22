package com.departamento.departamento.controllers;

import com.departamento.departamento.mappers.DepartamentoMapper;
import com.departamento.departamento.models.Departamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/departamento")
public class DepartamentoController {

    @Autowired
    private DepartamentoMapper departamentoMapper;

    // RUTA PARA Crear un nuevo departamento
    @PostMapping("/crear")
    public ResponseEntity<String> crearDepartamento(@RequestBody Departamento departamento) {
        try {
            departamentoMapper.insertDepartamento(departamento);
            return ResponseEntity.ok("Departamento creado exitosamente");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error al crear el departamento: " + e.getMessage());
        }
    }




    // RUTA PARA Actualizar un departamento existente
    @PutMapping("/actualizar/{numeroArea}")
    public ResponseEntity<String> actualizarDepartamento(@PathVariable int numeroArea, @RequestBody Departamento departamento) {
        try {
            departamento.setNumeroArea(numeroArea);
            departamentoMapper.updateDepartamento(departamento);
            return ResponseEntity.ok("Departamento actualizado exitosamente");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error al actualizar el departamento: " + e.getMessage());
        }
    }





    //  RUTA PARA Consultar un departamento por su número de área
    @GetMapping("/consultar/{numeroArea}")
    public ResponseEntity<Departamento> consultarDepartamento(@PathVariable int numeroArea) {
        Departamento departamento = departamentoMapper.getDepartamentoById(numeroArea);
        if (departamento != null) {
            return ResponseEntity.ok(departamento);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // RUTA PARA Consultar todos los departamentos
    @GetMapping("/consultarTodos")
    public ResponseEntity<List<Departamento>> consultarTodosLosDepartamentos() {
        List<Departamento> departamentos = departamentoMapper.getAllDepartamentos();
        return ResponseEntity.ok(departamentos);
    }




    // RUTA PARA Eliminar un departamento por su número de área
    @DeleteMapping("/eliminar/{numeroArea}")
    public ResponseEntity<String> eliminarDepartamento(@PathVariable int numeroArea) {
        try {
            departamentoMapper.deleteDepartamento(numeroArea);
            return ResponseEntity.ok("Departamento eliminado exitosamente");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error al eliminar el departamento: " + e.getMessage());
        }
    }
}
