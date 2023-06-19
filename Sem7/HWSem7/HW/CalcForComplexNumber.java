package HW;

public class CalcForComplexNumber{
    private Calculator calc;

    public CalcForComplexNumber() {
        calc = new Calculator();
    }

    public ComplexNumber sum(ComplexNumber complexNumberOne, ComplexNumber complexNumberTwo) {
        return new HW.ComplexNumber(calc.sum(complexNumberOne.getReal(), complexNumberTwo.getReal())
                , calc.sum(complexNumberOne.getImaginary(), complexNumberTwo.getImaginary()));
    }

    public ComplexNumber dif(ComplexNumber complexNumberOne, ComplexNumber complexNumberTwo) {
        return new HW.ComplexNumber(calc.dif(complexNumberOne.getReal(), complexNumberTwo.getReal())
                , calc.dif(complexNumberOne.getImaginary(), complexNumberTwo.getImaginary()));
    }

    public ComplexNumber multiplication(ComplexNumber complexNumberOne, ComplexNumber complexNumberTwo) {
        /* Или так
        double real = complexNumberOne.getReal() * complexNumberTwo.getReal() - complexNumberOne.getImaginary() * complexNumberTwo.getImaginary();
        double imaginary = complexNumberOne.getReal() * complexNumberTwo.getReal() + complexNumberOne.getImaginary() * complexNumberTwo.getImaginary();*/
        double a1 = complexNumberOne.getReal();
        double b1 = complexNumberOne.getImaginary();
        double a2 = complexNumberTwo.getReal();
        double b2 = complexNumberTwo.getImaginary();

        double real = calc.dif(calc.multiplication(a1, a2), calc.multiplication(b1, b2));
        double imaginary = calc.sum(calc.multiplication(a1, a2), calc.multiplication(b1, b2));
        return new HW.ComplexNumber(real, imaginary);
    }

    public ComplexNumber division(ComplexNumber complexNumberOne, ComplexNumber complexNumberTwo) {
        //Тут так же можно все в одно строчку, но тот кто это будет править меня найдет(((
        double a1 = complexNumberOne.getReal();
        double b1 = complexNumberOne.getImaginary();
        double a2 = complexNumberTwo.getReal();
        double b2 = complexNumberTwo.getImaginary();

        double real = calc.division(calc.sum(calc.multiplication(a1, a2), calc.multiplication(b1, b2)), calc.sum(calc.multiplication(a2, a2), calc.multiplication(b2, b2)));
        double imaginary = calc.division(calc.dif(calc.multiplication(a2, b1), calc.multiplication(a1, b2)), calc.sum(calc.multiplication(a2, a2), calc.multiplication(b2, b2)));
        ;

        return new HW.ComplexNumber(real, imaginary);
    }
}
