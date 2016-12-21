import java.util.*;

class TaskForAlexey{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int i = 0 ; i < t ; i++){
			int n = scan.nextInt();
			int a[] = new int[n];
			for(int j = 0 ; j < n ; j++){
				a[j] = scan.nextInt();
			}
			Arrays.sort(a);
			Set<Integer> set = new TreeSet<Integer>();
			for(int m = 0 ; m < n ; m++){
				for(int l = m+1 ; l < n ; l++){
					set.add(lcm(a[m], a[l]));	
				}
			}
			System.out.println(set.iterator().next());
		}
		scan.close();
	}
	private static int lcm(int x, int y){
		int a = y;
		while(true){
			if(a % x == 0 && a % y == 0){
				return a;
			}
			a++;
		}
	}
}