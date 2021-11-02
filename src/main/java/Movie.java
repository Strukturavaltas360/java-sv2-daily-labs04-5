package day01;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    String title;
    int yearOfPremier;
    List<Actor> listOfActors = new ArrayList<>();

    public Movie(String title, int yearOfPremier) {
        this.title = title;
        this.yearOfPremier = yearOfPremier;
    }

    public void addActor(Actor actor){
        listOfActors.add(actor);
    }

    public int actorsInTheirTwenties() {
        int i = 0;
        for (Actor actualActor : listOfActors) {
            int actualActorAge = yearOfPremier - actualActor.getDateOfBirth();
            if (actualActorAge >=20 && actualActorAge <30) {
                i++;
            }
        }
        return i;
    }
}
