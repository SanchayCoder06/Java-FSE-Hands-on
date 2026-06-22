import java.util.Arrays;
import java.util.Comparator;

public class SearchFunction {

    // Linear Search
    public static Product linearSearch(Product[] products, String targetName) {
        for (Product product : products) {
            if (product.productName.equalsIgnoreCase(targetName)) {
                return product;
            }
        }
        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] products, String targetName) {

        Arrays.sort(products,
                Comparator.comparing(p -> p.productName.toLowerCase()));

        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            int comparison = products[mid].productName
                    .compareToIgnoreCase(targetName);

            if (comparison == 0) {
                return products[mid];
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mobile", "Electronics"),
                new Product(103, "Shoes", "Fashion"),
                new Product(104, "Watch", "Accessories")
        };

        String searchItem = "Mobile";

        Product result1 = linearSearch(products, searchItem);

        if (result1 != null) {
            System.out.println("Linear Search Found:");
            System.out.println(result1.productId + " "
                    + result1.productName + " "
                    + result1.category);
        } else {
            System.out.println("Product not found");
        }

        Product result2 = binarySearch(products, searchItem);

        if (result2 != null) {
            System.out.println("Binary Search Found:");
            System.out.println(result2.productId + " "
                    + result2.productName + " "
                    + result2.category);
        } else {
            System.out.println("Product not found");
        }
    }
}