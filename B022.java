import java.util.Scanner;

public class B022 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();//입후보자
		int n=sc.nextInt();//투표자
		int k=sc.nextInt();//연설횟수
		
		int[] arr=new int[k];
		//연설 순서
		for (int i = 0; i < k; i++) {
			arr[i]=sc.nextInt();
		}
		//지지자 배열
		int[] sup=new int[m];
		//연설 시작
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < sup.length; j++) {
				if(arr[i] != j+1 && sup[j]>0) {
					sup[j]--;
					sup[arr[i]-1]++;
				}
			}
			if(n>0) {
				n--;
				sup[arr[i]-1]++;
			}
		}
		int max=0;
		for (int i = 0; i < sup.length; i++) {
			if(max<sup[i]) {
				max=sup[i];
			}
		}
		for (int i = 0; i < sup.length; i++) {
			if(sup[i]==max) {
				System.out.println(i+1);
			}
		}
	}

}
