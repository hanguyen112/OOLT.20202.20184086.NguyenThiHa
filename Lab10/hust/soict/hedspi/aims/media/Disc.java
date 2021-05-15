package hust.soict.hedspi.aims.media;


public class Disc extends Media{
	protected String director;
	protected int length;
	
	public String getDirector() {
		return director;
	}
	
	public int getLength() {
		return length;
	}
	
	public Disc(int id, String category, float cost) {
		super(id, category, cost);
	}
	
	public Disc(int id, String title, String category) {
		super(id, title, category);
	}
	
	public Disc(int id, String title, String category, float cost) {
		super(id, title, category, cost);
	}
	
	public Disc(int id, String title, String category, int length, float cost) {
		super(id, title, category, cost);
		this.length = length;
	}
	
	public Disc(int id, String title, String category, String director, int length, float cost) {
		super(id, title, category, cost);
		this.length = length;
		this.director = director;
	}

	//public Disc(String string, String title, String category, int length2, float cost) {
		// TODO Auto-generated constructor stub
	//}

	public int compareTo(Media media) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getCategory() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}
}