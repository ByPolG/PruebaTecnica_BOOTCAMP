package org.example;

import org.example.controllers.EmpleadoController;
import org.example.entities.Empleado;
import org.example.exceptions.EmpleadoActualizadoException;
import org.example.exceptions.EmpleadoBorradoException;
import org.example.exceptions.EmpleadoCreadoException;
import org.example.exceptions.EmpleadoNoEncontradoException;

import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        EmpleadoController controller = new EmpleadoController();

        // Creamos un empleado nuevo

        /*try {

            Empleado nuevoEmpleado = new Empleado("Marta", "Diaz", "Jefa Administración", 35000.00, LocalDate.of(2025, 12, 1));
            controller.create(nuevoEmpleado);

        } catch (EmpleadoCreadoException e) {

            System.err.println("Error al crear al empleado: " + e.getMessage());

        } finally {

            System.out.println("\nOperación concluida.");

            // List<Empleado> empleados = controller.findAll();
            // empleados.forEach(System.out::println);
        }*/

        // Mostramos todos los empleados

        /*try {

            List<Empleado> empleados = controller.findAll();
            empleados.forEach(System.out::println);

        } catch (Exception e) {

            System.err.println("Error al mostrar a los empleados: " + e.getMessage());

        } finally {

            System.out.println("\nOperación concluida.");

            // List<Empleado> empleados = controller.findAll();
            // empleados.forEach(System.out::println);
        }*/

        // Actualizamos un empleado usando su ID

        /*try {

            Integer idEmpleado = 12;
            Empleado actualizarEmpleado = controller.findOne(idEmpleado);

            // Elegimos los datos a modificar

            actualizarEmpleado.setNombre("Francisco");
            actualizarEmpleado.setApellido("Javier");
            actualizarEmpleado.setSalario(15.00);
            actualizarEmpleado.setCargo("Accionista");
            actualizarEmpleado.setFechaInicio(LocalDate.of(2022, 2, 20));

            // Guardamos los cambios

            controller.update(actualizarEmpleado);

        } catch (EmpleadoNoEncontradoException e) {

            System.err.println("Error al buscar al empleado para actualizarlo: " + e.getMessage());

        } catch (EmpleadoActualizadoException e) {

            System.err.println("Error al actualizar al empleado: " + e.getMessage());

        } finally {

            System.out.println("\nOperación concluida.");

            // List<Empleado> empleados = controller.findAll();
            // empleados.forEach(System.out::println);
        }*/

        // Eliminamos un empleado usando su ID

        try {

            Integer idEliminar = 12;
            controller.delete(idEliminar);

        } catch (EmpleadoBorradoException e) {

            System.err.println(e.getMessage());

        } finally {

            System.out.println("\nOperación concluida.");

            // List<Empleado> empleados = controller.findAll();
            // empleados.forEach(System.out::println);
        }
    }
}
