package h2;

import java.util.ArrayList;

public class Bus {
	ArrayList <Passenger> passengers = new ArrayList <Passenger>();
	
	public Bus() {
		passengers = new ArrayList<>();
	}
	
	public void enterBus(Passenger p) {
		passengers.add(p);
	}
	
	private void exitBus() {
		for (int i = passengers.size() - 1; i >= 0; i--) {
			if(passengers.get(i).getVisited() == passengers.get(i).getPlanned()) {
				passengers.remove(i);
			}
		}
	}
	
	public void nextStop(Passenger[] boarding) {
		for (int i = 0; i < passengers.size(); i++) {
			Passenger temp = passengers.get(i);
			temp.setVisited(temp.getVisited() +1);
		}
		exitBus();
		for (int j = 0; j < boarding.length; j++) {
			Passenger n = boarding[j];
			passengers.add(n);
		}
	}
	public void nextStop() {
		for (int i = 0; i < passengers.size(); i++) {
			Passenger temp = passengers.get(i);
			temp.setVisited(temp.getVisited() +1);
		}
		exitBus();
	}
	
	public ArrayList<Passenger> findPassengersWithoutTickets() {
		ArrayList <Passenger> withoutTicket = new ArrayList <Passenger>();
		
		for (int i = passengers.size() - 1; i >= 0; i--) {
			Passenger temp = passengers.get(i);
			if(!temp.isTicket()) {
				withoutTicket.add(temp);
				passengers.remove(i);
			}
		}
		return withoutTicket;
	}
	
	public void transferPassengers(Bus otherBus, String[] passengerNames) {
		for (int i = 0;i < passengerNames.length; i++) {
			for (int j = passengers.size()-1; j >= 0; j--) {
				if (passengers.get(j).getName().equals(passengerNames[i])) {
					Passenger temp = passengers.get(j);
					otherBus.passengers.add(temp);
					passengers.remove(temp);
					break;
				}
			}
		}
	}
}
