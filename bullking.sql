-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 21, 2024 at 05:04 AM
-- Server version: 10.3.16-MariaDB
-- PHP Version: 7.3.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gym`
--

-- --------------------------------------------------------

--
-- Table structure for table `bullking`
--

CREATE TABLE `bullking` (
  `id` int(11) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `alat` varchar(30) NOT NULL,
  `nomor` varchar(30) NOT NULL,
  `waktu` int(11) NOT NULL,
  `biaya` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bullking`
--

INSERT INTO `bullking` (`id`, `nama`, `alat`, `nomor`, `waktu`, `biaya`) VALUES
(1, 'Haqi', 'Barbel', '098796869790', 2, 100000),
(3, 'Kendal', 'Mata Bor', '086798567456', 5, 20000),
(4, 'Dico', 'Mata Gerinda', '085467356213', 10, 200000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bullking`
--
ALTER TABLE `bullking`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bullking`
--
ALTER TABLE `bullking`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
