
public class DemoMVCPattern {
	public static void main(String argds[]) {
		Student model = retrieveStudentFromDatabase();
		StudentView view = new StudentView();
		StudentController controller = new StudentController(model,view);
		
		controller.updateView();
		controller.setStudentName("Jam");
		controller.setStudentRollNum("66");
		controller.updateView();
		controller.getStudentname();
		controller.updateView();
		
	}
	
	private static Student retrieveStudentFromDatabase() {
		Student student = new Student();
		student.setName("Sam");
		student.setRollNo("34");
		return student;
		
		
	}

}
