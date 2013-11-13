import java.util.ArrayList;


public class Day {
	// Don't need "timeslots" just sessions in a day
	private ArrayList<Session> slots;

	public Day(){	
		slots=new ArrayList<Session>();
		// don't need to fill the day with empty sessions.
	}

/* shouldn't have to deal with conflicts ? */
/*	public void checkBook(Time b,Time e,Session s){
		int diff=b.getHour()-e.getHour();
		boolean c=false;
		if (diff>1){
			for(int i=0;i<=diff;i++){
				if(slots.get(b.getHour()-9+i).isAvailable()){
					c=true;
				}
			}
			if (c){
				for(int i=0;i<=diff;i++){
					slots.get(b.getHour()-9+i).book(s);
					}
				System.out.println("Session booked");
				}
			else{
				System.out.println("Unable to book session.");}
			}
		else{
			if(slots.get(b.getHour()-9).isAvailable()){
				slots.get(b.getHour()-9).book(s);
				c=true;
				System.out.println("Session booked");
			}
			else{
				System.out.println("Unable to book session.");}
			
		}
	}*/

	public ArrayList<Session> getSlots() {
		return slots;
	}

	public void setSlots(ArrayList<Session> slots) {
		this.slots = slots;
	}

/* shouldn't have to unbook */	
/*	public void unbook(Session s){
		if(!slots.get(s.getBegin().getHour()-9).isAvailable()){
			slots.get(s.getBegin().getHour()-9).unbook();
			System.out.println("Session freed.");}
		else
			System.out.println("Session is already free.");
	}*/
}