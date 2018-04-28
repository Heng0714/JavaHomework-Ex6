

public class AExecutive extends ACEmployee {
		private final int lunchAllowance = 1800;
		private final int trafficAllowance = 2000;
		private final int posDeputy = 5000;
		
		AExecutive(int empno, String name, String gender, String dofHire, String tel, String address, int monthSalary, int workhour ){
			super(empno,name,gender,dofHire,tel,address,monthSalary,workhour);
		}

		public int salaryFinal() {
			return super.salaryFinal()+ lunchAllowance + trafficAllowance +posDeputy;
		}




	}// end of class
