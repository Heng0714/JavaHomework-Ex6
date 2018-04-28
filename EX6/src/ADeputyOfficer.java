
public class ADeputyOfficer extends ACEmployee {
	private final int lunchAllowance = 1800;
	private final int posDeputy = 3000;
	
	ADeputyOfficer(int empno, String name, String gender, String dofHire, String tel, String address, int monthSalary, int workhour ){
		super(empno,name,gender,dofHire,tel,address,monthSalary,workhour);
	}

	public int salaryFinal() {
		return super.salaryFinal()+ lunchAllowance + posDeputy;
	}




}// end of class
