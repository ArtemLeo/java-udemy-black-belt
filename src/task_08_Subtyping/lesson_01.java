package task_08_Subtyping;

import java.util.ArrayList;
import java.util.List;

public class lesson_01 {
    public static void main(String[] args) {

        // Создание объекта через родительский класс;
        X x = new Y();

        // Для Generics эта возможность отсутствует - будет ошибка;
        // List<X> list = new ArrayList<>(Y);
    }
}

class X {
}

class Y extends X {
}

// Ограничения для значения Placeholder <T extends Number>;

class Info<T extends Number> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "{[" + value + "]}";
    }

    public T getValue() {
        return value;
    }
}

// Для параметризированных методов, ограничения тоже работают;

class GenMethod {
    public static <T extends Number> T getSecondElement(ArrayList<T> arrayList) {
        return arrayList.get(1);
    }
}

// Имплементацию интерфейсов в параметризированные классы, добавляем через "&";
// class Info<T extends Number&Interface1&Interface2>
