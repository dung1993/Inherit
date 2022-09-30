package ArrayList;

import java.util.Arrays;

public class MyListTest {

    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(1);
        list.add(2);
        list.add(3);

//        MyList<Integer> l1 = new MyList<>();
//        l1.add(1);
//        l1.add(2);

//        list.connectOf(l1);
//        System.out.println(Arrays.toString(Arrays.stream(list.getElements()).toArray()));

        Integer[] arr = {1,2,3,5};
        System.out.println(list.checkChildArray(arr));
//        list.remove(2);
//        System.out.println(list.size());
//        System.out.println(list.clone());

//        System.out.println(list.get(2));
//        System.out.println(list);
//        System.out.println(list.clear());

//        list1.copyOf(2,5);
//        System.out.println(Arrays.toString(list1.getElements()));



    }



//    public static Object[] connectOf() {
//        Object[] list1 = new Object[]{1, 2, 3, 65, 4};
//        Object[] list2 = new Object[]{4, 5, 7, 32, 7};
//        Object newArr[] = new Object[list1.length + list2.length];
//        for (int i = 0; i < list1.length; i++) {
//            newArr[i] = list1[i];
//        }
//        for (int i = list1.length, j = 0; j < list2.length && i < newArr.length; i++, j++) {
//            newArr[i] = list2[j];
//        }
//        return newArr;
//    }
}
