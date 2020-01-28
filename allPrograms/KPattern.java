package snippet;

public class KPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=6;
		for(int i=0;i<=12;i++)
		{
			for(int j=0;j<1;j++)
			{
				System.out.print("*");
			}
			for(int k=0;k<=6;k++)
			{
				if(k==count)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			if(i<=5)
			{
				count--;
			}
			else if(i>5)
			{
				count++;
			}
			System.out.println();
		}

	}

}
