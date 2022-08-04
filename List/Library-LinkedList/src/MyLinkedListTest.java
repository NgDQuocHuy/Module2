public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList myList = new MyLinkedList();
        myList.addFirst("Huy");
        myList.addLast("Hùng");
        myList.add(1, "Hoàng");
        myList.add(2, "Hưng");
        myList.addFirst("Hoang");
        myList.addLast("Loan");

        System.out.println(myList.size());
        System.out.println(myList);
        myList.remove(1);
        System.out.println(myList);
        myList.remove("Huy");
        System.out.println(myList);
    }
}
