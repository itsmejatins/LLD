package example.defaultMethods;

import java.util.List;

public abstract class AbstractCircle
{
	private String color;
	private List<String> allowedColors = List.of("red", "blue", "orange");

	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	public boolean isValidCircle()
	{
		return this.allowedColors.contains(this.color);
	}

}
