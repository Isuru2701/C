
class Book {

    void open() {
        System.out.println("book opened");
    }
    void close() {
        System.out.println("book closed");
    }
}

class oop {
    public static void main(String[] args){
        Book myBook = new Book();
        myBook.open();

        Book anotherBook = new Book();
        anotherBook.open();


    }
}