package by.webtech.first_lab.tests;

import org.junit.*;
import org.junit.runner.*;
import org.junit.runners.*;
import by.webtech.first_lab.task.thirteenth.ProgrammerBook;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Vladimir on 08.10.2016.
 */
@RunWith(value = Parameterized.class)
public class ThirteenthTasksTest {
    private ProgrammerBook firstBook;
    private ProgrammerBook secondBook;
    private ProgrammerBook thirdBook;

    public ThirteenthTasksTest(ProgrammerBook firstBook, ProgrammerBook secondBook, ProgrammerBook thirdBook) {
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

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        ProgrammerBook firstBook = new ProgrammerBook("Методы программирования", "И.Н.Блинов", 897, "Java", 3);
        ProgrammerBook secondBook = new ProgrammerBook("Методы программирования", "И.Н.Блинов", 897, "Java", 3);
        ProgrammerBook thirdBook = new ProgrammerBook("Методы программирования", "И.Н.Блинов", 897, "Java", 3);

        Object[][] data = new Object[][] { { firstBook, secondBook, thirdBook } };
        return Arrays.asList(data);
    }
}
