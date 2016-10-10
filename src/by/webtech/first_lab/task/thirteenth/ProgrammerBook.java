package by.webtech.first_lab.task.thirteenth;

import by.webtech.first_lab.task.twelveth.Book;

/**
 * Created by Vladimir on 02.10.2016.
 */
public class ProgrammerBook extends Book {
    private String language;
    private int level;
    public ProgrammerBook(String title, String author, int price, String language, int level) {
        super(title, author, price);
        this.language = language;
        this.level = level;
    }

    public String getTitle() {
        return super.getTitle();
    }

    public String getAuthor() {
        return super.getAuthor();
    }

    public int getPrice() {
        return super.getPrice();
    }

    public static int getEdition() {
        return Book.getEdition();
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
        ProgrammerBook programmerBook = (ProgrammerBook)obj;
        return (this.language.equals(programmerBook.language) && (this.level == programmerBook.level) && super.equals((Book)programmerBook));
    }

    @Override
    public int hashCode() {
        int result = 67;
        result = 53 * result + super.hashCode();
        result = 53 * result + this.language.hashCode();
        result = 53 * result + this.level;
        return result;
    }

    @Override
    public String toString() {
        String result;
        result = "ProgrammerBook{title=\"" + this.getTitle() + "\";author=\"" + this.getAuthor() + "\";price=" + this.getPrice() + ";language=\"" + this.language + "\";level=" + this.level + "}";
        return result;
    }



}
