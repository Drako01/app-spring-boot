-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-01-2024 a las 03:00:15
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
-- Base de datos: `spring`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `id` bigint(20) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `imagen` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`id`, `descripcion`, `imagen`, `nombre`) VALUES
(1, 'Las Bananas mas ricas y baratas del mercado.', 'https://acdn.mitiendanube.com/stores/001/219/229/products/banana1-39d62a544fc16a2b8016025979095295-640-0.jpg', 'Banana'),
(2, 'Las manzanas mas deliciosas y tiernas de todas.', 'https://almacen.do/wp-content/uploads/2020/12/Manzanas-Rojas_-1-lb-Front.jpg', 'Manzana'),
(3, 'Las Bananas mas ricas y baratas del mercado.', 'https://acdn.mitiendanube.com/stores/001/219/229/products/banana1-39d62a544fc16a2b8016025979095295-640-0.jpg', 'Banana'),
(4, 'Las manzanas mas deliciosas y tiernas de todas.', 'https://almacen.do/wp-content/uploads/2020/12/Manzanas-Rojas_-1-lb-Front.jpg', 'Manzana'),
(5, 'Las Bananas mas ricas y baratas del mercado.', 'https://acdn.mitiendanube.com/stores/001/219/229/products/banana1-39d62a544fc16a2b8016025979095295-640-0.jpg', 'Banana'),
(6, 'Las manzanas mas deliciosas y tiernas de todas.', 'https://almacen.do/wp-content/uploads/2020/12/Manzanas-Rojas_-1-lb-Front.jpg', 'Manzana'),
(7, 'Las Bananas mas ricas y baratas del mercado.', 'https://acdn.mitiendanube.com/stores/001/219/229/products/banana1-39d62a544fc16a2b8016025979095295-640-0.jpg', 'Banana'),
(8, 'Las manzanas mas deliciosas y tiernas de todas.', 'https://almacen.do/wp-content/uploads/2020/12/Manzanas-Rojas_-1-lb-Front.jpg', 'Manzana');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id` bigint(20) NOT NULL,
  `correo` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id`, `correo`, `nombre`) VALUES
(1, 'alejandro@mail.com', 'Alejandro'),
(2, 'usuario_prueba@mail.com', 'Usuario');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
