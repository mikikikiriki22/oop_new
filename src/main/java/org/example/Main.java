package org.example;

<<<<<<< HEAD
import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        System.out.println("Wellcome to my little calculator. Do what you want ;)");

        Scanner reader = new Scanner (System.in);

        while(true) {

            System.out.println("enter the command. You may use +, - and quit! ");

            String command = reader.nextLine();

            if (command.equals("quit")) {

                break;
            }
            System.out.println("enter the numbers:");
            int a = Integer.parseInt(reader.nextLine());
            int b = Integer.parseInt(reader.nextLine());

            if (command.equals("+")) {
                System.out.println("Result is: " + (a+b));
            }
            else if (command.equals("-")) {
                System.out.println("Result is: " + (a-b));
            }
            else {
                System.out.println("unknown command :/");
            }





        }
        System.out.println("thank you bye, bye ;)");
    }
}
=======
/*public class Main {
      public static void main(String[] args) {

          System.out.printf("Hello world, whats up!");
          System.out.printf("Hello world, whats up!");
          System.out.printf("Hello world, whats up!");


      }
  }*/



/* task_1
package org.example;
import java.util.Scanner;
public class Main
{
    public static void main(String[]args)
    {
        String password;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the password: ");
        password = s.nextLine();
        if(password.equals("carrot"))
        {
            System.out.println("Right!");
            System.out.println("The secret is: jryy qbar");
        }
        else
        {
            System.out.println("Wrong!");
        }

    }
}*/

//task_2

/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read;

        System.out.println("Enter the first number: ");
        read = reader.nextInt();
        sum += read;

        System.out.println("Enter the second number: ");
        read = reader.nextInt();
        sum += read;

        System.out.println("Enter the third number: ");
        read = reader.nextInt();
        sum += read;


        System.out.println("The sum of these three numbers is: " + sum);


    }
}*/


//task_3

/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.println("enter the number: ");
            int read = Integer.parseInt(reader.nextLine());
            if (read == 0) {
                break;
            } else {
                sum += read;
                System.out.println("Sum now: " + sum);
            }

        }
        System.out.println("Sum in the end:" + sum);
    }
}*/


//task 4

/*import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the firstt number: ");
        int firstNumber = reader.nextInt();

        System.out.println("Enter the lastt number: ");
        int lastNumber = reader.nextInt();

        System.out.println("Numbers between " + firstNumber + " and " + lastNumber + "is :");

        int numberNow = firstNumber + 1;

        while (numberNow < lastNumber) {
            System.out.println(numberNow);
            numberNow++;
        }
    }
}*/


//task 5

/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of n: ");
        int n = scanner.nextInt();

        int sum = 0;

        for (int i = 0; i <= n; i++) {
            int term = (int) Math.pow(2, i);
            sum += term;
        }

        System.out.println("The sum of the series is: " + sum);

    }
}*/

//task 6

//note: this is used with additional methods, doesn"t give any logic here, but will be usefull in larger codes!!!

/*public class Main {
    public static void main(String[] args) {
        printText();   // here we are calling the method that we defined down there!!
    }
    public static void printText(){

        System.out.println("In the beggining there were the swamp, the hoe and Java.");

    }
}*/

// task 7

/*public class Main {
    public static void main(String[]args) {
        printStars(5);
        printStars(3);
        printStars(9);                                    //same here: additional method printStars(int count(to count number of stars)) was made.
                                                                //this is more practical use!!!
    }

    public static void printStars(int count) {
        for(int i = 0; i<count; i++){
            System.out.print("**");
        }
        System.out.println();

    }
}*/

//task 8 pt 2

/*public class Main {
    public static void main (String[]args) {
        printStars(5);

    }

    public static void printStars(int n) {
        for (int i=1; i<=n; i++){

            for (int j=i; j<=n; j++) {
                System.out.print(" * ");
            }

            System.out.println();

        }

    }
}*/

//task 9

/*public class Main {
    public static void main (String[]args) {
        printStars(20);

    }

    public static void printStars(int n) {
        for (int i=1; i<=n; i++){

            for (int j=1; j<=i; j++) {
                System.out.print(" "+j+" ");
            }

            System.out.println();

        }

    }
}*/

//for the output to be changed like:
/*
1
22
333
4444
55555
 */
// wee must change j with i in the second for loop!



// discrete math task, last even nr. search
public class Main {
    public static void main(String[] args) {
        /*int[]array={1,3,5,7,8,9,10,12};

        System.out.println(lastEvenDigit(array));


    }

    public static int lastEvenDigit (int[]a) {
        for (int i = a.length-1; i>=0; i--) {
            if (a[i]%2==0) {
                return i;
            }
        }
        return 0;*/
    }

}
//I made some changes here!!!! :3
>>>>>>> 8d06a201dbba51b08ff70ee164760f9304e89af9
