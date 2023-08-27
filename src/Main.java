import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        /*int i = 0;   //счётчик цикла
        System.out.println("Введите количество итераций: ");
        int n = kb.nextInt();
        while (++i < n)
        {
            System.out.println("%d - Hello".formatted(i));
            //i++;
        }*/

        /*int value;
        int sum = 0;
        System.out.println("Введите значения для суммирования (для завершения введите 0): ");
        do {
            value = kb.nextInt();
            sum+=value;
        }while (value !=0);
        System.out.println("Сумма введённых значений: " + sum);*/
        /*String integer;
        do {
            System.out.print("Введите целое число: ");
            integer = kb.next();
            if (integer.indexOf('.') != -1 || integer.indexOf(',') != -1) System.out.println("Вы ввели дробное число, нужно ввести целое число");
        }while (integer.indexOf(',') != -1 || integer.indexOf(',') != -1);
        //System.out.println(integer);//
        /*System.out.print("Введите количество итераций: ");
        int n = kb.nextInt();
        for (int i =0; i < n; i++)
        {
            System.out.print(i + "\t");
        }
        System.out.println();*/
        System.out.print("Введите предельное число: ");
        int n=kb.nextInt();
        for (int i=0, counter = 0; i<n; i++)
        {
            if (i%10==0) System.out.println();
            Boolean simple = true; //Предположим, что число простое, но это нужно проверить
            for (int j = 2; j<1; j++)
            {
                if(i % j ==0)
                {
                    simple = false;
                    break; //Прерывает текущую итерацию и все последующие
                    //continue; // Прерывает текущую итерацию и переходит к следующей
                }
            }
            if (simple)
            {
            System.out.printf("%-5d\t", i);
        }
        System.out.println();
    }
}