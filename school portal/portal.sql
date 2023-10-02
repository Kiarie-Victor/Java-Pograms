-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 22, 2023 at 11:13 PM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `portal`
--
CREATE DATABASE IF NOT EXISTS `portal` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `portal`;

-- --------------------------------------------------------

--
-- Table structure for table `course`
--

DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `courseid` varchar(40) NOT NULL,
  `coursename` varchar(40) NOT NULL,
  `regno` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `exam`
--

DROP TABLE IF EXISTS `exam`;
CREATE TABLE `exam` (
  `id` int(10) NOT NULL,
  `course` varchar(40) NOT NULL,
  `unit` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `exam`
--

INSERT INTO `exam` (`id`, `course`, `unit`) VALUES
(1, 'Software Engineering', 'Algebra'),
(2, 'Software Engineering', 'Economics');

-- --------------------------------------------------------

--
-- Table structure for table `examresults`
--

DROP TABLE IF EXISTS `examresults`;
CREATE TABLE `examresults` (
  `regno` varchar(50) NOT NULL,
  `name` varchar(40) NOT NULL,
  `unit` varchar(40) NOT NULL,
  `grade` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `examresults`
--

INSERT INTO `examresults` (`regno`, `name`, `unit`, `grade`) VALUES
('CIT-223-011/2021', 'Maxwell Mugo', 'Algebra', 'B'),
('CIT-227-011/2020', 'Alex Samuel', 'Algebra', 'A'),
('CIT-227-011/2021', 'Mua Emmanuel', 'Algebra', 'A'),
('CIT-227-016/2021', 'Ivy Mugure', 'Algebra', 'A'),
('CIT-227-042/2021', 'Jeanne Kilimo', 'Algebra', 'A');

-- --------------------------------------------------------

--
-- Table structure for table `exams`
--

DROP TABLE IF EXISTS `exams`;
CREATE TABLE `exams` (
  `course` varchar(40) NOT NULL,
  `unit` varchar(40) NOT NULL,
  `file` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `fee`
--

DROP TABLE IF EXISTS `fee`;
CREATE TABLE `fee` (
  `yos` varchar(40) NOT NULL,
  `sem` varchar(40) NOT NULL,
  `amount` double NOT NULL,
  `paid` double NOT NULL,
  `bal` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `fee`
--

INSERT INTO `fee` (`yos`, `sem`, `amount`, `paid`, `bal`) VALUES
('Y1', 'Sem 2', 20000, 18000, 2000),
('Y1', 'Sem 2', 12000, 13000, -1000);

-- --------------------------------------------------------

--
-- Table structure for table `parent`
--

DROP TABLE IF EXISTS `parent`;
CREATE TABLE `parent` (
  `id` int(11) NOT NULL,
  `FullName` varchar(100) DEFAULT NULL,
  `ParentEmail` varchar(120) DEFAULT NULL,
  `UserName` varchar(100) NOT NULL,
  `Mobno` varchar(40) NOT NULL,
  `Password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `parent`
--

INSERT INTO `parent` (`id`, `FullName`, `ParentEmail`, `UserName`, `Mobno`, `Password`) VALUES
(3, 'Mua John', 'john@gmail.com', 'johnmua', '0758514600', '1234');

-- --------------------------------------------------------

--
-- Table structure for table `tblstudents`
--

DROP TABLE IF EXISTS `tblstudents`;
CREATE TABLE `tblstudents` (
  `RegNo` varchar(100) NOT NULL,
  `FullName` varchar(120) DEFAULT NULL,
  `EmailId` varchar(120) DEFAULT NULL,
  `MobileNumber` char(11) DEFAULT NULL,
  `Password` varchar(120) DEFAULT NULL,
  `RegDate` timestamp NULL DEFAULT current_timestamp(),
  `UpdationDate` timestamp NULL DEFAULT NULL ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tblstudents`
--

INSERT INTO `tblstudents` (`RegNo`, `FullName`, `EmailId`, `MobileNumber`, `Password`, `RegDate`, `UpdationDate`) VALUES
('CIT-223-011/2021', 'Mugo Maxwell', 'mugo@gmail.com', '01123456778', '0123', '2023-04-22 16:11:44', NULL),
('CIT-227-016/2021', 'Ivy Mugure', 'ivy@gmail.coom', '0987654321', '1245', '2023-04-22 15:53:24', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `unitsreg`
--

DROP TABLE IF EXISTS `unitsreg`;
CREATE TABLE `unitsreg` (
  `unit1` varchar(40) NOT NULL,
  `unit2` varchar(40) NOT NULL,
  `unit3` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `unitsreg`
--

INSERT INTO `unitsreg` (`unit1`, `unit2`, `unit3`) VALUES
('Software Eng. IV', 'Operating System IV', 'Algebra IV'),
('Calculus III', 'Operating System II', 'Research II'),
('Software Eng.', 'Operating System', 'Algebra');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `course`
--
ALTER TABLE `course`
  ADD PRIMARY KEY (`courseid`);

--
-- Indexes for table `exam`
--
ALTER TABLE `exam`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `examresults`
--
ALTER TABLE `examresults`
  ADD PRIMARY KEY (`regno`);

--
-- Indexes for table `parent`
--
ALTER TABLE `parent`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tblstudents`
--
ALTER TABLE `tblstudents`
  ADD PRIMARY KEY (`RegNo`),
  ADD UNIQUE KEY `RegNo` (`RegNo`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `parent`
--
ALTER TABLE `parent`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
