package tuan06;

public class HinhVuong {
    String nhac="âm thanh muốn nghe!!";
    Boolean bam =false;
    int size;
    static int count;
    hinhVuong(){
        count ++;
    }
    void bam(){
    bam = bam;
    }
    void play(){
        if(bam == true){
            System.out.println("đang xoay 360 độ");
            System.out.println("phat tieng");
        }
        else
        System.out.println("đã ngừng!!");
    }
}