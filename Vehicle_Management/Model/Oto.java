package Vehicle_Management.Model;

public class Oto extends PhuongTien{
    private int soChoNgoi;
    private String kieuXe;
    public Oto(String bienSo, int namSanXuat, String chuSoHuu, int soChoNgoi, String kieuXe){

    }

    public Oto(int soChoNgoi, String kieuXe) {
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    public Oto(String bienSo, String maSanXuat, int namSanXuat, String chuSoHuu, int soChoNgoi, String kieuXe) {
        super(bienSo, maSanXuat, namSanXuat, chuSoHuu);
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    @Override
    public String toString() {
        return "Oto{" +
                "soChoNgoi=" + soChoNgoi +
                ", kieuXe='" + kieuXe + '\'' +
                ", bienSo='" + bienSo + '\'' +
                ", maSanXuat='" + maSanXuat + '\'' +
                ", NamSanXuat=" + NamSanXuat +
                ", chuSoHuu='" + chuSoHuu + '\'' +
                '}';
    }
}
