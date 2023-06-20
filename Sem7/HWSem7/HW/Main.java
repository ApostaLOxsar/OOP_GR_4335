package HW;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {


    public static void main(String[] args) {
        Loger loger = new Loger();
        Logger log = loger.Loger();

        CalcForComplexNumber calc = new CalcForComplexNumber();
        iCalcView view = new CalcViewRus();
        ComplexNumber res;
        ComplexNumber complexTemp;
        StringBuilder resString = new StringBuilder();
        CreatComplexNumber creatNumber = new CreatComplexNumber();
        Scanner iSc = new Scanner(System.in);
        Boolean flagStop = false;

        log.info("Произведена инициализация необходимого для работы");

        view.messHello();
        view.messSetNumber();
        res = creatNumber.CreatComplexNumber(iSc.nextDouble(), iSc.nextDouble());
        log.info("Пользователь ввел:" + res);
        resString.append(res);
        log.info("В итоговую строку добавлена запись " + res);

        while (!flagStop) {

            view.messOperation();
            switch (iSc.next()) {
                case "+":
                    view.messSetNumber();
                    complexTemp = creatNumber.CreatComplexNumber(iSc.nextDouble(), iSc.nextDouble());
                    log.info("Пользователь выбрал +, и добавил значение " + complexTemp);
                    resString.append(" + " + complexTemp);
                    res = calc.sum(res, complexTemp);
                    log.info("В итоговвую строку добавлена запись + " + complexTemp);
                    log.info("Результат посчитан и равен " + res);

                    break;
                case "-":
                    view.messSetNumber();
                    complexTemp = creatNumber.CreatComplexNumber(iSc.nextDouble(), iSc.nextDouble());
                    log.info("Пользователь выбрал +, и добавил значение " + complexTemp);
                    resString.append(" - " + complexTemp);
                    res = calc.dif(res, complexTemp);
                    log.info("В итоговвую строку добавлена запись - " + complexTemp);
                    log.info("Результат посчитан и равен " + res);

                    break;
                case "/":
                    view.messSetNumber();
                    complexTemp = creatNumber.CreatComplexNumber(iSc.nextDouble(), iSc.nextDouble());
                    log.info("Пользователь выбрал +, и добавил значение " + complexTemp);
                    resString.append(" / " + complexTemp);
                    res = calc.division(res, complexTemp);
                    log.info("В итоговвую строку добавлена запись / " + complexTemp);
                    log.info("Результат посчитан и равен " + res);
                    break;
                case "*":
                    view.messSetNumber();
                    complexTemp = creatNumber.CreatComplexNumber(iSc.nextDouble(), iSc.nextDouble());
                    log.info("Пользователь выбрал +, и добавил значение " + complexTemp);
                    resString.append(" * " + complexTemp);
                    res = calc.multiplication(res, complexTemp);
                    log.info("В итоговвую строку добавлена запись * " + complexTemp);
                    log.info("Результат посчитан и равен " + res);
                    break;
                case "=":
                    System.out.println("\n" + resString + " = " + res);
                    log.info("Пользователь выбрал =");
                    flagStop = true;
                    break;
                default:
                    System.out.println("Нет такой команды давайте сначала(");
                    break;
            }


        }
    }

}
