import java.util.Scanner;

public class C075 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int point=0;
		for (int i = 0; i < n; i++) {
			int ryokin=sc.nextInt();
			if(point > ryokin) {
				point = point - ryokin;
				System.out.print(m+" "+(point));
				System.out.println();
			}else {
				m=m-ryokin;
				point += ryokin/10;
				System.out.print(m+" "+point);
				System.out.println();
			}
			
		}
	}

}
