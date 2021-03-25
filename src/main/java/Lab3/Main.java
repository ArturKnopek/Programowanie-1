package Lab3;

import Lab2.Task;
import Lab2.taskCategory;


public class Main {
    public static void main(String[] args) {
        Task zad1 = new Task("Sprzatanie", "Posprzatac pokoj", taskCategory.IN_PROGRESS);
        Subtask zad2 = (Subtask) new Task("Trening", "Pojsc na silownie", taskCategory.DONE);
        Task zad3 = (Task) new Object();
        Subtask zad4 = (Subtask) new Object();
    }

        public void getDetailInfo(Object o);
    





}
