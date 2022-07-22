package encapsulation;

public class Emp {

	//Properties / Variable
		String Ename;
		int Eid;
	private	double Esalary;
		//Getter method 
		public double getSalary()
		{
			return Esalary;
		} 
		
		// Setter method
		public void setEsalary(double b)
		{
			this.Esalary=b;
		}
		
		// Behavior/Method
		public void work()
		{
			System.out.println("Working Employee name is :" +Ename );
			
		}
		public void details()
		{
			System.out.println("Working Employee name is :" +Ename );
			System.out.println("Working Employee id :" +Eid );
			System.out.println("Working Employee Salary is :" +Esalary);
			
			}
		
		//Parameterized Constructor
		
		Emp(String n,int i,double s)
		{
			this.Ename=n;
			this.Eid=i;
			this.Esalary=s;
			}
		}
//		class Comp extends Emp
//		{
//		public static void main(String[] args)
//		{
//			Emp e =new Emp("Pallavi",1,3999999);
//			System.out.println(e.getEsalary);
//		    e.getEsalaray(10000);
//		    System.out.println(e.getEsalary);
//		
//	
//}
