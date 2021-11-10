package lap8.Shape;

public class HinhVuong ;private Object canh;
{
        super(canh,canh);
    }
    
    protected double getChuVi(){
        return getDai() * 4;
    }
    protected double getDienTich(){
        return Math.pow(2, getDai());
    }
    private double getDai() {
        return 0;
    }
    protected void xuat(){
        System.out.println("canh: "+ getDai());
        System.out.println("chu vi : "+getDai()+"* 4 = "+ getChuVi());
        System.out.println("dien tich: "+ getDai()+ getDai() +" = "+ getDienTich());
    }
    @Override
    public String toString() {
        return "HinhVuong []";
    }
    public Object getCanh() {
        return canh;
    }
    public void setCanh(Object canh) {
        this.canh = canh;
    }
}
