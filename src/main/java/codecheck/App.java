package codecheck;


public class App {
	public static void main(String[] args) {


		String subcmd = args[0];
		String input = args[1];

		StringBuilder str = new StringBuilder();;

		for (int i = 0; i < input.length(); i++) {
		    // strの先頭から1文字ずつString型にして取り出す
		    String str2 = String.valueOf(input.charAt(i));

		    switch(str2){
		    case "A" : str2 = "0";
		    case "B" : str2 =  "1";
		    case "C" : str2 =  "2";
		    case "D" : str2 =  "3";
		    case "E" : str2 =  "4";
		    case "F" : str2 =  "5";
		    case "G" : str2 =  "6";
		    case "H" : str2 =  "7";
		    case "I" : str2 =  "8";
		    case "a" : str2 =  "0";
		    case "b" : str2 =  "1";
		    case "c" : str2 =  "2";
		    case "d" : str2 =  "3";
		    case "e" : str2 =  "4";
		    case "f" : str2 =  "5";
		    case "g" : str2 =  "6";
		    case "h" : str2 =  "7";
		    case "i" : str2 =  "8";
		    }

		    // 配列に順番に格納する
//		    str.append(re_in8);
		    System.out.println(str2);
		}
	}



}
