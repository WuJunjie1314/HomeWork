import java.util.Scanner;

public class Exercise_03 {

    public static void main(String[] args) {

        //第三节第一题
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a degree in Celsius: ");
        double celsius = input.nextDouble();

        // 把摄氏度转换为华氏度并输出结果
        double fahrenheit = 9.0 / 5 * celsius + 32;
        System.out.println(celsius + " Celsius is " + fahrenheit
                + " Fahrenheit");


        // 第三节第二题
        Scanner input2 = new Scanner(System.in);
        System.out.print("Please enter the radius and length: ");
        double radius = input2.nextDouble();
        double length = input2.nextDouble();

        final double PI = 3.14159265359;
        // 计算面积和体积并输出结果
        double area = radius * radius * PI;
        double volume = area * length;
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);


        // 第三节第三题
        Scanner input3 = new Scanner(System.in);
        System.out.print("Please enter a value for feet: ");
        double feet = input3.nextDouble();

        // 一英尺等于0.305米
        final double METERS_PER_FOOT = 0.305;

        // 通过给定的公式英尺换算成米并输出结果
        double meters = feet * METERS_PER_FOOT;
        System.out.println(feet + " feet is " + meters + " meters");


        //第三节第四题
        Scanner input4 = new Scanner(System.in);
        System.out.print("Please enter a number in pounds: ");
        double pounds = input4.nextDouble();

        //一磅等于0.454 千克
        final double KILOGRAMS_PER_POUND = 0.454;

        // 通过给定的公式换算并输出结果
        double kilograms = pounds * KILOGRAMS_PER_POUND;
        System.out.println(pounds + " pounds is " + kilograms + " kilograms");


        //第三节第五题
        Scanner input5 = new Scanner(System.in);
        System.out.print("Please enter the subtotal and a gratuity rate: ");
        double subtotal = input5.nextDouble();
        double gratuityRate = input.nextDouble();

        // 通过给定计算方式计算并输出结果
        double gratuity = subtotal * (gratuityRate / 100);
        double total = subtotal + gratuity;
        System.out.println("The gratuity is $" + gratuity +
                " and total is $" + total);


        //第三节第六题
        Scanner input6 = new Scanner(System.in);
        System.out.print("Please enter a number between 0 and 1000: ");
        int number = input6.nextInt();

        // 先对10取余来取出个位数，然后除以10把个位数去掉，相同操作再取出十位数和百位数，最后相加得出结果
        int lessThan10 = number % 10;
        number /= 10;
        int tens = number % 10;
        number /= 10;
        int hundreds = number % 10;
        number /= 10;
        int sum = hundreds + tens + lessThan10;
        System.out.println("The sum of the digits is " + sum);


        //第三节第七题
        Scanner input7 = new Scanner(System.in);
        System.out.print("Please enter balance and interest rate (e.g., 3 for 3%): ");
        double balance = input7.nextDouble();
        double annualInterestRate = input7.nextDouble();

        //按照公式计算利息并输出结果
        double interest = balance * (annualInterestRate / 1200);
        System.out.println("The interest is " + interest);


        //第三节第八题
        Scanner input8 = new Scanner(System.in);
        System.out.print("Please enter the driving distance: ");
        double distance = input8.nextDouble();
        System.out.print("Please enter miles per gallon: ");
        double milesPerGallon = input8.nextDouble();
        System.out.print("Please enter price per gallon: ");
        double pricePerGallon = input8.nextDouble();

        // 按给定公式计算并输出结果
        double costOfDriving = (distance / milesPerGallon) * pricePerGallon;
        System.out.println("The cost of driving is $" + costOfDriving);
    }

}
