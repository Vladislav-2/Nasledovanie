package Nasledovanie;

import Nasledovanie.Task_2;

public class Task_3 extends Task_2 {
    protected boolean haveKids;
    protected int procent = 20;

    public void options(String fullName, String kindeOfPay, int sum, boolean haveKids) {
        this.haveKids = haveKids;
            System.out.println(payer(fullName, kindeOfPay));
        if(payer != "Сдельная") {
            System.out.println("|| " + fullName + " ||   " + procent + "   ||  " + sumForLine + "  $ || " + (sumForLine - (int)(sumForLine * (procent * 0.01))) + " $ ||");
        }
    }

    @Override
    protected String payer(String fullName, String kindeOfPay){
        if (haveKids){
            procent += 5;
        }
        switch (kindeOfPay) {
            case RATE:
                payer = "Ставка";
                break;
            case HOURLY:
                payer = "Почасовая";
                break;
            case PIECEWORK:
                payer = "Сдельная";
                procent -= 5;
                return ("|| " + fullName + " ||   " + procent + "   ||  " + quantityOfPay + "  $ || " + (quantityOfPay - (int)((quantityOfPay) * (procent * 0.01))) + " $ ||");
            default:
                throw new Error();
        }
        return "";
    }

}
