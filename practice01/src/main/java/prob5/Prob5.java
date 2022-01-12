package prob5;

public class Prob5 {

	public static void main(String[] args) {
		
		for(int i=1; i<=99; i++) {
			String value = String.valueOf(i);
			String result="";
			for(int j=0; j<value.length(); j++) {
			if(value.charAt(j)=='3' || value.charAt(j)=='6' || value.charAt(j)=='9') {
				result+="짝";
			}
			}
			if(!result.equals("")) {
				System.out.println(i + " " + result);
			}
		}
	}
}
