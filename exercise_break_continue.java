package judge;

public class exercise_break_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] names = {"han", "wei", "li", "shu", "hua"};
//		Exercise break
		for (String x : names)
			{
				if (x == "li")
				{
					break;
				}
				System.out.println("name: "+x);
			}
		
		System.out.println("*******************************");
//		Exercise continue
		for (String y : names)
		{
			if (y == "li")
			{
				continue;
			}
			System.out.println("name: "+y);
		}

	}

}
