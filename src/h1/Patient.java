package h1;

public class Patient {
	private String Name;
	private int prio;
	
	public Patient(String name, int prio) {
		this.Name = name;
		this.prio = prio;  
	}
	
	public String getName() {
		return Name;
	}
	public int getPrio() {
		return prio;
	}
}
