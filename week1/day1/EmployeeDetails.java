package week1.day1;

public class EmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String employeeName = "Sushmitha Ravichandran";
     int employeeAge = 22;
     int employeeSalary = 150000;
     long employeePhoneNumber = 9876543210L;
     float employeeHike = 55.5f;
     char employeeGender = 'F';
     int pinCode = 600100;
     boolean acceptTerms = true;
     
     System.out.println("The Best Employee of the year award goes to:" +employeeName);
     System.out.println("Appraisal:"+ employeeSalary+" " +employeeHike);
     System.out.println("Profile Details:" +employeeGender+" "+employeeAge);
     System.out.println("Address and Mobile Number:" +employeePhoneNumber+" "+pinCode);
     System.out.println("T&c:"+acceptTerms );
     
     
     
	}

}
