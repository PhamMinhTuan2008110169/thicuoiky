package tuan05;

import java.util.Scanner;

public class book{
    double giaBan;
    String nhaXuatBan;
    String tenSach;
    int namXuatban;
    int soLuong;
    String loaiSach;
    Scanner input = new Scanner(System.in);
    book(){
        
    }
    void nhapThongTinSach(){
        System.out.print("Nhập tên sách : ");
        tenSach = input.nextLine();
        System.out.print("Nhập loại sách : ");
        loaiSach = input.nextLine();
        System.out.print("Nhập giá sách :");
        giaBan = input.nextFloat();
        System.out.print("Nhập tên nhà xuất bản của sách : ");
        nhaXuatBan = input.nextLine();
        System.out.print("Nhập năm xuất bản của sách : ");
        namXuatban = input.nextInt();
        System.out.print("Nhập số lượng sách : ");
        soLuong = input.nextInt();
        
    }
    void xuatThongTinSach(){
        System.out.println("Tên sách : " + tenSach);
        System.out.println("Loại sách : " + loaiSach);
        System.out.println("Giá sách :" + giaBan);
        System.out.println("Tên nhà xuất bản của sách : " + nhaXuatBan);
        System.out.println("Năm xuất bản của sách : " + namXuatban);
        System.out.println("Số lượng sách : " + soLuong);
        
    }
}