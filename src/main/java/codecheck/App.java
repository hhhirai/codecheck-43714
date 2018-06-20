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
		    case "A" :
		    	outstr = "0";
		    	break;
		    case "B" :
		    	outstr =  "1";
		    	break;
		    case "C" :
		    	outstr =  "2";
		    	break;
		    case "D" :
		    	outstr =  "3";
		    	break;
		    case "E" :
		    	outstr =  "4";
		    	break;
		    case "F" :
		    	outstr =  "5";
		    	break;
		    case "G" :
		    	outstr =  "6";
		    	break;
		    case "H" :
		    	outstr =  "7";
		    	break;
		    case "I" :
		    	outstr =  "8";
		    	break;
		    }

		    // 配列に順番に格納する
//		    str.append(re_in8);
		    System.out.println(str2 + ":" + outstr);
		}
	}



}
