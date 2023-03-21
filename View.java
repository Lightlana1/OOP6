package OOP5;

public class View {



    public int signSelect(){
        int sign = ValidationUserInp.userInput("Выберите действие: " +
                "\n\t1. Сложение"+
                "\n\t2. Вычитание" +
                "\n\t3. Умножение" +
                "\n\t4. Деление");
        return sign;
    }



}
