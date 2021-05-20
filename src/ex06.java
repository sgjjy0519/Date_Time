import java.text.DecimalFormat;

public class ex06 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,###.##");  //패턴
		DecimalFormat df2 = new DecimalFormat("#.###E0");

		try {
			//System.out.println(Double.parseDouble("1,234,567.89")); 
			//에러(20라인) ,(콤마)만 제거하면 에러안생김
			//parseInt,ParseDouble 등 메서드는 ,를 갖고있는 문자열을 변환 못함
			
			
			//문자열을 숫자로(14라인) -> 다시 문자열로(16라인) --> parse 사용
			Number num = df.parse("1,234,567.89");        
 			System.out.print("1,234,567.89" + " -> ");
			
			double d = num.doubleValue(); //d=1234567.89
			System.out.print(d + " -> ");
			
			System.out.println(df2.format(num));//형식문자열로 --> format() 메서드 사용
		}catch(Exception e) {
			e.printStackTrace(); //java.lang.NumberFormatException 발생
		}
	}

}
