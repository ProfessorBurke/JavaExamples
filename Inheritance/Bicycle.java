
class Bicycle extends Racer {
	
	@Override
    public void move() {
        this.advance(2);
    }

	@Override
    public String getName() {
        return "Bicycle";
    }
}