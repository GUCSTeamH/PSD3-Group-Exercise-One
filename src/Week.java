
class Week {
	private ArrayList<Day> days;
	
	public Week(){
		days = new ArrayList<Day>(5);
		for (int i=0; i<5; i++){
			days.add(new Day());
		}
	}
	
	public Day getDay(int day){
		return days.get(day);
	}
	
}