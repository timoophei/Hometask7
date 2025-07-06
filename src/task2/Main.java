package task2;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        //использовал РЕФЛЕКСИЮ
        //без throws не компилируется, потому что возможны ошибки (поле с таким именем не найдено и нет прав доступа к полю)
        Apple apple = new Apple("зеленое");
        System.out.println("до изменения: " + apple.getColor());

        Field colorField = Apple.class.getDeclaredField("color");
        colorField.setAccessible(true);
        colorField.set(apple, "красное");

        System.out.println("после изменения: " + apple.getColor());
    }
}