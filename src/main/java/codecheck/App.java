package codecheck;


public class App {
	public static void main(String[] args) {


		String subcmd = args[0];
		String input = args[1];

		if(subcmd == "decode"){
			double jou = input.length()-1;
			double out_decode = 0;

			for (int i = 0; i < input.length(); i++) {

				String str2 = String.valueOf(input.charAt(i));
			    int re_int8 = Integer.parseInt(return_int8(str2));


			    int num = 0;
			    if(jou == 0){
			    	num = re_int8;
			    }else{
			    	num = (int) (re_int8 * Math.pow(9, jou));
			    }

			    out_decode += num;
			    jou--;
			}
		    System.out.println(out_decode);

		}else if(subcmd == "encode"){

		    int input_i = Integer.parseInt(input);
		    String oct = Integer.toOctalString(input_i);
		    StringBuilder out_encode = new StringBuilder();

		    for (int i = 0; i < input.length(); i++) {

				String str2 = String.valueOf(input.charAt(i));
				out_encode.append(return_A(str2));
		    }
		    System.out.println(out_encode.toString());
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

	private static String return_A(String input_i) {

		String return_strA = "";
	    switch(input_i){
	    case "0" :
	    	return_strA = "A";
	    	break;
		case "1" :
		    return_strA = "B";
		    break;
		case "2" :
		    return_strA = "C";
		    break;
		case "3" :
		    return_strA = "D";
		    break;
		case "4" :
		    return_strA = "E";
		    break;
		case "5" :
		    return_strA = "F";
		    break;
		case "6" :
		    return_strA = "G";
		    break;
		case "7" :
		    return_strA = "H";
		    break;
		case "8" :
		    return_strA = "I";
		    break;
	    }
	    return return_strA;
	}
}
