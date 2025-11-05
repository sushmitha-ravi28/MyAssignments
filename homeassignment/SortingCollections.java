package week4.day2.homeassignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingCollections {

	public static void main(String[] args) {
		
     //Step 1:Declare Array
		String[] company = {"Myridius","HCL","Cognizant","Caterpillar","TCS","Aspire Systems"};
		
	//Step 2 : Add Array to the List
		List<String> complist = new ArrayList<String>();
	
	//Step 3: Using For each loop
		for (String each : company) {
			complist.add(each);
		}
		Collections.sort(complist);
    //Step 4: Print values in reverse order
		for (int i = complist.size()-1; i >=0 ; i--) {
			System.out.println(complist.get(i));
		}
	}

}
