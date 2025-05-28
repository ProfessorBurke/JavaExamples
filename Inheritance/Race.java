
public class Race {
    public static void main(String[] args) {
        Racer[] racers = { new Car(), new Horse(), new Bicycle() };

        for (int i = 0; i < 5; i++) {
            System.out.println("Round " + (i+1));
            for (Racer racer: racers) {
            	racer.move();
            	System.out.println(racer);
            }
            System.out.println();
        }
    }
}
