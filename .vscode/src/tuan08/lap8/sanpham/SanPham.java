package lap8.sanpham;

import java.util.Scanner;

public class SanPham {
    private static String TenSp;
    private static Double DonGia;
    private static Double GiamGia;
   
    public String getTenSp() {
        return TenSp;
    }
    public void setTenSp(String TenSp) {
        SanPham.TenSp = TenSp;
    }
    public Double getDonGia() {
        return DonGia;
    }
    public void setDonGia(Double DonGia) {
        SanPham.DonGia = DonGia;
    }
    public Double getGiamGia() {
        return GiamGia;
    }
    public void setGiamGia(Double GiamGia) {
        SanPham.GiamGia = GiamGia;
    }
    protected static double getThueNhapKhau(){
        double thue;
        thue = (DonGia*10)/100;
        return thue;
    }
    protected static void Xuat(){
        System.out.println("Tên Sản Phẩm: "+TenSp);
        System.out.println("Đơn Giá: "+DonGia+"$");
        System.out.println("Giảm giá: "+ GiamGia+"$");
        System.out.println("Thuế nhập khẩu: "+ getThueNhapKhau()+"$");
    }
    protected static void nhap(){
        Scanner n = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm");
        TenSp= n.nextLine();
        System.out.println("Nhập đơn giá: ");
        DonGia = n.nextDouble();
        System.out.println("Nhập số tiền được giảm: ");
        GiamGia = n.nextDouble();
    }
}    