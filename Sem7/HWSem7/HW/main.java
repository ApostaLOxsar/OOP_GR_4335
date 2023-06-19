package HW;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        CalcForComplexNumber calc = new CalcForComplexNumber();
        iCalcView view = new CalcViewRus();
        ComplexNumber res;
        ComplexNumber complexTemp;
        StringBuilder resString = new StringBuilder();
        CreatComplexNumber creatNumber = new CreatComplexNumber();
        Scanner iSc = new Scanner(System.in);
        Boolean flagStop = false;


        view.messHello();
        view.messSetNumber();
        res = creatNumber.CreatComplexNumber(iSc.nextDouble(), iSc.nextDouble());
        resString.append(res);

        while (!flagStop) {

            view.messOperation();
            switch (iSc.next()) {
                case "+":
                    view.messSetNumber();
                    complexTemp = creatNumber.CreatComplexNumber(iSc.nextDouble(), iSc.nextDouble());
                    resString.append(" + " + complexTemp);
                    res = calc.sum(res, complexTemp);

                    break;
                case "-":
                    view.messSetNumber();
                    complexTemp = creatNumber.CreatComplexNumber(iSc.nextDouble(), iSc.nextDouble());
                    resString.append(" - " + complexTemp);
                    res = calc.dif(res, complexTemp);
                    break;
                case "/":
                    view.messSetNumber();
                    complexTemp = creatNumber.CreatComplexNumber(iSc.nextDouble(), iSc.nextDouble());
                    resString.append(" / " + complexTemp);
                    res = calc.division(res, complexTemp);
                    break;
                case "*":
                    view.messSetNumber();
                    complexTemp = creatNumber.CreatComplexNumber(iSc.nextDouble(), iSc.nextDouble());
                    resString.append(" * " + complexTemp);
                    res = calc.multiplication(res, complexTemp);
                    break;
                case "=":
                    System.out.println("\n" + resString + " = " + res);
                    flagStop = true;
                    break;
                default:
                    System.out.println("Нет такой команды давайте сначала(");
                    break;
            }


        }
    }

}
