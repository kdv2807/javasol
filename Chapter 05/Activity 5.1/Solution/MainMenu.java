package university;

import java.util.Scanner;

public class MainMenu {

    public static void main(String[] args) {
        Scanner choice = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Student Details");
        System.out.println("2. Employee Details");
        System.out.println("Enter the choice: ");
        int a = choice.nextInt();
        switch (a) {
            case 1:
                Student st = new Student();
                st.getDetail();
                break;

            case 2:
                Employee emp1 = new Employee();
                emp1.getDetail();
                break;
        }
    }
}
