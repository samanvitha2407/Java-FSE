package DataStructuresAndAlgorithms;

import java.util.*;

class ProductCatalog {
    private List<String> products;

    public ProductCatalog(List<String> products) {
        this.products = products;
    }

    public List<String> search(String keyword) {
        List<String> results = new ArrayList<>();
        for (String p : products)
            if (p.toLowerCase().contains(keyword.toLowerCase()))
                results.add(p);
        return results;
    }
}

public class Ecommerce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take product list input
        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline
        List<String> items = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter product " + (i+1) + ": ");
            items.add(sc.nextLine());
        }

        ProductCatalog catalog = new ProductCatalog(items);

        // Search input
        System.out.print("Enter search keyword: ");
        String key = sc.nextLine();

        List<String> matches = catalog.search(key);
        System.out.println("Matching products: " + matches);
    }
}
