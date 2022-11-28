package task_2;

import task_1.InvalidData;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Storage {
    private List<Product> products = new ArrayList<>();

    public void add(Product product, Worker worker) {
        Document document = new Document(true, product, worker);
        try {
            validate(product);

            if (products.stream()
                    .anyMatch(e -> e.getName().equals(product.getName()))) {
                products = products.stream()
                        .peek(e -> {
                            if (e.getName().equals(product.getName()) && e.getCost() == product.getCost()) {
                                e.setAmount(e.getAmount() + product.getAmount());
                            }
                        })
                        .collect(Collectors.toList());
            } else {
                products.add(product);
            }
            History.add(document);
        } catch (InvalidData e) {
            e.invoke();
        }
    }

    public void get(Product product, Worker worker) {
        Document document = new Document(false, product, worker);
        try {
            validate(product);
            if (products.stream()
                    .anyMatch(e -> {
                        return e.getName().equals(product.getName()) && e.getAmount() > product.getAmount();
                    })) {
                products = products.stream()
                        .peek(e -> {
                            if (e.getName().equals(product.getName())) {
                                e.setAmount(e.getAmount() - product.getAmount());
                            }
                        })
                        .collect(Collectors.toList());
            } else {
                throw new InvalidData("No such product");
            }
            History.add(document);
        } catch (InvalidData e) {
            e.invoke();
        }

    }


    public void validate(Product product) throws InvalidData {
//        try{
//            if(product.getAmount() < 0 || product.getCost() < 0 || product.getName().isEmpty()){
//                throw new InvalidData("Invalid product");
//            }
//        }catch (InvalidData e){
//            e.invoke();
//        }
        if (product.getAmount() < 0 || product.getCost() < 0 || product.getName().isEmpty()) {
            throw new InvalidData("Invalid product");
        }
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
