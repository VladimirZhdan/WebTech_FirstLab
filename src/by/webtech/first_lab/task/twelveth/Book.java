package by.webtech.first_lab.task.twelveth;

/**
 * Created by Vladimir on 02.10.2016.
 */
public class Book implements Cloneable, Comparable<Book> {
    private String title;
    private String author;
    private int price;
    private static int edition = 0;
    private static int ISBN = 0;
    private int isbn;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = getNewISBN();
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPrice() {
        return this.price;
    }

    public static int getEdition() {
        return Book.edition;
    }

    public void setTitle(String value) {
        this.title = value;
    }

    public void setAuthor(String value) {
        this.author = value;
    }

    public void setPrice(int value) {
        this.price = value;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj == null) {
            return false;
        }
        if(this.getClass() != obj.getClass()) {
            return false;
        }
        Book bookObj = (Book)obj;
        return (this.title.equals(bookObj.title) && this.author.equals(bookObj.author) && (this.price == bookObj.price));
    }

    @Override
    public int hashCode() {
        int result = 73;
        result = 31 * result + this.title.hashCode();
        result = 31 * result + this.author.hashCode();
        result = 31 * result + this.price;
        return result;
    }

    @Override
    public String toString() {
        String result;
        result = "Book{title=\"" + this.title + "\";author=\"" + this.author + "\";price=" + this.price + "}";
        return result;
    }

    @Override
    public Book clone() {
        try {
            Book result = (Book)super.clone();
            return result;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    private int getNewISBN() {
        int result = Book.ISBN;
        Book.ISBN += 1;
        return result;
    }

    @Override
    public int compareTo(Book book) {
        if(this.isbn < book.isbn) {
            return -1;
        }
        if(this.isbn > book.isbn) {
            return 1;
        }
        return 0;
    }
}