import java.util.Scanner;

public class C019 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			int s=0;
			for (int j = 1; j < arr[i]; j++) {
				if(arr[i]%j==0) {
					
					s +=j; 
				}
			}
			if(arr[i]==s) {
				System.out.println("perfect");
			}else if(Math.abs(arr[i]-s)==1) {
				System.out.println("nearly");
			}else {
				System.out.println("neither");
			}
		}

	}

}
