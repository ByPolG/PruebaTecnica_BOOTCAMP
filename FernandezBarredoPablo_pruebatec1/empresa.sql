-- Creamos la base de datos
CREATE DATABASE empresa;

-- Seleccionamos la base ya creada y creamos la tabla
USE empresa;
CREATE TABLE empleados (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100) NOT NULL,
    cargo VARCHAR(50) NOT NULL,
    salario DECIMAL(10, 2) NOT NULL,
    fecha_inicio DATE NOT NULL
);

-- Metemos datos en la tabla
INSERT INTO empleados (nombre, apellido, cargo, salario, fecha_inicio) VALUES
('Juan', 'Pérez', 'Programador', 50000.00, '2024-06-15'),
('María', 'Gómez', 'Directora Marketing', 65000.00, '2023-08-01'),
('Carlos', 'López', 'Diseñador', 45000.00, '2024-01-10'),
('Daniel', 'Sánchez', 'Diseñadora', 45000.00, '2020-03-22'),
('Pedro', 'Fernández', 'Administrador', 35000.00, '2022-07-11'),
('Lucía', 'Rodríguez', 'Marketing', 48000.00, '2020-11-05'),
('Darío', 'Ramírez', 'Programador Jefe', 55000.00, '2017-09-18'),
('María', 'Dolores', 'Diseñadora Jefe', 53000.00, '2023-12-01'),
('Diego', 'Álvarez', 'Fundador', 80000.00, '2015-01-20'),
('Laura', 'Barredo', 'Cofundadora', 70000.00, '2015-01-20');