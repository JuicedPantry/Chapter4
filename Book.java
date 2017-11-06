package Chapter4;


/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    private String title;
    private Author bookAuthor;
    public Book (Author a, String tl){
        this.bookAuthor = a;
        this.title = tl;
    }
    public String toString(){
        return "The book " + title + " was written by " + bookAuthor;
    }
    
    
}
