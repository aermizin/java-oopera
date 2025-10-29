public class Director extends Person {
    private int numberOfShows;

    public Director(String name, String surname, String gender, double height, int numberOfShows) {
        super(name, surname, gender, height);
        this.numberOfShows = numberOfShows;
    }

    public int getNumberOfShows() {
        return numberOfShows;
    }

    public void setNumberOfShows(int numberOfShows) {
        this.numberOfShows = numberOfShows;
    }

    @Override
    public String toString() {
        return "{имя ='" + getName() + "', " +
                "фамилия ='" + getSurname() + "', " +
                "пол ='" + getGender() + "', " +
                "рост ='" + getHeight() + "', " +
                "колличество спектаклей ='" + numberOfShows +
                "'}";

    }
}
