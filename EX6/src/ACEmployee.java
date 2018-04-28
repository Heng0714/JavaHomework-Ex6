
public  class ACEmployee extends ABEmployeeBasic {

	private int monthSalary;
	private int workhour;
	
	
	ACEmployee(int empno, String name, String gender, String dofHire, String tel, String address, int monthSalary, int workhour ){
		super(empno,name,gender,dofHire,tel,address);
		this.monthSalary=monthSalary;
		this.workhour=workhour;
	}

	public int getMonthSalary() {
		return monthSalary;
	}

	public int getWorkhour() {
		return workhour;
	}
	public int salaryFinal() {
		int otPay=0;
		if (workhour > 160) {
			otPay=(int)((monthSalary/240)*1.5*(this.workhour - 160));
		} else {otPay=0;}
		return 	monthSalary + otPay;
	}
	
	public void display() {
		super.display();
		System.out.println("§Î¡~= "+ monthSalary);
	}
	
	
}//end of class
