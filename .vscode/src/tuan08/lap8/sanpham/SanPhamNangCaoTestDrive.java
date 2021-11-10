package lap8.sanpham;

import java.util.ArrayList;
import java.util.List;

public class SanPhamNangCaoTestDrive {
    public static void main(String[] args) {
        List<sanphamnangcao> list;
        list = new ArrayList<>();
        sanphamnangcao sanpham = new sanphamnangcao("RTX 3030", 1000.0);
        sanphamnangcao sanpham2 = new sanphamnangcao("RTX 3020", 899.99, 777.77);
        list.add(sanpham);
        list.add(sanpham2);
        for (int i = 0 ; i < list.size(); i++){
            sanphamnangcao sanphamnangcao = list.get(i);
            sanphamnangcao.Xuat();
        }
    }
}
