package day01;

public class MovieMain {

    public static void main(String[] args) {
        Movie movie = new Movie("Titanic", 1997);

        Actor diCaprio = new Actor("Leonardo Dicaprio",1974);
        Actor kateWinslet = new Actor("Kate Winslet",1975);
        Actor billPaxton = new Actor("Bill Paxton",1955);


        movie.addActor(diCaprio);
        movie.addActor(kateWinslet);
        movie.addActor(billPaxton);

        System.out.println(movie.actorsInTheirTwenties());
    }
}