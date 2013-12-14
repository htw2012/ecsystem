package java.util;

public class TestArrayList {

	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<String>(2);
		
		list.add("fufh");
		list.add("3");
		
		list.add("d");


		for(int i=0;i<list.size()-1;i++){
			System.out.println(list.get(i));
		}
	}
}
