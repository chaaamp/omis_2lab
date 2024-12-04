package champ.service;

import champ.model.Document;
import org.apache.catalina.User;

public class SharingServiceImpl implements SharingService {
    public void grantAccess(Document document, User user, String permission) {
        // Реализация предоставления доступа
    }

    public void revokeAccess(Document document, User user) {
        // Реализация отзыва доступа
    }
}
