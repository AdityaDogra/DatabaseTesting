package TestDB;

import java.sql.ResultSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class TestingDatabase extends BaseClass{

	private static final Logger logger = LoggerFactory.getLogger(TestingDatabase.class);
	@Test
	public void test1() {
		logger.info("Executing test");
		System.out.println("this is test class");
		 try{
             String query = "select * from employee_info;";
             logger.info(" Executing query");
             ResultSet res = stmt.executeQuery(query);
             logger.info("query Executed");
             while (res.next())
             {
                    System.out.print(res.getString(1));
             System.out.print("\t" + res.getString(2));
             System.out.print("\t" + res.getString(3));
             System.out.println("\t" + res.getString(4));
             }
             }
             catch(Exception e)
             {
                    e.printStackTrace();
             }     
		
	}
	
}
