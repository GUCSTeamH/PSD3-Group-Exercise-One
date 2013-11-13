import java.util.ArrayList;


public class LabSession extends Session {

	private int	tutorNum;
	private ArrayList<Tutor> tutors;

	public LabSession(boolean r, boolean c, int t, String l, String crs,
			int bh, int bm, int eh, int em, int[] y,int cap) {
		super(r, c,l, crs, bh, bm, eh, em, y,cap);
		tutorNum=t;
		tutors=new ArrayList<Tutor>();
		// TODO Auto-generated constructor stub
	}
	public LabSession(boolean r, boolean c,String l, String crs,
			int bh, int bm, int eh, int em, int[] y,int cap) {
		super(r, c,l, crs, bh, bm, eh, em, y,cap);
		tutorNum=0;
		tutors=new ArrayList<Tutor>();
		// TODO Auto-generated constructor stub
	}
	public LabSession(boolean r, boolean c, int t, String l, String crs,
			String b, String e, int[] y,int cap) {
		super(r, c,l, crs, b,e, y,cap);
		tutorNum=t;
		tutors=new ArrayList<Tutor>();
		// TODO Auto-generated constructor stub
	}
	public LabSession(boolean r, boolean c,String l, String crs,
			String b, String e, int[] y,int cap) {
		super(r, c,l, crs, b,e, y,cap);
		tutorNum=0;
		tutors=new ArrayList<Tutor>();
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Tutor> getTutors() {
		return tutors;
	}
	public void setTutorsNeeded(int n){
		tutorNum=n;
	}
	public void moreTutors(int n){
		tutorNum+=n;
	}
	public void addTutor(Tutor t) {
		if(tutors.size()==tutorNum)
			System.out.println("Can't add anymore tutors to session");
		else{
		tutors.add(t);}
	}
	


}
