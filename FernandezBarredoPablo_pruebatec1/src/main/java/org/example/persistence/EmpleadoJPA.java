package org.example.persistence;

import jakarta.persistence.EntityManager;
import org.example.entities.Empleado;
import org.example.exceptions.EmpleadoActualizadoException;
import org.example.exceptions.EmpleadoBorradoException;
import org.example.exceptions.EmpleadoCreadoException;
import org.example.exceptions.EmpleadoNoEncontradoException;

import java.util.List;

public class EmpleadoJPA {

    // Para crear un nuevo empleado

    public void create(Empleado nuevoEmpleado) throws EmpleadoCreadoException {

        EntityManager em = ConfigJPA.getEntityManager();

        try {

            em.getTransaction().begin();
            em.persist(nuevoEmpleado);
            em.getTransaction().commit();

            System.out.println("Se ha creado un nuevo empleado.");

        } catch (Exception e) {

            if (em.getTransaction().isActive()) {

                em.getTransaction().rollback();
            }

            throw new EmpleadoCreadoException("Error al crear al empleado: " + e.getMessage());

        } finally {

            em.close();
        }
    }


    // Para mostrar todos los empleados

    public List<Empleado> findAll() {

        EntityManager em = ConfigJPA.getEntityManager();

        try {

            return em.createQuery("FROM Empleado", Empleado.class).getResultList();

        } finally {

            em.close();
        }
    }

    // Para buscar un empleado por su ID

    public Empleado findOne(Integer idBuscado) throws EmpleadoNoEncontradoException {

        EntityManager em = ConfigJPA.getEntityManager();

        try {

            Empleado empleado = em.find(Empleado.class, idBuscado);

            if (empleado == null) {

                throw new EmpleadoNoEncontradoException("No se ha encontrado al empleado con el ID " + idBuscado);
            }

            return empleado;

        } finally {

            em.close();
        }
    }


    // Para actualizar los datos de un empleado

    public void update(Empleado empleadoActualizado) throws EmpleadoActualizadoException {

        EntityManager em = ConfigJPA.getEntityManager();

        try {

            em.getTransaction().begin();

            if (em.find(Empleado.class, empleadoActualizado.getId()) == null) {

                throw new EmpleadoActualizadoException("No se ha encontrado al empleado con el ID " + empleadoActualizado.getId());
            }

            em.merge(empleadoActualizado);
            em.getTransaction().commit();

            System.out.println("Empleado actualizado.");

        } catch (Exception e) {

            if (em.getTransaction().isActive()) {

                em.getTransaction().rollback();
            }

            throw new EmpleadoActualizadoException("Error al actualizar al empleado: " + e.getMessage());

        } finally {

            em.close();
        }
    }

    // Para eliminar un empleado

    public void delete(Integer idEliminar) throws EmpleadoBorradoException {

        EntityManager em = ConfigJPA.getEntityManager();

        try {

            em.getTransaction().begin();

            Empleado empleado = em.find(Empleado.class, idEliminar);

            if (empleado == null) {

                throw new EmpleadoBorradoException("No se ha encontrado al empleado con el ID " + idEliminar);
            }

            em.remove(empleado);
            em.getTransaction().commit();

            System.out.println("El empleado con el ID " + idEliminar + " ha sido eliminado.");

        } catch (Exception e) {

            if (em.getTransaction().isActive()) {

                em.getTransaction().rollback();
            }

            throw new EmpleadoBorradoException("Error al eliminar al empleado: " + e.getMessage());

        } finally {

            em.close();
        }
    }

}
