import java.util.Objects;

public class Book {
    private String title;
    private Author author;
    private int publishDate;

    public Book(String title, Author author, int publishDate) {
        this.title = title;
        this.author = author;
        this.publishDate = publishDate;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(int publishDate) {
        this.publishDate = publishDate;
    }

    public String toString() {
        return "Название книги: " + title + ", Автор: " + author + ", Дата публикации: " + publishDate;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishDate == book.publishDate && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publishDate);
    }
}
