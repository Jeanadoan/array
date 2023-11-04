package arrays;
import java.util.ArrayList ;
import java.util.Collections;
public class stts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ArrayList <String> country = new ArrayList <>();
		country.add("USA");
		country.add("Canada");
		country.add("Mexico");
		System.out.println (country.size ());
				/*for (int i=0;i<country.size();i++) {
					System.out.println (country.get(i));
				
				}*/
				////System.out.println (country.get());
				/*country.set(2, "Brazil");
				Collections.sort (country);
				System.out.println (country);*/
		ArrayList <Integer> num = new ArrayList <>();
		num.add (10);
		num.add (15);
		num.add (9);
		num.add (11);
		num.add(30);
		Collections.sort (num);
		System.out.println (num);
	}

}
