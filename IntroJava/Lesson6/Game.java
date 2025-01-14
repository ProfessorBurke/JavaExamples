import java.util.Random;

public class Game {
	private int trick;
	private int treat;
	private int threshold;
	private Die die;
	private Player player;
	private Computer computer;
	

	private final void generateTrick() {
		this.die.roll();
		this.trick = this.die.getValue();
	}

	private final void generateTreat() {
		this.die.roll();
		this.treat = this.die.getValue();
		while (this.treat == this.trick) {
			this.die.roll();
			this.treat = this.die.getValue();
		}
	}
	public Game() {
		this.die = new Die();
		this.generateTrick();
		this.generateTreat();
		this.threshold = 5;
		this.computer = new Computer(this);
		this.player = new Player(this);
	}
	
	public int getTrick() {
		return this.trick;
	}
	
	public int getTreat() {
		return this.treat;
	}
	
	public void play() {
		int currentHighScore = 0;
		int playerScore, computerScore;
		while (currentHighScore < this.threshold) { 
			this.player.takeTurn(this.die);
			this.computer.takeTurn(this.die);
			playerScore = this.player.getScore();
			computerScore = this.computer.getScore();
			currentHighScore = playerScore > computerScore ? playerScore : computerScore;
			System.out.println("Player score: " + playerScore);
			System.out.println("Computer score: " + computerScore + "\n");
		}
	}
	
	
}
