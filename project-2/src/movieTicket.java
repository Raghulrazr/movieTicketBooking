import java.util.*;
public class movieTicket {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t=1;
		while(t!=3)
		{
			System.out.println("Select a servise");
			System.out.println("1.Booking");
			System.out.println("2.Cancelling");
			System.out.println("3.exit");
			int n=s.nextInt();
			switch(n)
			{
			case 1:
				Movies m = new Movies();
				int t1=s.nextInt();
				Movies m1=new Movies(t1);
				System.out.println("Enter your name: ");
				String name1=s.next();
				customerDetails cd1= new customerDetails(t1);
				System.out.println("Enter your seatno: ");
				int seat1=s.nextInt();
				customerDetails cd= new customerDetails(name1,seat1,t1);
				customerDetails cd2= new customerDetails();
				break;
			//case 2:
				//Cancel c= new Cancel();
				//break;
			case 3:
				t=3;
				break;
			}
		}
		System.out.println("Thanks for visiting");
	}
}
class Details
{
	public static String movie[]=new String[300];
	public static String name[]=new String[300];
	public static int seat[][]=new int[3][100];
	public static int con=0;
	public static int senum=0;
}
class Movies extends Details
{
	private String mov1="Dhasavatharam";
	private String mov2="Ratchasan";
	private String mov3="Super Delex";
	Movies()
	{
		System.out.println("Select A Movie");
		System.out.println("1.Dhasavatharam");
		System.out.println("2.Ratchasan");
		System.out.println("3.Super Delex");
	}
	Movies(int j)
	{
		switch(j)
		{
		case 1:
			movie[con]=mov1;
			break;
		case 2:
			movie[con]=mov2;
			break;
		case 3:
			movie[con]=mov3;
			break;
		}
	}
}
class customerDetails extends Details
{

	customerDetails(int no)
	{
		for(int i=1;i<=100;i++)
		{
			if(seat[no-1][i-1]==1)
				System.out.print("* ");
			else
				System.out.print(i+" ");
			if(i%10==0)
				System.out.println();
		}
	}
	customerDetails(String name2, int seat2,int no)
	{
		name[con]=name2;
		seat[no-1][seat2-1]=1;
		senum=seat2;
	}
	customerDetails()
	{
		System.out.println("Name = "+name[con]);
		System.out.println("seat no = "+senum);
		System.out.println("Movie = "+movie[con]);
		con++;
	}
}
