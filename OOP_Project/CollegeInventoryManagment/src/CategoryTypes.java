import java.util.ArrayList;

public class CategoryTypes 
{
	String catID;
	String dept;
	String name;
	static ArrayList<CategoryTypes> catARL = new ArrayList<CategoryTypes>();
	
	public CategoryTypes(String c, String d, String n)
	{
		catID=c; dept=d; name=n;
	}
	
	public static void catViewer(String c, String d, String n)
	{
		CategoryTypes r = new CategoryTypes (c,d,n);
		catARL.add(r);
	}
		
}
