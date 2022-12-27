package Vehicle_Management.Model;

public  class HangSanXuat {
    private String maSanXuat;
    private String tenHangSX;
    private String quocGia;
    public HangSanXuat(){

    }

    public HangSanXuat(String maSanXuat, String tenHangSX, String quocGia) {
        this.maSanXuat = maSanXuat;
        this.tenHangSX = tenHangSX;
        this.quocGia = quocGia;
    }

    public String getMaSanXuat() {
        return maSanXuat;
    }

    public void setMaSanXuat(String maSanXuat) {
        this.maSanXuat = maSanXuat;
    }

    public String getTenHangSX() {
        return tenHangSX;
    }

    public void setTenHangSX(String tenHangSX) {
        this.tenHangSX = tenHangSX;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    @Override
    public String toString() {
        return "HangSanXuat{" +
                "maSanXuat='" + maSanXuat + '\'' +
                ", tenHangSX='" + tenHangSX + '\'' +
                ", quocGia='" + quocGia + '\'' +
                '}';
    }
}
