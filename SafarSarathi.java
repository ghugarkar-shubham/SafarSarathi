import java.util.Scanner;
import java.util.ArrayList;
class Driver{

	private String name;
	private long contact;

	Driver(String name, long contact){
		this.name = name;
		this.contact = contact;
	}

	public void getDriver(){
		System.out.println("\n Driver Info");
		System.out.println("Driver name : "+name);
		System.out.println("Contact : "+contact+"\n");
	}
}
class Cab{

	static int id = 35345;
	private Driver driver;
	private String number;
	private String uberId;
	private String type;
	private int capacity;
	private String location = "DECCAN";
	private String status = "AVAILABLE";
	{
		this.uberId = "UBER" + id++;
	}

	String [] typeVehicle = {"hatchback", "sedan", "suv", "muv"};
	int [] vehicleCapacity = {3, 4, 5, 6};

	Cab(String number, String type, Driver driver)
	{
		this.number = number;
		this.type = type.toLowerCase();

		int index = 0;
		for(String element : typeVehicle){
		    if(type.toLowerCase().equals(element)){
		        break;
		    }
		    index++;
		}
		this.capacity = vehicleCapacity[index];
		this.driver = driver;
 	}

 	public void getCabDetails(){
 		System.out.println("\n CAB DETAILS ");
 		System.out.println("Uber Id : "+uberId);
 		System.out.println("Location : "+location);
 		System.out.println("Status : "+status);
 		System.out.println("Type : "+type);
 		System.out.println("Capacity : "+capacity);
 		System.out.println();
 	}

 	public String getCabnumber(){
 		return number;
 	}
 	public Driver getDriver(){
 		return driver;
 	}
 	public String getStatus(){
 		return status;
 	}
 	public void setStatus(String newStatus){
 		this.status = newStatus;
 	}
 	public String getUberId(){
 		return uberId;
 	}
}

class Uber
{

	ArrayList <String> list = new ArrayList<>;
	{
		Cab cab1 = new Cab("MH-10-BF-2342", "sedan", new Driver("Ramesh Kumbhar", 9876543210L));
		Cab cab2 = new Cab("MH-13-AA-4323", "hatchback", new Driver("Ganesh Kumar", 8799553210L));
		Cab cab3 = new Cab("MH-14-DS-8665", "suv", new Driver("Suresh Bhale", 7797423265L));
		Cab cab4 = new Cab("MH-16-BE-1276", "sedan", new Driver("Santosh Kale", 9871234558L));
		Cab cab5 = new Cab("MH-17-WE-9775", "muv", new Driver("Ganesh Gore", 7637754443L));
		Cab cab6 = new Cab("MH-16-AS-8567", "hatchback", new Driver("kartik Gaikwad", 9134647598L));
		Cab cab7 = new Cab("MH-13-BS-1254", "sedan", new Driver("Durga Girme", 8257684335L));
		Cab cab8 = new Cab("MH-12-BG-0988", "suv", new Driver("Nitin Gandhale", 9387532567L));

		list.add(cab1);
		list.add(cab2);
		list.add(cab3);
		list.add(cab4);
		list.add(cab5);
		list.add(cab6);
		list.add(cab7);
		list.add(cab8);
	}

	public void homeApplication()
	{

		for (; ; ) {
		
		System.out.println("\n WEL-COME \n");
		System.out.println("1. Book A Ride.");
		System.out.println("2. Cancle A Ride.");
		System.out.println("3. Rider History.");
		System.out.println("4. LOGOUT");
		System.out.print("\nEnter your responce : ");
		int responce = new Scanner(System.in).nextInt();

	}
}
class SafarSarathi{

	public static void main(String[] args) {

		Uber uber = new Uber();
		uber.homeApplication();
	}
}
