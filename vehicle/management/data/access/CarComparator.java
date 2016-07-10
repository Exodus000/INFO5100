package project.vehicle.management.data.access;

import java.util.Comparator;

import project.vehicle.management.data.Car;

public class CarComparator implements Comparator<Car> {

    private String attribute;
    //public CarComparator(String attribute) {
	//	super();
	//	this.attribute = attribute;
	//}
	public String getAttribute() {
        return attribute;
    }
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
    @Override
    public int compare(Car o1, Car o2) {
        if(attribute.equals("Price")) {
            return o1.getPrice().compareTo(o2.getPrice());
        }
        if(attribute.equals("Year")) {
            return o1.getYear().compareTo(o2.getYear());
        }
        return 0;
    }

}