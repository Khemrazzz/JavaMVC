
public class StudentController {
	//Model object 
	//View object
	private Student model;
	private StudentView view;
	
	public StudentController(Student model, StudentView view) {
		this.model = model;
		this.view = view;
		// TODO auto generated constructor stub

	}
	//control model object
	public void setStudentName(String name) {
		model.setName(name);
		
	}
	public void setStudentRollNum(String rollNo) {
		model.setRollNo(rollNo);
	}
	public String getStudentRollNum() {
		return model.getRollNo();
	}
	public String getStudentname() {
		return model.getName();
	}
	
	//control view object 
	public void updateView() {
		view.printStudentDetails(model.getName(), model.getRollNo());
	}
	
}
