package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {

	public static void main(String[] args) {
		String input="My Mobile Number is 9632924387";
		Pattern patternObj=Pattern.compile("[6-9]+");//or [0-9] ,[0123456789],[a-z],[3-7],[k-p],[A-Z],[A-Z][a-z]
		//[6-9][0-9]{9},[6-9][0-9]-->take 2 characters,[6-9]*,[6-9]+
		Matcher matcherObj=patternObj.matcher(input);
		 while(matcherObj.find()) {
		  System.out.print(matcherObj.group());
		 
		  
		 }
	}

}
