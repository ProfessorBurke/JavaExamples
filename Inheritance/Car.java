
class Car extends Racer {
	
	@Override
    public void move() {
    	this.advance(5);
    }

    @Override
    public String getName() {
        return "Car";
    }
}