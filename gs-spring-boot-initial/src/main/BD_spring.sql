-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 29-01-2024 a las 17:50:43
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
  `nombre` varchar(255) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `stock` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`id`, `descripcion`, `imagen`, `nombre`, `price`, `stock`) VALUES
(1, 'Las Bananas mas ricas y baratas del mercado.', 'https://acdn.mitiendanube.com/stores/001/219/229/products/banana1-39d62a544fc16a2b8016025979095295-640-0.jpg', 'Banana', 102.5, 1520),
(2, 'Las manzanas mas deliciosas y tiernas de todas.', 'https://almacen.do/wp-content/uploads/2020/12/Manzanas-Rojas_-1-lb-Front.jpg', 'Manzana', 106.32, 3000),
(3, 'Las Peras mas ricas y dulces del mercado.', 'https://puntovegetal.com.ar/static/media/productos/pera.png', 'Peras', 121.2, 2540),
(4, 'Las manzanas mas deliciosas y tiernas de todas.', 'https://almacen.do/wp-content/uploads/2020/12/Manzanas-Rojas_-1-lb-Front.jpg', 'Manzana', 180.6, 2110),
(5, 'Las Bananas mas ricas y baratas del mercado.', 'https://acdn.mitiendanube.com/stores/001/219/229/products/banana1-39d62a544fc16a2b8016025979095295-640-0.jpg', 'Banana', 147.3, 2121),
(6, 'Las manzanas mas deliciosas y tiernas de todas.', 'https://almacen.do/wp-content/uploads/2020/12/Manzanas-Rojas_-1-lb-Front.jpg', 'Manzana', 156.25, 2000),
(7, 'Las Bananas mas ricas y baratas del mercado.', 'https://acdn.mitiendanube.com/stores/001/219/229/products/banana1-39d62a544fc16a2b8016025979095295-640-0.jpg', 'Banana', 122.35, 2450),
(8, 'Las manzanas mas deliciosas y tiernas de todas.', 'https://almacen.do/wp-content/uploads/2020/12/Manzanas-Rojas_-1-lb-Front.jpg', 'Manzana', 190.6, 4521),
(9, 'Las Bananas mas ricas y baratas del mercado.', 'https://acdn.mitiendanube.com/stores/001/219/229/products/banana1-39d62a544fc16a2b8016025979095295-640-0.jpg', 'Banana', 152.2, 12445),
(10, 'Las manzanas mas deliciosas y tiernas de todas.', 'https://almacen.do/wp-content/uploads/2020/12/Manzanas-Rojas_-1-lb-Front.jpg', 'Manzana', 125.2, 1212),
(11, 'Las Peras mas ricas y dulces del mercado.', 'https://puntovegetal.com.ar/static/media/productos/pera.png', 'Peras', 99.87, 1214),
(12, 'Las manzanas mas deliciosas y tiernas de todas.', 'https://almacen.do/wp-content/uploads/2020/12/Manzanas-Rojas_-1-lb-Front.jpg', 'Manzana', 87.6, 1237),
(13, 'Las Bananas mas ricas y baratas del mercado.', 'https://acdn.mitiendanube.com/stores/001/219/229/products/banana1-39d62a544fc16a2b8016025979095295-640-0.jpg', 'Banana', 102.5, 1520),
(14, 'Las manzanas mas deliciosas y tiernas de todas.', 'https://almacen.do/wp-content/uploads/2020/12/Manzanas-Rojas_-1-lb-Front.jpg', 'Manzana', 106.32, 3000),
(15, 'Las Peras mas ricas y dulces del mercado.', 'https://puntovegetal.com.ar/static/media/productos/pera.png', 'Peras', 121.2, 2540),
(16, 'Las manzanas mas deliciosas y tiernas de todas.', 'https://almacen.do/wp-content/uploads/2020/12/Manzanas-Rojas_-1-lb-Front.jpg', 'Manzana', 180.6, 2110),
(17, 'Las Bananas mas ricas y baratas del mercado.', 'https://acdn.mitiendanube.com/stores/001/219/229/products/banana1-39d62a544fc16a2b8016025979095295-640-0.jpg', 'Banana', 147.3, 2121),
(18, 'Las manzanas mas deliciosas y tiernas de todas.', 'https://almacen.do/wp-content/uploads/2020/12/Manzanas-Rojas_-1-lb-Front.jpg', 'Manzana', 156.25, 2000),
(19, 'Las Bananas mas ricas y baratas del mercado.', 'https://acdn.mitiendanube.com/stores/001/219/229/products/banana1-39d62a544fc16a2b8016025979095295-640-0.jpg', 'Banana', 122.35, 2450),
(20, 'Las manzanas mas deliciosas y tiernas de todas.', 'https://almacen.do/wp-content/uploads/2020/12/Manzanas-Rojas_-1-lb-Front.jpg', 'Manzana', 190.6, 4521),
(21, 'Las Bananas mas ricas y baratas del mercado.', 'https://acdn.mitiendanube.com/stores/001/219/229/products/banana1-39d62a544fc16a2b8016025979095295-640-0.jpg', 'Banana', 152.2, 12445),
(22, 'Las manzanas mas deliciosas y tiernas de todas.', 'https://almacen.do/wp-content/uploads/2020/12/Manzanas-Rojas_-1-lb-Front.jpg', 'Manzana', 125.2, 1212),
(23, 'Las Peras mas ricas y dulces del mercado.', 'https://puntovegetal.com.ar/static/media/productos/pera.png', 'Peras', 99.87, 1214),
(24, 'Las manzanas mas deliciosas y tiernas de todas.', 'https://almacen.do/wp-content/uploads/2020/12/Manzanas-Rojas_-1-lb-Front.jpg', 'Manzana', 87.6, 1237);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
