package judge;

public class exercise_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int x=0; x<20; x++)
		{
			System.out.println("Value x = "+x);
		}
		
		System.out.println("******************");
		
		for (int x=0; x<20; ++x)
		{
			System.out.println("Vlaue x = "+x);
		}
		
		System.out.println("******************");
		
		int [] numbers = {10, 20, 30, 40, 50};
		for (int x : numbers)
		{
			System.out.print(x);
			System.out.print(" ,");
		}

	}

}
