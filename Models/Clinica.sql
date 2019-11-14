-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 14-11-2019 a las 10:35:49
-- Versión del servidor: 8.0.17-0ubuntu2
-- Versión de PHP: 7.3.11-0ubuntu0.19.10.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `Clinica`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Citas`
--

CREATE TABLE `Citas` (
  `IDCita` int(5) NOT NULL,
  `IDMedico` int(5) NOT NULL,
  `IDPaciente` int(5) NOT NULL,
  `Fecha` date NOT NULL,
  `Hora` time(6) NOT NULL,
  `Descripcion` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Medico`
--

CREATE TABLE `Medico` (
  `IDMedico` int(5) NOT NULL,
  `Nombre` varchar(50) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `APaterno` varchar(50) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `AMaterno` varchar(50) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `Correo` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Paciente`
--

CREATE TABLE `Paciente` (
  `IDPaciente` int(5) NOT NULL,
  `Nombre` varchar(50) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `APaterno` varchar(50) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `AMaterno` varchar(50) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `Edad` int(3) NOT NULL,
  `Correo` varchar(100) NOT NULL,
  `TContacto` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `Citas`
--
ALTER TABLE `Citas`
  ADD PRIMARY KEY (`IDCita`),
  ADD KEY `IDMedico` (`IDMedico`),
  ADD KEY `IDPaciente` (`IDPaciente`);

--
-- Indices de la tabla `Medico`
--
ALTER TABLE `Medico`
  ADD PRIMARY KEY (`IDMedico`);

--
-- Indices de la tabla `Paciente`
--
ALTER TABLE `Paciente`
  ADD PRIMARY KEY (`IDPaciente`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `Citas`
--
ALTER TABLE `Citas`
  MODIFY `IDCita` int(5) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `Medico`
--
ALTER TABLE `Medico`
  MODIFY `IDMedico` int(5) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `Paciente`
--
ALTER TABLE `Paciente`
  MODIFY `IDPaciente` int(5) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `Citas`
--
ALTER TABLE `Citas`
  ADD CONSTRAINT `Citas_ibfk_1` FOREIGN KEY (`IDMedico`) REFERENCES `Medico` (`IDMedico`) ON DELETE RESTRICT ON UPDATE CASCADE,
  ADD CONSTRAINT `Citas_ibfk_2` FOREIGN KEY (`IDPaciente`) REFERENCES `Paciente` (`IDPaciente`) ON DELETE RESTRICT ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
