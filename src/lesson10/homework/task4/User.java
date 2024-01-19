package lesson10.homework.task4;

public class User {
    private int id;
    private String email;
    private String login;
    private String name;
    private int yearOfBirth;

    public User(int id, String email, String login, String name, int yearOfBirth) {
        this.id = id;
        this.email = email;
        this.login = login;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    String getLogin() {
        return login;
    }

    int getYearOfBirth() {
        return yearOfBirth;
    }

    void setId(int id) {
        this.id = id;
    }

    void setName(String name) {
        this.name = name;
    }

    void setEmail(String email) {
        this.email = email;
    }

    void setLogin(String login) {
        this.login = login;
    }

    void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}
