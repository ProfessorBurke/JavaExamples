import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestTriviaQuestion {
	
	TriviaQuestion question;
	String QUESTION = "Who was Alan Turing?";
	String[] ANSWERS = {"first-team midfielder for Manchester United",
			"the father of theoretical computer science", 
			"the true name of the Red Baron",
			"19th century Scottish playwright"};
	int CORRECT_ANSWER = 1;
	int POINTS = 10;
	String POSED_QUESTION = QUESTION + "\n1) " + ANSWERS[0]
			+ "\n2) " + ANSWERS[1] + "\n3) " + ANSWERS[2] 
			+ "\n4) " + ANSWERS[3] + "\n";
	
	String NEW_QUESTION = "The first computer \"bug\" was literally a bug and was found by";
	String[] NEW_ANSWERS = {"Charles Babbage",
			"Ada Lovelace", 
			"Grace Hopper",
			"Edsger Djikstra"};
	int NEW_CORRECT_ANSWER = 2;
	int NEW_POINTS = 100;
	String NEW_POSED_QUESTION = NEW_QUESTION + "\n1) " + NEW_ANSWERS[0]
			+ "\n2) " + NEW_ANSWERS[1] + "\n3) " + NEW_ANSWERS[2] 
			+ "\n4) " + NEW_ANSWERS[3] + "\n";
	
	String ERROR_UNPOSED = "Cannot answer a question that has not been posed.";
	String ERROR_UNSCORED = "Cannot return score as this question has not been scored.";
	String ERROR_ALREADY_POSED = "This question has already been posed.";
	String ERROR_CANT_MUTATE = "This question cannot be changed once posed.";

	@BeforeEach
	void setUp() throws Exception {
		question = new TriviaQuestion(QUESTION, ANSWERS, CORRECT_ANSWER, POINTS);
	}

	@Test
	@DisplayName("Check that TriviaQuestion throws an exception on getScore in Unposed state")
	void testUnposedExceptionOnGetScore() {
		IllegalStateException e = assertThrows(IllegalStateException.class, () -> {
			question.getScore();},
				"TriviaQuestion fails to throw an IllegalStateException in Unposed state on getScore");
		assertEquals(ERROR_UNSCORED, e.getMessage());
	}
	
	@Test
	@DisplayName("Check that TriviaQuestion throws an exception on answerQuestion in Unposed state")
	void testUnposedExceptionOnAnswerQuestion() {
		IllegalStateException e = assertThrows(IllegalStateException.class, () -> {
			question.answerQuestion(0);},
				"TriviaQuestion fails to throw an IllegalStateException in Unposed state on answerQuestion");
		assertEquals(ERROR_UNPOSED, e.getMessage());
	}
	
	
	@Test
	@DisplayName("Check that TriviaQuestion can be mutated in an Unposed state")
	void testUnposedCanBeMutated() {
		// Mutate all of the mutatable fields
		question.setQuestion(NEW_QUESTION);
		question.setAnswers(NEW_ANSWERS);
		question.setCorrectAnswer(NEW_CORRECT_ANSWER);
		question.setPoints(NEW_POINTS);
		
		// Pose the question and confirm fields have been mutated
		String posed = question.poseQuestion();
		assertEquals(NEW_POSED_QUESTION, posed);
		
		// Answer the question correctly and confirm points and correct answer
		// have been mutated
		question.answerQuestion(NEW_CORRECT_ANSWER);
		int points = question.getScore();
		assertEquals(NEW_POINTS, points);
		
		
	}

}
