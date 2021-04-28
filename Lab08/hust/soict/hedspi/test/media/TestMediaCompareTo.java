package hust.soict.hedspi.test.media;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.disc.CompactDisc;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.disc.Track;

public class TestMediaCompareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Media> collection = new java.util.ArrayList<Media>();
		Book book1 = new Book("Digital Fortress", "Techno-thriller Novel", 120, Arrays.asList(new String[]{"Dan Brown"}));
		collection.add(book1);
		Book book2 = new Book("The Da Vinci Code", "Thriller Novel", 124, Arrays.asList(new String[]{"Dan Brown"}));
		collection.add(book2);
		Book book3 = new Book("Angels and Demons", "Mystery-thriller Novel", 136, Arrays.asList(new String[]{"Dan Brown", "PTH"}));
		collection.add(book3);
		
		CompactDisc CD1 = new CompactDisc("Cinderella", "Cartoon", "Disney", 16);
		collection.add(CD1);
		
		Track track1_1 = new Track(CD1.getTitle(), 12);
		Track track2_1 = new Track(CD1.getTitle(), 30);
		Track track3_1 = new Track(CD1.getTitle(), 55);
		CD1.addTrack(track1_1);
		CD1.addTrack(track2_1);
		CD1.addTrack(track3_1);
		
		CompactDisc CD2 = new CompactDisc("The Lord of The Rings", "Adventure", "Peter Jackson", 167);
		collection.add(CD2);
		
		Track track1_2 = new Track(CD2.getTitle(), 60);
		Track track2_2 = new Track(CD2.getTitle(), 70);
		Track track3_2 = new Track(CD2.getTitle(), 80);
		Track track4_2 = new Track(CD2.getTitle(), 90);
		CD2.addTrack(track1_2);
		CD2.addTrack(track2_2);
		CD2.addTrack(track3_2);
		CD2.addTrack(track4_2);
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("Harry Potter", "Fantasy", "J.K. Rowling", 129, 294);
		collection.add(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Tom and Jerry", "Cartoon", "Tim Story", 120, 150);
		collection.add(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Flipped", "Romentic Comedy", "Rob Reiner", 100, 164);
		collection.add(dvd3);
		DigitalVideoDisc dvd7 = new DigitalVideoDisc("Flipped", "Romentic Comedy", "Rob Reiner", 100, 180);
		collection.add(dvd7);
		DigitalVideoDisc dvd8 = new DigitalVideoDisc("Flippedt", "Romentic Comedy", "Rob Reiner", 100, 164);
		collection.add(dvd8);
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Three idiots", "Comedy", "Hinrani", 180, 200);
		collection.add(dvd4);
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("Three idiots", "Camedy", "Hinrani", 180, 200);
		collection.add(dvd5);
		DigitalVideoDisc dvd6 = new DigitalVideoDisc("Three idiots", "Camedy", "Hanrani", 170, 200);
		collection.add(dvd6);
		
		System.out.println("List of media before being sorted: ");
		java.util.Iterator<Media> iterator = collection.iterator();
		while(iterator.hasNext()) {
			System.out.println(((Media)iterator.next()).getDetail());
		}
		System.out.println("List of medias after being sorted: ");
		java.util.Collections.sort((List<Media>) collection);
		iterator = collection.iterator();
		while(iterator.hasNext()) {
			System.out.println(((Media)iterator.next()).getDetail());
		}
		
		System.out.println("\nList of medias after being sorted title cost: ");
		java.util.Collections.sort((List<Media>) collection, Media.COMPARE_BY_TITLE_COST);
		iterator = collection.iterator();
		while(iterator.hasNext()) {
			System.out.println(((Media)iterator.next()).getDetail());
		}
		
		System.out.println("\nList of medias after being sorted cost title: ");
		java.util.Collections.sort((List<Media>) collection, Media.COMPARE_BY_COST_TITLE);
		iterator = collection.iterator();
		while(iterator.hasNext()) {
			System.out.println(((Media)iterator.next()).getDetail());
		}
		
	}

}