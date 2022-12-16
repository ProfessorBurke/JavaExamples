import java.util.Scanner;

public class StringDemo {
	
	public static String findAndReplace(String text, String search, String replace) {
		int index = text.indexOf(search);
    	while (index != -1) {
    		String newText = text.substring(0, index) + replace
    				+ text.substring(index + search.length(), text.length());
    		text = newText;
    		index += replace.length() - 1;
    		index = text.indexOf(search, ++index);
    	}
    	return text;
	}

	public static void main(String[] args) {
		String string1 = "Hello, world!";
    	String string2 = string1;
    	String string3 = new String ("Hello, world!");
    	String string4 = new String(string1);

    	System.out.println(string1.equalsIgnoreCase("hello, World!"));
    	System.out.println(string2.equals("Hello, world!"));
    	System.out.println(string3.equals("Hello, world!"));
    	System.out.println(string4.equals("Hello, world!"));
    	
    	System.out.println("A".compareTo("B"));
    	
    	int index = string1.indexOf("l");
    	while (index != -1) {
    		System.out.println("'l' found at " + index);
    		index = string1.indexOf("l", ++index);
    	}
		
	}

}
