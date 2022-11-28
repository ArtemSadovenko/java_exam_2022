package task_2;

import javax.print.Doc;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker(1, "Martin");
        Worker worker2 = new Worker(2, "Joe");

        History history = new History();
        Report report = new Report();
        Supplier supplier = new Supplier();

        Document document1 = new Document(true ,new Product("Beer", 30.5, 23), worker1);
        Document document2 = new Document(true ,new Product("Cake", 70, 50), worker1);
        Document document3 = new Document(true ,new Product("Fire", 10, 200), worker2);
        Document document_4 = new Document(false ,new Product("Beer", 30.5, 10), worker1);

        supplier.put(document1, worker1);
        supplier.put(document2, worker1);
        supplier.put(document3, worker2);
        supplier.get(document_4, worker1);

        report.getReceivedGoods();
        report.getReportsByUser(worker1);

    }
}
