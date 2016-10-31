-- phpMyAdmin SQL Dump
-- version 3.4.9
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jul 30, 2015 at 08:31 AM
-- Server version: 5.5.20
-- PHP Version: 5.3.9

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `db_apotek_salatiga`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_konsumen`
--

CREATE TABLE IF NOT EXISTS `tbl_konsumen` (
  `id_konsumen` int(6) NOT NULL AUTO_INCREMENT,
  `nama_konsumen` varchar(30) NOT NULL,
  `alamat` text NOT NULL,
  PRIMARY KEY (`id_konsumen`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `tbl_konsumen`
--

INSERT INTO `tbl_konsumen` (`id_konsumen`, `nama_konsumen`, `alamat`) VALUES
(1, 'Ivan', 'Salatiga'),
(2, 'Entah', 'Salatiga'),
(3, 'Budi', 'Salatiga'),
(4, 'Susi', 'Salatiga');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_obat`
--

CREATE TABLE IF NOT EXISTS `tbl_obat` (
  `id_obat` int(10) NOT NULL AUTO_INCREMENT,
  `kode_obat` varchar(20) NOT NULL,
  `golongan` varchar(20) NOT NULL,
  `nama_obat` varchar(30) NOT NULL,
  `stock` varchar(5) NOT NULL,
  `harga_satuan` int(11) NOT NULL,
  `kadaluarsa` date NOT NULL,
  PRIMARY KEY (`id_obat`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=132 ;

--
-- Dumping data for table `tbl_obat`
--

INSERT INTO `tbl_obat` (`id_obat`, `kode_obat`, `golongan`, `nama_obat`, `stock`, `harga_satuan`, `kadaluarsa`) VALUES
(129, 'S205', 'Anak', 'Sakatonik abc', '255', 25000, '2019-02-03'),
(130, 'P123', 'Dewasa & anak', 'Paracetamol', '245', 1200, '2015-08-09'),
(131, 'K2012', 'Anak', 'Fidoran', '200', 120000, '2012-02-03');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_pegawai`
--

CREATE TABLE IF NOT EXISTS `tbl_pegawai` (
  `id_pegawai` varchar(10) NOT NULL,
  `nama_pegawai` varchar(30) NOT NULL,
  `alamat` text NOT NULL,
  `jenis_kelamin` varchar(10) NOT NULL,
  `jabatan` varchar(6) NOT NULL,
  PRIMARY KEY (`id_pegawai`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_pembelian`
--

CREATE TABLE IF NOT EXISTS `tbl_pembelian` (
  `id_pembelian` int(4) NOT NULL AUTO_INCREMENT,
  `nama_konsumen` varchar(30) NOT NULL,
  `nama_obat` varchar(30) NOT NULL,
  `harga_satuan` int(11) NOT NULL,
  `jumlah_pembelian` int(11) NOT NULL,
  `total` int(11) NOT NULL,
  `tanggal_pembelian` date NOT NULL,
  PRIMARY KEY (`id_pembelian`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `tbl_pembelian`
--

INSERT INTO `tbl_pembelian` (`id_pembelian`, `nama_konsumen`, `nama_obat`, `harga_satuan`, `jumlah_pembelian`, `total`, `tanggal_pembelian`) VALUES
(1, 'Ivan', 'Paracetamol', 1200, 2, 2400, '2015-07-30'),
(2, 'Budi', 'Fidoran', 120000, 4, 480000, '2015-07-30');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_penjualan`
--

CREATE TABLE IF NOT EXISTS `tbl_penjualan` (
  `id_penjualan` varchar(5) NOT NULL,
  `nama_obat` varchar(30) NOT NULL,
  `golongan` varchar(6) NOT NULL,
  `harga_satuan` int(11) NOT NULL,
  `obat_terjual` int(11) NOT NULL,
  `total` int(11) NOT NULL,
  `tgl_penjualan` date NOT NULL,
  PRIMARY KEY (`id_penjualan`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
