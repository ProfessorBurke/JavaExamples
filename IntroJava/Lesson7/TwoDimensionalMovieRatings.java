
public class TwoDimensionalMovieRatings {

	public static void main(String[] args) {
		
		// Define the movieTitles, names, and ratings parallel arrays.
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
		
		String[] names = {"You", "Zara", "Milo", "Jules", "Lia", "Pan"};
		int[][] ratings = {
				  // you, Zara,  Milo, Jules, Lia, Pan
				  { 9,     7,     6,    10,   5,    8 },   // Casablanca
				  { 8,    10,     7,     7,   9,   10 },   // The Princess Bride
				  { 9,     6,     5,     9,   4,    7 },   // Rear Window
				  { 10,    4,    10,     9,   6,    7 },   // Alien
				  { 8,     6,     7,     9,  -1,   10 },   // The Godfather
				  { 7,    10,    -1,     6,   8,    9 },   // The Wizard of Oz
				  { 8,     6,     6,    10,  -1,    8 },   // 12 Angry Men
				  { 5,     8,     10,    5,  10,    6 },   // Holy Grail
				  { 4,    10,    -1,     6,   4,    7 },   // Singin' in the Rain
				  { 8,     6,     9,     9,   6,    7 },   // Dr. Strangelove
				  { 9,     5,     4,    10,  -1,    8 }    // Citizen Kane
				};

		
		// Loop over the ratings array, averaging the ratings for each movie.
		// The ratings for one movie are stored in a row of the array.
		for (int i=0; i<ratings.length; i++) {
			int total = 0;
			int count = 0;
			for (int j=0; j<ratings[i].length; j++) {
				if (ratings[i][j] != -1) {
					total += ratings[i][j];
					count++;
				}
			}
			if (count > 0) {
				System.out.printf("The average rating for %s is %.1f.\n", 
						movieTitles[i], (double)total/count);
			} else {
				System.out.println("There were no ratings for " + movieTitles[i]);
			}
			
		}
		
		// Loop over the ratings array, averaging the ratings for each person.
		// The ratings for one person are stored in a column of the array.
		for (int j=0; j<ratings[0].length; j++) {
			int total = 0;
			int count = 0;
			for (int i=0; i<ratings.length; i++) {
				if (ratings[i][j] != -1) {
					total += ratings[i][j];
					count++;
				}
			}
			if (count > 0) {
				System.out.printf("The average rating for %s is %.1f.\n", 
						names[j], (double)total/count);
			} else {
				System.out.println("There were no ratings for " + names[j]);
			}
			
		}

	}

}
