package Vehicle_Management.Model;

public class XeTai extends PhuongTien{
    private double trongTai;
    public XeTai(){

    }

    public XeTai(double trongTai) {
        this.trongTai = trongTai;
    }

    public XeTai(String bienSo, String maSanXuat, int namSanXuat, String chuSoHuu, double trongTai) {
        super(bienSo, maSanXuat, namSanXuat, chuSoHuu);
        this.trongTai = trongTai;
    }

    public double getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(double trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return "XeTai{" +
                "trongTai=" + trongTai +
                ", bienSo='" + bienSo + '\'' +
                ", maSanXuat='" + maSanXuat + '\'' +
                ", NamSanXuat=" + NamSanXuat +
                ", chuSoHuu='" + chuSoHuu + '\'' +
                '}';
    }
}
