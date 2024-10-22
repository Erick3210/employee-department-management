package com.departamento.departamento.controllers;

import com.departamento.departamento.mappers.EmpleadoMapper;
import com.departamento.departamento.models.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Isolation;
import java.util.List;

@RestController
@RequestMapping("/empleado")
public class empleadoController {

    @Autowired
    private EmpleadoMapper empleadoMapper;


     // RUTA PARA Crear un nuevo EMPLEADO
    @Transactional(isolation = Isolation.READ_COMMITTED)
    @PostMapping("/crear")
    public ResponseEntity<String> crearEmpleado(@RequestBody Empleado empleado) {
        try {
            System.out.println("Datos recibidos para crear empleado: " + empleado);
            System.out.println("Intentando insertar el empleado en la base de datos...");
            empleadoMapper.insertEmpleado(empleado);
            System.out.println("Empleado insertado y commit realizado.");
            return ResponseEntity.ok("Empleado creado exitosamente");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error al crear el empleado: " + e.getMessage());
            return ResponseEntity.status(500).body("Error al crear el empleado: " + e.getMessage());
        }
    }


    // RUTA PARA Actualizar un EMPLEADO EXISTENTE
    @PutMapping("/actualizar/{numeroEmpleado}")
    public ResponseEntity<String> actualizarEmpleado(@PathVariable int numeroEmpleado, @RequestBody Empleado empleado) {
        try {
            empleado.setNumeroEmpleado(numeroEmpleado);
            empleadoMapper.updateEmpleado(empleado);
            return ResponseEntity.ok("Empleado actualizado exitosamente");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error al actualizar el empleado: " + e.getMessage());
        }
    }



//  RUTA PARA Consultar un empleado por su número de área
    @GetMapping("/consultar/{numeroEmpleado}")
    public ResponseEntity<Empleado> consultarEmpleado(@PathVariable int numeroEmpleado) {
        Empleado empleado = empleadoMapper.getEmpleadoById(numeroEmpleado);
        if (empleado != null) {
            return ResponseEntity.ok(empleado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
 // RUTA PARA Consultar todos los empleados
    @GetMapping("/consultarTodos")
    public ResponseEntity<List<Empleado>> consultarTodosLosEmpleados() {
        List<Empleado> empleados = empleadoMapper.getAllEmpleados();
        return ResponseEntity.ok(empleados);
    }




   // RUTA PARA Eliminar un empleado por su número de área
    @DeleteMapping("/eliminar/{numeroEmpleado}")
    public ResponseEntity<String> eliminarEmpleado(@PathVariable int numeroEmpleado) {
        try {
            empleadoMapper.deleteEmpleado(numeroEmpleado);
            return ResponseEntity.ok("Empleado eliminado exitosamente");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error al eliminar el empleado: " + e.getMessage());
        }
    }
}
