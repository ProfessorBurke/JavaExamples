import java.util.Scanner;

public class SimpleMovieRatings {

	public static void main(String[] args) {
		
		// Define the movieTitles and ratings parallel arrays.
		String[] movieTitles = {
			    "Casablanca",
			    "The Princess Bride",
			    "Rear Window",
			    "Alien",
			    "The Godfather",
			    "The Wizard of Oz",
			    "12 Angry Men",
			    "Monty Python and the Holy Grail",
			    "Singin' in the Rain",
			    "Dr. Strangelove",
			    "Citizen Kane"
			};
		int[] ratings = {9, 8, 9, 10, 8, 7, 8, 5, 4, 8, 9};
		
		// Display the movie titles with their associated rating.
		for (int i=0; i<movieTitles.length && i<ratings.length; i++) {
			System.out.printf("%-35s%d\n", movieTitles[i],ratings[i]);
		}
		
		// Prompt the user for a movie to search for.
		Scanner stdin = new Scanner(System.in);
		System.out.print("What movie rating would you like to know? ");
		String movie = stdin.nextLine();
		stdin.close();

		// Find the index of that movie using a sequential search.
		int movieIndex = -1, i = 0;
		while (movieIndex == -1 && i < movieTitles.length) {
			if (movieTitles[i].equals(movie)) {
				movieIndex = i;
			} else {
				i++;
			}
		}

		// Display either the rating of the movie or a message that it wasn't 
		// found.
		if (movieIndex == -1) {
			System.out.println("That movie hasn't been rated.");
		} else {
			System.out.printf("The rating for %s is %d.\n", movie, ratings[movieIndex]);
		}

	}

}
