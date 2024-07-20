package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern="a+";
		String input="fafafafafafafa";
		Pattern pobj=Pattern.compile(pattern);
		Matcher mobj=pobj.matcher(input);
		while(mobj.find()) {
			System.out.print(mobj.group() +" ");
		}
	}

}
