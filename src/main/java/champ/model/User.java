package champ.model;

// Подсистема регистрации и авторизации пользователя
class User {
    public String username;
    public String email;
    private String passwordHash;

    public boolean isAuthenticated() {
        // Реализация проверки аутентификации
        return false;
    }
}