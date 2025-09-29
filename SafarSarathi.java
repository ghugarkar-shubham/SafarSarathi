package SafarSarathi;
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
		System.out.println("\n  DRIVER INFO  \n");
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
 		System.out.println("\n  CAB DETAILS  \n");
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
 	public int getCapacity(){
 		return capacity;
 	}
}

class SafarSarathi{

	public static void main(String[] args) {

		SafarSarathiDriver uber = new SafarSarathiDriver();
		uber.homeModule();
	}
}

class Passenger{

	private String name;
	private long contact;
	private String email;
	private String pickUpLocation;
	private String dropLocation;
	private int seats;

	Passenger(String name, long contact, String email, String pickUpLocation, String dropLocation, int seats)
	{
		super();
		this.name = name;
		this.contact = contact;
		this.email = email;
		this.pickUpLocation = pickUpLocation;
		this.dropLocation = dropLocation;
		this.seats = seats;
	}
	public String getName(){
 		return name;
 	}
 	public void setName(String newName){
 		this.name = newName;
 	}
 	public long getContact(){
 		return contact;
 	}
 	public void setContact(long newContact){
 		this.contact = newContact;
 	}
 	public String getEmail(){
 		return email;
 	}
 	public void setEmail(String newEmail){
 		this.email = newEmail;
 	}
 	public String getPick(){
 		return pickUpLocation;
 	}
 	public void setPick(String newPick){
 		this.pickUpLocation = newPick;
 	}
 	public String getDrop(){
 		return dropLocation;
 	}
 	public void setDrop(String newDrop){
 		this.dropLocation = newDrop;
 	}
 	public int getSeats(){
 		return seats;
 	}
 	public void setSeats(int newSeats){
 		this.seats = newSeats;
 	}
}

class Ride {
    String passengerName;
    String pickUp;
    String drop;
    String cabId;
    double fare;
    String status; 

    Ride(String passengerName, String pickUp, String drop, String cabId, double fare, String status) {
        this.passengerName = passengerName;
        this.pickUp = pickUp;
        this.drop = drop;
        this.cabId = cabId;
        this.fare = fare;
        this.status = status;
    }

    public void showRide() {
        System.out.println("\nRide Details\n");
        System.out.printf("Passenger :%s  From :%s  To :%s  Cab :%s  Fare :%.2f rs  Status :%s",
        	passengerName, pickUp, drop, cabId, fare, status);
    }    
}

class SafarSarathiDriver{

	String [] stops = {"DECCAN", "MANAPA", "SHIVAJINAGAR", "SANGAMWADI", "YERWADA"};
	int [] distance = {0, 2, 4, 7, 9};

	ArrayList <Ride> rideHistoryList = new ArrayList<>();
	ArrayList <Cab> listCab = new ArrayList<>();
	Passenger passenger;
	Cab currentCab;
	{
		addPassenger();
	}

	{
		Cab cab1 = new Cab("MH-10-BF-2342", "sedan", new Driver("Ramesh Kumbhar", 9876543210L));
		Cab cab2 = new Cab("MH-13-AA-4323", "hatchback", new Driver("Ganesh Kumar", 8799553210L));
		Cab cab3 = new Cab("MH-14-DS-8665", "suv", new Driver("Suresh Bhale", 7797423265L));
		Cab cab4 = new Cab("MH-16-BE-1276", "sedan", new Driver("Santosh Kale", 9871234558L));
		Cab cab5 = new Cab("MH-17-WE-9775", "muv", new Driver("Ganesh Gore", 7637754443L));
		Cab cab6 = new Cab("MH-16-AS-8567", "hatchback", new Driver("kartik Gaikwad", 9134647598L));
		Cab cab7 = new Cab("MH-13-BS-1254", "sedan", new Driver("Durga Girme", 8257684335L));
		Cab cab8 = new Cab("MH-12-BG-0988", "suv", new Driver("Nitin Gandhale", 9387532567L));

		listCab.add(cab1);
		listCab.add(cab2);
		listCab.add(cab3);
		listCab.add(cab4);
		listCab.add(cab5);
		listCab.add(cab6);
		listCab.add(cab7);
		listCab.add(cab8);
	}

