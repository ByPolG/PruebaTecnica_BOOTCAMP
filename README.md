Ejecución de la aplicación
--------------------------

La aplicación realiza las siguientes acciones al ejecutarse:

- Creará un nuevo empleado con los datos proporcionados (nombre, apellido, cargo, salario, fecha de ingreso).
- Mostrará una lista de todos los empleados registrados en la base de datos.
- Actualizará los datos de cualquier empleado existente escogiendo su ID.
- Eliminará cualquier empleado existente escogiendo su ID.

Si alguna de estas acciones falla (por ejemplo, si no se encuentra el empleado para actualizarlo o eliminarlo), se lanzarán excepciones personalizadas y se mostrarán en la consola.

Manejo de Excepciones
---------------------

Se han creado excepciones personalizadas para cada tipo de error que puede ocurrir durante la ejecución de la aplicación:

- EmpleadoCreadoException: Se lanza si ocurre un error al intentar crear un empleado.
- EmpleadoNoEncontradoException: Se lanza si no se encuentra un empleado al intentar actualizarlo o eliminarlo.
- EmpleadoActualizadoException: Se lanza si ocurre un error al intentar actualizar un empleado.
- EmpleadoBorradoException: Se lanza si ocurre un error al intentar eliminar un empleado.

Estas excepciones son manejadas por los "try-catch" dentro de la aplicación, mostrando mensajes de error específicos cuando algo falla.

Supuestos
---------

- Se asume que la base de datos está configurada correctamente y es accesible desde la aplicación.
- Se asume que la tabla "empleados" ya existe en la base de datos con las columnas id, nombre, apellido, cargo, salario y fecha_ingreso.
- Se asume que los métodos crear, leer, buscar, actualizar y eliminar están correctamente implementados y que el EntityManager está configurado correctamente.
- Se han usado algunos datos de prueba.
- Se asume que la aplicación maneja correctamente las transacciones de la base de datos (es decir, hace "commit" al finalizar con éxito y "rollback" en caso de error).

Pruebas
-------

Para probar la aplicación, puedes:

1. Ejecutar el programa para observar cómo se realizan las operaciones sobre los empleados.
2. Comentar y descomentar partes del código (main), como el bloque de la acción de eliminar o actualizar, para ver cómo responde la aplicación.
3. Modificar los datos de entrada, como el salario o la fecha de ingreso, para comprobar que al actualizar algún empleado funciona correctamente.

Requisitos
----------

Para probar la aplicación, necesitas:

- Tener IntelliJ IDEA Community Edition instalado (la versión usada en el proyecto es la 2024.3.1).
- Tener XAMPP instalado.
- Tener MySQL Workbench instalado (la versión usada en el proyecto es la 8.0 CE).
- Crear la base de datos "empresa".
- Crear la tabla "empleados".
- Crear datos de prueba.

(Todos los comandos para crear la base de datos se encuentran en el archivo "empresa.sql").

