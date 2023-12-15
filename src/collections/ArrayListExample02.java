package collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + "}";
    }
}

public class ArrayListExample02 {

    public static void main(String[] args) {
        // Create an ArrayList of Product objects
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1200.99));
        products.add(new Product("Smartphone", 999.99));
        products.add(new Product("Tablet", 400.00));
        products.add(new Product("Smartwatch", 199.99));

        // Sort products by price in descending order
        products.sort(Comparator.comparingDouble(Product::getPrice).reversed());
        //products.sort(Comparator.comparing(Product::getName));

        // Filter products to find those with price greater than 500
        List<Product> expensiveProducts = products.stream()
                .filter(p -> p.getPrice() > 500)
                .collect(Collectors.toList());

        System.out.println("All Products:");
        products.forEach(System.out::println);

        System.out.println("\nExpensive Products (Price > 500):");
        expensiveProducts.forEach(System.out::println);

        System.out.println("\nProductList:");
        products.stream()
                .map(Product::getName)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);


    }

}
