public class BlogPost {

    String authorName;
    String title;
    String text;
    String publicationDate;

    BlogPost(String authorName, String title, String text, String publicationDate) {
        this.authorName = authorName;
        this.title = title;
        this.text = text;
        this.publicationDate = publicationDate;
    }

    void printPublished() {
        System.out.print(this.title + this.authorName + this.publicationDate);
        System.out.println();
        System.out.print(this.text);
    }
}
