package OOP_6;

public interface UserCreator<T extends User> {
    void create(String firstName, String lastName, String middleName);
}