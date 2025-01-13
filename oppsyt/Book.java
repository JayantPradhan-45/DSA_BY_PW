package oppsyt;

class Book {
    static int TotalBooks;
    String author;
    String isbn;
    String title;
    Boolean isBorrowed;



    static{
        TotalBooks=0;
    }
    {  //object inti
        TotalBooks++;
    }

    //constructor
    Book(String author,String isbn ,String title ){
        this.author=author;
        this.isbn=isbn;
        this.title=title;

    }
    //another constructor
    Book(String isbn){
        this("Unknown",isbn,"unknown");
    }


    //static method
    static int getTotalBooks(){
        return TotalBooks;
    }

    void BorrowBook(){
        if(isBorrowed){
            System.out.println("book is alredy borred");
        }
        else {
            this.isBorrowed=true;
            System.out.println("you can enjoy with the book ");

        }

    }
    void returnBook(){
        if(isBorrowed){
            this.isBorrowed=false;
            System.out.println("hope you enjoyed , please give a review ");
        }
        else{
            System.out.println("this book alredy in the library ");
        }
    }

    public static void main(String[] args) {
        Book design=new Book("RS agrawal  ","1","design");
        Book myBook=new Book("2");
        System.out.println(Book.getTotalBooks());
        design.BorrowBook();
        myBook.BorrowBook();
        design.BorrowBook();
        design.returnBook();
        design.returnBook();


    }

}
