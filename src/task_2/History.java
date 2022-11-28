package task_2;

import java.util.ArrayList;
import java.util.List;

public class History {
    private static List<Document> documents = new ArrayList<>();

    public static List<Document> getDocuments() {
        return documents;
    }

    public static void setDocuments(List<Document> documents) {
        History.documents = documents;
    }

    public static void add(Document document){
        documents.add(document);
    }
}
