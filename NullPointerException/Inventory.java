
public class Inventory {
	
	private Item[] inventory;
	
	public Inventory() {
		this.inventory = new Item[3];
		inventory[0] = new Item("widget", 100);
		inventory[1] = new Item("gadget", 115);
		inventory[2] = new Item("component", 200);
	}
	
	public Item findItem(String name) {
		Item result = null;
		int i = 0;
		while (i < this.inventory.length && result == null) {
			if (this.inventory[i].getName().equals(name)) {
				result = this.inventory[i];
			}
			i++;
		}
		return result;
	}

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		Item item = inventory.findItem("whatsit");
		if (item == null) {
			System.out.println("That item is not in your inventory.");
		} else {
			System.out.println(item.getQuantity());
		}
	}

}
