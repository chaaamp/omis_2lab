package champ.service;

import champ.model.Document;
import org.apache.catalina.User;

import java.util.Map;

public class DocumentServiceImpl implements DocumentService {
    public Document createDocument(String title, User owner) {
        // Реализация создания документа
        return null;
    }

    public void editDocument(Document document, Map<String, String> changes) {
        // Реализация редактирования документа
    }

    public void editFont(Document document, Map<Integer, String> changes) {
        // Реализация редактирования шрифта
    }
}
