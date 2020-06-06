import java.util.Scanner;

public class B053 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String nagasa=sc.nextLine();
		int tate=Integer.parseInt(nagasa.split(" ")[0]);
		int yoko=Integer.parseInt(nagasa.split(" ")[1]);
		String naiyou_1=sc.nextLine();
		int a_1=Integer.parseInt(naiyou_1.split(" ")[0]);
		int a_2=Integer.parseInt(naiyou_1.split(" ")[1]);
		String naiyou_2=sc.nextLine();
		int b_1=Integer.parseInt(naiyou_2.split(" ")[0]);
		int b_2=Integer.parseInt(naiyou_2.split(" ")[1]);
		
		int[][] arr=new int[tate][yoko];
		arr[0][0] = a_1;
		arr[0][1] = a_2;
		arr[1][0] = b_1;
		arr[1][1] = b_2;
		int d_1=a_2-a_1;
		int d_2=b_2-b_1;
		for (int i = 0; i < tate; i++) {
			for (int j = 0; j < yoko; j++) {
				
			}
		}
		int a=sc.nextInt();
		System.out.println((int)Math.pow(a, 3));
	}

}