	public void addPassenger(){
		System.out.println("\n  PASSENGER DETAILS  \n");
		System.out.print("Name : ");
		String name = new Scanner(System.in).nextLine();
		System.out.print("Contatct : ");
		long contact = new Scanner(System.in).nextLong();
		System.out.print("Email : ");
		String email = new Scanner(System.in).nextLine();
		System.out.print("Pick Up Location : ");
		String pickUpLocation = new Scanner(System.in).nextLine().toUpperCase();
		System.out.print("Drop Location : ");
		String dropLocation = new Scanner(System.in).nextLine().toUpperCase();
		System.out.print("Seats : ");
		int seats = new Scanner(System.in).nextInt();

		if(seats >= 7){
			System.out.println("\n  NO RIDES AVAILABLE FOR YOU  \n"); 
			System.exit(0);
		}

		this.passenger = new Passenger(name, contact, email, pickUpLocation, dropLocation, seats);
	}

	public void homeModule()
	{

		for (; ; ) 
		{
		
			System.out.println("\n\n  *** WEL-COME ***  \n");
			System.out.println("1. Book A Ride.");
			System.out.println("2. Cancle A Ride.");
			System.out.println("3. Rider History.");
			System.out.println("4. LOGOUT");
			System.out.print("\nEnter your responce : ");
			int responce = new Scanner(System.in).nextInt();

			switch(responce){
				case 1 -> bookRide();
				case 2 -> cancleRide();
				case 3 -> rideHistory();
				case 4 -> {
					System.out.println("\n  THANK YOU FOR VISITING SAFARSARTHI!!  \n");
					System.exit(0);
				}
				default -> System.out.println("Invalid Responce.");
			}
		}
	}	
	
	public double caculateFair(String pickUp, String drop)
	{
		double fare = 0;
		int pickupIndex = -1;
		int dropIndex = -1;
		int index = 0;
		for(String point : stops)
		{
			if(pickUp.equals(point)){
				pickupIndex = index;
			}
			if(drop.equals(point)){
				dropIndex = index;
			}
			index++;
		}
		System.out.println("\nDistance : "+Math.abs(distance[dropIndex] - distance[pickupIndex])+" km");
		fare = Math.abs(distance[dropIndex] - distance[pickupIndex])*30;
		return fare;
	}	

	public void bookRide()
	{
		if(passenger == null){
			addPassenger();
		}
		System.out.println("\n  BOOK-A-RIDE MODULE  \n");
		for (Cab element : listCab ) 
		{
			if(element.getStatus() == "AVAILABLE" && element.getCapacity() >= passenger.getSeats())	
				element.getCabDetails();		
		}

		System.out.print("Enter an uberId : ");
		String uberId = new Scanner(System.in).next();
		boolean assump = false;

		for(Cab ele : listCab)
		{
			if(ele.getUberId().equals(uberId))
			{
				System.out.println("\n  YOUR RIDE HAS BEEN CONFIRMED  \n");
				currentCab = ele;
				assump = true;
				System.out.println("\nYour ride Details : ");
				ele.getCabDetails();
				System.out.println("Cab number : "+ele.getCabnumber());
				ele.getDriver().getDriver();
				double fair = caculateFair(passenger.getPick(),passenger.getDrop());
				System.out.println("Pick up : "+passenger.getPick());
				System.out.println("Drop : "+passenger.getDrop());
				System.out.println("\nFair is : "+fair+" rs\n");
				rideHistoryList.add(new Ride(passenger.getName(), passenger.getPick(), passenger.getDrop(), ele.getUberId(), fair, "COMPLETED"));
				break;
			}	
		}
		if(!assump)
			System.out.println("\n  INVALID UBERID  \n");
	}
	public void cancleRide()
	{
		if(currentCab == null){
			System.out.println("\n  NO RIDE HAS BEEN BOOK  \n");
			return;
		}
		System.out.println("\n  CANCLE-A-RIDE MODULE  \n");
		System.out.println("\nYour ride Details : ");
		currentCab.getCabDetails();
		System.out.println("Cab number : "+currentCab.getCabnumber());
		currentCab.getDriver();

		System.out.print("\nDo you want to Cancle a ride (Yes/No) : ");
		String response = new Scanner(System.in).next();
		if(response.equalsIgnoreCase("Yes")){
			System.out.println("\n  YOUR RIDE HAS BEEN CANCELED  \n");
			rideHistoryList.add(new Ride(passenger.getName(), passenger.getPick(), passenger.getDrop(), currentCab.getUberId(), 0, "CANCELED"));
			currentCab = null;
			passenger = null;
		}
	}
	public void rideHistory()
	{
	    if (rideHistoryList.isEmpty()) {
	        System.out.println("\nNo rides taken yet!\n");
	        return;
	    }

	    System.out.println("\nRide History\n");
	    for (Ride ride : rideHistoryList) {
	        ride.showRide();
	    }
	}
}