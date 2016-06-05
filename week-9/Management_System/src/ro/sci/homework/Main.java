package ro.sci.homework;

/**
 * This class is the main class
 * 
 * @author Todea Mihaela
 *
 */
public class Main {

	public static void main(String[] args) throws WrongSeniorityException {
		
		CompanyManagementSystem employeeList = new CompanyManagementSystem();
		
		employeeList.add(new Employees("Cataleea", "manager", 11, true));
		employeeList.add(new Employees("Mihai", "manager", 15, true));
		employeeList.add(new Employees("Sorina", "manager", 13, true));
		employeeList.add(new Employees("Mihaela", "tester", 1, false));
		employeeList.add(new Employees("Andriana", "junior", 3, false));
		employeeList.add(new Employees("Antoniu", "manager", 9, true));
		employeeList.add(new Employees("Razvan", "manager", 10, true));
		employeeList.add(new Employees("Robert", "tester", 1, false));

		
		employeeList.printAllEmployees();
		employeeList.printJuniors();
		employeeList.printTester();
		employeeList.printManager();
		employeeList.printEmployeesWithParking();
		employeeList.printEmployeesWithNoParking();
		
	}

}
