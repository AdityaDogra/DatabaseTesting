package TestDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	private static final Logger logger= LoggerFactory.getLogger(BaseClass.class);
    static Connection con = null;
    protected Statement stmt;
    public static String DB_URL = "jdbc:mysql://localhost:3306/employee_personal_data";   
    public static String DB_USER = "root";
    public static String DB_PASSWORD = "root";
	@BeforeClass
	public void connectionSetup() {
		logger.info("Connecting to DB");
		System.out.println("connecting to db");
		  try{
             // String dbClass = "com.mysql.cj.jdbc.Driver";
             // Class.forName(dbClass).newInstance();
              Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
              stmt = con.createStatement();
              logger.info("Connected to DB");
              }
              catch (Exception e)
              {
                    e.printStackTrace();
              }
	}
	
	@AfterClass
	public void closeConnection() {
		logger.info("closing DB connection");
        if (con != null) {
        try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
        }
 }
		
		
	}
	

