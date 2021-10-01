
public class Room 
{
	static private int roomCount = 0;
	
	private int roomNum;
	private Guest guest;
	private int status;  //1 = available, 2 = reserved, 3 = booked
	
	public Room()
	{
		roomCount++;//Increment room count
		
		roomNum = roomCount;//Setting unique room count equal to room Number
		
		guest = null;
		
		status = 1;
	}
	
	public void reserveRoom(Guest newGuest) 
	{
		this.guest = newGuest;
		
		this.status = 2;
	} 
	
	public void bookRoom(Guest newGuest) 
	{
		this.guest = newGuest;
		
		this.status = 2;
	}
	
}
