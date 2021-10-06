import java.util.Scanner;

public class Exercise_04 {

    public static void main(String[] args) {

        exerciseEight();
    }

    //第四节第一题
    public static void exerciseOne(){
        // 随机产生一个1到12之间的数
        int month = (int)((Math.random() * 12) + 1);

        //用switch来检索出该数字相对应的月份
        switch (month)
        {
            case 1: System.out.println("January"); break;
            case 2: System.out.println("February"); break;
            case 3: System.out.println("March"); break;
            case 4: System.out.println("April"); break;
            case 5: System.out.println("May"); break;
            case 6: System.out.println("June"); break;
            case 7: System.out.println("July"); break;
            case 8: System.out.println("August"); break;
            case 9: System.out.println("September"); break;
            case 10: System.out.println("October"); break;
            case 11: System.out.println("November"); break;
            case 12: System.out.println("December");
        }
    }

    //第四节第二题
    public static void exerciseTwo(){

        Scanner input2 = new Scanner(System.in);
        System.out.print("Please enter today’s day: ");
        int day = input2.nextInt();
        System.out.print("Please enter the number of days elapsed since today: ");
        int daysElapsed = input2.nextInt();

        // 计算输入的这一天所代表的周几的数字，再通过switch选出结果
        int futureDay = (day + daysElapsed) % 7;

        System.out.print("Today is ");
        switch (day)
        {
            case 0: System.out.print("Sunday"); break;
            case 1: System.out.print("Monday"); break;
            case 2: System.out.print("Tuesday"); break;
            case 3: System.out.print("Wednesday"); break;
            case 4: System.out.print("Thursday"); break;
            case 5: System.out.print("Friday"); break;
            case 6: System.out.print("Saturday");
        }

        // 计算将来的一天所代表的周几的数字，再通过switch选出结果
        System.out.print(" and the future day is ");
        switch (futureDay)
        {
            case 0: System.out.println("Sunday"); break;
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday");
        }
    }

    //第四节第三题
    public static void exerciseThree(){

        Scanner input3 = new Scanner(System.in);
        System.out.print("Enter three integers: ");
        int number1 = input3.nextInt();
        int number2 = input3.nextInt();
        int number3 = input3.nextInt();

        // 设置一个临时变量，通过if语句来进行三个数字由小到大的排序
        int temp;
        if (number2 < number1 || number3 < number1)
        {
            if (number2 < number1)
            {
                temp = number1;
                number1 = number2;
                number2 = temp;
            }
            if (number3 < number1)
            {
                temp = number1;
                number1 = number3;
                number3 = temp;
            }
        }
        if (number3 < number2)
        {
            temp = number2;
            number2 = number3;
            number3 = temp;
        }
        System.out.println(number1 + " " + number2 + " " + number3);
    }

