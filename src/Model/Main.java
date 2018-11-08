package Model;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args) {
        // write your code here
        System.out.println("Welcome to GradeImprovment System");
        Manager manager = new Manager();
        Scanner reader = new Scanner(System.in);
        while (true) {
            System.out.print("/ ");
            String input = reader.nextLine();
            if (input.equals("done")) break;
            String[] argArr = input.split(" ");
            try {
                if (argArr.length > 1)
                    manager.excuteCommand(argArr[0], argArr[1]);
                else
                    manager.excuteCommand(argArr[0], null);
            }
            catch (Exception e){
                System.out.println("Illegal command");
            }
        }
    }

}
