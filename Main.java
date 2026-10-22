public class Main {
    public static void main(String[] args) {
        // 1. Hai sản phẩm bằng constructor đủ tham số
        SanPham banPhim = new SanPham("SP01", "Bàn phím cơ", 450000, 20);
        SanPham chuot   = new SanPham("SP02", "Chuột không dây", 200000, 50);

        // 2. Tai nghe: constructor 2 tham số, rồi dùng setter
        SanPham taiNghe = new SanPham("SP03", "Tai nghe");
        taiNghe.setDonGia(350000);
        taiNghe.setSoLuongTon(10);

        System.out.println("===== DANH SÁCH SẢN PHẨM =====");
        banPhim.hienThi();
        chuot.hienThi();
        taiNghe.hienThi();

        // 3. Ba đơn hàng (Chi nhập nhầm số lượng 0)
        DonHang don1 = new DonHang("An", banPhim, 2);
        DonHang don2 = new DonHang("Bình", chuot, 5);
        DonHang don3 = new DonHang("Chi", taiNghe, 0);

        // 4. In đơn hàng
        System.out.println("\n===== DANH SÁCH ĐƠN HÀNG =====");
        System.out.printf("%-6s %-16s %-3s %10s%n", "Khách", "Sản phẩm", "SL", "Thành tiền");
        don1.inDonHang();
        don2.inDonHang();
        don3.inDonHang();
    }
}
