package by.webtech.first_lab.tests;

import org.junit.*;
import org.junit.runner.*;
import org.junit.runners.*;
import by.webtech.first_lab.task.twelveth.Book;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Vladimir on 05.10.2016.
 */
@RunWith(value = Parameterized.class)
public class TwelvethTasksTest {
    private Book firstBook;
    private Book secondBook;
    private Book thirdBook;

    public TwelvethTasksTest(Book firstBook, Book secondBook, Book thirdBook) {
        this.firstBook = firstBook;
        this.secondBook = secondBook;
        this.thirdBook = thirdBook;
    }

    @Test
    public void checkReflexivityOfEquals() {
        boolean actualResult = firstBook.equals(firstBook);
        boolean expectedResult = true;

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkSymmetryOfEquals() {
        boolean secondEqualToFirst = firstBook.equals(secondBook);
        boolean firstEqualToSecont = secondBook.equals(firstBook);
        boolean expectedResult = true;

        boolean actualResult = (firstEqualToSecont == secondEqualToFirst);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkTransitivityOfEquals() {
        boolean expectedResult = firstBook.equals(secondBook);
        expectedResult = expectedResult && secondBook.equals(thirdBook);

        boolean actualResult = firstBook.equals(thirdBook);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkSameHashCodeOfSameObjects() {
        boolean actualResult = (firstBook.hashCode() == secondBook.hashCode());
        boolean expectedResult = true;

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkWorkableClone() {
        boolean expectedResult = true;
        boolean actualResult = firstBook.clone().equals(firstBook);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Book firstBook = new Book("Thinking in Java", "Bruce Eckel", 455);
        Book secondBook = new Book("Thinking in Java", "Bruce Eckel", 455);
        Book thirdBook = new Book("Thinking in Java", "Bruce Eckel", 455);

        Object[][] data = new Object[][] { { firstBook, secondBook, thirdBook } };
        return Arrays.asList(data);
    }

}
