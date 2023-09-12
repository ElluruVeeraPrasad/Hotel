import java.util.*;
public class Hotel2 {

	public static void main(String[] args) {
		Menu m=new Menu();
		System.out.println("Select  the choice");
		Scanner sc=new Scanner(System.in);
		int choice=0;
		while(choice!=6)
		{
			m.menu();
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:{
				System.out.println("Enter the no.of plates");
		           int q=sc.nextInt();
		           m.takeOrder(choice-1, q);
		           break;
			}
			case 2:{
				System.out.println("Enter the no.of plates");
		           int q=sc.nextInt();
		           m.takeOrder(choice-1, q);
		           break;
			}
			case 3:{
				System.out.println("Enter the no.of plates");
		           int q=sc.nextInt();
		           m.takeOrder(choice-1, q);
		           break;
			}
			case 4:{
				System.out.println("Enter the no.of plates");
		           int q=sc.nextInt();
		           m.takeOrder(choice-1, q);
		           break;
			}
			case 5:{
				System.out.println("Enter the no.of plates");
				int q=sc.nextInt();
		           m.takeOrder(choice-1, q);
		           break;
			}
	          
			
		}
	  
		}
		m.bill();
		
	}

}

class Menu
{
	static String[] name={"idly","Dosa","Gobi","Puri","Rice"};
	static 
	{
		System.out.println("========WELCOME=========");
	}
	static  int order[][]=new int[5][2];
	Menu()
	{
		order[0][0]=10;
		order[1][0]=20;
		order[2][0]=30;
		order[3][0]=40;
		order[4][0]=50;
	}
	void menu()
	{
		System.out.println("1:Idly          Price=35");
		System.out.println("2:Dosa          Price=50");
		System.out.println("3.Gobi          Price=30");
		System.out.println("4.Puri          Price=40");
		System.out.println("5.Rice          Price=60");
		System.out.println("6.Exit and Generate Bill");
	}
	void takeOrder(int i,int q)
	{
		order[i][1]=order[i][1]+q;
	}
	void bill()
	{
		System.out.println("ITEMS   QUANTITY    PRICE       TOTAL");
		System.out.println("=========================================");
		int s=0;
		for(int i=0;i<5;i++)
		{
			if(order[i][1]>0)
			{
				s++;
				System.out.println(s+"."+name[i]+"   "+order[i][1]+"      "+order[i][0]+"          "+order[i][1]*order[i][0]);
			}
		}
		System.out.println("==========================================");
		int total=0;
		for(int z=0;z<5;z++)
		{
			total =total+order[z][0]*order[z][1];
			
		}
		System.out.println("Total cost="+total);
		System.out.println("GST=18%");
		System.out.println();
		System.out.println();
		float cost=total+total*0.18f;
		System.out.println("Final Bill="+cost);
		System.out.println("===============THANK YOU==================");
	}
	
}
