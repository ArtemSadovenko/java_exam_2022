package task_2;

public class Document {
    private boolean isPutted;
    private Product product;
    private Worker worker;

    public Document() {
    }

    public Document(boolean isPutted, Product product, Worker worker) {
        this.isPutted = isPutted;
        this.product = product;
        this.worker = worker;
    }

    public boolean isPutted() {
        return isPutted;
    }

    public void setPutted(boolean putted) {
        isPutted = putted;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    @Override
    public String toString() {
        return "Document{" +
                "isPutted=" + isPutted +
                ", product=" + product +
                ", worker=" + worker +
                '}';
    }
}
