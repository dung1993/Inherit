package ArrayList;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, int value) {
        if (size >= elements.length) {
            ensureCapa();
        }
        if (index > 0 || index < size) {
            for (int i = size - 1; i >= index; i--) {
                elements[i + 1] = elements[i];
            }
            elements[index] = value;
            size++;
        }
    }

    public void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }


    public void remove(int index) {
        if (size >= elements.length) {
            ensureCapa();
        }
        if (index > 0 || index < size) {
            for (int i = size; i < size - 1; i++) {
                elements[i] = elements[i + 1];
            }
            size--;
        }
    }

    public int size() {
        return size;
    }

    public Object clone() {
        Object newArr[] = new Object[size];
        for (int i = 0; i < size; i++) {
            newArr[i] = elements[i];
        }
        return "MyListClone{" +
                "size=" + size +
                ", elements=" + Arrays.toString(newArr) +
                '}';
    }

    public boolean contains(E e) {
        for (Object element : elements) {
            if (element == e) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E e) {
        int indexOf = -1;
        for (int i = 0; i < size; i++) {
            if (elements[i] == e) {
                indexOf = i;
            }
        }
        return indexOf;
    }

    public Object[] copyOf(int from, int to) {
        Object newArr[] = new Object[size];
        if (to < size && from >= 0) {
            for (int i = from; i <= to; i++) {
                newArr[i] = elements[i];
            }
        } else {
            return null;
        }
        return newArr;
    }

    public void connectOf(MyList<E> list) {
        for (Object e : list.elements) {
            add((E) e);
        }
    }

    // kiểm tra mảng con
    public boolean checkChildArray(E[] e) {
//        Object newArr[] = new Object[size];
        boolean flag = false;
        if (e.length <= size) {
            for (int i = 0; i < size; i++) {
                if (elements[i] == e[0]) {
                    int j = 0;
                    for (; j < e.length; j++) {
                        if (e[j] != elements[i + j]) {
                            break;
                        }
                    }
                    if (j == e.length){
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }


    public Object[] getElements() {
        return elements;
    }

    public void add(E e) {
        if (size >= elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    public E get(int i) {
        if (i > size || i < 0) {
            System.out.println("Index invalid!");
        }
        return (E) elements[i];
    }

    public Object clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
        return "MyList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }

    @Override
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }

}

