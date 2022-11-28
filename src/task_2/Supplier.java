package task_2;

import java.util.List;

public class Supplier {
    private Storage storage =new Storage();

    public void put(Document document, Worker worker){
        storage.add(document.getProduct(), worker);
    }
    public void get(Document document, Worker worker){
        storage.get(document.getProduct(), worker);
    }

    public List<Product> print(){
        return storage.getProducts();
    }
}
