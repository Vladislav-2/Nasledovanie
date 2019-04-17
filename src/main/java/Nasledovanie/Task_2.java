package Nasledovanie;

import Nasledovanie.Task_1;

public class Task_2 extends Task_1 {

@Override
    protected String payer(String fullName, String kindeOfPay){
    switch (kindeOfPay) {
        case RATE:
            payer = "Ставка";
            break;
        case HOURLY:
            payer = "Почасовая";
            break;
        case PIECEWORK:
            payer = "Сдельная";
            return ("|| " + fullName + " ||   15%   ||  " + quantityOfPay + "  $ || " + (quantityOfPay - (int)((quantityOfPay) * 0.15)) + " $ ||");
        default:
            throw new Error();
    }
    return null;
}

@Override
    public void options(String fullName, String kindeOfPay, int sum) {
    if (kindeOfPay == PIECEWORK) {
        System.out.println(payer(fullName, kindeOfPay));
    } else {
        payer(fullName, kindeOfPay);
    }
    if(payer != "Сдельная") {
        System.out.println("|| " + fullName + " ||   20%   ||  " + sumForLine + "  $ || " + (sumForLine - (int)(sumForLine * 0.2)) + " $ ||");
    }
    }

    @Override
    public void headOfTab(){
        line();
        System.out.println("||  ФИО  ||  Налог%  ||  Сумма  ||  К оплате  ||");
        line();
    }

    @Override
    public void line(){
        System.out.println("_________________________________________________");
    }

}
