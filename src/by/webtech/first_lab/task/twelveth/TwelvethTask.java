package by.webtech.first_lab.task.twelveth;

import java.util.Arrays;

/**
 * Created by Vladimir on 02.10.2016.
 */
public class TwelvethTask {
    public static void main(String[] args) {
        Book firstBook = new Book("Thinking in Java", "Bruce Eckel", 455);
        Book secondBook = new Book("Thinkisng in Java", "Bruce Ecwel", 455);
        System.out.println(firstBook);
        System.out.println(firstBook.hashCode());
        System.out.println(secondBook.hashCode());
        Book cloneBook = firstBook.clone();
        firstBook.setPrice(333);
        firstBook.setAuthor("Bruce");
        System.out.println("New first book: " + firstBook);
        System.out.println("New clone book: " + cloneBook);
        Book[] booksArray = new Book[4];
        booksArray[0] = new Book("Методы программирования", "И.Н.Блинов", 897);
        booksArray[1] = new Book("Thinking in Java", "Bruce Eckel1", 455);
        booksArray[2] = new Book("Тревожное счастье", "Иван Шамякин", 932);
        booksArray[3] = new Book("Thinking in Java", "Bruce Eckel", 422);
        System.out.println("Initial array: ");
        for(int i = 0; i < booksArray.length; i++) {
            System.out.println(booksArray[i]);
        }
        Arrays.sort(booksArray, BookLogic.AUTHOR_TITLE_COMPARATOR);
        System.out.println("Sorted array: ");
        for(int i = 0; i < booksArray.length; i++) {
            System.out.println(booksArray[i]);
        }

    }
}
