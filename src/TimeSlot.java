import java.util.ArrayList;


public class TimeSlot {
	private Time begin;
	private Time end;
	private boolean available;
	private Session booked;
	public TimeSlot(Time b,Time e){
		begin=b;
		end=e;
		available=true;
	}
	
	public TimeSlot(String b,String e){
		begin=new Time(b);
		end=new Time(e);
		available=true;
	}
	
	public TimeSlot(int bh,int bm,int eh,int em){
		begin=new Time(bh,bm);
		end=new Time(eh,em);
		available=true;
	}
	
	public boolean isAvailable(){
		return available;
	}
	
	public void book(Session s){
		available=false;
		booked=s;
	}
	public void unbook(){
		available=true;
		booked=null;
	}
	
	public Time getBegin() {
		return begin;
	}
	
	public void setBegin(Time begin) {
	
		this.begin = begin;
	}
	
	public Time getEnd() {
		return end;
	}
	
	public void setEnd(Time end) {
		this.end = end;
	}

}
