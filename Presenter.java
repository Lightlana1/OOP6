package OOP5;

import OOP5.model.ComplexCalc;
import OOP5.model.RatioCalk;

public class Presenter {
    View view;
    ComplexCalc complexCalc;

    ValidationUserInp valuserint;

    RatioCalk rc;

    Print print;

    public Presenter (ComplexCalc cc, View v){
        complexCalc = cc;
        view = v;
    }

    public void calculate(){
        int action = valuserint.userInput("Выберите тип числа \n 1. Рациональные \n 2. Комплексные" );
        switch (action){
            case 1:
                actionRatio();
                break;
            case 2:
                actionComplex();
                break;
            default:
                System.out.println(" ");
        }
    }

    public void restart(){
        System.out.println(" ");
        int choice = valuserint.userInput("Что делаем дальше? \n 1. Новое вычисление \n 2. Закрываем калькулятор" );
        switch (choice){
            case 1:
                calculate();
            case 2:
                System.out.println("Благодарим за использование нашего приложения!");
                break;
            default:
                System.out.println(" ");
        }

    }


    public void actionComplex(){
        complexCalc.setX(valuserint.userDInput("Введите число х: "));
        complexCalc.setA(valuserint.userDInput("Введите число а: "));

        complexCalc.setY(valuserint.userDInput("Введите число y: "));
        complexCalc.setB(valuserint.userDInput("Введите число b: "));

        switch (view.signSelect()){
            case 1:
                print.printComplex("Сумма: " + complexCalc.sum());
                break;
            case 2:
                print.printComplex("Разность: " + complexCalc.difference());
                break;
            case 3:
                print.printComplex("Произведение: " + complexCalc.mult());
                break;
            case 4:
                print.printComplex("Деление: " + complexCalc.divide());
                break;
            default:
                System.out.println(" ");
        }
    }

    public void actionRatio(){
        RatioCalk rc = new RatioCalk();
        rc.setX(valuserint.userDInput("Введите число х: "));
        rc.setA(valuserint.userDInput("Введите число y: "));

        switch (view.signSelect()){
            case 1:
                print.printRatio("Сумма: " + rc.sum());
                break;
            case 2:
                print.printRatio("Разность: " + rc.difference());
                break;
            case 3:
                print.printRatio("Произведение: " + rc.mult());
                break;
            case 4:
                print.printRatio("Деление: " + rc.divide());
                break;
            default:
                System.out.println(" ");
        }
    }


}
