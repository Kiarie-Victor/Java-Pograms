
--database for jump AA airlines 
--OOP2 project
--Monicah Wamuhu CIT-227-017/2021
--Patricia Mwende CIT-227-014/2021
--Joseph Mwakai CIT-227-052/2021
--
--
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
--

-- --------------------------------------------------------

--
-- Table structure for table `cancellation`
--

CREATE TABLE `cancellation` (
  `pnr_no` varchar(30) NOT NULL,
  `cancellation_no` varchar(30) NOT NULL,
  `cancellation_date` varchar(30) NOT NULL,
  `fl_code` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `flight`
--

CREATE TABLE `flight` (
  `f_code` varchar(30) NOT NULL,
  `f_name` varchar(30) NOT NULL,
  `src` varchar(30) NOT NULL,
  `dst` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `flight`
--

INSERT INTO `flight` (`f_code`, `f_name`, `src`, `dst`) VALUES
('f1005', 'flight 1005', 'Nairobi-Kenya', 'Istanbul-Turkey');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Putting data for table `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
('admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `passenger`
--

CREATE TABLE `passenger` (
  `pnr_no` varchar(30) NOT NULL,
  `address` text NOT NULL,
  `nationality` varchar(30) NOT NULL,
  `name` varchar(30) NOT NULL,
  `gender` varchar(30) NOT NULL,
  `ph_no` varchar(30) NOT NULL,
  `passport_no` varchar(30) NOT NULL,
  `fl_code` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Putting data for table `passenger`
--

INSERT INTO `passenger` (`pnr_no`, `address`, `nationality`, `name`, `gender`, `ph_no`, `passport_no`, `fl_code`) VALUES
('227', '1234-0100 Nairobi', 'Kenyan', '', 'male', '0712345678', 'AK0308119', 'f1005');

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

CREATE TABLE `payment` (
  `pnr_no` varchar(30) NOT NULL,
  `ph_no` varchar(30) NOT NULL,
  `cheque_no` varchar(30) NOT NULL,
  `card_no` varchar(30) NOT NULL,
  `paid_amt` varchar(30) NOT NULL,
  `pay_date` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Putting data for table `payment`
--

INSERT INTO `payment` (`pnr_no`, `ph_no`, `cheque_no`, `card_no`, `paid_amt`, `pay_date`) VALUES
('227', '0712345678', '1200', '120-121', '12000', '2023-01-02');

-- --------------------------------------------------------

--
-- Table structure for table `reservation`
--

CREATE TABLE `reservation` (
  `pnr_no` varchar(30) NOT NULL,
  `ticket_id` varchar(30) NOT NULL,
  `f_code` varchar(30) NOT NULL,
  `jny_date` varchar(30) NOT NULL,
  `jny_time` varchar(30) NOT NULL,
  `src` varchar(30) NOT NULL,
  `dst` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Putting data for table `reservation`
--

INSERT INTO `reservation` (`pnr_no`, `ticket_id`, `f_code`, `jny_date`, `jny_time`, `src`, `dst`) VALUES
('227', '111', 'f1005', '2023-01-02', '1:00 PM', 'Nairobi-Kenya', 'Istanbul-Turkey');

-- --------------------------------------------------------

--
-- Table structure for table `sector`
--

CREATE TABLE `sector` (
  `flight_code` varchar(30) NOT NULL,
  `capacity` varchar(30) NOT NULL,
  `class_code` varchar(30) NOT NULL,
  `class_name` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- putting data for table `sector`
--

INSERT INTO `sector` (`flight_code`, `capacity`, `class_code`, `class_name`) VALUES
('f1005', '500', 'A', 'FIRST CLASS'),
('f1005', '500', 'B', 'BUSINESS CLASS'),
('f1005', '500', 'C', 'ECONOMY');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
