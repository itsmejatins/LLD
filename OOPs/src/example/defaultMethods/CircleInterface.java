package example.defaultMethods;

import java.util.List;

public interface CircleInterface
{
	public static List<String> allowedColors = List.of("red", "blue", "green");
	
	public abstract String getColor();
	
	public default boolean isValidCircle()
	{
		String color = getColor();
		return(allowedColors.contains(color));
	}

}
