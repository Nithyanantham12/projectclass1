package org.phone;

public class InternalStorage {
	private void processorName() {
		System.out.println("Phone processor name is Snapdragon");

	}
private void ramSize() {
	System.out.println("16gb");

}
public static void main(String[] args) {
	InternalStorage d = new InternalStorage();
	d.processorName();
	d.ramSize();
	ExternalStorage c = new ExternalStorage();
	c.size();
}
}
