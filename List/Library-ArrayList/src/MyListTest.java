import java.util.ArrayList;
import java.util.Arrays;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> list = new MyList<String>();
        System.out.println(list.size());

        list.add(0,"a");
        list.add(1,"b");
        list.add( 2,"c");
        list.add(3,"d");
        list.add(4,"e");
        list.add(5,"f");
        list.add(6,"g");
        list.add(7,"h");
        list.add(8,"i");
        list.add(9,"f");

        System.out.println(list.size());
        System.out.println(list.get(2));
        for (int i = 0 ; i < list.size(); i++) {
            System.out.println(list.get(i) +"");
        }
        list.clear();
        System.out.println("sau khi clear");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) +"");
        }

        System.out.println(list.size());
        list.add(0, "Huy");
        list.add(1, "Huy");
        list.add(2, "Huy");
        list.add(3, "Huy");
        list.add(4,"hung");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) +"");
        }
        System.out.println(list.size());

        System.out.println(list.contains("Huy"));
        System.out.println(list.indexOf("Huy"));

        list.add("huyndqgcd171");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) +"");

        }
        System.out.println(list.size());
        System.out.println(list.size());
    }
}
