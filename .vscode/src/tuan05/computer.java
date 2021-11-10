package tuan05;

public class Computer {
    String nhaSanXuat,heDieuHanh,cpu;
    int namSanXuat,ram,gia,namBaoHanh;
    Scanner input = new Scanner(System.in);
    Computer(){

    }
    void nhapThongtincomputer(){
        System.out.print("Nhap Nhà sản xuất : ");
        nhaSanXuat = input.nextLine();
        System.out.print("Nhap Năm sản xuất : ");
        namSanXuat = input.nextLine();
        System.out.print("Nhap Hệ điều hành : ");
        heDieuHanh = input.nextLine();       
        System.out.print("Nhap Ram : ");
        ram = input.nextFloat();
        System.out.print("Nhap CPU : ");
        cpu = input.nextFloat();
        System.out.print("Nhap Giá : ");
        gia = input.nextFloat();
        System.out.print("Nhap Năm bảo hành : ");
        namBaoHanh = input.nextFloat();
    }
     void xuatThongtincomputer(){
        System.out.println("Nhà sản xuất: "+nhaSanXuat);
        System.out.println("Năm sản xuất: "+namSanXuat);
        System.out.println("Hệ điều hành: "+heDieuHanh);
        System.out.println("Ram: "+ram+" GB");
        System.out.println("CPU: "+cpu);
        System.out.println("Giá: "+gia+" VND");
        System.out.println("Năm bảo hành: "+namBaoHanh+" năm");
    }
   
}