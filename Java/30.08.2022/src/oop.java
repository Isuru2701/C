
class Book {

    void open() {
        System.out.println("book opened");
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