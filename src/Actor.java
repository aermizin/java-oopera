import java.util.Objects;

public class Actor extends Person {

    public Actor(String name, String surname, String gender, double height) {
        super(name, surname, gender, height);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false; // можно оформить и так
        Actor otherActor = (Actor) obj;
        return Objects.equals(name, otherActor.name) &&
                Objects.equals(surname, otherActor.surname) &&
                Objects.equals(gender, otherActor.gender) &&
                (height == otherActor.height);

    }

    @Override
    public int hashCode() {
        // вызываем вспомогательный метод и передаём в него нужные поля
        return Objects.hash(name, surname, gender, height);
    }
}