package tuan05;
import java.util.Scanner;
class Car {
    String ten_chu_xe;
    String hang_san_xuat;
    String dong;
    String giay_phep;
    int dung_lit_xang;
    int nam_san_xuat;

    String Ten_Chu_Xe(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập Tên Chủ Xe : ");
        ten_chu_xe = sc.nextLine();
        return null;
    }
    String Hang_San_Xuat(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập Hãng Xe Sản Xuất: ");
        hang_san_xuat = sc.nextLine();
        return null;
        
    }
    String Dong_Xe(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Loại Dòng Của Xe là : ");
        dong = sc.nextLine();
        return null;
    }
    void Giay_Phep(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Giấy Phép Của Xe là : ");
        giay_phep= sc.nextLine();

    }
    void Dung_Lit_Xang(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dung Lít Xăng của Xe là : ");
        dung_lit_xang = sc.nextInt();
    }
    String Nam_San_Xuat(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Năm Sản Xuất Của xe : ");
        nam_san_xuat = sc.nextInt();
        return null;

    }
    void showCar(){
        System.out.println("   ---Car Imformation---  ");
        System.out.println(" Tên Chủ Xe    : "+ten_chu_xe);
        System.out.println(" Hãng Sản Xuất : "+hang_san_xuat);
        System.out.println(" Dòng Xe       : "+dong);
        System.out.println(" Giấy Phép     : "+giay_phep);
        System.out.println(" Dung Lít Xe   : "+dung_lit_xang);
        System.out.println(" Năm Sản Xuất  : "+nam_san_xuat);
        
    }
    