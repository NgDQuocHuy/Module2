public class MyLinkedList<E> {
     public class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }
        public Object getData() {
            return data;
        }
    }

    private Node head;
    private int numNodes = 0;

    public MyLinkedList() {}
    public MyLinkedList(Node head, int numNodes) {
        this.head = head;
        this.numNodes = numNodes;
    }
    public MyLinkedList(Node head) {
        this.head = head;
    }

    @Override
    protected Object clone() {
        return new MyLinkedList<E>(head, numNodes);
    }

    //    Phương thức add first
    public void addFirst(E e) {
        if (head == null) {
            head = new Node(e);
            return;
        } else {
            Node temp = head;
            head = new Node(e);
            head.next = temp;
        }
        numNodes++;
    }

//    Phương thức add last
    public void addLast(E e) {
        if(head != null) {
            addFirst(e);
            return;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(e);
        }
        numNodes++;
    }

//    Phương thức add data in index
    public void add(int index, E element)  {
        if(index < 0 || index > numNodes + 1) {
            throw new IllegalArgumentException("Index: " + index + "Size: " + size());
        }
        if(index == 0) {
            addFirst(element);
            return;
        }
        if(index == numNodes) {
            addLast(element);
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;

        Node holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNodes++;
        }
    }

//    Phương thức remove data in index
    public void remove(int index) {
        Node temp = head;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        numNodes--;
    }

//    Phương thức remove data in data
    public void remove(Object e) {
        Node temp = head;
        Node holder = head;
        while (temp.next != null) {
            if(temp.data.equals(e)) {
                holder.next = temp.next;
            }
            holder = temp;
            temp = temp.next;
        }
        numNodes--;
    }

//      Phương thức get size
    public int size() {
        return numNodes;
    }

//      Phương thức contains
    public boolean contains(E o) {
        Node temp = head;
        while (temp.next != null) {
            if (temp.data.equals(o)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

//      Phương thức indexOf
    public int indexOf(E o) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp.data.equals(o)) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

//    public boolean add(E o) {
//        return false;
//    }


//      Phương thức get data in i
    public E get(int i) {
        Node temp = head;
        for (int j = 0; j < i && temp.next != null; j++) {
                temp = temp.next;
            }
        return (E) temp.getData();
    }

//      Phương thức get first data
    public E getFirst() {
        return (E) head.getData();
    }

//      Phương thức get last data
    public E getLast() {
        Node temp = head;
        for (int i = 0; i <= numNodes; i++) {
            temp = temp.next;
        }
        return (E)temp.getData();
    }

//      Phương thức clear
    public void clear() {
        head = null;
        numNodes = 0;
    }

    @Override
    public String toString() {
        Node temp = head;
        String result = "[";
        while (temp != null) {
            result += temp.data + ", ";
            temp = temp.next;
        }
        return result + "]";
    }
}
