import java.util.ArrayList;


public class LabSession extends Session {
	
	private ArrayList<Tutor> tutors;

	public LabSession(boolean r, boolean c, int t, String l, String crs,
			int bh, int bm, int eh, int em, int[] y,int cap) {
		super(r, c, t, l, crs, bh, bm, eh, em, y,cap);
		tutors=new ArrayList<Tutor>();
		// TODO Auto-generated constructor stub
	}
	public LabSession(boolean r, boolean c, int t, String l, String crs,
			String b, String e, int[] y,int cap) {
		super(r, c, t, l, crs, b,e, y,cap);
		tutors=new ArrayList<Tutor>();
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Tutor> getTutors() {
		return tutors;
	}
	public void addTutor(Tutor t) {
		tutors.add(t);
	}
	


}
