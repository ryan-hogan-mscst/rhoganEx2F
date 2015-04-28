package ex3f;

public class Employee {

	private String name;
	private int idNumber;
	private String department;
	private String position;
	
	@Override
	public String toString() {
		return "Id" + idNumber + ", " + name + ", department " + department + ", position " + position;
	}
	
	public String emp1() {
		name = "";
		idNumber = 0;
		department = "";
		position = "";
		return toString();
	}
	
	public String emp2(int idNum, String nameName) {
		idNumber = idNum;
		name = nameName;
		department = "";
		position = "";		
		return toString();
		
	}
	
	public String emp3(int idNumber2, String name2, String department2, String position2) {
		idNumber = idNumber2;
		name = name2;
		department = department2;
		position = position2;
		
		return toString();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIdNumber() {
		return this.idNumber;
	}
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	public String getDepartment() {
		return this.department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPosition() {
		return this.position;
	}
	public void setPosition(String position) {
		this.position = position;
	}

}

