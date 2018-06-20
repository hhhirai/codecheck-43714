package codecheck;


public class App {
	public static void main(String[] args) {


		String subcmd = args[0];
		String input = args[1];

		StringBuilder str = new StringBuilder();;
		double jou = input.length()-1;
		double output = 0;

		for (int i = 0; i < input.length(); i++) {

			String str2 = String.valueOf(input.charAt(i));
		    int re_in8 = Integer.parseInt(return_int8(str2));


		    double num = 0;
		    if(jou == 0){
		    	num = re_in8;
		    }else{
		    	num = re_in8 * Math.pow(9, jou);
		    }

		    output += num;

		    System.out.println(str2+ ":" + re_in8 + "*" +jou + ":" +num + ":" +output );

		    jou--;
		}
	}

	private static String return_int8(String input_A) {

		String return_str8 = "";
	    switch(input_A){
	    case "A" :
	    	return_str8 = "0";
	    	break;
	    case "B" :
	    	return_str8 =  "1";
	    	break;
	    case "C" :
	    	return_str8 =  "2";
	    	break;
	    case "D" :
	    	return_str8 =  "3";
	    	break;
	    case "E" :
	    	return_str8 =  "4";
	    	break;
	    case "F" :
	    	return_str8 =  "5";
	    	break;
	    case "G" :
	    	return_str8 =  "6";
	    	break;
	    case "H" :
	    	return_str8 =  "7";
	    	break;
	    case "I" :
	    	return_str8 =  "8";
	    	break;
	    }
	    return return_str8;
	}
}
