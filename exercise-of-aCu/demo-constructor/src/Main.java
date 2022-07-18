public class Main {
//      Constructor Overloading (Nạp chồng) trong Java
}
class OverloadConst {

    int id;
    String name;
    int age;
    String clas;

    // Constructor có 2 tham số
    OverloadConst(int stt, String ten) {
        id = stt;
        name = ten;
    }

    // Constructor có 3 tham số
    OverloadConst(int stt, String ten, int tuoi) {
        id = stt;
        name = ten;
        age = tuoi;
    }

    OverloadConst(int stt, String ten, int tuoi, String lop) {
        id = stt;
        name = ten;
        age = tuoi;
        clas = lop;
    }

    // Phương thức
    void display() {
        System.out.println(id + "\t" + name + "\t" + age + "\t" + clas);
    }


    public static void main(String[] args) {
        // Tạo đối tượng và truyền vào 2 tham số
        OverloadConst s1 = new OverloadConst(01, "Nguyễn Đình Quốc Huy");

        // Tạo đối tượng và truyền vào 3 tham số
        OverloadConst s2 = new OverloadConst(02, "Quốc Huy Nguyễn Đình", 23);

        // Tạo đối tượng và truyền vào 4 tham số
        OverloadConst s3 = new OverloadConst(03, "Nguyễn Đình Huy Quốc", 22, "C0522K1");

        System.out.println("OverloadConst với 2 tham số:");
        s1.display();
        System.out.println("OverloadConst với 3 tham số:");
        s2.display();
        System.out.println("OverloadConst với 4 tham số:");
        s3.display();
    }
}