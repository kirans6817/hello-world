//Kiran Sharma
//CSC 162-01
//Lab 5-B

public class Asterisks
{
	public void pattern(int n, int i)
		{
			Double num = Math.log(n) / Math.log(2);
			int number = num.intValue();
			if (number == 0)
			{
				for (int k = 0; k < i; k++) System.out.print(" ");
				for (int k = 0; k < n; k++) System.out.print("* ");
				System.out.println();
			}
			else
			{
				Double newNum = Math.pow(2.0, num-1);
				int nextNumber = newNum.intValue();
				pattern(nextNumber, i);
				for (int k = 0; k < i; k++) System.out.print(" ");
				for (int k = 0; k < n; k++) System.out.print("* ");
				System.out.println();
				i = i + (number * 2);
				pattern(nextNumber, i);
			}
		}
	}