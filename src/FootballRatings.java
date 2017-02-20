// Gabriel Corella	
// University of Delaware
// Quarter Back rating: Quiz 1
// February 19th, 2017



import java.util.Scanner;
public class FootballRatings {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double comp = 0;
		double att = 0;
		double td = 0;
		double yds = 0;
		double intc = 0; 
		double a = 0, b= 0, c = 0, d =0;
		double passerRating = 0;
	
	// Ask the user to input the statistics of the Player 
		System.out.println("How many completions were completed by the player?");
		comp = input.nextDouble();
		
		System.out.println("How many passing attempts were there?");
		att = input.nextDouble();
		
		System.out.println("How many touchdowns were there?");
		td = input.nextDouble();
		
		System.out.println("How many yards were thrown throughout the season");
		yds = input.nextDouble();
		
		System.out.println("How many interceptions were thrown?");
		intc = input.nextDouble();
		
		a = ((comp/att)-.3)*5; //Completion percentage 
		b = ((yds/att)-3)*.25; //Yards per attempt
		c = (td/att)*20; // Touchdowns per attempt 
		d = 2.375 - ((intc/att)*25); // Interceptions per attempt
		
		if (a>2.375){
			a = 2.375;
		}
		if (a<0){
			a = 0;
		}
		if (b>2.375){
			b = 2.375;
		}
		if (b<0){ 
			b = 0;
		}
		if (c>2.375){
			a = 2.375;
		}
		if (c<0){
			c=0;
		}
		if (d>2.375){
			a = 2.375;
		}
		if (d<0){
			d=0;
		}
		passerRating = ((a + b + c + d)/6)*100; //This calculates the passer rating 
		
		System.out.printf("This is the Quarterbacks completion percentage: %.2f \n", (comp/att)*100);
		System.out.printf("The is the average yardage per attempt: %.2f \n", (yds/att) );
		System.out.printf("On average, this is the quarterbacks touchdowns per attempt: %.2f \n", (td/att)*100);
		System.out.printf("This is the quarterbacks interceptions per attempt: %.2f \n", (intc/att)*100);
		System.out.printf("Overall, this is the quarterbacks passing rating: %.1f \n", passerRating);
		
		
	}

}
