package Aims;

public class Aims {

	public static void main(String[] args) {
        // TODO Auto-generated method stub;
		Order anOrder = new Order();
        
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        // add the dvd to the order
        anOrder.addDigitalVideoDisc(dvd1);
        
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);
        
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 19.95f);
        anOrder.addDigitalVideoDisc(dvd3);
        
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Harry Potter and the Deathly Hallows II", "Fantacy","David Yates",175, 26.5f);
        anOrder.addDigitalVideoDisc(dvd4);
        
       
        anOrder.removeDigitalVideoDisc(dvd4);
        
        //print total cost
        System.out.print("Total Cost is: ");
        System.out.println(anOrder.totalCost());
    }
}
