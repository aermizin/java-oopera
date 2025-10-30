import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private final ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public void infoDirector () {
        System.out.println("имя = '" + director.name + "', фамилия = '" + director.surname + "'.");
    }

    public String getTitle() {
        return title;
    }

    public void replaceActor(String replaceableActor, Actor currentActor) {
        int numberPerson = 0;
        int indexActor = 0;
        for (int i = 0; i < listOfActors.size(); i++) {
            Actor actor = listOfActors.get(i);
            if (replaceableActor.equals(actor.getSurname())) {
                numberPerson++;
                indexActor = i;
            }
        }

        if (numberPerson == 0) {
            System.out.println("Данный актер отсутствует в спектакле: " + replaceableActor + ".");
        } else if (numberPerson == 1) {
            listOfActors.set(indexActor, currentActor);
            System.out.println("В спектакль добавлен новый актер: " + currentActor);
        } else {
            System.out.println("В спектакле участвуют " + numberPerson + " актера с фамилей : " + replaceableActor
            + ".");
            System.out.println("Рекомендуется заменить актера в ручную.");
        }
            numberPerson = 0;
    }
    // Реализовал метод, когда в спектале участвуют несколько людей с одинаковой фамилей.

    public void addActor(Actor newActor) {
        boolean result = true;
        for (Actor actor : listOfActors) {
            if (actor.equals(newActor)) {
                result = false;
                break;
            }
        }

        if (result) {
            listOfActors.add(newActor);
            System.out.println("В спектакль добавлен новый актер: " + newActor);
        } else {
            System.out.println("Актер уже участвует в спектакле: " + newActor);
        }
    }

    public void printActor() { // добавьте метод printHares()
        System.out.println("Актерский состав спектакля:");
        int indexActor = 1;
        for (Actor actor : listOfActors) {
            System.out.println("Актер " + (indexActor++) + ":" + actor);
        }

    }
}