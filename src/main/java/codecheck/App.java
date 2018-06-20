package codecheck;


public class App {
	public static void main(String[] args) {


		String subcmd = args[0];
		String input = args[1];

		StringBuilder str = new StringBuilder();;

		for (int i = 0; i < input.length(); i++) {
		    // strの先頭から1文字ずつString型にして取り出す
		    String str2 = String.valueOf(input.charAt(i));
		    String re_in8 = return_int8(str2);



		    // 配列に順番に格納する
		    str.append(re_in8);
		    System.out.println(re_in8);
		}
	}

	private static String return_int8(String input_A) {

	    switch(input_A){
	    case "A" : return "0";
	    case "B" : return "1";
	    case "C" : return "2";
	    case "D" : return "3";
	    case "E" : return "4";
	    case "F" : return "5";
	    case "G" : return "6";
	    case "H" : return "7";
	    case "I" : return "8";
	    case "a" : return "0";
	    case "b" : return "1";
	    case "c" : return "2";
	    case "d" : return "3";
	    case "e" : return "4";
	    case "f" : return "5";
	    case "g" : return "6";
	    case "h" : return "7";
	    case "i" : return "8";
	    }
	}
}
