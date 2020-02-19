import models.*;
import java.util.Scanner;

public class MainClass {

    static int _id;
    static int _quantity;
    static Shop _shop = new Shop();
    static Basket _basket = new Basket();
    public static Scanner Reader = new Scanner(System.in);
    public static void main(String[] args) {
        char choice;
    do {
            choice = mainMenu();
            switch (choice) {
                case 'a':
                    System.out.println(_shop);
                    break;
                case 'b':
                   optionOfArticles();
                    break;
                case 'c':
                    System.out.println(_basket.toString());
                    break;
                case 'd':

                    break;
                case 'e':
                    removeArticles();
                    break;
                case 'x':
                    System.out.println("Program is closing.");
                    System.exit(1);
                    break;
                default:
                    System.out.println("Try again with the right key");
                    System.exit(1);
            }
        }while(choice != 'x');

    }
    public static char mainMenu(){
        System.out.println("a...show articles");
        System.out.println("b...choose articles");
        System.out.println("c...show chosen articles");
        System.out.println("d...accept and pay");
        System.out.println("e...remove article(s)");
        System.out.println("x...close program");
        System.out.print("your choice: ");
        return Reader.next().toLowerCase().charAt(0);
    }
    public static void optionOfArticles(){
        System.out.println(_shop);
        System.out.print("Type in the ID you want to add to your basket: ");
        _id = Reader.nextInt();
        Article a = _shop.searchArticleByID(_id);
        if(a == null){
            System.out.println("Our system couldn't find the article you wanted to add");
        }
        else {
            System.out.print("Type in how much of the articles you want to add: ");
            _quantity = Reader.nextInt();
            if(_quantity < 0){
                _quantity = _quantity * (-1);
            }
            _basket.addItem(new BasketItem(a, _quantity));
        }
    }
    public static void removeArticles(){
        System.out.println(_basket.toString());
        System.out.print("Choose the article ID you want to remove: ");
        _id = Reader.nextInt();
        if(_basket.removeItem(_id)){
            System.out.println("Your chosen article was found and has been removed by our system.");
        }
        else{
            System.out.println("I'm sorry, our system couldn't locate that file. Please try again.");
        }
    }
}
