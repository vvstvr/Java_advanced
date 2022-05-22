package Calculator;
/*
Задание 1:
    - Реализовать сложение дробных чисел, которые пользователь вводит в консоль.
    - Использовать комментарии и JavaDoc при описании метода.
    - Использовать форматирование при выводе результата в консоль.
Полученный результат округлять до 4-х знаков после запятой.
Запушить проект в свой репозиторий на GitHub и прикрепить ссылку на него в ответе на задание
* Доп задание по желание: добавить возможность выбора другой операции (сложение, вычитание, деление, умножение)
 */
import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Введите первое число:");
        float first = scanner.nextFloat();
        System.out.println("Введите второе число:");
        float second = scanner.nextFloat();

        System.out.println("Выберите операцию (+,-,*,/): ");
        char op = scanner.next().charAt(0);

        switch (op) {
            case '+':
                System.out.printf("Sum: %.4f\n", addition(first, second));
                break;
            case '-':
                System.out.printf("Div: %.4f\n", subtraction(first, second));
                break;
            case '*':
                System.out.printf("Mult: %.4f\n", multiplication(first, second));
                break;
            case '/':
                System.out.printf("Quot: %.4f\n", division(first, second));
                break;
        }

    }

    /**
     *
     * @param a Первое расчётное значение
     * @param b Второе расчётное значение
     * @return Возвращаем результат сложения
     */

    private static float addition (float a, float b){
        return a + b;
    }
    /**
     *
     * @param a Первое расчётное значение
     * @param b Второе расчётное значение
     * @return Возвращаем результат вычитания
     */
    private static float subtraction (float a, float b) {
        return a - b;
    }
    /**
     *
     * @param a Первое расчётное значение
     * @param b Второе расчётное значение
     * @return Возвращаем результат умножения
     */
    private static float multiplication (float a, float b){
        return a * b;
    }
    /**
     *
     * @param a Первое расчётное значение
     * @param b Второе расчётное значение
     * @return Возвращаем результат деления
     */
    private static float division (float a, float b){
        return a / b;
    }

}

