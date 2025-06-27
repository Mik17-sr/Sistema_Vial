-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 27-06-2025 a las 02:31:27
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `sistema_vial`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comparendo`
--

CREATE TABLE `comparendo` (
  `id_comparendo` int(11) NOT NULL,
  `hora` time NOT NULL,
  `tipo_comparendo` varchar(500) NOT NULL,
  `fecha` date NOT NULL,
  `id_vehiculo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `comparendo`
--

INSERT INTO `comparendo` (`id_comparendo`, `hora`, `tipo_comparendo`, `fecha`, `id_vehiculo`) VALUES
(2, '18:26:20', 'Velocidad excesiva', '2025-05-21', 2),
(3, '18:29:50', 'Velocidad excesiva', '2025-05-21', 3),
(4, '20:55:27', 'Velocidad excesiva', '2025-05-21', 4),
(5, '04:43:20', 'Velocidad Excesiva', '2025-05-25', 4),
(6, '04:49:45', 'Velocidad Excesiva', '2025-05-25', 6),
(7, '08:45:10', 'Velocidad Excesiva', '2025-05-25', 7),
(8, '10:20:35', 'Velocidad Excesiva', '2025-05-25', 9),
(9, '12:05:50', 'Velocidad Excesiva', '2025-05-25', 11);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `propietario`
--

CREATE TABLE `propietario` (
  `id_propietario` int(11) NOT NULL,
  `identificacion` varchar(500) NOT NULL,
  `correo` varchar(500) NOT NULL,
  `nombre` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `propietario`
--

INSERT INTO `propietario` (`id_propietario`, `identificacion`, `correo`, `nombre`) VALUES
(1, '1023647859', 'lupqwer@gmail.com', 'Lupe Andrea'),
(2, '1000123456', 'juan.perez@email.com', 'Juan Pérez'),
(3, '1000789123', 'laura.gomez@email.com', 'Laura Gómez'),
(4, '1000345678', 'carlos.moreno@email.com', 'Carlos Moreno'),
(5, '1000987654', 'andrea.lopez@email.com', 'Andrea López'),
(6, '1000567890', 'maria.rodriguez@email.com', 'María Rodríguez'),
(7, '1000678912', 'david.martinez@email.com', 'David Martínez'),
(8, '1000432187', 'sofia.torres@email.com', 'Sofía Torres'),
(9, '1000654321', 'jose.ramirez@email.com', 'José Ramírez'),
(10, '1000876543', 'camila.sanchez@email.com', 'Camila Sánchez'),
(11, '1000234567', 'diego.fernandez@email.com', 'Diego Fernández'),
(12, '14554578984', 'santibelfree@gmail.com', 'Tomas Lancheros'),
(13, '1022547487', 'boddymalagon2003@gmail.com', 'Andres Malagon'),
(14, '1024875114', 'cstrianal@udistrital.edu.co', 'Cristian Triana'),
(15, '1036784698', 'daniel.carreon@email.com', 'Daniel Carreon'),
(17, '45487884513', 'lucas.valenzuela@email.com', 'Lucas Valenzuela'),
(18, '2364785497', 'andres.suarez@email.com', 'Andres Suarez'),
(20, '11231912312', 'lucas.vasquez@email.com', 'Lucas Vazquez'),
(21, '123812381', 'castrillonangelica@hotmail.com', 'Maria Angélica'),
(23, '123442112334', 'a@a.com', 'nuevo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vehiculo`
--

CREATE TABLE `vehiculo` (
  `id_vehiculo` int(11) NOT NULL,
  `placa` varchar(500) NOT NULL,
  `marca` varchar(500) NOT NULL,
  `modelo` int(11) NOT NULL,
  `tipo_vehiculo` varchar(500) NOT NULL,
  `id_propietario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `vehiculo`
--

INSERT INTO `vehiculo` (`id_vehiculo`, `placa`, `marca`, `modelo`, `tipo_vehiculo`, `id_propietario`) VALUES
(2, 'MSX413', 'Ford', 2012, 'Carro', 12),
(3, 'LOX47H', 'Bajaj', 2024, 'Moto', 13),
(4, 'JAV27H', 'Suzuki', 2025, 'Moto', 14),
(5, 'WCL839', 'Renault', 2009, 'Carro', 10),
(6, 'JUC293', 'Skoda', 2023, 'Carro', 8),
(7, 'ITP37C', 'Royal Enfield', 2008, 'Moto', 4),
(9, 'POT123', 'Mercedes Benz', 2001, 'Carro', 9),
(11, 'LOR27H', 'Suzuki', 2025, 'Moto', 11);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `comparendo`
--
ALTER TABLE `comparendo`
  ADD PRIMARY KEY (`id_comparendo`),
  ADD KEY `fk_comparendo_vehiculo` (`id_vehiculo`);

--
-- Indices de la tabla `propietario`
--
ALTER TABLE `propietario`
  ADD PRIMARY KEY (`id_propietario`);

--
-- Indices de la tabla `vehiculo`
--
ALTER TABLE `vehiculo`
  ADD PRIMARY KEY (`id_vehiculo`),
  ADD KEY `fk_vehiculo_propietario` (`id_propietario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `comparendo`
--
ALTER TABLE `comparendo`
  MODIFY `id_comparendo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `propietario`
--
ALTER TABLE `propietario`
  MODIFY `id_propietario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT de la tabla `vehiculo`
--
ALTER TABLE `vehiculo`
  MODIFY `id_vehiculo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `comparendo`
--
ALTER TABLE `comparendo`
  ADD CONSTRAINT `fk_comparendo_vehiculo` FOREIGN KEY (`id_vehiculo`) REFERENCES `vehiculo` (`id_vehiculo`) ON DELETE CASCADE;

--
-- Filtros para la tabla `vehiculo`
--
ALTER TABLE `vehiculo`
  ADD CONSTRAINT `fk_vehiculo_propietario` FOREIGN KEY (`id_propietario`) REFERENCES `propietario` (`id_propietario`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
