public class Main {
    public static void main(String[] args) {
        BookList booklist=new BookList();
        booklist.addBookString("F1,Austen,Jane,Pride and Prejudice");
        booklist.addBookString("F2,Orwell,George,1984");
        booklist.addBookString("F3,Dostoyevsky,Fyodor,Crime and Punishment");
        booklist.addBookString("N1,Kolbert,Elizabeth,The Sixth Extinction");
        booklist.addBookString("Q5,Shakespeare,William,Romeo and Juliet");
        booklist.addBookString("FF,Marx,Karl,Das Kapital");
        booklist.printBooks();

        if(booklist.findBookByAuthorLastName("Orwell") >-1)
            System.out.println("Author Orwell is in the list as position "+booklist.findBookByAuthorLastName("Orwell"));
        else if(booklist.findBookByAuthorLastName("Orwell")==-1)
            System.out.println("Author Orwell is not found");

        if(booklist.findBookByTitle("Engells") <-1)
            System.out.println("Title Engells in the list as position "+booklist.findBookByTitle("Engells"));
        else if(booklist.findBookByTitle("Engells")==-1)
            System.out.println("The Engells is not in the list");

        if(booklist.findBookByTitle("1984") >-1)
            System.out.println("Title 1984 in the list as position "+booklist.findBookByTitle("1984"));
        else if(booklist.findBookByTitle("1984")==-1)
            System.out.println("The 1984 is not in the list");


    }

}

