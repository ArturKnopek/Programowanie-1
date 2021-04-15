package Lab3;

import Lab2.Task;
import lombok.*;

@NoArgsConstructor


public class Subtask extends Task {
    private String subtaskName;
    String getSubtaskName() {
        return null;
    }

     void SubtaskName(String subtaskName) {

    }

    @Override
    public String toString() {
        return "Subtask{" +
                "subtaskName='" + subtaskName + '\'' +
                '}';
    }



    public Subtask(String taskName, String taskDescription, Lab2.taskCategory taskCategory, String taskDateTimeStop, String subtaskName) {
        super(taskName, taskDescription, taskCategory);
        this.subtaskName = subtaskName;
    }

}
