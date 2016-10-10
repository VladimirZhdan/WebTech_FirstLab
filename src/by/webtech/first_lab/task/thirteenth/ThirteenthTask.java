package by.webtech.first_lab.task.thirteenth;

/**
 * Created by Vladimir on 02.10.2016.
 */
public class ThirteenthTask {
    public static void main(String[] args) {
        ProgrammerBook bookFirst = new ProgrammerBook("Методы программирования", "И.Н.Блинов", 897, "Java", 3);
        ProgrammerBook bookSecond = new ProgrammerBook("Методы программиронания", "И.Н.Блинов", 897, "Java", 3);
        System.out.println(bookFirst);
        System.out.println(bookFirst.hashCode());
        System.out.println(bookSecond.hashCode());
    }


}
