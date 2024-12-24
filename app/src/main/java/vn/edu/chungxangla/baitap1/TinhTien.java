package vn.edu.chungxangla.baitap1;

public class TinhTien {


    private float soGio;
    private String loaiPhong;

    public double tinhtoan(){
        if(loaiPhong.equals("thuong")) {
            return soGio * 100000;
        }
        else if(loaiPhong.equals("vip")) {
            return soGio * 500000;
        }
        return 0;
    }


    public float getSoGio() {
        return soGio;
    }

    public void setSoGio(float soGio) {
        this.soGio = soGio;
    }

    public String getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(String loaiPhong) {
        this.loaiPhong = loaiPhong;
    }
}
