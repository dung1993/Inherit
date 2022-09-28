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

    public void add(int i, E e) {
        if (size > elements.length) {
            ensureCapa();
        }
        if (i >= elements.length || i < 0) {
            System.out.println("Index: " + i + ", Size: " + elements.length);
        } else {
            System.arraycopy(elements, i, elements, i + 1, size - i);
            elements[i] = e;
            size++;
        }
    }

    public void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void remove(int i) {
        if (i >= elements.length || i < 0) {
            System.out.println("Index: " + i + ", Size: " + elements.length);
        } else {
            System.arraycopy(elements, i + 1, elements, i, size - i);
//            size--;
            elements[--size] = null;
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

