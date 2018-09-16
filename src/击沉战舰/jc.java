package 击沉战舰;

import java.util.ArrayList;

public class jc
{
  private static ArrayList<String> locations = new ArrayList<>(7);

 
   public void set(ArrayList<String> locs) {

   	locations = locs;
	}

public String check(String stringGuess) {
	String result = "Miss";

	int index = locations.indexOf(stringGuess);

	if (index >= 0) {
		locations.remove(index);
	if(locations.isEmpty())
	{
		result = "Kill";
	} else {
        result = "Hit";
	}
	}
	System.out.println(result);
	return result;
  }

	public static void main(String[] args) {
		int numofguess = 0;
		GameHelper helper = new GameHelper();
		jc dot = new jc();
		int m = (int)(Math.random() * 7);
		
		String a = new String (String.valueOf(m));
		String b = new String(String.valueOf(m+1));
		String c = new String(String.valueOf(m+2));
		
		locations.add(a);
		locations.add(b);
		locations.add(c);
		dot.set(locations);
		
		boolean isAlive =true;

		while(isAlive == true) {
			String guess = helper.input("Enter a coordinate bewteen 0~9");
			String result = dot.check(guess);
			numofguess++;
			if(result.equals("Kill")){
				isAlive = false;
				System.out.println("You've fired " + numofguess + " times");
			}
		}

	}


}//��
