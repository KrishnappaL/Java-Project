package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex7 {

	public static void main(String[] args) {
		String pattern="-";
		String input="28-March-2024";
		Pattern pobj=Pattern.compile(pattern);
		String[] items=pobj.split(input);
for(int i=0;i<items.length;i++) {
	System.out.println(items[i]);
}
}

}
