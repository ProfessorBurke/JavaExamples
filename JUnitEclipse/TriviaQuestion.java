
/**
    Represents a trivia question that can be modified, posed, and answered.
	@author Maggie
*/

public class TriviaQuestion {
	

	private String question;
	private String[] answers;
	private int correctAnswer;
	private int points;
	private int score;
	private boolean posed;
	private boolean scored;
	
	
	/**
	 * Initialize a TriviaQuestion object from parameters.
	 * @param question The question.
	 * @param answers The answer options
	 * @param correct The index of the correct answer.
	 * @param points The number of points the question is worth.
	 */
	public TriviaQuestion(String question, String[] answers, int correct, int points) {
		this.question = question;
		this.answers = answers;
		this.correctAnswer = correct;
		this.points = points;
		this.score = 0;
		this.posed = false;
		this.scored = false;
	}
	
	
	/**
	 * Create and return a string to pose the question if the question hasn't already been posed,
	 * otherwise throw an IllegalStateException.  Transition this object into the posed state.
	 * 
	 * @return The string representation of the question.
	 */
	public String poseQuestion() {
		if (this.posed) {throw new IllegalStateException("This question has already been posed.");}
		this.posed = true;
		int count = 1;
		String questionText = this.question + "\n";
		for (String answer: this.answers) {
			questionText += (count++) + ") " + answer + "\n";
		}
		return questionText;
	}

	/**
	 * If this question has been posed, if the answer is correct, set score to points, otherwise zero.
	 * If this question hs not been posed, throw an IllegalStateException.
	 * 
	 * @param The answer being compared to the correct answer to determine points awarded.
	 */
	public void answerQuestion(int answer) {
		if (!this.posed) {throw new IllegalStateException("Cannot answer a question that has not been posed.");}
		this.scored = true;
		this.score = this.correctAnswer == answer ? this.points : 0;
	}

	
	/**
	 * Return the score if the question has been answered, otherwise throw an IllegalStateException.
	 * 
	 * @return The number of points received on this question.
	 */
	public int getScore() {
		if (!this.scored) {throw new IllegalStateException("Cannot return score as this question has not been scored.");}
		return this.score;
	}
	
	/**
	 * Change the question text if the question has not already been posed, otherwise throw
	 * an IllegalStateException.
	 * 
	 * @param question The new question.
	 */
	public void setQuestion(String question) {
		if (this.posed) {throw new IllegalStateException("This question cannot be changed once posed.");}
		this.question = question;
	}
	
	/**
	 * Change the answer array if the question has not already been posed, otherwise throw
	 * an IllegalStateException.
	 * 
	 * @param answers The new answers array.
	 */
	public void setAnswers(String[] answers) {
		if (this.posed) {throw new IllegalStateException("This question cannot be changed once posed.");}
		this.answers = answers;
	}

	/**
	 * Change the correct answer if the question has not already been posed, otherwise throw
	 * an IllegalStateException.
	 * 
	 * @param correctAnswer the new correct answer index.
	 */
	public void setCorrectAnswer(int correctAnswer) {
		if (this.posed) {throw new IllegalStateException("This question cannot be changed once posed.");}
		this.correctAnswer = correctAnswer;
	}

	/**
	 * Change the question value if the question has not already been posed, otherwise throw
	 * an IllegalStateException.
	 * 
	 * @param points The new value of the question.
	 */
	public void setPoints(int points) {
		if (this.posed) {throw new IllegalStateException("This question cannot be changed once posed.");}
		this.points = points;
	}
	

	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	