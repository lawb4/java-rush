package lvl4;

/*
Программа учета имен
*/

public class NameRegister {
    private String fullName;

    public void setName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;

        this.fullName = fullName;     // Обращаюсь к переменной класса и присваиваю ей значение переменной метода.
        // this , т.к. переменная 'private String fullName' не статик ?
        // (не относится ко всему классу NameRegister)
    }

    public static void main(String[] args) {

    }
}
