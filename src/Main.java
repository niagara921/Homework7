import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String firstName = "Ivan ";
        String middleName = "Ivanovich";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника —  " + fullName );

        // Задача 2

        System.out.println("Данные ФИО сотрудника для заполнения отчета —  " + fullName.toUpperCase());

        // Задача 3

        fullName = "Иванов Семён Семёнович";
        System.out.println(fullName.replace("ё","е"));



    }
}