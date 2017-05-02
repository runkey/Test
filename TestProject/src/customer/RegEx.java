package customer;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegEx 
{

	public static void main(String[] args)

	{      

		String str="test123data&$";
		List<String> output = new ArrayList<String>();
		Matcher match = Pattern.compile("[a-z]+|[^a-zA-Z0-9]+|[0-9]+").matcher(str);
		while (match.find())
		{
			output.add(match.group());

		}
		System.out.println(output);


	}
}