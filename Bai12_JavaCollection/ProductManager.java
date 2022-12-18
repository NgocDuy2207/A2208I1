package Bai12_JavaCollection;

import java.util.*;

public class ProductManager implements IProductManager {
    private List<Product> products = new ArrayList<>();

    ProductManager(){
        products.add(new Product(1,"samsung",1));
        products.add(new Product(2,"iphone",2));
        products.add(new Product(3,"nokia",3));
        products.add(new Product(4,"redmi",4));
    }

    @Override
    public void disPlay() {
        for (int i = 0; i < products.size(); i++){
            System.out.println(products.get(i));
        }
    }

    @Override
    public void add(Product product) {
        this.products.add(product);
    }


    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public void edit(int id , Product product) {

        for (int i = 0 ; i < products.size();i++){
            if (id == products.get(i).getId()){
                products.set(i, product);
                break;

            }
        }
    }

    @Override
    public void delete(int id) {
//        for (int i = 0; i < products.size(); i++) {
//            if(products.get(i).getId() == id){
//                products.remove(i);
//                break;
//            }
//        }
        products.removeIf(e -> e.getId() == id);
    }

    @Override
    public void search(String name) {
        for (Product product : products) {
            if (product.getProductName().indexOf(name) >= 0) {
                System.out.println(product);
            }
        }
    }

    @Override
    public void sortByPrice() {
        Collections.sort(products, new Comparator<>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() < o2.getPrice()) {
                    return -1;
                } else if (o1.getPrice() > o2.getPrice()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        }


}
