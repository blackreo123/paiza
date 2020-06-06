import java.util.ArrayList;
import java.util.Scanner;

public class A031 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int P_1=sc.nextInt();
		int P_2=sc.nextInt();
		int P_3=sc.nextInt();
		int k=sc.nextInt();
		
		ArrayList<Double> list=new ArrayList<Double>();
		for(int i=0;i<20;i++) {
			for(int j=0;j<40;j++) {
				for(int r=0; r<50; r++) {
					list.add(Math.pow(P_3, i)*Math.pow(P_2, j)*Math.pow(P_1, r));
				}
			}
		}
		list.sort(null);
		System.out.println((list.get(k-1)).longValue());
		
	}

}
