package Bai12_JavaCollection;

import java.util.List;

public interface IProductManager {
    void disPlay();
    void add(Product product);

    List<Product> findAll();
    void edit(int id ,Product product);
    void delete(int id);
    void search(String name);
    void sortByPrice();
}
