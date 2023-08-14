package de.mysh.calcApp._main;
import de.mysh.calcApp.util.Calculator;
import de.mysh.calcApp.service.ResultWriteService;


public class _Main {
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 7;
        int sumResult = Calculator.summarise (num1, num2);
        int subtrResult = Calculator.subtract(num1, num2);
        int multResult = Calculator.multiply (num1, num2);
        ResultWriteService.printTheResult(num1, num2, sumResult, "Сумма ");
        ResultWriteService.printTheResult(num1, num2, subtrResult, "Разность ");
        ResultWriteService.printTheResult(num1, num2, multResult, "Произведение ");
    }
}
