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


    public String getTitle() {
        return title;
    }

    public void replaceActor(Actor replaceableActor, Actor currentActor) {
        int index = 0;
        for (Actor actor :listOfActors) {
            index++;
            if (replaceableActor.equals(actor)) {
                listOfActors.set(index, currentActor);
                index = 0;
                System.out.println("В спектакль добавлен новый актер: " + currentActor);
                break;
            }
            if (index == listOfActors.size()) {
                System.out.println("Данный актер отсутствует в спектакле: " + replaceableActor);
            }
        }
    }

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
            System.out.println("В спектакль добавлен новый актер: " + newActor.toString());
        } else {
            System.out.println("Актер уже присутствует в спектакле: " + newActor);
        }
    }

    public void printActor() { // добавьте метод printHares()
        System.out.println("Актерский состав спектакля:");
        int indexActor = 1;
        for (Actor actor : listOfActors) {
                System.out.println("Актер " + (indexActor++) + ":" + actor.toString());
            }

    }
}