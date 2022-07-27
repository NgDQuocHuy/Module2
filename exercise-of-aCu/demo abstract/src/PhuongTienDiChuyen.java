abstract class PhuongTienDiChuyen {
//    Lớp con phải kế thừa hết abstract của lớp cha

    private String hang = "Mazda";
    PhuongTienDiChuyen() {

    }
    public void displayInfo() {
        System.out.println("Tôi là xe oto.");
    }

    PhuongTienDiChuyen(String hang) {
        this.hang = hang;
    }
}
class XeOto extends PhuongTienDiChuyen {
    private double km = 60;
    private double h = 1;

    public XeOto(double km, double h) {
        super("Blue");
        this.km = km;
        this.h = h;
    }


    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
    
    double layVanToc() {
        return km / h;
    }



    @Override
    public void displayInfo() {
        System.out.println("Tôi là xe oto Mazda");
    }

    @Override
    public String toString() {
        return layVanToc() + " km/h";
    }
}
class Main {
    public static void main(String[] args) {
//        Không thể tạo ra đối tượng cho Class trừu tượng
        PhuongTienDiChuyen a1;
//        Nếu cố tạo sẽ bị lỗi biên dịch
//        PhuongTienDiChuyen a2 = new PhuongTienDiChuyen();

//        PhuongTienDiChuyen phuongtien = new PhuongTienDiChuyen();
        XeOto oto1 = new XeOto(80, 2);
        oto1.displayInfo();
        System.out.println(oto1);
    }
}
