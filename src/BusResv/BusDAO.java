package BusResv;

import java.sql.*;

public class BusDAO {//bus data access object
	public void displayBusInfo() throws SQLException{
		String query="SELECT *FROM bus";
		Connection con=DbConnection.getConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		while(rs.next()) {
			System.out.println("Bus No: "+rs.getInt(1));
			if(rs.getInt(2)==0)
				System.out.println("AC: NO");
			else{
				System.out.println("AC: YES");
			}
			System.out.println("Capacity: "+rs.getInt(3));
		}
		
		System.out.println("-----------------------------");
		
	}
	
	public int getCapacity(int id) throws SQLException{
		String query="SELECT capacity from bus where id="+id;
		Connection con=DbConnection.getConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();//initially curser points to col name
		return rs.getInt(1);//rs contains only the capacity
	}
	
	

}
