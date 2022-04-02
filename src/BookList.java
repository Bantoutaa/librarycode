import java.util.ArrayList;

public class BookList {
    ArrayList<Book> booklist;

    BookList(){
        booklist=new ArrayList<Book>();
    }

    //a method that adds a book to the books list using all of the parameters of the Book constructor
    public void addBook(String bookID, String authorLastname, String authorFirstname, String Title)
    {
        Book book=new Book(bookID, authorLastname, authorFirstname, Title);
        if(Book.checkBookDataOK(bookID, authorLastname, authorFirstname, Title))
            booklist.add(book);
        else
            System.out.println("Book was not entered. Data invalid");
    }

    //a method addBookString that takes a CSV String as a parameter. (CSV means comma separated values)
    public void addBookString(String bookData) {
        String[] res = bookData.split("[,]", 0);
        Book book=new Book(res[0],res[1],res[2],res[3]);
        if(Book.checkBookDataOK(book.getBookID(),book.getLastName() ,book.getFirstName() , book.getBookTitle()))
            booklist.add(book);
        else
            System.out.println("The Book "+book.getBookTitle()+" was not entered into list. Data invalid");
    }
    public void printBooks() {
        for(int i=0; i<booklist.size();i++) {
            System.out.println(booklist.get(i).toString());
        }
    }
    public int findBookByTitle(String title) {
        boolean found=false;
        int i=0;
        while(found==false && i<booklist.size()) {
            if(booklist.get(i).getBookTitle().equals(title)) {
                found=true;
                return i;
            }
            i++;
        }
        return -1;
    }

    public int findBookByAuthorLastName(String lastName) {
        boolean found=false;
        int i=0;
        while(found==false && i<booklist.size()) {
            if(booklist.get(i).getLastName().equals(lastName)) {
                found=true;
                return i;
            }
            i++;
        }
        return -1;
    }

}
