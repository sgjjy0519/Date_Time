package exercise;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ex04 {

	public static void main(String[] args) {
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		date1.set(1996,4,19);
		date2.set(2021,4,13);
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println("생일="+df.format(new Date(date1.getTimeInMillis())));
		System.out.println("생일="+df.format(new Date(date2.getTimeInMillis())));
		
		long difference = (date2.getTimeInMillis() - date1.getTimeInMillis())/1000;
		
		System.out.println(difference / (24*60*60)+"일");
	}

}
