import java.util.Date;

import java.text.SimpleDateFormat;
public class sanhsu extends HangHoa{
    private String noiSanxuat;

    public sanhsu(String id, String tenMonHang, double giaCa, int soluong, String ngayNhap, String noiSanxuat) throws ParseException
    {
        super("HSS-" + id, tenMonHang, giaCa, soluong, ngayNhap);
        this.noiSanxuat = noiSanxuat;
    }
    public void setNoiSanxuat(String noiSanxuat) {
        this.noiSanxuat = noiSanxuat;
    }
    public String getNoiSanxuat() {
        return noiSanxuat;
    }

    DecimalFormat df = new DecimalFormat("###,###,### VND");
    @Override
    public String toString() {
        String s;
        s = super.toString() + String.format("%-20s|%-20s|", getNoiSanxuat(),df.format(thanhToan()));
        return s;
    }
    private Object thanhToan() { 
        return null;
    }
    
    
}