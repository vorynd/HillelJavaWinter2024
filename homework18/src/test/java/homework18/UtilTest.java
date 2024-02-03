package homework18;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class UtilTest {
    private Util sut;
    private List<Product> productList;

    @BeforeEach
    public void setUp() {
        sut = new Util();
        productList = createTestProductList();
    }

    private List<Product> createTestProductList() {
        List<Product> productList = new ArrayList<>();

        productList.add(new Product(Type.BOOK, 10.0, true, LocalDateTime.now()));
        productList.add(new Product(Type.CD, 20.0, false, LocalDateTime.now().minusDays(1)));
        productList.add(new Product(Type.CD, 30.0, true, LocalDateTime.now().minusDays(2)));
        productList.add(new Product(Type.BOOK, 500.0, true, LocalDateTime.now().minusDays(3)));
        productList.add(new Product(Type.BOOK, 300.0, true, LocalDateTime.now().minusDays(4)));
        productList.add(new Product(Type.TOY, 50.0, true, LocalDateTime.now().minusDays(5)));
        productList.add(new Product(Type.TOY, 700.0, true, LocalDateTime.now().minusDays(50)));
        productList.add(null);

        return productList;
    }

    @Test
    void filterBookPrice() {
        List<Product> filteredBooks = sut.filterBookPrice(productList);
        assertEquals(2, filteredBooks.size());
        assertEquals(List.of(productList.get(3), productList.get(4)), filteredBooks);
    }

    @Test
    void filterBookPriceWithEmptyCollection() {
        List<Product> filteredProducts = sut.filterBookPrice(new ArrayList<>());
        assertEquals(List.of(), filteredProducts);
    }

    @Test
    void filterBookDiscount() {
        List<Product> discountedBooks = sut.filterBookDiscount(productList);
        assertEquals(List.of(productList.get(0), productList.get(3), productList.get(4)), discountedBooks);
    }

    @Test
    void filterBookDiscountWithEmptyCollection() {
        List<Product> filteredProducts = sut.filterBookDiscount(new ArrayList<>());
        assertEquals(List.of(), filteredProducts);
    }

    @Test
    void filterBookDiscountNoMatch() {
        productList.get(0).setDiscountPossible(false);
        productList.get(3).setDiscountPossible(false);
        productList.get(4).setDiscountPossible(false);
        List<Product> discountedBooks = sut.filterBookDiscount(productList);
        assertEquals(List.of(), discountedBooks);
    }

    @Test
    void filterBookMinPrice() {
        Product cheapestBook = sut.filterBookMinPrice(productList);
        assertEquals(productList.get(0), cheapestBook);
        assertEquals(10.0, cheapestBook.getPrice());
    }

    @Test
    void filterBookMinPriceWithEmptyCollection() {
        ProductNotFoundExeption exception = assertThrows(ProductNotFoundExeption.class,
                () -> sut.filterBookMinPrice(new ArrayList<>()));
        assertEquals("Product BOOK not found", exception.getMessage());
    }

    @Test
    public void filterBookMinPriceNoBookInCollection() {
        productList.removeIf(product -> product != null && product.getType().equals(Type.BOOK));

        ProductNotFoundExeption exception = assertThrows(ProductNotFoundExeption.class,
                () -> sut.filterBookMinPrice(productList));
        assertEquals("Product BOOK not found", exception.getMessage());
    }

    @Test
    void filterThreeLast() {
        List<Product> lastThreeProducts = sut.filterThreeLast(productList);
        assertEquals(3, lastThreeProducts.size());
        assertEquals(List.of(productList.get(0), productList.get(1), productList.get(2)), lastThreeProducts);
    }

    @Test
    void filterThreeLastWithEmptyCollection() {
        List<Product> lastThreeProducts = sut.filterThreeLast(new ArrayList<>());
        assertEquals(List.of(), lastThreeProducts);
    }

    @Test
    void filterThreeLastWithShortCollection() {
        productList = productList.subList(0, 2);
        List<Product> lastThreeProducts = sut.filterThreeLast(productList);
        assertEquals(2, lastThreeProducts.size());
        assertEquals(List.of(productList.get(0), productList.get(1)), lastThreeProducts);
    }

    @Test
    void summBookCurrentYear() {
        double totalBookPrice = sut.summBookCurrentYear(productList);
        assertEquals(10.0 , totalBookPrice);
    }

    @Test
    void summBookCurrentYearWithEmptyCollection() {
        double totalBookPrice = sut.summBookCurrentYear(new ArrayList<>());
        assertEquals(0.0 , totalBookPrice);
    }

    @Test
    void groupByType() {
        Map<Type, List<Product>> groupedProducts = sut.groupByType(productList);
        assertEquals(3, groupedProducts.get(Type.BOOK).size());
        assertEquals(2, groupedProducts.get(Type.CD).size());
        assertEquals(2, groupedProducts.get(Type.TOY).size());
    }

    @Test
    void groupByTypeWithEmptyCollection() {
        Map<Type, List<Product>> groupedProducts = sut.groupByType(new ArrayList<>());
        assertEquals(0, groupedProducts.size());
    }
}