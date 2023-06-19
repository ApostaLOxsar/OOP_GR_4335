package HW;

public class CalcViewRus implements iCalcView{

    @Override
    public void messHello() {
        System.out.println("Добро пожаловать в калькулятор комплексных чисел\nВведите число формата a+bi");
    }
    @Override
    public void messFirsrNumber(){
        System.out.println("Введите первое число: ");
    }

    @Override
    public void messSetNumber() {
        System.out.println("Введите A и через enter B:");
    }
    @Override

    public void messGetNumber(ComplexNumber comp){
        System.out.println(comp);
    }

    @Override
    public void messOperation() {
        System.out.print("Введите знак /,*,-,+,= : ");
    }

}
