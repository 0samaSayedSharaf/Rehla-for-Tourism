-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: rehla
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `hotel_date`
--

DROP TABLE IF EXISTS `hotel_date`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hotel_date` (
  `hotel_name` varchar(60) DEFAULT NULL,
  `room` varchar(60) DEFAULT NULL,
  `reserv_date` date DEFAULT NULL,
  `id` int DEFAULT NULL,
  KEY `id_idx` (`id`),
  CONSTRAINT `id` FOREIGN KEY (`id`) REFERENCES `hotel` (`hotel_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hotel_date`
--

LOCK TABLES `hotel_date` WRITE;
/*!40000 ALTER TABLE `hotel_date` DISABLE KEYS */;
INSERT INTO `hotel_date` VALUES ('Citymax','5 rooms',NULL,NULL),('Citymax','5 rooms',NULL,NULL),('Citymax','5 rooms',NULL,NULL),('Sofitel Legend Old Cataract Aswan','Triple Room',NULL,NULL),('Sofitel Legend Old Cataract Aswan','Triple Room','2020-12-30',NULL),('Citymax','5 rooms',NULL,NULL),('Citymax','5 rooms','2020-12-30',NULL),('Citymax','5 rooms',NULL,NULL),('Citymax','5 rooms','2001-12-01',NULL),('Citymax',NULL,NULL,NULL),('Citymax',NULL,'2020-02-03',NULL),('Citymax',NULL,'2020-02-03',NULL),('Citymax',NULL,'2020-12-30',NULL),('Citymax','5 rooms','2020-12-30',NULL),('Citymax','5 rooms','2020-12-30',NULL),('Citymax','5 rooms',NULL,NULL),('Citymax','5 rooms','2020-12-30',NULL),('Citymax','5 rooms',NULL,NULL),('Sofitel Legend Old Cataract Aswan','Single room',NULL,NULL),('Citymax',NULL,NULL,NULL),('Citymax',NULL,'2021-01-01',NULL),('Sofitel Legend Old Cataract Aswan','Single room',NULL,NULL),('Sofitel Legend Old Cataract Aswan','Single room','2021-01-01',NULL),('Sofitel Legend Old Cataract Aswan','Single room',NULL,NULL),('Sofitel Legend Old Cataract Aswan','Single room','2021-01-01',NULL),('Sofitel Legend Old Cataract Aswan',' room',NULL,NULL),('Sofitel Legend Old Cataract Aswan',' room',NULL,NULL),('Sofitel Legend Old Cataract Aswan',' room','2021-01-01',NULL),('s','dsfds',NULL,NULL),('Sofitel Legend Old Cataract Aswan',NULL,NULL,NULL),('Citymax',NULL,NULL,NULL),('s','dsfds','3353-03-03',NULL),('Sofitel Legend Old Cataract Aswan','Double room','0210-02-02',NULL),('Sofitel Legend Old Cataract Aswan','Double room','2321-01-01',NULL),('Citymax',NULL,NULL,NULL),('Sofitel Legend Old Cataract Aswan',NULL,NULL,NULL),('Sofitel Legend Old Cataract Aswan',NULL,NULL,NULL),('Sofitel Legend Old Cataract Aswan','Triple Room',NULL,NULL),('Sofitel Legend Old Cataract Aswan','Triple Room','2020-01-01',NULL),('Sofitel Legend Old Cataract Aswan','Triple Room','2020-01-01',NULL),('Sofitel Legend Old Cataract Aswan','Triple Room','2020-01-01',NULL),('Sofitel Legend Old Cataract Aswan','Triple Room',NULL,NULL),('Citymax','5 rooms',NULL,NULL),('Citymax','5 rooms','2121-01-01',NULL),('Citymax','5 rooms','2121-01-01',NULL),('Citymax','5 rooms',NULL,NULL),('Citymax','5 rooms',NULL,NULL),('Sofitel Legend Old Cataract Aswan',' room',NULL,NULL),('Sofitel Legend Old Cataract Aswan',' room','2021-01-01',NULL),('Sofitel Legend Old Cataract Aswan',' room',NULL,NULL),('Sofitel Legend Old Cataract Aswan',' room',NULL,NULL),('Sofitel Legend Old Cataract Aswan',' room',NULL,NULL),('Sofitel Legend Old Cataract Aswan',' room',NULL,NULL);
/*!40000 ALTER TABLE `hotel_date` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-01-04 18:22:44
