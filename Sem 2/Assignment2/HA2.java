class Book {
    String BName;
    String BEdition;
    double BPrice;

    Book(String BName, String BEdition, double BPrice) {
        this.BName = BName;
        this.BEdition = BEdition;
        this.BPrice = BPrice;
    }

    void display() {
        System.out.println("Book Name: " + BName);
        System.out.println("Edition: " + BEdition);
        System.out.println("Price: Rs. " + BPrice);
    }

    double getBPrice() {
        return BPrice;
    }
}

public class HA2 {
    public static void main(String[] args) {
        Book b1 = new Book("War and Peace", "1st", 5000);
        Book b2 = new Book("To Kill a Mockingbird", "1st", 2000);
        Book b3 = new Book("The Great Gatsby", "1st", 1000);
        Book b4 = new Book("The Hobbit", "75th Anniversary Edition", 2500);
        Book b5 = new Book("The Alchemist", "25th Anniversary Edition", 1500);

        Book[] books = {b1, b2, b3, b4, b5};
        Book max = books[0];

        for (var book : books) {
            if (book.getBPrice() > max.getBPrice()) {
                max = book;
            }
        }

        System.out.println("Book with maximum price:");
        max.display();
    }
}

/*
 *  Output:
 *      Book with maximum price:
 *      Book Name: War and Peace
 *      Edition: 1st
 *      Price: Rs. 5000.0
 */