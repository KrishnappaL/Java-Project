package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex6 {
public static void main(String[] args) {
	String mobile="919632924381";
	Pattern pobj=Pattern.compile("(0|91)?[0-9]{10}");
	Matcher mobj=pobj.matcher(mobile);
	while(mobj.find()) {
		System.out.println(mobj.group());
	}
}
}
