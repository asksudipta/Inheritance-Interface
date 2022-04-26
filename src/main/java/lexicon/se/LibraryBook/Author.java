package lexicon.se.LibraryBook;

import java.time.LocalDate;

public class Author {
    private String firstName;
    private String lastName;
    private LocalDate birthdate;
    private int numberOfBooks;

    public Author() {
    }

    public Author(String firstName, String lastName, LocalDate birthdate, int numberOfBooks) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.numberOfBooks = numberOfBooks;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }
}
