USE [master]
GO
/****** Object:  Database [ASM_Java3]    Script Date: 29/08/2016 11:39:24 CH ******/
CREATE DATABASE [ASM_Java3]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'ASM_Java3', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.MSSQLSERVER\MSSQL\DATA\ASM_Java3.mdf' , SIZE = 4096KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'ASM_Java3_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.MSSQLSERVER\MSSQL\DATA\ASM_Java3_log.ldf' , SIZE = 1024KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [ASM_Java3] SET COMPATIBILITY_LEVEL = 120
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [ASM_Java3].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [ASM_Java3] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [ASM_Java3] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [ASM_Java3] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [ASM_Java3] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [ASM_Java3] SET ARITHABORT OFF 
GO
ALTER DATABASE [ASM_Java3] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [ASM_Java3] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [ASM_Java3] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [ASM_Java3] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [ASM_Java3] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [ASM_Java3] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [ASM_Java3] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [ASM_Java3] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [ASM_Java3] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [ASM_Java3] SET  DISABLE_BROKER 
GO
ALTER DATABASE [ASM_Java3] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [ASM_Java3] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [ASM_Java3] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [ASM_Java3] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [ASM_Java3] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [ASM_Java3] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [ASM_Java3] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [ASM_Java3] SET RECOVERY FULL 
GO
ALTER DATABASE [ASM_Java3] SET  MULTI_USER 
GO
ALTER DATABASE [ASM_Java3] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [ASM_Java3] SET DB_CHAINING OFF 
GO
ALTER DATABASE [ASM_Java3] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [ASM_Java3] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
ALTER DATABASE [ASM_Java3] SET DELAYED_DURABILITY = DISABLED 
GO
EXEC sys.sp_db_vardecimal_storage_format N'ASM_Java3', N'ON'
GO
USE [ASM_Java3]
GO
/****** Object:  Table [dbo].[ChiTietDatPhong]    Script Date: 29/08/2016 11:39:25 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChiTietDatPhong](
	[MaChiTietDatPhong] [int] IDENTITY(1,1) NOT NULL,
	[MaPhieuDat] [int] NOT NULL,
	[MaPhong] [int] NOT NULL,
 CONSTRAINT [PK_ChiTietDatPhong] PRIMARY KEY CLUSTERED 
(
	[MaChiTietDatPhong] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[ChiTietThuePhong]    Script Date: 29/08/2016 11:39:25 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChiTietThuePhong](
	[MaChiTietThuePhong] [int] IDENTITY(1,1) NOT NULL,
	[MaPhieuThue] [int] NOT NULL,
	[MaPhong] [int] NOT NULL,
	[NgayTao] [date] NOT NULL,
	[MaDichVu] [int] NOT NULL,
	[SoLuong] [int] NULL,
 CONSTRAINT [PK_ChiTietThuePhong] PRIMARY KEY CLUSTERED 
(
	[MaChiTietThuePhong] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[ChiTietVatTu]    Script Date: 29/08/2016 11:39:25 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChiTietVatTu](
	[MaChiTiet] [int] IDENTITY(1,1) NOT NULL,
	[MaThietBi] [int] NOT NULL,
	[MaLoaiPhong] [int] NOT NULL,
	[SoLuong] [int] NOT NULL,
 CONSTRAINT [PK_ChiTietVatTu] PRIMARY KEY CLUSTERED 
(
	[MaChiTiet] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[ChucVu]    Script Date: 29/08/2016 11:39:25 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChucVu](
	[MaChucVu] [int] IDENTITY(1,1) NOT NULL,
	[TenChucVu] [nvarchar](30) NOT NULL,
	[MoTa] [nvarchar](50) NULL,
 CONSTRAINT [PK_ChucVu] PRIMARY KEY CLUSTERED 
(
	[MaChucVu] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[DichVu]    Script Date: 29/08/2016 11:39:25 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DichVu](
	[MaDichVu] [int] IDENTITY(1,1) NOT NULL,
	[TenDichVu] [nvarchar](50) NOT NULL,
	[Gia] [money] NOT NULL,
 CONSTRAINT [PK_DichVu] PRIMARY KEY CLUSTERED 
(
	[MaDichVu] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[HoaDon]    Script Date: 29/08/2016 11:39:25 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDon](
	[MaHoaDon] [int] IDENTITY(1,1) NOT NULL,
	[NgayThanhToan] [date] NOT NULL,
	[TongTien] [money] NOT NULL,
	[MaKhachHang] [int] NOT NULL,
	[MaTaiKhoan] [int] NOT NULL,
 CONSTRAINT [PK_HoaDon] PRIMARY KEY CLUSTERED 
(
	[MaHoaDon] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[KhachHang]    Script Date: 29/08/2016 11:39:25 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhachHang](
	[MaKH] [int] IDENTITY(1,1) NOT NULL,
	[TenKH] [nvarchar](50) NOT NULL,
	[GioiTinh] [bit] NOT NULL,
	[NgaySinh] [date] NULL,
	[DiaChi] [nvarchar](50) NULL,
	[SoCMND] [nchar](12) NULL,
	[SDT] [nchar](11) NULL,
	[Email] [nchar](30) NULL,
	[MaLoaiKH] [int] NOT NULL,
 CONSTRAINT [PK_KhachHang] PRIMARY KEY CLUSTERED 
(
	[MaKH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[LoaiKhachHang]    Script Date: 29/08/2016 11:39:25 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LoaiKhachHang](
	[MaLoaiKH] [int] IDENTITY(1,1) NOT NULL,
	[TenLoaiKH] [nvarchar](30) NOT NULL,
	[MoTa] [nvarchar](50) NULL,
 CONSTRAINT [PK_LoaiKhachHang] PRIMARY KEY CLUSTERED 
(
	[MaLoaiKH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[LoaiPhong]    Script Date: 29/08/2016 11:39:25 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LoaiPhong](
	[MaLoaiPhong] [int] IDENTITY(1,1) NOT NULL,
	[TenLoaiPhong] [nvarchar](50) NOT NULL,
	[GiaPhong] [money] NOT NULL,
 CONSTRAINT [PK_LoaiPhong] PRIMARY KEY CLUSTERED 
(
	[MaLoaiPhong] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[NhanVien]    Script Date: 29/08/2016 11:39:25 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhanVien](
	[MaNhanVien] [int] IDENTITY(1,1) NOT NULL,
	[TenNhanVien] [nvarchar](50) NOT NULL,
	[GioiTinh] [bit] NOT NULL,
	[NgaySinh] [date] NOT NULL,
	[DiaChi] [nvarchar](50) NOT NULL,
	[SoCMND] [nchar](12) NOT NULL,
	[SDT] [nchar](11) NULL,
	[Email] [nchar](30) NULL,
	[MaChucVu] [int] NOT NULL,
	[NgayVaoLam] [date] NULL,
	[Luong] [money] NULL,
 CONSTRAINT [PK_NhanVien] PRIMARY KEY CLUSTERED 
(
	[MaNhanVien] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[PhieuDatPhong]    Script Date: 29/08/2016 11:39:25 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PhieuDatPhong](
	[MaPhieuDat] [int] IDENTITY(1,1) NOT NULL,
	[MaPhieuThue] [int] NOT NULL,
	[MaKhachHang] [int] NOT NULL,
	[NgayThuePhong] [date] NOT NULL,
	[NgayTraPhong] [date] NOT NULL,
	[TienDatCoc] [money] NOT NULL,
	[MaTaiKhoan] [int] NOT NULL,
	[TinhTrang] [nvarchar](50) NULL,
	[SoNguoi] [int] NULL,
 CONSTRAINT [PK_PhieuDatPhong] PRIMARY KEY CLUSTERED 
(
	[MaPhieuDat] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[PhieuThuePhong]    Script Date: 29/08/2016 11:39:25 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PhieuThuePhong](
	[MaPhieuThue] [int] IDENTITY(1,1) NOT NULL,
	[MaTaiKhoan] [int] NOT NULL,
	[MaHoaDon] [int] NOT NULL,
 CONSTRAINT [PK_PhieuThuePhong] PRIMARY KEY CLUSTERED 
(
	[MaPhieuThue] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Phong]    Script Date: 29/08/2016 11:39:25 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Phong](
	[MaPhong] [int] IDENTITY(1,1) NOT NULL,
	[MaLoai] [int] NULL,
	[MaTrangThai] [int] NOT NULL,
	[MaTinhTrang] [int] NOT NULL,
 CONSTRAINT [PK_Phong] PRIMARY KEY CLUSTERED 
(
	[MaPhong] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Quyen]    Script Date: 29/08/2016 11:39:25 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Quyen](
	[MaQuyen] [int] IDENTITY(1,1) NOT NULL,
	[TenQuyen] [nvarchar](30) NOT NULL,
	[MoTa] [nvarchar](50) NULL,
 CONSTRAINT [PK_Quyen] PRIMARY KEY CLUSTERED 
(
	[MaQuyen] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[TaiKhoan]    Script Date: 29/08/2016 11:39:25 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TaiKhoan](
	[MaTaiKhoan] [int] IDENTITY(1,1) NOT NULL,
	[UserName] [nvarchar](50) NOT NULL,
	[PassWord] [nvarchar](50) NOT NULL,
	[MaQuyen] [int] NOT NULL,
	[LuotDangNhap] [int] NULL,
 CONSTRAINT [PK_TaiKhoan] PRIMARY KEY CLUSTERED 
(
	[MaTaiKhoan] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[TinhTrangPhong]    Script Date: 29/08/2016 11:39:25 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TinhTrangPhong](
	[MaTinhTrang] [int] IDENTITY(1,1) NOT NULL,
	[TinhTrang] [nchar](10) NOT NULL,
 CONSTRAINT [PK_TinhTrangPhong] PRIMARY KEY CLUSTERED 
(
	[MaTinhTrang] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[TinhTrangThietBi]    Script Date: 29/08/2016 11:39:25 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TinhTrangThietBi](
	[MaTinhTrang] [int] IDENTITY(1,1) NOT NULL,
	[TinhTrang] [nvarchar](20) NOT NULL,
 CONSTRAINT [PK_TinhTrangThietBi] PRIMARY KEY CLUSTERED 
(
	[MaTinhTrang] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[TrangThaiPhong]    Script Date: 29/08/2016 11:39:25 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TrangThaiPhong](
	[MaTrangThai] [int] IDENTITY(1,1) NOT NULL,
	[TrangThai] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_TrangThaiPhong] PRIMARY KEY CLUSTERED 
(
	[MaTrangThai] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[TrangThietBi]    Script Date: 29/08/2016 11:39:25 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TrangThietBi](
	[MaThietBi] [int] IDENTITY(1,1) NOT NULL,
	[TenThietBi] [nvarchar](50) NOT NULL,
	[MoTa] [nvarchar](50) NULL,
	[MaTinhTrang] [int] NOT NULL,
 CONSTRAINT [PK_ThietBi] PRIMARY KEY CLUSTERED 
(
	[MaThietBi] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET IDENTITY_INSERT [dbo].[ChucVu] ON 

INSERT [dbo].[ChucVu] ([MaChucVu], [TenChucVu], [MoTa]) VALUES (1, N'Quản Trị', NULL)
INSERT [dbo].[ChucVu] ([MaChucVu], [TenChucVu], [MoTa]) VALUES (2, N'Quản Lý', NULL)
INSERT [dbo].[ChucVu] ([MaChucVu], [TenChucVu], [MoTa]) VALUES (3, N'Nhân Viên', NULL)
INSERT [dbo].[ChucVu] ([MaChucVu], [TenChucVu], [MoTa]) VALUES (4, N'Bảo Vệ', NULL)
INSERT [dbo].[ChucVu] ([MaChucVu], [TenChucVu], [MoTa]) VALUES (5, N'Khác', NULL)
SET IDENTITY_INSERT [dbo].[ChucVu] OFF
SET IDENTITY_INSERT [dbo].[HoaDon] ON 

INSERT [dbo].[HoaDon] ([MaHoaDon], [NgayThanhToan], [TongTien], [MaKhachHang], [MaTaiKhoan]) VALUES (2, CAST(N'1900-01-01' AS Date), 0.0000, 1, 3)
SET IDENTITY_INSERT [dbo].[HoaDon] OFF
SET IDENTITY_INSERT [dbo].[KhachHang] ON 

INSERT [dbo].[KhachHang] ([MaKH], [TenKH], [GioiTinh], [NgaySinh], [DiaChi], [SoCMND], [SDT], [Email], [MaLoaiKH]) VALUES (1, N'Nguyễn Văn A', 1, CAST(N'1990-08-14' AS Date), N'daklak', N'011234564   ', N'013245487  ', N'afeij@gmail.com               ', 3)
INSERT [dbo].[KhachHang] ([MaKH], [TenKH], [GioiTinh], [NgaySinh], [DiaChi], [SoCMND], [SDT], [Email], [MaLoaiKH]) VALUES (2, N'Lê Thị C', 0, CAST(N'1991-08-16' AS Date), N'HCM', N'2315454888  ', N'05648945   ', N'CCCj@gmail.com                ', 2)
INSERT [dbo].[KhachHang] ([MaKH], [TenKH], [GioiTinh], [NgaySinh], [DiaChi], [SoCMND], [SDT], [Email], [MaLoaiKH]) VALUES (42, N'Lê Thị C', 0, CAST(N'1991-08-16' AS Date), N'HCM', N'2315454888  ', N'1234567895 ', N'CCCj@gmail.com                ', 1)
INSERT [dbo].[KhachHang] ([MaKH], [TenKH], [GioiTinh], [NgaySinh], [DiaChi], [SoCMND], [SDT], [Email], [MaLoaiKH]) VALUES (43, N'Lê Thị C', 0, CAST(N'1991-08-16' AS Date), N'HCM', N'2315454888  ', N'01234564789', N'CCCj@gmail.com                ', 1)
INSERT [dbo].[KhachHang] ([MaKH], [TenKH], [GioiTinh], [NgaySinh], [DiaChi], [SoCMND], [SDT], [Email], [MaLoaiKH]) VALUES (44, N'Lê Thị C', 0, CAST(N'1991-08-16' AS Date), N'HCM', N'2315454888  ', N'           ', N'CCCj@gmail.com                ', 1)
INSERT [dbo].[KhachHang] ([MaKH], [TenKH], [GioiTinh], [NgaySinh], [DiaChi], [SoCMND], [SDT], [Email], [MaLoaiKH]) VALUES (46, N'Lê Thị C', 0, CAST(N'1991-08-16' AS Date), N'HCM', N'2315454888  ', N'01234564789', N'CCCj@gmail.com                ', 1)
INSERT [dbo].[KhachHang] ([MaKH], [TenKH], [GioiTinh], [NgaySinh], [DiaChi], [SoCMND], [SDT], [Email], [MaLoaiKH]) VALUES (47, N'Lê Thị C', 0, CAST(N'1998-08-16' AS Date), N'HCM', N'2315454888  ', N'01234564789', N'CCCj@gmail.com                ', 1)
INSERT [dbo].[KhachHang] ([MaKH], [TenKH], [GioiTinh], [NgaySinh], [DiaChi], [SoCMND], [SDT], [Email], [MaLoaiKH]) VALUES (51, N'Lê Thị C', 0, CAST(N'1991-08-26' AS Date), N'HCM', N'2315454888  ', N'564523123  ', N'CCCj@gmail.com                ', 1)
INSERT [dbo].[KhachHang] ([MaKH], [TenKH], [GioiTinh], [NgaySinh], [DiaChi], [SoCMND], [SDT], [Email], [MaLoaiKH]) VALUES (52, N'Lê Thị C', 0, CAST(N'1984-08-17' AS Date), N'HCM', N'2315454888  ', N'           ', N'CCCj@gmail.com                ', 1)
INSERT [dbo].[KhachHang] ([MaKH], [TenKH], [GioiTinh], [NgaySinh], [DiaChi], [SoCMND], [SDT], [Email], [MaLoaiKH]) VALUES (53, N'Lê Thị C', 0, CAST(N'1991-08-16' AS Date), N'HCM', N'2315454888  ', N'           ', N'CCCj@gmail.com                ', 1)
INSERT [dbo].[KhachHang] ([MaKH], [TenKH], [GioiTinh], [NgaySinh], [DiaChi], [SoCMND], [SDT], [Email], [MaLoaiKH]) VALUES (54, N'Lê Thị C', 0, CAST(N'1991-08-19' AS Date), N'HCM', N'2315454888  ', N'           ', N'CCCj@gmail.com                ', 1)
INSERT [dbo].[KhachHang] ([MaKH], [TenKH], [GioiTinh], [NgaySinh], [DiaChi], [SoCMND], [SDT], [Email], [MaLoaiKH]) VALUES (55, N'Lê Thị C', 0, CAST(N'1991-08-16' AS Date), N'HCM', N'2315454888  ', N'           ', N'CCCj@gmail.com                ', 1)
INSERT [dbo].[KhachHang] ([MaKH], [TenKH], [GioiTinh], [NgaySinh], [DiaChi], [SoCMND], [SDT], [Email], [MaLoaiKH]) VALUES (56, N'Lê Thị C', 0, CAST(N'1991-08-16' AS Date), N'HCM', N'2315454888  ', N'           ', N'CCCj@gmail.com                ', 1)
SET IDENTITY_INSERT [dbo].[KhachHang] OFF
SET IDENTITY_INSERT [dbo].[LoaiKhachHang] ON 

INSERT [dbo].[LoaiKhachHang] ([MaLoaiKH], [TenLoaiKH], [MoTa]) VALUES (1, N'Đặt Biệt', NULL)
INSERT [dbo].[LoaiKhachHang] ([MaLoaiKH], [TenLoaiKH], [MoTa]) VALUES (2, N'Vip', NULL)
INSERT [dbo].[LoaiKhachHang] ([MaLoaiKH], [TenLoaiKH], [MoTa]) VALUES (3, N'Thường', NULL)
SET IDENTITY_INSERT [dbo].[LoaiKhachHang] OFF
SET IDENTITY_INSERT [dbo].[LoaiPhong] ON 

INSERT [dbo].[LoaiPhong] ([MaLoaiPhong], [TenLoaiPhong], [GiaPhong]) VALUES (1, N'Đặt Biệt', 2000000.0000)
INSERT [dbo].[LoaiPhong] ([MaLoaiPhong], [TenLoaiPhong], [GiaPhong]) VALUES (2, N'Cao Cấp', 1000000.0000)
INSERT [dbo].[LoaiPhong] ([MaLoaiPhong], [TenLoaiPhong], [GiaPhong]) VALUES (3, N'Tốt', 800000.0000)
INSERT [dbo].[LoaiPhong] ([MaLoaiPhong], [TenLoaiPhong], [GiaPhong]) VALUES (4, N'Bình Thường', 400000.0000)
INSERT [dbo].[LoaiPhong] ([MaLoaiPhong], [TenLoaiPhong], [GiaPhong]) VALUES (5, N'Trung Bình', 600000.0000)
INSERT [dbo].[LoaiPhong] ([MaLoaiPhong], [TenLoaiPhong], [GiaPhong]) VALUES (6, N'Bình Dân', 300000.0000)
SET IDENTITY_INSERT [dbo].[LoaiPhong] OFF
SET IDENTITY_INSERT [dbo].[NhanVien] ON 

INSERT [dbo].[NhanVien] ([MaNhanVien], [TenNhanVien], [GioiTinh], [NgaySinh], [DiaChi], [SoCMND], [SDT], [Email], [MaChucVu], [NgayVaoLam], [Luong]) VALUES (3, N'admin', 1, CAST(N'1997-08-17' AS Date), N'BMT', N'241711888   ', N'01667852634', N'aliosa113@gmail.com           ', 1, CAST(N'2016-02-02' AS Date), 99999999.0000)
INSERT [dbo].[NhanVien] ([MaNhanVien], [TenNhanVien], [GioiTinh], [NgaySinh], [DiaChi], [SoCMND], [SDT], [Email], [MaChucVu], [NgayVaoLam], [Luong]) VALUES (6, N'Le Lang', 1, CAST(N'1997-02-08' AS Date), N'HN', N'264158765   ', N'01652842514', N'lelang@gmail.com              ', 2, CAST(N'2016-01-08' AS Date), 132125.0000)
INSERT [dbo].[NhanVien] ([MaNhanVien], [TenNhanVien], [GioiTinh], [NgaySinh], [DiaChi], [SoCMND], [SDT], [Email], [MaChucVu], [NgayVaoLam], [Luong]) VALUES (7, N'admin', 1, CAST(N'1997-08-17' AS Date), N'BMT', N'241711888   ', N'01667852634', N'aliosa113@gmail.com           ', 1, CAST(N'2016-02-02' AS Date), 99999999.0000)
INSERT [dbo].[NhanVien] ([MaNhanVien], [TenNhanVien], [GioiTinh], [NgaySinh], [DiaChi], [SoCMND], [SDT], [Email], [MaChucVu], [NgayVaoLam], [Luong]) VALUES (8, N'Le Lang', 1, CAST(N'1997-02-08' AS Date), N'HN', N'264158765   ', N'01652842514', N'lelang@gmail.com              ', 2, CAST(N'2016-01-08' AS Date), 132125.0000)
INSERT [dbo].[NhanVien] ([MaNhanVien], [TenNhanVien], [GioiTinh], [NgaySinh], [DiaChi], [SoCMND], [SDT], [Email], [MaChucVu], [NgayVaoLam], [Luong]) VALUES (9, N'admin', 1, CAST(N'1997-08-17' AS Date), N'BMT', N'241711888   ', N'01667852634', N'                              ', 1, CAST(N'2016-02-02' AS Date), 99999999.0000)
INSERT [dbo].[NhanVien] ([MaNhanVien], [TenNhanVien], [GioiTinh], [NgaySinh], [DiaChi], [SoCMND], [SDT], [Email], [MaChucVu], [NgayVaoLam], [Luong]) VALUES (10, N'Nguyen hạ', 0, CAST(N'1997-07-07' AS Date), N'HCM', N'243566158   ', N'01665482536', N'                              ', 1, CAST(N'2016-01-02' AS Date), 99999999.0000)
INSERT [dbo].[NhanVien] ([MaNhanVien], [TenNhanVien], [GioiTinh], [NgaySinh], [DiaChi], [SoCMND], [SDT], [Email], [MaChucVu], [NgayVaoLam], [Luong]) VALUES (11, N'Le Lang', 0, CAST(N'1997-02-08' AS Date), N'HN', N'264158765   ', N'01652842514', N'lelang@gmail.com              ', 2, CAST(N'2016-01-08' AS Date), 132125.0000)
INSERT [dbo].[NhanVien] ([MaNhanVien], [TenNhanVien], [GioiTinh], [NgaySinh], [DiaChi], [SoCMND], [SDT], [Email], [MaChucVu], [NgayVaoLam], [Luong]) VALUES (12, N'Le Lang', 0, CAST(N'1997-02-08' AS Date), N'HN', N'264158765   ', N'01652842514', N'lelang@gmail.com              ', 2, CAST(N'2016-01-08' AS Date), 132125.0000)
INSERT [dbo].[NhanVien] ([MaNhanVien], [TenNhanVien], [GioiTinh], [NgaySinh], [DiaChi], [SoCMND], [SDT], [Email], [MaChucVu], [NgayVaoLam], [Luong]) VALUES (13, N'Nguyen hạ', 0, CAST(N'1997-07-07' AS Date), N'HCM', N'243566158   ', N'01665482536', N'                              ', 1, CAST(N'2016-01-02' AS Date), 99999999.0000)
INSERT [dbo].[NhanVien] ([MaNhanVien], [TenNhanVien], [GioiTinh], [NgaySinh], [DiaChi], [SoCMND], [SDT], [Email], [MaChucVu], [NgayVaoLam], [Luong]) VALUES (14, N'Le Lang', 0, CAST(N'1997-02-08' AS Date), N'HN', N'264158765   ', N'01652842514', N'lelang@gmail.com              ', 2, CAST(N'2016-01-08' AS Date), 132125.0000)
INSERT [dbo].[NhanVien] ([MaNhanVien], [TenNhanVien], [GioiTinh], [NgaySinh], [DiaChi], [SoCMND], [SDT], [Email], [MaChucVu], [NgayVaoLam], [Luong]) VALUES (15, N'Le Lang', 0, CAST(N'1997-02-08' AS Date), N'HN', N'264158765   ', N'01652842514', N'lelang@gmail.com              ', 2, CAST(N'2016-01-08' AS Date), 132125.0000)
INSERT [dbo].[NhanVien] ([MaNhanVien], [TenNhanVien], [GioiTinh], [NgaySinh], [DiaChi], [SoCMND], [SDT], [Email], [MaChucVu], [NgayVaoLam], [Luong]) VALUES (16, N'Le Lang', 0, CAST(N'1997-02-08' AS Date), N'HN', N'264158765   ', N'01652842514', N'lelang@gmail.com              ', 2, CAST(N'2016-01-08' AS Date), 132125.0000)
INSERT [dbo].[NhanVien] ([MaNhanVien], [TenNhanVien], [GioiTinh], [NgaySinh], [DiaChi], [SoCMND], [SDT], [Email], [MaChucVu], [NgayVaoLam], [Luong]) VALUES (17, N'Le Lang', 0, CAST(N'1997-02-08' AS Date), N'HN', N'264158765   ', N'01652842514', N'lelang@gmail.com              ', 2, CAST(N'2016-01-08' AS Date), 132125.0000)
INSERT [dbo].[NhanVien] ([MaNhanVien], [TenNhanVien], [GioiTinh], [NgaySinh], [DiaChi], [SoCMND], [SDT], [Email], [MaChucVu], [NgayVaoLam], [Luong]) VALUES (18, N'Le Lang', 0, CAST(N'1997-02-08' AS Date), N'HN', N'264158765   ', N'01652842514', N'lelang@gmail.com              ', 2, CAST(N'2016-01-08' AS Date), 132125.0000)
INSERT [dbo].[NhanVien] ([MaNhanVien], [TenNhanVien], [GioiTinh], [NgaySinh], [DiaChi], [SoCMND], [SDT], [Email], [MaChucVu], [NgayVaoLam], [Luong]) VALUES (19, N'Le Lang', 0, CAST(N'1997-02-08' AS Date), N'HN', N'264158765   ', N'01652842514', N'lelang@gmail.com              ', 2, CAST(N'2016-01-08' AS Date), 132125.0000)
INSERT [dbo].[NhanVien] ([MaNhanVien], [TenNhanVien], [GioiTinh], [NgaySinh], [DiaChi], [SoCMND], [SDT], [Email], [MaChucVu], [NgayVaoLam], [Luong]) VALUES (20, N'Nguyen hạ', 0, CAST(N'1997-07-07' AS Date), N'HCM', N'243566158   ', N'01665482536', N'                              ', 1, CAST(N'2016-01-02' AS Date), 99999999.0000)
INSERT [dbo].[NhanVien] ([MaNhanVien], [TenNhanVien], [GioiTinh], [NgaySinh], [DiaChi], [SoCMND], [SDT], [Email], [MaChucVu], [NgayVaoLam], [Luong]) VALUES (21, N'Nguyen hạ', 0, CAST(N'1997-07-07' AS Date), N'HCM', N'243566158   ', N'01665482536', N'                              ', 1, CAST(N'2016-01-02' AS Date), 99999999.0000)
INSERT [dbo].[NhanVien] ([MaNhanVien], [TenNhanVien], [GioiTinh], [NgaySinh], [DiaChi], [SoCMND], [SDT], [Email], [MaChucVu], [NgayVaoLam], [Luong]) VALUES (22, N'Nguyen hạ', 0, CAST(N'1997-07-07' AS Date), N'HCM', N'243566158   ', N'01665482536', N'                              ', 1, CAST(N'2016-01-02' AS Date), 99999999.0000)
SET IDENTITY_INSERT [dbo].[NhanVien] OFF
SET IDENTITY_INSERT [dbo].[PhieuThuePhong] ON 

INSERT [dbo].[PhieuThuePhong] ([MaPhieuThue], [MaTaiKhoan], [MaHoaDon]) VALUES (3, 3, 2)
SET IDENTITY_INSERT [dbo].[PhieuThuePhong] OFF
SET IDENTITY_INSERT [dbo].[Phong] ON 

INSERT [dbo].[Phong] ([MaPhong], [MaLoai], [MaTrangThai], [MaTinhTrang]) VALUES (1, 2, 2, 2)
SET IDENTITY_INSERT [dbo].[Phong] OFF
SET IDENTITY_INSERT [dbo].[Quyen] ON 

INSERT [dbo].[Quyen] ([MaQuyen], [TenQuyen], [MoTa]) VALUES (1, N'admin', N'admin')
INSERT [dbo].[Quyen] ([MaQuyen], [TenQuyen], [MoTa]) VALUES (2, N'quanly', NULL)
INSERT [dbo].[Quyen] ([MaQuyen], [TenQuyen], [MoTa]) VALUES (3, N'nhanvien', NULL)
SET IDENTITY_INSERT [dbo].[Quyen] OFF
SET IDENTITY_INSERT [dbo].[TaiKhoan] ON 

INSERT [dbo].[TaiKhoan] ([MaTaiKhoan], [UserName], [PassWord], [MaQuyen], [LuotDangNhap]) VALUES (3, N'Username', N'Password', 1, 3)
INSERT [dbo].[TaiKhoan] ([MaTaiKhoan], [UserName], [PassWord], [MaQuyen], [LuotDangNhap]) VALUES (6, N'', N'', 3, 1)
SET IDENTITY_INSERT [dbo].[TaiKhoan] OFF
SET IDENTITY_INSERT [dbo].[TinhTrangPhong] ON 

INSERT [dbo].[TinhTrangPhong] ([MaTinhTrang], [TinhTrang]) VALUES (1, N'Tốt       ')
INSERT [dbo].[TinhTrangPhong] ([MaTinhTrang], [TinhTrang]) VALUES (2, N'Hỏng      ')
SET IDENTITY_INSERT [dbo].[TinhTrangPhong] OFF
SET IDENTITY_INSERT [dbo].[TinhTrangThietBi] ON 

INSERT [dbo].[TinhTrangThietBi] ([MaTinhTrang], [TinhTrang]) VALUES (1, N'Tốt')
INSERT [dbo].[TinhTrangThietBi] ([MaTinhTrang], [TinhTrang]) VALUES (2, N'Hỏng')
SET IDENTITY_INSERT [dbo].[TinhTrangThietBi] OFF
SET IDENTITY_INSERT [dbo].[TrangThaiPhong] ON 

INSERT [dbo].[TrangThaiPhong] ([MaTrangThai], [TrangThai]) VALUES (1, N'Đã thuê')
INSERT [dbo].[TrangThaiPhong] ([MaTrangThai], [TrangThai]) VALUES (2, N'Đã đặt')
INSERT [dbo].[TrangThaiPhong] ([MaTrangThai], [TrangThai]) VALUES (3, N'Chưa thuê')
SET IDENTITY_INSERT [dbo].[TrangThaiPhong] OFF
ALTER TABLE [dbo].[ChiTietDatPhong]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietDatPhong_PhieuDatPhong] FOREIGN KEY([MaPhieuDat])
REFERENCES [dbo].[PhieuDatPhong] ([MaPhieuDat])
GO
ALTER TABLE [dbo].[ChiTietDatPhong] CHECK CONSTRAINT [FK_ChiTietDatPhong_PhieuDatPhong]
GO
ALTER TABLE [dbo].[ChiTietDatPhong]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietDatPhong_Phong] FOREIGN KEY([MaPhong])
REFERENCES [dbo].[Phong] ([MaPhong])
GO
ALTER TABLE [dbo].[ChiTietDatPhong] CHECK CONSTRAINT [FK_ChiTietDatPhong_Phong]
GO
ALTER TABLE [dbo].[ChiTietThuePhong]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietThuePhong_DichVu] FOREIGN KEY([MaDichVu])
REFERENCES [dbo].[DichVu] ([MaDichVu])
GO
ALTER TABLE [dbo].[ChiTietThuePhong] CHECK CONSTRAINT [FK_ChiTietThuePhong_DichVu]
GO
ALTER TABLE [dbo].[ChiTietThuePhong]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietThuePhong_PhieuThuePhong] FOREIGN KEY([MaPhieuThue])
REFERENCES [dbo].[PhieuThuePhong] ([MaPhieuThue])
GO
ALTER TABLE [dbo].[ChiTietThuePhong] CHECK CONSTRAINT [FK_ChiTietThuePhong_PhieuThuePhong]
GO
ALTER TABLE [dbo].[ChiTietThuePhong]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietThuePhong_Phong] FOREIGN KEY([MaPhong])
REFERENCES [dbo].[Phong] ([MaPhong])
GO
ALTER TABLE [dbo].[ChiTietThuePhong] CHECK CONSTRAINT [FK_ChiTietThuePhong_Phong]
GO
ALTER TABLE [dbo].[ChiTietVatTu]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietVatTu_LoaiPhong] FOREIGN KEY([MaLoaiPhong])
REFERENCES [dbo].[LoaiPhong] ([MaLoaiPhong])
GO
ALTER TABLE [dbo].[ChiTietVatTu] CHECK CONSTRAINT [FK_ChiTietVatTu_LoaiPhong]
GO
ALTER TABLE [dbo].[ChiTietVatTu]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietVatTu_TrangThietBi] FOREIGN KEY([MaThietBi])
REFERENCES [dbo].[TrangThietBi] ([MaThietBi])
GO
ALTER TABLE [dbo].[ChiTietVatTu] CHECK CONSTRAINT [FK_ChiTietVatTu_TrangThietBi]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_KhachHang] FOREIGN KEY([MaKhachHang])
REFERENCES [dbo].[KhachHang] ([MaKH])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_KhachHang]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_TaiKhoan] FOREIGN KEY([MaTaiKhoan])
REFERENCES [dbo].[TaiKhoan] ([MaTaiKhoan])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_TaiKhoan]
GO
ALTER TABLE [dbo].[KhachHang]  WITH CHECK ADD  CONSTRAINT [FK_KhachHang_LoaiKhachHang] FOREIGN KEY([MaLoaiKH])
REFERENCES [dbo].[LoaiKhachHang] ([MaLoaiKH])
GO
ALTER TABLE [dbo].[KhachHang] CHECK CONSTRAINT [FK_KhachHang_LoaiKhachHang]
GO
ALTER TABLE [dbo].[NhanVien]  WITH CHECK ADD  CONSTRAINT [FK_NhanVien_ChucVu] FOREIGN KEY([MaChucVu])
REFERENCES [dbo].[ChucVu] ([MaChucVu])
GO
ALTER TABLE [dbo].[NhanVien] CHECK CONSTRAINT [FK_NhanVien_ChucVu]
GO
ALTER TABLE [dbo].[PhieuDatPhong]  WITH CHECK ADD  CONSTRAINT [FK_PhieuDatPhong_KhachHang] FOREIGN KEY([MaKhachHang])
REFERENCES [dbo].[KhachHang] ([MaKH])
GO
ALTER TABLE [dbo].[PhieuDatPhong] CHECK CONSTRAINT [FK_PhieuDatPhong_KhachHang]
GO
ALTER TABLE [dbo].[PhieuDatPhong]  WITH CHECK ADD  CONSTRAINT [FK_PhieuDatPhong_PhieuThuePhong] FOREIGN KEY([MaPhieuThue])
REFERENCES [dbo].[PhieuThuePhong] ([MaPhieuThue])
GO
ALTER TABLE [dbo].[PhieuDatPhong] CHECK CONSTRAINT [FK_PhieuDatPhong_PhieuThuePhong]
GO
ALTER TABLE [dbo].[PhieuDatPhong]  WITH CHECK ADD  CONSTRAINT [FK_PhieuDatPhong_TaiKhoan] FOREIGN KEY([MaTaiKhoan])
REFERENCES [dbo].[TaiKhoan] ([MaTaiKhoan])
GO
ALTER TABLE [dbo].[PhieuDatPhong] CHECK CONSTRAINT [FK_PhieuDatPhong_TaiKhoan]
GO
ALTER TABLE [dbo].[PhieuThuePhong]  WITH CHECK ADD  CONSTRAINT [FK_PhieuThuePhong_HoaDon] FOREIGN KEY([MaHoaDon])
REFERENCES [dbo].[HoaDon] ([MaHoaDon])
GO
ALTER TABLE [dbo].[PhieuThuePhong] CHECK CONSTRAINT [FK_PhieuThuePhong_HoaDon]
GO
ALTER TABLE [dbo].[PhieuThuePhong]  WITH CHECK ADD  CONSTRAINT [FK_PhieuThuePhong_TaiKhoan] FOREIGN KEY([MaTaiKhoan])
REFERENCES [dbo].[TaiKhoan] ([MaTaiKhoan])
GO
ALTER TABLE [dbo].[PhieuThuePhong] CHECK CONSTRAINT [FK_PhieuThuePhong_TaiKhoan]
GO
ALTER TABLE [dbo].[Phong]  WITH CHECK ADD  CONSTRAINT [FK_Phong_LoaiPhong] FOREIGN KEY([MaLoai])
REFERENCES [dbo].[LoaiPhong] ([MaLoaiPhong])
GO
ALTER TABLE [dbo].[Phong] CHECK CONSTRAINT [FK_Phong_LoaiPhong]
GO
ALTER TABLE [dbo].[Phong]  WITH CHECK ADD  CONSTRAINT [FK_Phong_TinhTrangPhong] FOREIGN KEY([MaTinhTrang])
REFERENCES [dbo].[TinhTrangPhong] ([MaTinhTrang])
GO
ALTER TABLE [dbo].[Phong] CHECK CONSTRAINT [FK_Phong_TinhTrangPhong]
GO
ALTER TABLE [dbo].[Phong]  WITH CHECK ADD  CONSTRAINT [FK_Phong_TrangThaiPhong] FOREIGN KEY([MaTrangThai])
REFERENCES [dbo].[TrangThaiPhong] ([MaTrangThai])
GO
ALTER TABLE [dbo].[Phong] CHECK CONSTRAINT [FK_Phong_TrangThaiPhong]
GO
ALTER TABLE [dbo].[TaiKhoan]  WITH CHECK ADD  CONSTRAINT [FK_TaiKhoan_NhanVien] FOREIGN KEY([MaTaiKhoan])
REFERENCES [dbo].[NhanVien] ([MaNhanVien])
GO
ALTER TABLE [dbo].[TaiKhoan] CHECK CONSTRAINT [FK_TaiKhoan_NhanVien]
GO
ALTER TABLE [dbo].[TaiKhoan]  WITH CHECK ADD  CONSTRAINT [FK_TaiKhoan_Quyen] FOREIGN KEY([MaQuyen])
REFERENCES [dbo].[Quyen] ([MaQuyen])
GO
ALTER TABLE [dbo].[TaiKhoan] CHECK CONSTRAINT [FK_TaiKhoan_Quyen]
GO
ALTER TABLE [dbo].[TrangThietBi]  WITH CHECK ADD  CONSTRAINT [FK_TrangThietBi_TinhTrangThietBi] FOREIGN KEY([MaTinhTrang])
REFERENCES [dbo].[TinhTrangThietBi] ([MaTinhTrang])
GO
ALTER TABLE [dbo].[TrangThietBi] CHECK CONSTRAINT [FK_TrangThietBi_TinhTrangThietBi]
GO
USE [master]
GO
ALTER DATABASE [ASM_Java3] SET  READ_WRITE 
GO
