package OOP_6;

import java.util.List;

public interface UserDisplayer<T extends User> {
    void display(List<T> list);
}
