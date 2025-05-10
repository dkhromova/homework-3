package task3;

public class Films { //Задание 3 и 5
    public static void main(String[] args) {

        Movie[] films = new Movie[]{
                new Movie("Лёд", 7.0, "Драма", "Россия", false, 2017),
                new Movie("Интерстеллар", 8.7, "Фантастика", "США", true, 2014),
                new Movie("Титаник", 8.4, "Мелодрама", "США", true, 1997)
        };

        for (Movie film : films) {
            System.out.println(film.year + " - " + film.name + " - " + film.genre + " - " + film.rating);
        }
    }
}
