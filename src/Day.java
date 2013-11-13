import java.util.ArrayList;


public class Day {
	private ArrayList<TimeSlot> slots;

	public Day(){	
		slots=new ArrayList<TimeSlot>();
		for(int i=0;i<9;i++){
			slots.add(new TimeSlot(new Time(i+9,00),new Time(i+10,00)));
		}
	}

	public void checkBook(Time b,Time e,Session s){
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
	}

	public ArrayList<TimeSlot> getSlots() {
		return slots;
	}

	public void setSlots(ArrayList<TimeSlot> slots) {
		this.slots = slots;
	}
	
	public void unbook(TimeSlot s){
		if(!slots.get(s.getBegin().getHour()-9).isAvailable()){
			slots.get(s.getBegin().getHour()-9).unbook();
			System.out.println("Session freed.");}
		else
			System.out.println("Session is already free.");
	}
}