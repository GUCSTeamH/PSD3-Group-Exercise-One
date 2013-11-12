
public class Time {
	private int hour;
	private int min;
public Time(int h,int m){
	hour=h;
	min=m;
}
public Time(String t){
	String[] time=t.split(":");
	hour=Integer.parseInt(time[0]);
	min=Integer.parseInt(time[1]);
}
public int getHour() {
	return hour;
}
public void setHour(int hour) {
	this.hour = hour;
}
public int getMin() {
	return min;
}
public void setMin(int min) {
	this.min = min;
}
public String toString(){
	String h="",m="";
	if(hour<10&&hour>=0) h="0"+String.valueOf(hour);
	if(min<10&&min>=0)m="0"+String.valueOf(min);
	return h+":"+m;
}
}
