***SCRIPT BASE DE DATOS***


CREATE TABLE departamento (
    numero_area INT PRIMARY KEY,      -- Clave primaria: Identificador único para cada departamento
    departamento VARCHAR2(50),        -- Nombre del departamento
    nombre_corto VARCHAR2(20),        -- Nombre corto o abreviado del departamento
    direccion VARCHAR2(100)           -- Dirección del departamento
);



CREATE TABLE empleado (
    numero_empleado INT PRIMARY KEY,   -- Identificador único para cada empleado, ahora como VARCHAR2
    nombre VARCHAR2(50),                       -- Nombre del empleado
    apellidos VARCHAR2(50),                    -- Apellidos del empleado
    fecha_nacimiento VARCHAR2(10),             -- Fecha de nacimiento como string (formato YYYY-MM-DD recomendado)
    fecha_ingreso VARCHAR2(10),                -- Fecha de ingreso como string (formato YYYY-MM-DD recomendado)
    area_trabajo VARCHAR2(10)                  -- Área de trabajo
);







