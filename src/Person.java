public class Person {
    protected String name;
    protected String surname;
    protected Gender gender;

    public Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getGender() {
        if(gender.equals(Gender.MALE)){
            return "мужской";
        } else {
            return "женский";
        }
    }

    @Override
    public String toString() {
        return "имя ='" + getName() + "', " +
                "фамилия ='" + getSurname() + "', " +
                "пол ='" + getGender() + "', ";
    }
}
