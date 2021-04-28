package hust.soict.hedspi.aims.disc;

import hust.soict.hedspi.aims.media.*;
import java.util.ArrayList;
//import java.time.LocalDate;


public class CompactDisc extends Disc implements Playable{
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();
	
	public CompactDisc(int id, String title, String category, String artist, float cost) {
		super(id, title, category, cost);
		this.artist = artist;
	}
		
	public CompactDisc(int id, String category, String artist, float cost) {
		super(id, category, cost);
		this.artist = artist;
	}
	
	public void addTrack(Track track) {
		if(tracks.contains(track)) {
			System.out.println("This track already in the list!");
		} 
		else {
			
			tracks.add(track);
			System.out.println("This track's been added to the list!");
		}
	}
	
	public void removeTrack(Track track) {
		if(tracks.contains(track)) {
			tracks.remove(track);
			System.out.println("This track's been removed!");
		} 
		else {
			System.out.println("This track is not in the list!");
		}
	}
	
	public int getLength() {
		int sum = 0;
		for(Track temp: tracks) {
			sum += temp.getLength();
		}
		super.length = sum;
		return sum;
	}
	
	@Override
    public String toString(){
        return "CD - " + super.getTitle() + " - " + super.getCategory() + " - " + this.getLength() + " : " + super.getCost() + "$";
    }
	
	public void play() {
		for(Track temp: tracks) {
			System.out.println("Playing CD: "+ this.getTitle());
			System.out.println("CD length: "+ this.getLength());
		}
	}
	
	public int compareTo(Media media) {
		if(media instanceof CompactDisc) {
			CompactDisc cd = (CompactDisc) media;
			if(tracks.size() == cd.tracks.size()) {
                return Integer.compare(this.length, cd.getLength());
            }
            else if(tracks.size() < cd.tracks.size())
                return -1;
            else return 1;
		} 
		else {
            return super.compareTo(media);
        }
	}
}