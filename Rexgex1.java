package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Rexgex1 {

	private static int count;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="My mobile number is 9632924381"; // here \\d means one \ will be removed and only take \d-->take 10 digits
		/*
		 * Pattern patternObj=Pattern.compile("\\d{10}");//compile take string as
		 * argument(the input statement) and return pattern Matcher
		 * matcherObj=patternObj.matcher(input); while(matcherObj.find()) {
		 * System.out.print(matcherObj.group());
		 * System.out.println(matcherObj.start());//9 start from 20
		 * System.out.println(matcherObj.end());//1 end in 30
		 * 
		 * }
		 */int cout=0;
		String[] inputs=input.split(" ");
		for(int i=0;i<inputs.length;i++) {
			String s=inputs[i];
			if(s.length()==10) {
				for(int j=0;j<s.length();j++) {
					if(s.charAt(j)>'0' && s.charAt(j)<='9') {
						 cout++;
					}
				}
				if(cout==10) 
					System.out.println("yes true");
					break;
			}
		}
	}

}
