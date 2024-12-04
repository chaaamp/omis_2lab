package champ.model;
import java.util.List;

public class Document {
    public String title;
    public String content;
    public User owner;
    public int fontSize;
    public String font;
    public List<User> sharedUsers;
}