    //第四节第四题
    public static void exerciseFour(){

        Scanner input4 = new Scanner(System.in);
        System.out.print("Please enter the first 9 digits of an ISBN as integer: ");
        int isbn = input4.nextInt();

        // 取出第一位数字，然后通过取余把第一位数字去掉，再重复同样的操作把剩下的每一位数字都取出来
        int d1 = isbn / 100000000;
        int remainingDigits = isbn % 100000000;
        int d2 = remainingDigits / 10000000;
        remainingDigits %= 10000000;
        int d3 = remainingDigits / 1000000;
        remainingDigits %= 1000000;
        int d4 = remainingDigits / 100000;
        remainingDigits %= 100000;
        int d5 = remainingDigits / 10000;
        remainingDigits %= 10000;
        int d6 = remainingDigits / 1000;
        remainingDigits %= 1000;
        int d7 = remainingDigits / 100;
        remainingDigits %= 100;
        int d8 = remainingDigits / 10;
        remainingDigits %= 10;
        int d9 = remainingDigits;

        //用给定的公式计算得出最后一位数并按要求输出结果，最后一位数为10的的时候输出为"X"
        int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5
                + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
        System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5
                + d6 + d7 + d8 + d9);
        if (d10 == 10)
            System.out.println("X");
        else
            System.out.println(d10);
    }


    //第四节第五题
    public static void exerciseFive(){

        Scanner input5 = new Scanner(System.in);
        System.out.print("Please enter a three-digit integer: ");
        int number = input5.nextInt();

        // 取出第一位数字，再取出第三位数字
        int digit1 = (int)(number / 100);
        int remaining = number % 100;
        int digit3 = (int)(remaining % 10);

        //判断第一位和第三位数字是否相等，相等就是回文数，不相等就不是
        System.out.println(
                number + ((digit1 == digit3) ? " is a " : " is not a ") + "palindrome");
    }


    //第四节第六题
    public static void exerciseSix(){

        Scanner input6 = new Scanner(System.in);
        System.out.print("scissor (0), rock (1), paper (2): ");
        int user = input6.nextInt();

        // 随机产生 0,1,2 中的一个数，通过switch来输出剪刀石头布的结果
        int computer = (int)(Math.random() * 3);
        System.out.print("The computer is ");
        switch (computer)
        {
            case 0: System.out.print("scissor."); break;
            case 1: System.out.print("rock."); break;
            case 2: System.out.print("paper.");
        }

        System.out.print(" You are ");
        switch (user)
        {
            case 0: System.out.print("scissor"); break;
            case 1: System.out.print("rock"); break;
            case 2: System.out.print("paper ");
        }

        // 进行数值比较，来确认剪刀石头布游戏的结果
        if (computer == user)
            System.out.println(" too. It is a draw");
        else
        {
            boolean win = (user == 0 && computer == 2) ||
                    (user == 1 && computer == 0) ||
                    (user == 2 && computer == 1);
            if (win)
                System.out.println(". You won");
            else
                System.out.println(". You lose");
        }
    }


    //第四节第七题
    public static void exerciseSeven(){
        Scanner input7 = new Scanner(System.in);
        System.out.println("Enter three edges for a triangle:");
        System.out.print(" Edge 1 points x, y: ");
        double x1 = input7.nextDouble();
        double y1 = input7.nextDouble();
        System.out.print(" Edge 2 points x, y: ");
        double x2 = input7.nextDouble();
        double y2 = input7.nextDouble();
        System.out.print(" Edge 3 points x, y: ");
        double x3 = input7.nextDouble();
        double y3 = input7.nextDouble();

        // 任意两条边的和大于第三条边就是合法输入，判断是否输入合法
        boolean valid = (x1 + y1 > x3 + y3 && x2 + y2 > x3 + y3) ||
                (x1 + y1 > x2 + y2 && x3 + y3 > x2 + y2) ||
                (x3 + y3 > x1 + y1 && x2 + y2 > x1 + y1);

        //如果输入不合法，直接反馈结果并退出程序
        if (!valid)
        {
            System.out.println("Input is invalid.");
            System.exit(1);
        }

        // 判断输入合法后，通过公式计算三角形的三条边长，并输出结果
        double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
        double side2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
        double side3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);
        System.out.println("perimeter of triangle is " + (side1 + side2 + side3));
    }


    //第四节第八题
    public static void exerciseEight(){

        // 随机产生一个1-13里的整数，代表扑克牌的点数
        int rank = (int)((Math.random() * (14 - 1)) + 1);

        // 随机产生一个1-4里的整数，代表扑克牌的花色
        int suit = (int)(Math.random() * 4);

        // 通过switch来选出两个随机数相对应的扑克牌的点数和花色，并输出结果
        System.out.print("The card you picked is ");
        switch(rank)
        {
            case 1: System.out.print("Ace"); break;
            case 2: System.out.print(rank); break;
            case 3: System.out.print(rank); break;
            case 4: System.out.print(rank); break;
            case 5: System.out.print(rank); break;
            case 6: System.out.print(rank); break;
            case 7: System.out.print(rank); break;
            case 8: System.out.print(rank); break;
            case 9: System.out.print(rank); break;
            case 10: System.out.print(rank); break;
            case 11: System.out.print("Jack"); break;
            case 12: System.out.print("Queen"); break;
            case 13: System.out.print("King");
        }
        System.out.print(" of ");
        switch (suit)
        {
            case 0: System.out.println("Clubs"); break;
            case 1: System.out.println("Diamonds"); break;
            case 2: System.out.println("Hearts"); break;
            case 3: System.out.println("Spades");
        }
    }
}
