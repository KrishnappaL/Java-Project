package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex4 {
	public static void main(String[] args) {
		String password=" Chennai is :- 600001";
		Pattern patternObj=Pattern.compile("[^a-zA-z0-9]");//[a-z A-Z],[a-zA-Z],[a-zA-z0-9] -->remove all special characters from a string
		//  \\d,\\D,\\s,\\S-->space negation 
		Matcher matcherObj=patternObj.matcher(password);
		while(matcherObj.find()) {
			System.out.print(matcherObj.group());
		}
	}

}
