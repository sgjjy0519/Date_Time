package exercise;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		String pattern = "yyyy/MM/dd";
		String pattern2 = "입력하신 날짜는 E요일입니다.";
		
		DateFormat df = new SimpleDateFormat(pattern);
		DateFormat df2 = new SimpleDateFormat(pattern2);
		
		Scanner s = new Scanner(System.in);
		
		Date inDate = null;
		
		do {
			System.out.println("날짜를  "+pattern+"의 형태로 입력해주세요.(입력예:2017/05/11)");
			
			try {
				System.out.println(">>");
				inDate = df.parse(s.nextLine()); //입력받은 날짜를 Date로 변환, ParseException이 발생할수있음.
				break;   
				//parse() 에서 예외가 발생하면 이 문장은 수행되지 않는다.
				//parse() 에서 예외가 발생하면 break문이 수행되지 않기때문에 예외가 발생하지 않을때까지 반복
				//지정된 yyyy/MM/dd 형식에 맞게 입력될 때까지 반복
			}catch(Exception e) {
				
			}
		}while(true);
		
		System.out.println(df2.format(inDate));
	}

}
