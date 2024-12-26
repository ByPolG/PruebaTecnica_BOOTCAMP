package org.example.controllers;

import org.example.entities.Empleado;
import org.example.exceptions.EmpleadoActualizadoException;
import org.example.exceptions.EmpleadoBorradoException;
import org.example.exceptions.EmpleadoCreadoException;
import org.example.exceptions.EmpleadoNoEncontradoException;
import org.example.persistence.EmpleadoJPA;

import java.util.List;

public class EmpleadoController {

    private final EmpleadoJPA empleadoJPA = new EmpleadoJPA();

    // Para crear un nuevo empleado

    public void create(Empleado empleado) throws EmpleadoCreadoException {
        empleadoJPA.create(empleado);
    }

    // Para mostrar todos los empleados

    public List<Empleado> findAll() {
        return empleadoJPA.findAll();
    }

    // Para buscar un empleado por su ID

    public Empleado findOne(Integer id) throws EmpleadoNoEncontradoException {
        return empleadoJPA.findOne(id);
    }

    // Para actualizar un empleado

    public void update(Empleado empleado) throws EmpleadoActualizadoException {
        empleadoJPA.update(empleado);
    }

    // Para eliminar un empleado por su ID

    public void delete(Integer id) throws EmpleadoBorradoException {
        empleadoJPA.delete(id);
    }
}
