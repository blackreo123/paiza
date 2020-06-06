import java.util.Scanner;

public class C024 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		sc.nextLine();
		int a=0;
		int b=0;
		
		for (int i = 0; i < n; i++) {
			String comand=sc.nextLine();
			String dousa=comand.split(" ")[0];
			if(dousa.equals("SET")) {
				if(comand.split(" ")[1].equals("1")) {
					a= Integer.parseInt(comand.split(" ")[2]);
				}else {
					b= Integer.parseInt(comand.split(" ")[2]);
				}
			}else if(dousa.equals("ADD")) {
				b= a+ Integer.parseInt(comand.split(" ")[1]);
			}else {
				b= a- Integer.parseInt(comand.split(" ")[1]);
			}
				
			
		}
		System.out.print(a+" "+b);
	}

}
