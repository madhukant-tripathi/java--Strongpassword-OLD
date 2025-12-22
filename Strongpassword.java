import java.util.*;
class Strongpassword
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Password\nIt should contain atleast 12 character\nIt should contain atleast 4 Upper Case Character\nIt should contain atleast 4 Lower Case Character\nIt should contain atleast 1 Unique Character\nIt should contain atleast 3 Digits\n");
		String a[]=new String[1];
		int c=0,f=0,u=0,d=0;
		for(int i=0;i<1;)
		{
			c=0;f=0;u=0;d=0;
			a[i]=sc.nextLine();
			if(a[i].length()<12)
			{
				System.out.println("\nEnter again it should contain atleast 12 characters\n");
				continue;
			}
			else
			{
				for(int j=0;j<a[i].length();j++)
				{
					char ch=a[i].charAt(j);
					if((int)ch>=65&&(int)ch<=90)
						c++;
					else if((int)ch>=97&&(int)ch<=122)
						f++;
					else if((int)ch>=48&&(int)ch<=57)
						d++;
					else if((int)ch==32)
					{
					}
					else
						u++;
				}
				if(c<=3||f<=3||d<=2||u==0)
				{
					System.out.println("\nEnter Again");
					if(c<=3)
						System.out.println("It should contain atleast 4 Upper Case Character\nPassword is weak\n");
					else if(f<=3)
						System.out.println("It should contain atleast 4 Lower Case Character\nPassword is weak\n");
					else if(d<=2)
						System.out.println("It should contain atleast 3 Digits\nPassword is weak\n");
					else if(u==0)
						System.out.println("It should contain atleast 1 unique Character\nPassword is weak\n");
				}
				else
				{
					System.out.println("\nPassword is Strong : "+a[i]);
					i++;
				}
			}
		}
	}
}