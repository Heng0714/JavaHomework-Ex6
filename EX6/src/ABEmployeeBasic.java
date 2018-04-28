
public abstract class ABEmployeeBasic {

	private int empno;
	private String name;
	private String gender;
	private String dofHire;
	private String tel;
	private String address;
	
	
	ABEmployeeBasic(int empno, String name, String gender, String dofHire, String tel, String address ){
		this.empno=empno;
		this.name=name;
		this.gender=gender;
		this.dofHire=dofHire;
		this.tel=tel;
		this.address=address;		
	}// constructor


	public int getEmpno() {
		return empno;
	}
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public String getDofHire() {
		return dofHire;
	}
	public String getTel() {
		return tel;
	}
	public String getAddress() {
		return address;
	}

	//getter only
		
	public void display() {
		System.out.println("員工編號= " + empno);
		System.out.println("員工姓名= " + name);
		System.out.println("員工性別= " + gender);
		System.out.println("到職日= " + dofHire);
		System.out.println("連絡電話= " + tel);
		System.out.println("通訊地址= " + address);
	}
	
}
