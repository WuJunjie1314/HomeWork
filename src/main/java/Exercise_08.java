import java.util.Scanner;

public class Exercise_08 {
    public static void main(String[] args) {

    }

    //第8节第一题
    public static void exerciseOne(){

        final int NUMBER_OF_PENTAGONALS = 100; // 一共输出100个数
        final int NUMBER_PER_LINE = 10; //一行输出十个数

        System.out.println("The first 100 pentagonal numbers, ten per line: ");
        for (int i = 1; i <= NUMBER_OF_PENTAGONALS; i++) {
            // 一行十个数，输出到第十个数时换行
            if (i % NUMBER_PER_LINE == 0) {
                System.out.printf("%7d\n", getPentagonalNumber(i));
            } else {
                System.out.printf("%7d", getPentagonalNumber(i));
            }
        }
    }
    /**
     * 按给定公式返回一个五角数
     */
    public static int getPentagonalNumber(int n) {
        return (n * (3 * n - 1)) / 2;
    }


    //第8节第二题
    public static void exerciseSecond(){

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a integer: ");
        long number = input.nextLong();

        // Display the sum of all the digits in the integer
        System.out.println("The sum of the digits in " + number + " is " +
                sumDigits(number));
    }

    /**
     * 取出n的每一位数并且求和，返回求和的值
     */
    public static long sumDigits(long n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10; //用取余取出最后一位数字
            n /= 10; //去掉最后一位数字
        }

        return sum;
    }


    //第8节第三题
    public static void exerciseThree(){

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        int number = input.nextInt();

        //通过判断的布尔值来控制输出的结果
        System.out.println(number + (isPalindrome(number) ? " is " : " is not ") +
                "a palindrome.");
    }

    /**
     * 判断是否是回文数
     */
    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }

    /**
     * 把number变成字符串再把字符串倒序排列，最后输出一个int值的数字
     */
    public static int reverse(int number) {
        String reverse = "";  // Holds reversed number
        String n = number + ""; // Convert number to string
        // Reverse string
        for (int i = n.length() - 1; i >= 0; i--) {
            reverse += n.charAt(i);
        }
        return Integer.parseInt(reverse); // Return reversed integer
    }


    //第8节第四题
    public static void exerciseFour(){

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        int number = input.nextInt();

        // 输出反向数
        reverseFour(number);
    }

    /**
     * 把数字从个位数开始一个一个取出然后倒置输出
     */
    public static void reverseFour(int number) {
        while (number > 0) {
            System.out.print((number % 10));
            number /= 10;
        }
        System.out.println();
    }

    //第8节第五题
    public static void exerciseFive(){

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter three numbers: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        // 按升序输出这三个数
        displaySortedNumbers(number1, number2, number3);
    }
    /**
     * 对传入的三个数进行升序排序
     */
    public static void displaySortedNumbers(
            double num1, double num2, double num3) {
        double temp; // 临时变量

        //先判断num2和num3是否有最小值，有的话交换到num1
        if (num2 < num1 && num2 < num3) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        } else if (num3 < num1 && num3 < num2) {
            temp = num1;
            num1 = num3;
            num3 = temp;
        }
        //再判断num2和num3，把小的值换到num2
        if (num3 < num2) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }

        System.out.println(num1 + " " + num2 + " " + num3);
    }

}
