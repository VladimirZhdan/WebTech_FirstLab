package by.webtech.first_lab.tests;

import org.junit.*;
import org.junit.runner.*;
import org.junit.runners.*;
import by.webtech.first_lab.task.twelveth.Book;
import by.webtech.first_lab.task.twelveth.BookLogic;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Vladimir on 09.10.2016.
 */
@RunWith(value = Parameterized.class)
public class SixteenTasksTest {
    private Book[] booksArray;

    public SixteenTasksTest(Book[] booksArray) {
        this.booksArray = booksArray;
    }

    @Test
    public void checkRightSortByTitle() {
        Book[] tempBooks = new Book[3];
        for(int i = 0; i < tempBooks.length; i++) {
            tempBooks[i] = booksArray[i].clone();
        }
        Arrays.sort(tempBooks, BookLogic.TITLE_COMPARATOR);

        Book[] expectedSortedBooks = new Book[3];
        expectedSortedBooks[0] = booksArray[1].clone();
        expectedSortedBooks[1] = booksArray[0].clone();
        expectedSortedBooks[2] = booksArray[2].clone();

        Assert.assertArrayEquals(expectedSortedBooks, tempBooks);
    }

    @Test
    public void checkRightSortByTitleAndAuthor() {
        Book[] tempBooks = new Book[4];
        for(int i = 0; i < tempBooks.length; i++) {
            tempBooks[i] = booksArray[i].clone();
        }
        Arrays.sort(tempBooks, BookLogic.TITLE_AUTHOR_COMPARATOR);

        Book[] expectedSortedBooks = new Book[4];
        expectedSortedBooks[0] = booksArray[3].clone();
        expectedSortedBooks[1] = booksArray[1].clone();
        expectedSortedBooks[2] = booksArray[0].clone();
        expectedSortedBooks[3] = booksArray[2].clone();

        Assert.assertArrayEquals(expectedSortedBooks, tempBooks);
    }

    @Test
    public void checkRightSortByAuthorAndTitle() {
        Book[] tempBooks = new Book[4];
        tempBooks[0] = booksArray[1].clone();
        tempBooks[1] = booksArray[0].clone();
        tempBooks[2] = booksArray[2].clone();
        tempBooks[3] = booksArray[3].clone();
        Arrays.sort(tempBooks, BookLogic.TITLE_AUTHOR_COMPARATOR);

        Book[] expectedSortedBooks = new Book[4];
        expectedSortedBooks[0] = booksArray[3].clone();
        expectedSortedBooks[1] = booksArray[1].clone();
        expectedSortedBooks[2] = booksArray[0].clone();
        expectedSortedBooks[3] = booksArray[2].clone();

        Assert.assertArrayEquals(expectedSortedBooks, tempBooks);
    }

    @Test
    public void checkRightSortByAuthorAndTitleAndPrice() {
        Book[] tempBooks = new Book[5];
        for(int i = 0; i < tempBooks.length; i++) {
            tempBooks[i] = booksArray[i].clone();
        }
        Arrays.sort(tempBooks, BookLogic.AUTHOR_TITLE_PRICE_COMPARATOR);

        Book[] expectedSortedBooks = new Book[5];
        expectedSortedBooks[0] = booksArray[3].clone();
        expectedSortedBooks[1] = booksArray[1].clone();
        expectedSortedBooks[2] = booksArray[0].clone();
        expectedSortedBooks[3] = booksArray[4].clone();
        expectedSortedBooks[4] = booksArray[2].clone();

        Assert.assertArrayEquals(expectedSortedBooks, tempBooks);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Book[] booksArray = new Book[5];
        booksArray[0] = new Book("Методы программирования", "И.Н.Блинов", 897);
        booksArray[1] = new Book("Thinking in Java", "Bruce Eckel1", 455);
        booksArray[2] = new Book("Тревожное счастье", "Иван Шамякин", 732);
        booksArray[3] = new Book("Thinking in Java", "Bruce Eckel", 422);
        booksArray[4] = new Book("Тревожное счастье", "Иван Шамякин", 456);

        Object[][] data = new Object[][] { { booksArray } };
        return Arrays.asList(data);
    }
}
