package lesson20.homework.user;

public abstract class AbstractUser {
    protected String name;

    public AbstractUser(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
