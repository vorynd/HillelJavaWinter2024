package homework18;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Util {

    public List<Product> filterBookPrice(Collection<Product> collection) {
        return collection.stream()
                .filter(Objects::nonNull)
                .filter(product -> product.getType().equals(Type.BOOK) && product.getPrice() > 250)
                .toList();
    }

    public List<Product> filterBookDiscount(Collection<Product> collection) {
        return collection.stream()
                .filter(Objects::nonNull)
                .filter(product -> product.getType().equals(Type.BOOK) && product.isDiscountPossible())
                .peek(product -> product.setPrice(product.getPrice() * 0.9))
                .toList();
    }

    public Product filterBookMinPrice(Collection<Product> collection) {
        return collection.stream()
                .filter(Objects::nonNull)
                .filter(product -> product.getType().equals(Type.BOOK))
                .min(Comparator.comparingDouble(Product::getPrice))
                .orElseThrow(() -> new ProductNotFoundExeption("Product " + Type.BOOK + " not found"));
    }

    public List<Product> filterThreeLast(Collection<Product> collection) {
        return collection.stream()
                .filter(Objects::nonNull)
                .sorted(Comparator.comparing(Product::getDate).reversed())
                .limit(3)
                .toList();

    }

    public double summBookCurrentYear(Collection<Product> collection) {
        return collection.stream()
                .filter(Objects::nonNull)
                .filter(product -> product.getType().equals(Type.BOOK) && product.getPrice() <= 75 && product.getDate().getYear() == LocalDate.now().getYear())
                .mapToDouble(Product::getPrice)
                .sum();
    }

    public Map<Type, List<Product>> groupByType(Collection<Product> collection) {
        return collection.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.groupingBy(Product::getType));
    }
}
