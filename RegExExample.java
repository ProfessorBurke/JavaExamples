import java.util.regex.*;

public class RegExExample {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("<[^<>]*>");
		Matcher m = p.matcher("<!DOCTYPE html>\r\n"
				+ "<html class=\"client-js ve-available\" dir=\"ltr\" lang=\"en\"><head>\r\n"
				+ "<meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">\r\n"
				+ "<meta charset=\"UTF-8\">\r\n"
				+ "<title>Regular expression - Wikipedia</title>");
		while (m.find()) {
			System.out.println(m.start() + ": " + m.group());
		}
	}

}
