public class Person {
    protected String name;
    protected String surname;
    protected String gender;
    protected double height;

    public Person(String name, String surname, String gender, double height) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getGender() {
        return gender;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "{имя ='" + getName() + "', " +
                "фамилия ='" + getSurname() + "', " +
                "пол ='" + getGender() + "', " +
                "рост ='" + getHeight() +
                "'}";
    }
}
