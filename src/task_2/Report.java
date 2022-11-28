package task_2;

public class Report {
    public void getReceivedGoods(){
        System.out.println("All received Goods");
        History.getDocuments().stream()
                .filter(Document::isPutted)
                .map(Document::getProduct)
                .forEach(System.out::println);

    }

    public void getReportsByUser(Worker worker){
        System.out.println("Goods by " + worker.getName());
        History.getDocuments().stream()
                .filter(e-> e.getWorker().equals(worker))
                .map(Document::getProduct)
                .forEach(System.out::println);
    }
}
