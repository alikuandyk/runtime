package lesson10.homework.task4;

public class Database {
    User[] users;
    Film[] films;

    void addUser(User user) {
        if (validateUser(user)) {
            for (int i = 0; i < this.users.length; i++) {
                if (users[i] == null) {
                    users[i] = user;
                }
            }
        } else {
            System.out.println("Некорректный ввод данных");
        }
    }

    boolean validateUser(User user){
        return user.getLogin() != null && user.getYearOfBirth() < 2025;
    };

    void addFilm(Film film) {
        if (film.getReleaseYear() >= 1895 && film.getDuration() > 0) {
            for (int i = 0; i < this.films.length; i++) {
                if (films[i] == null) {
                    films[i] = film;
                }
            }
        } else {
            System.out.println("Некорректный ввод данных");
        }
    }
}
