public class DonHang {
    private String tenKhach;
    private SanPham sanPham;     // đối tượng SanPham được truyền vào
    private int soLuong;

    public DonHang(String tenKhach, SanPham sanPham, int soLuong) {
        this.tenKhach = tenKhach;
        this.sanPham = sanPham;
        this.soLuong = (soLuong < 1) ? 1 : soLuong;   // nhỏ hơn 1 thì tự sửa thành 1
    }

    /** Thành tiền = đơn giá × số lượng; từ 5 cái trở lên giảm 10%. */
    public double tinhThanhTien() {
        double tien = sanPham.getDonGia() * soLuong;
        if (soLuong >= 5) tien *= 0.9;
        return tien;
    }

    public void inDonHang() {
        System.out.printf("%-6s %-16s %-3d %10s%n",
                tenKhach, sanPham.getTenSP(), soLuong, SanPham.tien(tinhThanhTien()));
        if (soLuong >= 5) System.out.println("       (đã giảm 10%)");
    }

    public String getTenKhach() { return tenKhach; }
    public int getSoLuong()     { return soLuong; }
}
