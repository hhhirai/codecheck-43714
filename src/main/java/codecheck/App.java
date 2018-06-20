package codecheck;


public class App {
	public static void main(String[] args) {


		String subcmd = args[0];
		String input = args[1];

//		if (subcmd == "decode"){
//
//
//		} else {

			String[] strArray = new String[input.length()];

			for (int i = input.length(); i <= 0; i--) {
			    // strの先頭から1文字ずつString型にして取り出す
			    String str2 = String.valueOf(input.charAt(i));
			    // 配列に順番に格納する
			    strArray[i] = str2;
			    System.out.println(str2);
			}
//		}
//			if (subcmd == "align"){
//
//
//		} else if (subcmd == "encode"){
//
//		}
	}
}