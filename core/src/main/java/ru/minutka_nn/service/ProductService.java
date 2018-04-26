package java.ru.minutka_nn.service;

import java.ru.minutka_nn.model.Product;
import java.util.List;

public interface ProductService {

    Product create(Product product);

    Product get(int id);

    void update(Product product);

    void delete(int id);

    List<Product> getAll();
}
