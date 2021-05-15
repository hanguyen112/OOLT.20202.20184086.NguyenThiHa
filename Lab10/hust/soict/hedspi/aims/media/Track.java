package hust.soict.hedspi.aims.media;

import java.util.*;

public class Track implements Playable, Comparable<Track>{
	private String title;
	private int length;
	
	public String getTitle() {
		return title;
		
	}
	
	public int getLength() {
		return length;
		
	}
	
	public Track(String title, int length) {
		this.title = title;
		this.length = length;
		
	}
	
	@Override
	public void play() {
		System.out.println("Playing track: "+ this.getTitle());
		System.out.println("track length: "+ this.getLength());
	
	}
	
	public boolean equals(Object obj) {
		Track t = (Track) obj;
		if(title.equalsIgnoreCase(t.title) && length == t.length) {
			return true;
		}
		else return false;
		
	}
	
	public int compareTo(Track track) {
		if(this.title.compareToIgnoreCase(track.title) < 0) {
			return -1;
		} else if (this.title.compareToIgnoreCase(track.title) == 0) {
			return 0;
		} else {
			return 1;
		}
		
	}
	
}