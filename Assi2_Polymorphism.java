import java.util.Scanner;
public class hospital
{
	string name;
	int id;
	string phone;
	
	hospital(string name1,int id1,string phone1)
	{
		name=name1;
		id=id1;
		phone=phone1;
	}
	
	int display()
	{
		System.out.println("# Name : "+name);
		System.out.println("# ID : "+id);
		System.out.println("# Phone :"+phone);
	}
}

public class docter extends hospital
{
	string speci;
	int room_no;
	
	docter(string speci1,int room_no1)
	{
		speci=speci1;
		room_no=room_no1;	
	}
	
	int display()
	{
		System.out.println("Here are Docter Details");
		super.display();
		System.out.println("# Specialization : "+speci);
		System.out.println("# Room No. : "+room_no);
	}
}

public class nurse extends hospital
{
	string shift;
	int ward_no;
	
	nurse(string shift1,int ward_no1)
	{
		shift=shift1;
		ward_no=ward_no1;
	}
	
	int display()
	{
		System.out.println("# Shift : "+shift);
		System.out.println("# Ward No. : "+ward_no);
	}
}

public class recep extends 

public class student
{
	public static void main(String[]args)
	{
		Scanner obj1=new Scanner(System.in);
		System.out.println("1.Docter Details\n2.");
		System.out.println("Enter name of Student : ");
		String name=obj1.nextLine();
		System.out.println("Enter Marks of Subjects Physics , Maths , Chemistry  Respectively : ");
		int x=obj1.nextInt();
		int y=obj1.nextInt();
		int z=obj1.nextInt();
		details obj=new details(x,y,z);
		int sum1=obj.sum();
		float per1=obj.percen();
		System.out.println("# Name of Student : "+name);
		System.out.println("# Sum of PCM Subjects : "+sum1);
		System.out.println("# Percentage of PCM Subjects : "+per1);
	}

}
