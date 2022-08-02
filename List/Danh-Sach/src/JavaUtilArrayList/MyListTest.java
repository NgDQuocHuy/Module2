package JavaUtilArrayList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> arrayList = new MyList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        System.out.println(arrayList.get(3));
        System.out.println(arrayList.get(4));
//        arrayList.remove()
    }
}
