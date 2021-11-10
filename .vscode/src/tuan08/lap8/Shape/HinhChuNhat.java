package lap8.Shape;

public class HinhChuNhat {
    private double dai;
    private double rong;
    public void ChuNhat(double dai, double rong){
        this.dai = dai;
        this.rong = rong;
    }
    
    protected double getChuVi(){
       return   (dai + rong)*2;
       
    }
    protected double getDienTich(){
       return  dai * rong ;
        
    }
    public double getDai() {
        return dai;
    }
    public double getRong() {
        return rong;
    }
    void xuat(){
        System.out.println("chieu dai: "+dai);
        System.out.println("chieu rong: "+ rong);
        System.out.println("chu vi: ("+ dai +"+"+rong+")*2 = "+getChuVi());
        System.out.println("dien tich: "+dai +"*"+rong+"= "+getDienTich());
    }
}

