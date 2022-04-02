public class Book {
    private static  String bookID;
    private String lastName;
    private String firstName;
    private String bookTitle;
    private String booksID;

    Book(String bookID,String lastName,String firstName,String bookTitle){
        this.bookID=bookID;
        this.lastName =lastName;
        this.firstName =firstName;
        this.bookTitle =bookTitle;
        booksID =this.bookID;
    }

    public String getBookID() {
        return bookID;
    }

    public String getLastName() {
        return lastName;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    //A method to confirm if the ID is correct
    public static boolean checkID() {
        boolean flag=false;
        if (bookID.charAt(0)!='F' && bookID.charAt(0)!='N') {
            System.out.println("error initial letter for book id "+bookID+" is wrong");
            flag=true;
            return !flag;
        }
        for(int i=1;i<bookID.length();i++) {
            if(Character.isDigit(bookID.charAt(i)) != true )
                flag=true;
        }
        if(flag != false) {
            System.out.println("error a valid number must follow the first letter for book id "+bookID);
            return !flag;
        }
        return !flag;
    }
    //method that checks that all fields of the book data are okay.
    public static boolean checkBookDataOK(String bookID,String authorLastName,String authorFirstName,String title) {
        boolean flag=false;
        //saves old value of bookID, in case user has given a different bookID to be checked.
        String temp= Book.bookID;
        Book.bookID =bookID;

        if(authorLastName.length() == 0)
            flag=true;
        if(authorFirstName.length() ==0)
            flag=true;
        if(title.length() ==0)
            flag=true;
        if(!checkID())
            flag=true;
        //changes back the bookID value to it's original value
        Book.bookID =temp;
        return !flag;

    }

    public String toString() {
        return booksID +": "+ lastName +", "+ firstName +": "+ bookTitle;
    }

}