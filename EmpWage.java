public class EmployeeWage{

	public static void main(String[] args){
		int IsFulltime = 1;
		//System.out.println(Math.random());
		double empCheck=Math.floor(Math.random() * 10) % 2;
		if(empCheck==IsFulltime)
			System.out.println("Employee present");
		else
			System.out.println("Employee absent");
	}
}
class EmployeeWageUC2
{

	public static void main(String[] args)
	{
		int isfull=1;
		int emprateperhour=20;
		int emphours=0;
		int empwage=0;
		double empcheck=Math.floor(Math.random() *10)%2;
		System.out.print("Employee Wage :");
		if(empcheck==1)
		{
			emphours=8;
			empwage=emphours*emprateperhour;
			System.out.println(empwage);
		}
		else
		{
			System.out.println(empwage);
		}
	}
}
class EmployeeWageUC3
{

	public static void main(String[] args)
	{
		int isfull=1;
		int isparttime=2;
		int emprateperhour=20;
		int emphours=0;
		int empwage=0;
		double empcheck=Math.floor(Math.random() *10)%3;
		if(empcheck==isfull)
		{
			emphours=8;
		}
		else if(empcheck==isparttime)
		{
			emphours=4;
		}
		else
		{
			emphours=0;
		}
	empwage=emphours*emprateperhour;
        System.out.println("Employee Wage :"+empwage);
	}
}
