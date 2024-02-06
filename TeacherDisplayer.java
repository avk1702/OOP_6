package OOP_6;

import java.util.List;

public class TeacherDisplayer implements UserDisplayer<Teacher> {
    @Override
    public void display(List<Teacher> list) {
        for (Teacher teacher : list) {
            System.out.println(teacher.getTeacherId());
        }
    }
}