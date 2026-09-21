package Constructor;

public class copyConstructor {
	int empId;
    String empName;
    double salary;

    copyConstructor(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    // Copy constructor
    copyConstructor(copyConstructor e) {
        empId = e.empId;
        empName = e.empName;
        salary = e.salary;
    }

    void display() {
        System.out.println(empId + " " + empName + " " + salary);
    }

	public static void main(String[] args) {
		copyConstructor e1 = new copyConstructor(1, "Anil", 50000);

		copyConstructor e2 = new copyConstructor(e1);

        e1.display();
        e2.display();
		
	}

}
