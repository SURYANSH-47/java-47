import java.util.Scanner;

class Books {
    String name;
    String author;
    int price;
    int numPages;

    Books(String name, String author, int price, int numPages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.numPages = numPages;
    }

    public String toString() {

        String name, author, price, numPages;

        name = "Book name: " + this.name + "\n";

        author = "Author name: " + this.author + "\n";

        price = "Price: " + this.price + "\n";

        numPages = "Number of pages: " + this.numPages + "\n";

        return name + author + price + numPages;

    }

}

class Book_details {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        String name;
        String author;
        int price;
        int numPages;
        System.out.println("Enter number of books: ");
        n = s.nextInt();
        Books b[] = new Books[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the name: ");
            name = s.next();
            System.out.println("Author of the book: ");
            author = s.next();
            System.out.println("Enter the price of the book: ");
            price = s.nextInt();
            System.out.println("ENTER THE NUMBER OF PAGES: ");
            numPages = s.nextInt();
            b[i] = new Books(name, author, price, numPages);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(b[i]);
        }
    }
}