import java.util.Scanner;

public class Exercise_09 {
    public static void main(String[] args) {

    }

    //第9节第一题
    public static void exerciseOne(){

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of students: ");
        int[] scores = new int[input.nextInt()];
        char[] grades = new char[scores.length];

        System.out.print("Please enter " + scores.length + " scores: ");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = input.nextInt();
        }

        //对分数进行等级分类
        getGrades(scores, grades);

        //遍历记录分数和记录等级的两个数组，全部输出
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Student " + i + " score is " +
                    scores[i] + " and grade is " + grades[i]);
        }
    }

    /**
     * 获取数组中的最大值作为最高分
     */
    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    /**
     * 按照题目要求对分数进行等级的分类，把数据放入另一个数组中
     */
    public static void getGrades(int[] scores, char[] grades) {
        int best = max(scores);
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= best - 10) {
                grades[i] = 'A';
            } else if (scores[i] >= best - 20) {
                grades[i] = 'B';
            } else if (scores[i] >= best - 30) {
                grades[i] = 'C';
            } else if (scores[i] >= best - 40) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
        }
    }


    //第9节第二题
    public static void exerciseTwo(){
        int[] array = new int[10];
        System.out.print("Enter ten integers: ");

        //接收控制台输入的数值，放到数组中
        fill(array);

        //遍历数组并输出
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    /**
     * 接收控制台输入的数值，放到数组中
     */
    public static void fill(int[] array) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
    }



    //第9节第三题
    public static void exerciseThree(){
        int[] counts = new int[100]; // Counts the occurrences of numbers

        System.out.print("Please enter the integers between 1 and 100: ");

        // Count occurrence of numbers
        count(counts);

        // Display results
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                System.out.println((i + 1) + " occurs " + counts[i] +
                        " time" + (counts[i] > 1 ? "s" : ""));
            }
        }
    }

    /**
     * Method count reads integers between 1 and 100 and counts the occurrences of each
     */
    public static void count(int[] counts) {
        Scanner input = new Scanner(System.in);
        int num; // 用来接收控制台输入的值
        do {
            num = input.nextInt();
            if (num >= 1 && num <= 100) {
                counts[num - 1]++;
            }
        } while (num != 0);
    }


    //第9节第四题
    public static void exerciseFour(){

        Scanner input = new Scanner(System.in);
        double[] values = new double[10];
        System.out.print("Please enter ten values of double type: ");
        for (int i = 0; i < values.length; i++) {
            values[i] = input.nextDouble();
        }

        System.out.println("The average value: " + average(values));
    }

    /* Overloaded method average accepts an integer array and returns its average */
    public static int average(int[] array) {
        int average = 0;
        for (int i : array) {
            average += i;  // Add indexed value to average
        }
        return average / array.length;
    }

    /* Overloaded method average accepts an double array and returns its average */
    public static double average(double[] array) {
        double average = 0;
        for (double i : array) {
            average += i; // Add indexed value to average
        }
        return average / array.length;
    }



    //第9节第五题
    public static void exerciseFive(){
        Scanner input = new Scanner(System.in); // Create a Scanner
        double[] numbers = new double[10]; // Create array of length 10

        // Prompt the user to enter ten numbers
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        // Display the minimum value
        System.out.println("The minimum number is: " + min(numbers));
    }

    /**
     * Method min returns the smallest element in an array of double values
     */
    public static double min(double[] array) {
        double min = array[0];  // The minimum value
        for (double i : array) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }



    //第9节第六题
    public static void exerciseSix(){
        Scanner input = new Scanner(System.in); // Create a Scanner
        int[] numbers = new int[5]; // Create an array of length 5

        // Prompt the user to enter five numbers
        System.out.print("Enter five numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        // Display the gcd
        System.out.println("The greatest common divisor is " + gcd(numbers));
    }

    /**
     * Method gcd returns the gcd of an unspecified number of integers
     */
    public static int gcd(int... numbers) {
        int gcd = 1;      // Initial gcd is 1
        boolean isDivisor;  // Is number a diviser

        for (int i = 2; i < min(numbers); i++) {
            isDivisor = true;
            for (int e : numbers) {
                if (e % i != 0) {
                    isDivisor = false;
                }
            }
            if (isDivisor) {
                gcd = i;
            }
        }
        return gcd;
    }

    /**
     * Method min returns the smallest integer in an array
     */
    public static int min(int... numbers) {
        int min = numbers[0];
        for (int e : numbers) {
            if (e < min) {
                min = e;
            }
        }
        return min;
    }


    //第9节第七题
    public static void exerciseSeven(){

        Scanner input = new Scanner(System.in); // Create a Scanner
        double[] numbers = new double[10]; // Create an array of length 10

        // Prompt the user to enter ten numbers
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        // Invoke bubblesort method
        bubbleSort(numbers);

        // display the sorted numbers
        for (double e : numbers) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    /**
     * bubbleSort
     */
    public static void bubbleSort(double[] list) {
        double temp;
        boolean swapped;

        do {
            swapped = false;
            for (int i = 0; i < list.length - 1; i++) {
                // If a neighboring pair is not in order, swap values
                if (list[i] > list[i + 1]) {
                    temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped); // Repeat if a value was swapped
    }


    //第9节第八题
    public static void exerciseEight(){

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String string = input.nextLine();

        System.out.println(sort(string));
    }

    /**
     * 取出字符串的每一个字符，重新按由小到大的顺序排序
     */
    public static char[] sort(String s) {
        char[] str = new char[s.length()];

        // 把字符串s的每个字符取出来放到数组str[]中
        for (int i = 0; i < str.length; i++) {
            str[i] = s.charAt(i);
        }

        // 对str[]数组内的每一项进行排序
        for (int i = 0; i < str.length - 1; i++) {
            char min = str[i];
            int minIndex = i;

            for (int j = i + 1; j < str.length; j++) {
                if (min > str[j]) {
                    min = str[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                str[minIndex] = str[i];
                str[i] = min;
            }
        }
        return str;
    }
}
