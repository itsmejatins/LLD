package example.abstractFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import example.abstractFactory.elements.Button;
import example.abstractFactory.elements.TextBox;
import example.abstractFactory.factories.Factory;
import example.abstractFactory.factories.GuiFactory;

public class Application
{
	static class FastScanner
	{
		private BufferedReader br;
		private StringTokenizer st;

		public FastScanner(InputStream stream)
		{
			try
			{
				br = new BufferedReader(new InputStreamReader(stream));
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}

		public String next()
		{
			while (st == null || !st.hasMoreTokens())
			{
				try
				{
					st = new StringTokenizer(br.readLine());
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		public int nextInt()
		{
			return Integer.parseInt(next());
		}
	}

	public static void main(String[] args)
	{
		FastScanner sc = new FastScanner(System.in);
		System.out.println("Enter your OS");
		String os = sc.next();
		Factory factory = GuiFactory.getFactory(os);

		Button button = factory.getButton();
		TextBox tb = factory.getTextBox();

		button.press();
		tb.showText();

	}
}
