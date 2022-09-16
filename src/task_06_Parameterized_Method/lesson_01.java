package task_06_Parameterized_Method;

import java.util.ArrayList;

public class lesson_01 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(10);
        arrayList1.add(20);
        arrayList1.add(5);
        int a = GenMethod.getSecondElement(arrayList1);
        System.out.println(a);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Anna");
        arrayList2.add("Tom");
        arrayList2.add("Den");
        String b = GenMethod.getSecondElement(arrayList2);
        System.out.println(b);
    }
}

class GenMethod{
    public static <T> T getSecondElement (ArrayList<T>arrayList){
        return arrayList.get(1);
    }
}

