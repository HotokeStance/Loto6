
public class LotoRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] loto = {0,0,0,0,0,0};
		int j = 0;
		//数値を入れる
		for(int i=0; i<loto.length; i++){
			System.out.println( "\n" + i + "周目");
			loto[i] = new java.util.Random().nextInt(50);
			System.out.println(i + "番目には" + loto[i] + "が入りました");
			//全配列を見て被りがないことを確認して入れる。
			for(j=0;j<loto.length-1; j++){
				//System.out.println("比較する前は" + loto[i] + "jは" + loto[j]);
				System.out.println(i + "番目と" + j + "番目を見ています");
				//おそらくif文がよくない
				//同じとこは隣の要素に行く
				if(i == j){
					j = j + 1;
					System.out.println("同じところにいるので隣の要素" + j + "を見に行く");
				}
				if(loto[i] == loto[j]){
					loto[i] = new java.util.Random().nextInt(50);
					System.out.println("被りを見つけました");
				}
			}
		}

		for(int i=0; i<loto.length; i++){
			System.out.println(i + "番目の値は:" + loto[i]);
		}
	}

}
