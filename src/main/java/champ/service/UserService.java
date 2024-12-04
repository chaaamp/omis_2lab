package champ.service;

public interface UserService {
    void register(String email, String username, String password, String confirmPassword);

    void login(String username, String password);
}
