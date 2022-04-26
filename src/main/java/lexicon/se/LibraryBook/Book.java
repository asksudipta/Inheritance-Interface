package lexicon.se.LibraryBook;

import java.security.PublicKey;

public class Book implements Loanable{

    // title,author,category(enum),year and pages
    private String title;
    private String author; // author should be an object
    private Category category;
    private int year;
    private int pages;


    //Create a default constructor that sets the pages field to 100.

    public Book() {
        setPages(100);
    }

    public Book(String title, String author, Category category, int year, int pages) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.year = year;
        this.pages = pages;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", category=" + category +
                ", year=" + year +
                ", pages=" + pages +
                '}';
    }

    @Override
    public void loan() {
        System.out.println("The book can be borrowed");
    }
}
