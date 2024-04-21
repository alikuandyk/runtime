package lesson45.homework;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Post {
    long id;
    String title;
    String description;

    public Post(String title, String description) {
        this.id = setUniqueId();
        this.title = title;
        this.description = description;
    }

    public static int uniqueId = 1;
    public static int setUniqueId() {
        return uniqueId++;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
