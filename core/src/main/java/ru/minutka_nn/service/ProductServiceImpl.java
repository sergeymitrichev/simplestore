package java.ru.minutka_nn.service;

import java.ru.minutka_nn.model.Product;
import java.ru.minutka_nn.repository.ProductRepository;
import java.util.List;

public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;

    public ProductServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public Product create(Product product) {
        return repository.save(product);
    }

    @Override
    public Product get(int id) {
        return repository.get(id);
    }

    @Override
    public void update(Product product) {
        repository.save(product);
    }

    @Override
    public void delete(int id) {
        repository.delete(id);
    }

    @Override
    public List<Product> getAll() {
        return repository.getAll();
    }
}
