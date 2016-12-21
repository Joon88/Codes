import java.util.*;

class TrainPartner{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int i = 0 ; i < t ; i++){
			int n = scan.nextInt();
			if(n%8 == 1){
				System.out.println("4LB");
			}else if(n%8 == 2){
				System.out.println("5MB");
			}else if(n%8 == 3){
				System.out.println("6UB");
			}else if(n%8 == 4){
				System.out.println("1LB");
			}else if(n%8 == 5){
				System.out.println("2MB");
			}else if(n%8 == 6){
				System.out.println("3UB");
			}else if(n%8 == 0){
				System.out.println("7SL");
			}else if(n%8 == 7){
				System.out.println("8SU");
			}
		}
		scan.close();
	}
}