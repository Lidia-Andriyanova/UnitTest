package dz.first.Shop;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Shop {
    private List<Product> products;

    // �������, �������:
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    // ����� ������ ������� ��������������� �� ����������� �� ���� ������ ���������
    public List<Product> sortProductsByPrice() {
        Collections.sort(products, Comparator.comparing(Product::getPrice));
        return products;
    }

    // ����� ������ ������� ����� ������� �������
    public Product getMostExpensiveProduct() {
        if (products.isEmpty()) {
            return null;
        }
        return Collections.max(products, Comparator.comparing(Product::getPrice));
    }
}