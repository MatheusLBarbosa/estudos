package br.com.mlb.rediscache.product;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ProductService {
    Map<Long, Product> products = new HashMap<>() {
        {
            put(1L, new Product(1L, "Notebook", "MacBook Air"));
            put(2L, new Product(2L, "Notebook", "MacBook Pro M1"));
            put(3L, new Product(3L, "Notebook", "MacBook Pro M2"));
            put(4L, new Product(4L, "Notebook", "Acer Nitro"));
            put(4L, new Product(4L, "Notebook", "Alienware"));
        }
    };

    @Cacheable("products")
    public Product getById(Long id) {
        System.out.println("Buscando produtos...");
        simulateLatancy();
        return products.get(id);
    }

    private void simulateLatancy() {
        try {
            long time = 1000L;
            Thread.sleep(time);
        }catch (InterruptedException e){
            throw new IllegalStateException();
        }
    }
}
