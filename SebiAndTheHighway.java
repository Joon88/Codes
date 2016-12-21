import java.util.*;

class SebiAndTheHighway{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int i = 0 ; i < T ; i++){
			int s = scan.nextInt();
			int sg = scan.nextInt();
			int fg = scan.nextInt();
			int d = scan.nextInt();
			int t = scan.nextInt();
			double new_speed = (double)(50*d*60*60)/(1000*t) + s;
			if(Math.abs(new_speed - sg) == Math.abs(new_speed - fg)){
				System.out.println("DRAW");
			}
			else if(Math.abs(new_speed - sg) > Math.abs(new_speed - fg)){
				System.out.println("FATHER");
			}else if(Math.abs(new_speed - sg) < Math.abs(new_speed - fg)){
				System.out.println("SEBI");
			}
		}
		scan.close();
	}
}