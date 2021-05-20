import java.util.Calendar;

public class ex02 {

	public static void main(String[] args) {
		final String[] DAY_OF_WEEK = {"","일","월","화","수","목","금","토"}; //배열은 0부터
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		//month의 경우 0부터 시작하기 때문에 7월인 경우 6으로 지정해야함
		//date1.set(2020, Calendar.JULY,2); 처럼 할 수도 있음.
		date1.set(2020, 6, 2); //2020년 7월 2일로 날짜설정
		System.out.println("date1은 "+ toString(date1)
					+DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)]+"요일이고,");
		
		System.out.println("오늘(date2)은 "+ toString(date2)
					+DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)]+"요일이다");
		
		// 두 날짜간의 차이, getTimeMillis() 천분의 일초 단위로 변환해야한다.
		long difference = (date2.getTimeInMillis() - date1.getTimeInMillis())/1000;
		
		System.out.println("그 날(date1)부터 지금(date2)까지 "+difference+"초가 지났습니다.");
		
		System.out.println("일 수(day)로 계산하면  "+difference/(24*60*60)+"일입니다.");
		//1일 = 24(시) * 60(분) * 60(초)
	}

	private static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"년 "+(date.get(Calendar.MONTH)+1)
										+"월 "+date.get(Calendar.DATE)+"일 ";
	}

	

}
