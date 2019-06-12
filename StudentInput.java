package jv2_assignment1;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

public class StudentInput {
    public TextField txtName;
    public TextField txtAge;
    public TextField txtMark;

    public void addStudent() {
    String name = txtName.getText();
    Integer age = Integer.parseInt(txtAge.getText());
    Float mark = Float.parseFloat(txtMark.getText());

    jv2_assignment1.Student s = new jv2_assignment1.Student(name, age, mark);
    jv2_assignment1.Main.studentList.add(s);
    txtName.setText("");
    txtAge.setText("");
    txtMark.setText("");

        for (Student v: jv2_assignment1.Main.studentList){
            System.out.println(v.name + " - " + v.age + " - " + v.mark);
        }
    }

    public void toList() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("StudentList.fxml"));
        Main.mainStage.getScene().setRoot(root);
    }
}
