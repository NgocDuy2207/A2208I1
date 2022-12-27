package Vehicle_Management.Model;

public class PhuongTien {
    protected String bienSo;
    protected String maSanXuat;
    protected int  NamSanXuat;
    protected String chuSoHuu;

    public PhuongTien(){

    }

    public PhuongTien(String bienSo, String maSanXuat, int namSanXuat, String chuSoHuu) {
        this.bienSo = bienSo;
        this.maSanXuat = maSanXuat;
        NamSanXuat = namSanXuat;
        this.chuSoHuu = chuSoHuu;
    }

    public String getBienSo() {
        return bienSo;
    }

    public void setBienSo(String bienSo) {
        this.bienSo = bienSo;
    }

    public String getMaSanXuat() {
        return maSanXuat;
    }

    public void setMaSanXuat(String maSanXuat) {
        this.maSanXuat = maSanXuat;
    }

    public int getNamSanXuat() {
        return NamSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        NamSanXuat = namSanXuat;
    }

    public String getChuSoHuu() {
        return chuSoHuu;
    }

    public void setChuSoHuu(String chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }

    @Override
    public String toString() {
        return "PhuongTien{" +
                "bienSo='" + bienSo + '\'' +
                ", maSanXuat='" + maSanXuat + '\'' +
                ", NamSanXuat=" + NamSanXuat +
                ", chuSoHuu='" + chuSoHuu + '\'' +
                '}';
    }
}
