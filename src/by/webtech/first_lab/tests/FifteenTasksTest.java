package by.webtech.first_lab.tests;

import org.junit.*;
import org.junit.runner.*;
import org.junit.runners.*;
import by.webtech.first_lab.task.twelveth.Book;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Vladimir on 09.10.2016.
 */
@RunWith(value = Parameterized.class)
public class FifteenTasksTest {
    private Book firstBook;
    private Book secondBook;
    private Book thirdBook;

    public FifteenTasksTest(Book firstBook, Book secondBook, Book thirdBook) {
        this.firstBook = firstBook;
        this.secondBook = secondBook;
        this.thirdBook = thirdBook;
    }

    @Test
    public void checkInvertSignOfCompareTo() {
        int firstCompare = firstBook.compareTo(secondBook);
        int secondCompare = secondBook.compareTo(firstBook);
        boolean expectedResult = true;

        boolean actualResult = (firstCompare == (-1*secondCompare));

        Assert.assertEquals(expectedResult, actualResult);
    }


    @Test
    public void checkTransitivityOfCompareTo() {
        boolean expectedResult = (firstBook.compareTo(secondBook) < 0);
        expectedResult = expectedResult && (secondBook.compareTo(thirdBook) < 0);

        boolean actualResult = (firstBook.compareTo(thirdBook) < 0);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkCompareOfSameBook() {
        boolean firstCompare = (firstBook.compareTo(secondBook) < 0);
        boolean secondCompare = (firstBook.compareTo(thirdBook) < 0);

        boolean expectedResult = true;

        boolean actualResult = (firstCompare && secondCompare);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Book firstBook = new Book("Thinking in Java", "Bruce Eckel", 455);
        Book secondBook = new Book("Методы программирования", "И.Н.Блинов", 897);
        Book thirdBook = new Book("Тревожное счастье", "Иван Шамякин", 932);

        Object[][] data = new Object[][] { { firstBook, secondBook, thirdBook } };
        return Arrays.asList(data);
    }

}
