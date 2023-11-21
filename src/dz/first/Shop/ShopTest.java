package dz.first.Shop;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class ShopTest {

    public static void main(String[] args) {

        Shop shop = new Shop();
        Product product1 = new Product("Product 1", 10.0);
        Product product2 = new Product("Product 2", 5.0);
        Product product3 = new Product("Product 3", 15.0);

        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        shop.setProducts(products);

        assertThat(shop.getProducts().size()).isEqualTo(3);

        assertThat(shop.getProducts().get(0)).isEqualTo(product1);
        assertThat(shop.getProducts().get(1)).isEqualTo(product2);
        assertThat(shop.getProducts().get(2)).isEqualTo(product3);

        assertThat(shop.getMostExpensiveProduct()).isEqualTo(product3);

        List<Product> sortList = shop.sortProductsByPrice();
        List<Product> needSortList = new ArrayList<>();
        needSortList.add(product2);
        needSortList.add(product1);
        needSortList.add(product3);

        assertThat(sortList).isEqualTo(needSortList);
    }
}
