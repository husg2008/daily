import java.util.Date;
import java.text.*;
public class DateDemo{
	public static void main(String args[]){
		Date date = new Date();
		System.out.println("date.toString():"+date.toString());

		Date dNow = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println("dNow:"+ft.format(dNow));
		
		System.out.printf("date:"+"%tc%n",date);
	}
}
