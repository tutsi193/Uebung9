package h2;

public class Passenger {
	private String name;
	private int planned;
	private int visited;
	private boolean ticket;
	
	public Passenger(String name, int planned, boolean ticket) {
		this.setName(name);
		this.setPlanned(planned);
		this.setTicket(ticket);
		setVisited(0);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPlanned() {
		return planned;
	}

	public void setPlanned(int planned) {
		this.planned = planned;
	}

	public int getVisited() {
		return visited;
	}

	public void setVisited(int visited) {
		this.visited = visited;
	}

	public boolean isTicket() {
		return ticket;
	}

	public void setTicket(boolean ticket) {
		this.ticket = ticket;
	}
	
	
}
