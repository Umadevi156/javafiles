package java1;
import java.util.Scanner;

public class TeamScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two team Score:");
		int teamA_score=sc.nextInt();
		int teamB_score=sc.nextInt();
		if(teamA_score > teamB_score) {
			System.out.println("Team A is winner ");
		}
		else if(teamA_score < teamB_score) {
			System.out.println("Team B is winner ");
		}
		else if(teamA_score == teamB_score) {
			System.out.println("Match is Draw ");
		}
		else {
			System.out.println("Invalid Scores");
		}
		
		
		

	}

}
