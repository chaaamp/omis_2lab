package champ.service;

import champ.model.Document;
import org.apache.catalina.User;

public interface SharingService {
    void grantAccess(Document document, User user, String permission);

    void revokeAccess(Document document, User user);
}
