
public class AAEmployeemain {

	public static void main(String[] args) {
		
// AExecutive(int empno, String name, String gender, String dofHire, String tel, String address, int monthSalary, int workhour )		
		ACEmployee e1= new ACEmployee(101,"John Doe","Male","2014-10-07","02-1234-5678","No. 87, no this street",24000,200);
		ACEmployee e2= new ACEmployee(102,"Mary Jan","Female","2017-02-13","0972-888-520","No.1 Broadway",78000,120);
		ADeputyOfficer e3 = new ADeputyOfficer(103,"LCPan","Female","1980-01-01","777","iiiedu",120000,260);
		ADeputyOfficer e4 = new ADeputyOfficer(104,"Armstrong","Male","1995-04-07","1-800-543-387","Pantagon",90000,158);
		AExecutive e5 = new AExecutive(105,"David Wu","Male","1976-04-07","0960","Home castle",250000,15);
		AExecutive e6 = new AExecutive(106,"Donald TruxP","Male","1970-04-07","+86111111","White House",1000000,300);
		
		
		
		e1.display();
		System.out.println("最終支付薪資=" + e1.salaryFinal());
		System.out.println("=======================================");
		e2.display();
		System.out.println("最終支付薪資=" + e2.salaryFinal());
		System.out.println("=======================================");
		e3.display();
		System.out.println("最終支付薪資=" + e3.salaryFinal());
		System.out.println("=======================================");
		e4.display();
		System.out.println("最終支付薪資=" + e4.salaryFinal());
		System.out.println("=======================================");
		e5.display();
		System.out.println("最終支付薪資=" + e5.salaryFinal());
		System.out.println("=======================================");
		e6.display();
		System.out.println("最終支付薪資=" + e6.salaryFinal());
		System.out.println("=======================================");
	}//end of main

}// end of class
