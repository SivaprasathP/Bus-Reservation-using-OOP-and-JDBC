package BusResv;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.SQLException;
public class Booking {
	String passengerName;
	int busNo;
	Date date;
	
	Booking(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of passenger: ");
		passengerName=sc.next();
		System.out.println("Enter Bus Number: ");
		busNo=sc.nextInt();
		System.out.println("Enter Date(dd-mm-yyyy): ");
		String dateInput=sc.next();
		//intially we get the date as string and then format it for Date object
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");//MM for month and mm for minutes
		try {
			date=dateFormat.parse(dateInput);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public boolean isAvailable() throws SQLException{
		BusDAO busdao=new BusDAO();
		BookingDAO bookingdao=new BookingDAO();
		int capacity=busdao.getCapacity(busNo);
		
		int booked=bookingdao.getBookedCount(busNo,date);
		
		return booked<capacity?true:false;
	}
}
