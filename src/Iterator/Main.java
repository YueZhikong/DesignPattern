package Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("test01"));
        bookShelf.appendBook(new Book("test02"));
        bookShelf.appendBook(new Book("test03"));
        bookShelf.appendBook(new Book("test04"));
        Iterator it = bookShelf.iterator();
        while (it.hasNext()){
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }
}
