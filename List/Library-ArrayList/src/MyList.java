public class MyList<E> {
    private int size = 0;

    private final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

//      Tạo Constructor
    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    //      Phương thức add
    public void add(int index, E element) {
        checkIndex(index);
        elements[index] = element;
        size++;
    }

//      Phương thức remove
    public E remove(int index) {
        checkIndex(index);
        int j = 0;
        E element = null;
        for (int i = 0; i < size; i++){
            if (i == index){
                element = (E) elements[i];
                continue;
            }
            elements[j]= elements[i];
            j++;
        }
        size--;
        return element;
    }
//      Phương thức lấy size
    public int size() {
        return size;
    }

//      Phưởng thức kiểm tra phần tử có nằm trong List không
    public boolean contains(E o) {
        if (o == null)
            return false;
        else
            for (int i = 0; i < size; i++) {
                if (o.equals(elements[i])) {
                    return true;
                }
            }
        return false;
    }

//      Phương thức index of
    public int indexOf(E o) {
        int j = 0;
        if (o == null)
            return -1;
        else
            for (int i = 0; i < size; i++) {
                if (o.equals(elements[i])) {
                    j++;
                    return j;
                }
            }
        return -1;
    }

    public boolean add(E o) {
        if (o == null)
            return false;
        else
            elements[size++] = o;
        return true;
    }

//      Phương thức nhân đôi Capacity List
    public void ensureCapacity() {
        if(size >= elements.length) {
            int minCapacity = elements.length * 2;
            Object[] newElements = new Object[minCapacity];
            for(int i = 0; i < size; i++) {
                newElements[i] = elements[i];
            }
            elements = newElements;
        }

    }

//      Phương thức get
    public E get(int index) {
        checkIndex(index);
        return (E) elements[index];

    }

//      Phương thức clear List
    public void clear() {
        size = 0;
    }

//      Phương thức checkIndex
    private void checkIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }
}
