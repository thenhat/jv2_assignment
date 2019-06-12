package jv2_assignment1;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextArea;

import java.util.Collections;
import java.util.Comparator;


public class StudentList {
    public TextArea txtList;

    public boolean flag = true;

    public void toAdd() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("StudentInput.fxml"));
        jv2_assignment1.Main.mainStage.getScene().setRoot(root);
    }

    public StudentList() {
    }

    public void sort() {
        if (flag) {
            Collections.sort(jv2_assignment1.Main.studentList, new Comparator<jv2_assignment1.Student>() {
                @Override
                public int compare(jv2_assignment1.Student o1, jv2_assignment1.Student o2) {
                    return (o1.mark.compareTo(o2.mark));
                }
            });
        } else {
            Collections.sort(jv2_assignment1.Main.studentList, new Comparator<jv2_assignment1.Student>() {
                @Override
                public int compare(jv2_assignment1.Student o1, jv2_assignment1.Student o2) {
                    return (o2.mark.compareTo(o1.mark));
                }
            });
        }
        flag = !flag;
        String str = "";
        for (Student s : Main.studentList) {
            str += s.name + " - " + s.age + " - " + s.mark + "\n";
        }
        txtList.setText(str);
    }
}

