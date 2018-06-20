package codecheck;


public class App {
	public static void main(String[] args) {


		String subcmd = args[0];
		String input = args[1];

		StringBuilder str = new StringBuilder();;

		for (int i = 0; i < input.length(); i++) {
		    // strの先頭から1文字ずつString型にして取り出す
		    String str2 = String.valueOf(input.charAt(i));
		    String outstr = "";
		    switch(str2){
		    case "A" : outstr = "0";
		    case "B" : outstr =  "1";
		    case "C" : outstr =  "2";
		    case "D" : outstr =  "3";
		    case "E" : outstr =  "4";
		    case "F" : outstr =  "5";
		    case "G" : outstr =  "6";
		    case "H" : outstr =  "7";
		    case "I" : outstr =  "8";
		    case "a" : outstr =  "0";
		    case "b" : outstr =  "1";
		    case "c" : outstr =  "2";
		    case "d" : outstr =  "3";
		    case "e" : outstr =  "4";
		    case "f" : outstr =  "5";
		    case "g" : outstr =  "6";
		    case "h" : outstr =  "7";
		    case "i" : outstr =  "8";
		    }

		    // 配列に順番に格納する
//		    str.append(re_in8);
		    System.out.println(str2 + ":" + outstr);
		}
	}



}
