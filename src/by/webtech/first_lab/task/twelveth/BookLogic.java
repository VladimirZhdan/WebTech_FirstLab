package by.webtech.first_lab.task.twelveth;

import java.util.Comparator;

/**
 * Created by Vladimir on 09.10.2016.
 */
public class BookLogic {
    public static final Comparator<Book> TITLE_COMPARATOR = new TitleCmp();
    public static final Comparator<Book> TITLE_AUTHOR_COMPARATOR = new TitleAuthorCmp();
    public static final Comparator<Book> AUTHOR_TITLE_COMPARATOR = new AuthorTitleCmp();
    public static final Comparator<Book> AUTHOR_TITLE_PRICE_COMPARATOR = new AuthorTitlePriceCmp();

    private static class TitleCmp implements Comparator<Book> {
        public int compare(Book firstBook, Book secondBook) {
            int compareTitle = firstBook.getTitle().compareTo(secondBook.getTitle());
            return compareTitle;
        }
    }

    private static class TitleAuthorCmp implements Comparator<Book> {
        public int compare(Book firstBook, Book secondBook) {
            int compareTitle = firstBook.getTitle().compareTo(secondBook.getTitle());
            if(compareTitle != 0) {
                return compareTitle;
            }

            int compareAuthor = firstBook.getAuthor().compareTo(secondBook.getAuthor());
            return compareAuthor;
        }
    }

    private static class AuthorTitleCmp implements Comparator<Book> {
        public int compare(Book firstBook, Book secondBook) {
            int compareAuthor = firstBook.getAuthor().compareTo(secondBook.getAuthor());
            if(compareAuthor != 0) {
                return compareAuthor;
            }

            int compareTitle = firstBook.getTitle().compareTo(secondBook.getTitle());
            return compareTitle;
        }
    }

    private static class AuthorTitlePriceCmp implements Comparator<Book> {
        public int compare(Book firstBook, Book secondBook) {
            int compareAuthor = firstBook.getAuthor().compareTo(secondBook.getAuthor());
            if(compareAuthor != 0) {
                return compareAuthor;
            }

            int compareTitle = firstBook.getTitle().compareTo(secondBook.getTitle());
            if(compareTitle != 0) {
                return compareTitle;
            }

            int firstBooksPrice = firstBook.getPrice();
            int secondBooksPrice = secondBook.getPrice();
            if(firstBooksPrice < secondBooksPrice) {
                return -1;
            }
            if(firstBooksPrice > secondBooksPrice) {
                return 1;
            }
            return 0;
        }
    }
}
