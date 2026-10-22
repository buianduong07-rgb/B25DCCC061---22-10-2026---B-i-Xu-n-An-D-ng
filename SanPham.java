import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class SanPham {
    private String maSP;
    private String tenSP;
    private double donGia;
    private int soLuongTon;

    /** Constructor 1: không tham số. */
    public SanPham() { }

    /** Constructor 2: hàng mới về chưa có giá, cập nhật giá sau. */
    public SanPham(String maSP, String tenSP) {
        this.maSP = maSP;
        this.tenSP = tenSP;
    }

    /** Constructor 3: đủ 4 tham số, tái sử dụng constructor 2 bằng this(...). */
    public SanPham(String maSP, String tenSP, double donGia, int soLuongTon) {
        this(maSP, tenSP);
        this.donGia = donGia;
        this.soLuongTon = soLuongTon;
    }

    // ---- getter / setter ----
    public String getMaSP()      { return maSP; }
    public void setMaSP(String maSP) { this.maSP = maSP; }

    public String getTenSP()     { return tenSP; }
    public void setTenSP(String tenSP) { this.tenSP = tenSP; }

    public double getDonGia()    { return donGia; }
    public void setDonGia(double donGia) { this.donGia = donGia; }

    public int getSoLuongTon()   { return soLuongTon; }
    public void setSoLuongTon(int soLuongTon) { this.soLuongTon = soLuongTon; }

    /** In thông tin một dòng sản phẩm. */
    public void hienThi() {
        System.out.printf("%-5s %-16s %9s  tồn %d%n",
                maSP, tenSP, tien(donGia), soLuongTon);
    }

    /** Định dạng 450000 -> 450.000 */
    static String tien(double v) {
        DecimalFormatSymbols s = new DecimalFormatSymbols(Locale.US);
        s.setGroupingSeparator('.');
        return new DecimalFormat("#,##0", s).format(v);
    }
}
