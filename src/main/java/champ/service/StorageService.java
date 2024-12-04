package champ.service;

import champ.model.Document;

public interface StorageService {
    void saveToCloud(Document document);

    void saveToLocal(Document document, String path);
}