package tcAndUtils;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {
	
	
	
	@DataProvider(name="dp1")
	public static Object [][] getData(Method m){
		
		Object[][] data = null;
		
		if(m.getName().equals("testLogin")) {
		
		data = new Object[2][2];
		data[0][0] = "Jackie";
		data[0][1] ="123ert";
		
		
		data[1][0] = "Anil";
		data[1][1] ="987bgr";
		
		
		}
		else if(m.getName().equals("testUserReg")){
			
			data = new Object[2][3];
			data[0][0] = "Jackie";
			data[0][1] ="Shroff";
			data[0][2] ="jack@hotmail.com";
			
			
			data[1][0] = "Anil";
			data[1][1] ="Kapoor";
			data[1][2] ="anil@rediffmail.com";
			
			
			
		}
		return data;
		
	}	
	
	@DataProvider(name="dp2")
	public static Object [][] getData2(){
		
		Object[][] data = new Object[2][3];
		data[0][0] = "Jackie";
		data[0][1] ="Shroff";
		data[0][2] ="jack@hotmail.com";
		
		
		data[1][0] = "Anil";
		data[1][1] ="Kapoor";
		data[1][2] ="anil@rediffmail.com";
		
		return data;		
		
	}	

}
