package task_2;

public class Product {
    private String name;
    private double cost;
    private int amount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Product() {
    }

    public Product(String name, double cost, int amount) {
        this.name = name;
        this.cost = cost;
        this.amount = amount;
    }

    public boolean equal(Product product){
        if(this.cost == product.getCost()
            && this.name.equals(product.getName())){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", amount=" + amount +
                '}';
    }
}
