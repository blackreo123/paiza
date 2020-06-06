import java.util.Scanner;

public class c051 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		int d= sc.nextInt();
		
		int ab=0;
		int dc=0;
		if(b>a) {
			ab=Integer.parseInt(Integer.toString(b)+Integer.toString(a));    
		}else {
			ab=Integer.parseInt(Integer.toString(a)+Integer.toString(b));
		}
		if(c>d) {
			dc=Integer.parseInt(Integer.toString(c)+Integer.toString(d));    
		}else {
			dc=Integer.parseInt(Integer.toString(d)+Integer.toString(c));
		}
		System.out.println(ab+dc);
	}

}
//フライト中に退屈してしまったあなたは、持っているトランプを使用した簡単な遊びを考えました。
//
//この遊びでは 1 から 9 までの数字のカードのみを 4 枚使用します。
//ただし、この 4 枚の中で同じ数値のカードが重複する事もあります。
//ルールは以下の通りです。
//
//4 枚のカードを横に並べます。
//左から 2 枚のカード、右から 2 枚のカードをそれぞれ 2 ケタの整数とみなし、和を計算します。
//あらゆる並べ方を試し、和の最大値（最大スコア）を求めます。
//
//カード 4 枚に書かれた数が与えられるので、最大スコアを出力してください。
//入力例 1 の 2, 9, 3, 8 の 4 枚を使う場合、以下の 12 通りの和の最大値 175 が最大スコアとなります。
//
//カードの 4 枚の並べ方は 4! = 24 通り存在しますが、足し算は順序に依存しないため、12 通りのみ考慮すればよいことに注意してください。
//たとえば、9, 2, 3, 8 の順で並べた場合のスコアは 92 + 38 = 130 となります。
//
//・92 + 38 = 130
//・92 + 83 = 175
//・93 + 28 = 121
//・93 + 82 = 175
//・98 + 23 = 121
//・98 + 32 = 130
//・39 + 28 = 67
//・38 + 29 = 67
//・82 + 39 = 121
//・89 + 23 = 112
//・89 + 32 = 121
//・83 + 29 = 112