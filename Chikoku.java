package chikoku;

import java.util.Scanner;

public class Chikoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String jikan=sc.nextLine();
		int a= Integer.parseInt(jikan.split(" ")[0]);
		int b= Integer.parseInt(jikan.split(" ")[1]);
		int c= Integer.parseInt(jikan.split(" ")[2]);
		
		int n= sc.nextInt();
		sc.nextLine();
		String[] densha=new String[n];
		for (int i = 0; i < n; i++) {
			densha[i]=sc.nextLine();
		}
		for (int i=densha.length-1; i>= 0;i--) {
			if( (((b+c)+Integer.parseInt(densha[i].split(" ")[1]))/60) + Integer.parseInt(densha[i].split(" ")[0])<=8            ) {
				if(a>Integer.parseInt(densha[i].split(" ")[1])){
					System.out.print("0"+Integer.toString(Integer.parseInt(densha[i].split(" ")[0])-1)+":");
					
					System.out.print(60-a+Integer.parseInt(densha[i].split(" ")[1]));
				}else {
					System.out.print("0"+densha[i].split(" ")[0]+":");
					if(Integer.parseInt(densha[i].split(" ")[1])-a ==0) {
						System.out.print("00");
					}else {
						System.out.print(Integer.parseInt(densha[i].split(" ")[1])-a);
					}
					
				}
				break;
			}
		}
	}
	
}
