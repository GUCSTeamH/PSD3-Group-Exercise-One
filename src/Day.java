import java.util.ArrayList;


public class Day {
	private ArrayList<TimeSlot> slots;
	
	public Day(){	
		slots=new ArrayList<TimeSlot>();
		for(int i=0;i<9;i++){
			slots.add(new TimeSlot(new Time(i+9,00),new Time(i+10,00)));
		}
	}

	public boolean check(Time b,Time e){
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
					slots.get(b.getHour()-9+i).book();
					}
				}
			}
		else{
			if(slots.get(b.getHour()-9).isAvailable()){
				slots.get(b.getHour()-9).book();
				c=true;
			}
		}
		return c;
	}

	public ArrayList<TimeSlot> getSlots() {
		return slots;
	}

	public void setSlots(ArrayList<TimeSlot> slots) {
		this.slots = slots;
	}
}