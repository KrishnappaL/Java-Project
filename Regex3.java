package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex3 {

	public static void main(String[] args) {
		String password="Chennai is the capital of TamilNadu";
		Pattern patternObj=Pattern.compile("[^Chennai]");//$ ->end with TamilNadu
		//[A-Z][a-z]{5},TamilNadu$,^Chennai-->^ denotes start with Chennai,[^Chenai] means any characters except this
		Matcher matcherObj=patternObj.matcher(password);
		while(matcherObj.find()) {
			System.out.print(matcherObj.group());
		}
	}

}
