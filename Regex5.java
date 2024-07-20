package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex5 {

	public static void main(String[] args) {
		String password=" Chennai is :- 600001";
		Pattern patternObj=Pattern.compile("\\s");
		Matcher matcherObj=patternObj.matcher(password);
		int count=0;
		while(matcherObj.find()) {
			count++;
			//System.out.print(matcherObj.group()); //print space
		}
	System.out.println(count);
	}

}
