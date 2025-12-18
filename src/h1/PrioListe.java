package h1;

import java.util.ArrayList;

public class PrioListe {
	ArrayList <Patient> myList = new ArrayList <Patient>();
	
	public void addPatient(Patient p) {
		if (myList.isEmpty() == true) {
			myList.add(0, p);
		}
		
		int a;
		a = p.getPrio();
		
		for(int i = 0; i < myList.size(); i++) {
			int b;
			b = myList.get(i).getPrio();
			if (a < b) {
				myList.add(i,p);
				return;
			}
		}
		myList.add(p);
		
	}
	
	public Patient getNextPatient() {
		if(myList.isEmpty() == true) {
			return null;
		}
		Patient NextPatient = myList.get(0);
		myList.remove(0);
		return NextPatient;
		
	}
	
	public int getPosition(Patient p) {
		/*for(int i = 0; i < myList.size(); i++) {
			Patient temp = myList.get(i);
			if(temp == p) {
				return i;
			}
		}
		return null;*/
		return myList.indexOf(p);
	}
}
