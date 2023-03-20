
public class Employee {
	String name;
	double salary;
	int workHours;
	int hireYear;
	
	Employee(String name, double salary, int workHours ,int hireYear){
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	public double tax(double salary){
		double taxPay;
		if(salary<1000) {
			return this.salary = salary;
		}else {
			return taxPay = salary * 0.03;
		}
		
	}
	
	public int bonus(int workHours) {
		int overtimeWage;
		if(workHours > 40) {
		return	overtimeWage = (workHours-40)*30;			
		}else
			return 0;
	}
	
	public double raiseSalary(int hireYear) {
		double Salaryİncrease;
		if(2021-hireYear < 10) {
			return Salaryİncrease = this.salary*0.05;
			
		}else if(2021-hireYear >=10 && 2021-hireYear<20 ) {
			return Salaryİncrease = this.salary*0.1;
			
		}else  {
			return Salaryİncrease = this.salary*0.15;
		} 
			
		
	}
	
	public String toString(){
		return "Name : " + this.name
				+"\nSalary : "+ this.salary
				+"\nWork Hours : "+ this.workHours
				+"\nHire Year : "+this.hireYear
				+"\nTax : "+ tax(this.salary)
				+"\nBonus : "+ bonus(this.workHours)
				+"\nSalary Raise : " +raiseSalary(this.hireYear)
				+"\nSalary with Tax and Bonus : "+ (this.salary - tax(this.salary) + bonus(this.workHours) )
				+"\nTotal Salary : " + ( this.salary - tax(this.salary) + bonus(this.workHours)+raiseSalary(this.hireYear)) ;
	
		
	}

}
