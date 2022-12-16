public class StringBufferDemo {
	
	public static String findAndReplace(String text, String search, String replaceStr) {
		StringBuffer sb = new StringBuffer(text);
		int index = sb.indexOf(search);
    	while (index != -1) {
    		sb.replace(index, index + search.length(), replaceStr);
    		index += replaceStr.length() - 1;
    		index = sb.indexOf(search, ++index);
    	}
    	return sb.toString();
	}

	public static void main(String[] args) {
		String newText = findAndReplace("Java is a good language and so is Python. Java, Java.",
				"Java", "JAVA");
		System.out.println(newText);
	}

}
