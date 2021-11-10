package Kiemtragiuaki.lab1;

public class HocVien extends Nguoi{
    public HocVien(float diemMonhoc1, float diemMonhoc2) {
        this.diemMonhoc1 = diemMonhoc1;
        this.diemMonhoc2 = diemMonhoc2;
    }
    private float diemMonhoc1;
    private float diemMonhoc2;
    protected float diemTB(){
        return (diemMonhoc1+diemMonhoc2)/2;
    }
    @Override
    public String toString() {
        return super.toString()+" "+diemMonhoc1+" "+diemMonhoc2+" "+" Diem trung binh "+diemTB();
    }
    HocVien(String hoTen,String diaChi,float diemMonhoc1,float diemMonhoc2){
        super(NhanVien.EXTRACTED, extracted(diaChi));
        this.diemMonhoc1 = diemMonhoc1;
        this.diemMonhoc2 = diemMonhoc2;
    }
    static String extracted(String hoTen) {
        return hoTen;
    }
}