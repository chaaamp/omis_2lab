package champ.repository;

import champ.model.Document;

public interface DocumentRepository {
    Document getDocument();

    void changeDocument();
}
