import java.util.Scanner;

// 4*дополнительно. К калькулятору из предыдущего дз добавить логирование.
// 1 + 3 = 4->


public class proj {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("введи первое число: ");
        int firstNum = iScanner.nextInt();
        System.out.println("введи второе число: ");
        int secondNum = iScanner.nextInt();
        System.out.println("введи знак для вычисления: ");
        String symbol = iScanner.next();
        result(firstNum, secondNum, symbol);
        }

        public static void result(int numOne, int numSec, String sym){
            int temp = 0;
            if (sym.equals("+")){
                temp = numOne + numSec;
                System.out.println(numOne + "+" + numSec + "=" + temp);
            }
            else if (sym.equals("-")){
                temp = numOne - numSec;
                System.out.println(numOne + "-" + numSec + "=" + temp);
            }
            else if (sym.equals("/")){
                temp = numOne / numSec;
                System.out.println(numOne + "/" + numSec + "=" + temp);
            }
            else if (sym.equals("*")){
                temp = numOne * numSec;
                System.out.println(numOne + "*" + numSec + "=" + temp);
            }
            else{
                System.out.println("Некорректный ввод!");
            }
        }
}