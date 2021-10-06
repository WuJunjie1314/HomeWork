import java.util.Scanner;

public class WORK11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入第一个字母：");
        String firstInput = input.nextLine();
        System.out.println("请输入第二个字母：");
        String secondInput = input.nextLine();

        int firstLetter = firstInput.charAt(0);
        int secondLetter = secondInput.charAt(0);

        if (firstLetter > secondLetter) {
            int temp = firstLetter;
            firstLetter = secondLetter;
            secondLetter = temp;
        }

        if (secondLetter-firstLetter<=1){
            System.out.println("两个字母之间没有其他字母");
        }

        while (secondLetter-firstLetter>1){
            firstLetter+=1;
            System.out.print((char) firstLetter);
        }





        int j=0;//计数器
        for(int i=0;i<101;i++){
            if (i%6==0){
                j++;
                System.out.println(i);
            }
        }
        System.out.println("jkghjfyhbbyfy"+j);
    }

}
