package champ.service;

import champ.model.Document;
import org.apache.catalina.User;
import java.util.Map;

public interface DocumentService {
    Document createDocument(String title, User owner);

    void editDocument(Document document, Map<String, String> changes);

    void editFont(Document document, Map<Integer, String> changes);
}
