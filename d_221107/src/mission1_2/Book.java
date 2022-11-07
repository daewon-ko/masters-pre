package mission1_2;

public class Book {
    private String author;
    private String title;

    Book(String title, String author){
        this.author =author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void showBookInfo(){


    }
}
