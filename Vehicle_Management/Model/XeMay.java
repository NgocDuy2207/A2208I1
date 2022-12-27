package Vehicle_Management.Model;

public class XeMay extends PhuongTien{
    private double congSuat;
    public XeMay(){}

    public XeMay(double congSuat) {
        this.congSuat = congSuat;
    }

    public XeMay(String bienSo, String maSanXuat, int namSanXuat, String chuSoHuu, double congSuat) {
        super(bienSo, maSanXuat, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return "XeMay{" +
                "congSuat=" + congSuat +
                ", bienSo='" + bienSo + '\'' +
                ", maSanXuat='" + maSanXuat + '\'' +
                ", NamSanXuat=" + NamSanXuat +
                ", chuSoHuu='" + chuSoHuu + '\'' +
                '}';
    }
}
