package section8;
import java.util.Scanner;

public class MainPoly {
    public static void main(String[] args) {
//        Movie theMovie = Movie.getMovie("ScienceFiction", "Star Wars");
//        theMovie.watchMovie();

        Scanner s = new Scanner(System.in);
        while (true){
            System.out.print("Enter type(A for Adventure, C for Comedy," + "S for ScienceFiction, or Q to quit: ");
            String type = s.nextLine();
            if("Qq".contains(type)){
                break;
            }
            System.out.print("Enter Movie Title: ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }

    }
}
