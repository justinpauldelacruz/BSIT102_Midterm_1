import java.util.Scanner;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

public class Delacruz 
{
    
    public static void main(String[] args) throws Exception{
    	Date date = new Date();
    	Scanner sc = new Scanner(System.in);
    	SimpleDateFormat format = new SimpleDateFormat("dd/M/yyyy");
    	Calendar calendar = new GregorianCalendar();
    	
    	System.out.print("Enter Your Birthday: ");
    	String input_bday = sc.nextLine();
    	Date bday = format.parse(input_bday);
    	
    	int year = calendar.get(Calendar.YEAR);
    	calendar.setTime(bday);
    	int byear = calendar.get(Calendar.YEAR);
    	
    	int age = year - byear;
    	System.out.print("My age : " + age);
    }
}
