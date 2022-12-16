import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestSBSearchAndReplace {
	
	String textEmpty = "";
	String textAll = "JavaJavaJavaJavaJava";
	String textAlternating = "JavaPythonJavaPythonJavaPython";
	String textPunctuation = "Java is a good language and so is Python. Java, Java.";
	String search = "Java";
	String replaceShorter = "C++";
	String replaceLonger = "Python";
	String replaceSame = "JAVA";

	@Test
	void testOrdinarySearch() {
		String expectedResult = "JAVA is a good language and so is Python. JAVA, JAVA.";
		String result = StringBufferDemo.findAndReplace(textPunctuation, "Java", replaceSame);
		assertEquals(expectedResult, result);
	}
	
	@Test
	void testSearchFirstLast() {
		String expectedResult = "JAVAJAVAJAVAJAVAJAVA";
		String result = StringBufferDemo.findAndReplace(textAll, "Java", replaceSame);
		assertEquals(expectedResult, result);
	}
	
	@Test
	void testReplaceEmpty() {
		String expectedResult = "";
		String result = StringBufferDemo.findAndReplace(textAll, "Java", textEmpty);
		assertEquals(expectedResult, result);
	}
	
	@Test
	void testReplaceLonger() {
		String expectedResult = "Python is a good language and so is Python. Python, Python.";
		String result = StringBufferDemo.findAndReplace(textPunctuation, "Java", replaceLonger);
		assertEquals(expectedResult, result);
	}
	
	@Test
	void testReplaceShorter() {
		String expectedResult = "C++ is a good language and so is Python. C++, C++.";
		String result = StringBufferDemo.findAndReplace(textPunctuation, "Java", replaceShorter);
		assertEquals(expectedResult, result);
	}
	
	@Test
	void testReplaceOneChar() {
		String expectedResult = "KavaPythonKavaPythonKavaPython";
		String result = StringBufferDemo.findAndReplace(textAlternating, "J", "K");
		assertEquals(expectedResult, result);
	}

	@Test
	void testNoReplacement() {
		String expectedResult = "Java is a good language and so is Python. Java, Java.";
		String result = StringBufferDemo.findAndReplace(textPunctuation, "C++", replaceSame);
		assertEquals(expectedResult, result);
	}
}
