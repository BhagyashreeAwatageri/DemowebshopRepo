package genericUtilities;

import java.sql.Connection;
//import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.jdbc.Driver;

import genericUtilities.IAutoConstants;

public class DatabaseUtility implements IAutoConstants{
	Driver dbdriver;
	Connection connection;
	Statement statement;
	ResultSet result;
	//ArrayList list;
	
	
	/**
	 * This method is used to read data from Database
	 * @param Query
	 * @param coloumnName
	 * @return
	 */
	public ArrayList readingDatafromDB(String Query, String coloumnName1, String coloumnName2) {
		ArrayList list = new ArrayList();
		try {
			statement=connection.createStatement();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			result=statement.executeQuery(Query);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			while(result.next()) {
				list.add(result.getString(coloumnName1)+" "+result.getString(coloumnName2));
			}
		}catch (SQLException e) {                                            
			e.printStackTrace();
		}
		return list;
	}
	
	/**
	 * This method is used to close the connection with Datbase
	 */
	public void closingDBConnection() {
		try {
			connection.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	/**This method id used to establish Connection with Database
	 * @return void
	 */
	public void establishingDBConnection() {
		// TODO Auto-generated method stub
		try {
			dbdriver = new Driver();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		try {
			DriverManager.registerDriver(dbdriver);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			connection=DriverManager.getConnection(DATABASE_URL, DATABASE_UN, DATABASE_PWD);
		}catch (SQLException e) {
			e.printStackTrace();
		}
	
	}

}



