
public class Racer {
    private int position;
    
    public Racer() {
    	this.position = 0;
    }
    
    protected void advance(int amount) {
    	this.position += amount;
    }

    public void move() {
        this.advance(1);
    }

    public String getName() {
        return "Racer";
    }
    
    @Override
    public String toString() {
    	String locationStr = "";
    	for (int i = 1; i < this.position; i++) {
    		locationStr += "-";
    	}
    	locationStr += this.getName();
    	return locationStr;
    }
}


