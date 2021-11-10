package Kiemtragiuaki.lab1;

public class NhanVien extends Nguoi{
    public static final String EXTRACTED = null;
    private float heSoLuong;
    
    protected float tinhLuong(){
        return heSoLuong*1500000;
    }
    @Override
    public String toString() {
        return super.toString()+" "+tinhLuong()+ " VND";
    }
    NhanVien(String hoTen,String diaChi,float heSoLuong){
        super(hoTen,diaChi);
        this.heSoLuong = heSoLuong;
    }
}