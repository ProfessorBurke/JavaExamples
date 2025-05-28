
class Horse extends Racer {
	
	@Override
    public void move() {
        this.advance(3);
    }

	@Override
    public String getName() {
        return "Horse";
    }
}