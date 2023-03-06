import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

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
                String x = (numOne + "+" + numSec + "=" + temp);
                System.out.println(x);
                writeToFile(x);
            }
            else if (sym.equals("-")){
                temp = numOne - numSec;
                String x = (numOne + "-" + numSec + "=" + temp);
                System.out.println(x);
                writeToFile(x);
            }
            else if (sym.equals("/")){
                temp = numOne / numSec;
                String x = (numOne + "/" + numSec + "=" + temp);
                System.out.println(x);
                writeToFile(x);
            }
            else if (sym.equals("*")){
                temp = numOne * numSec;
                String x = (numOne + "*" + numSec + "=" + temp);
                System.out.println(x);
                writeToFile(x);
            }
            else{
                String x = ("Некорректный ввод!");
                System.out.println(x);
                writeToFile(x);
            }
        }

        public static void writeToFile(String expression){
            String file_name = "1.txt";
            File file = new File(file_name);
            try{
                FileWriter writer = new FileWriter(file,true);
                writer.write(expression);
                writer.write("\n");
                writer.close();
                System.out.println("Информация добавлена!");
            }
            catch (Exception e){
                System.out.println("Что то пошло не так");
            }
        }

}