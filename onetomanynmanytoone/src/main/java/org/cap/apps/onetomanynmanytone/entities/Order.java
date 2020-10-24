package org.cap.apps.onetomanynmanytone.entities;

import javax.persistence.*;
import java.util.Map;
import java.util.Objects;

@Table(name = "orders")
@Entity
public class Order {

    @GeneratedValue
    @Id
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @ElementCollection
    private Map<Product,Integer>products;

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public void setProducts(Map<Product, Integer> products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
