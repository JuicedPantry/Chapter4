package Chapter4;


/**
 * Write a description of class AHSLibrary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AHSLibrary
{
    public static void main(String[] args){
        Library ahs = new Library(10, "Acalanes");
        
        Author a = new Author(23, "Jim");
        Book b = new Book(a, "Java Book");
        ahs.addBook(b);
        System.out.println(ahs);
        
    }
}
