import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void printSeparator() {
        System.out.println("----------------");
    }
    public static void main(String[] args) {
        Product product1 = new Product(99, "TV Samsung", 59999, "техника для дома");
        Product product2 = new Product(43, "Styler Bork", 35999, ",бытовая техника");
        Product product3 = new Product(43, "Dryer Bork", 31999, ",бытовая техника");
        Product product4 = new Product(50, "Notebook ASUS", 149999, ",компьютеры");
        Product product5 = new Product(12, "Coffee Machine", 28999, ",техника для дома");

        printSeparator();

        System.out.println("Каталог товаров: ");
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println(product4);
        System.out.println(product5);

        printSeparator();

        System.out.println("Сравнение Товаров №3 и №2 :");
        System.out.println(product3.equals(product2));
        System.out.println("Сравнение Товаров №3 и №1 :");
        System.out.println(product3.equals(product1));

        printSeparator();

        Product[] basket1 = {product3, product1};
        Product[] basket2 = {product3, product1, product5};
        Product[] basket3 = {product3, product1, product5};
        Product[] basket4 = {product2, product3, product5};
        Product[] basket5 = {product1, product4, product5};

        System.out.println(Arrays.toString(basket1));
        System.out.println(Arrays.toString(basket3));

        printSeparator();

        Order order1 = new Order("Den", basket1);
        Order order2 = new Order("Arina", basket4);
        Order order3 = new Order("Alex", basket5);
        Order order4 = new Order("Alex", basket5);

        System.out.println("Сравнение заказа №1 и №2 :");
        System.out.println(order1.equals(order2));
        System.out.println("Сравнение заказа №3 и №4 :");
        System.out.println(order3.equals(order4));
        System.out.println("Сравнение заказа №1 и №4 :");
        System.out.println(order1.equals(order4));

        printSeparator();


    }
}