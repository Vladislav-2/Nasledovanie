package Nasledovanie;

import Nasledovanie.Task_3;

public class Task_4 extends Task_3 {

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
                int x = (sumForLine - (int)(sumForLine * (procent * 0.01)));
                x = x / 2;
                return ("|| " + fullName + " ||   " + procent + "   ||  " + sumForLine + "  $ || " + x + " / " + (x * 2614) + " MNT ||");     // 1 USD = 2614 MNT
            case PIECEWORK:
                payer = "Сдельная";
                procent -= 5;
                return ("|| " + fullName + " ||   " + procent + "   ||  " + quantityOfPay + "  $ || " + (quantityOfPay - (int)((quantityOfPay) * (procent * 0.01))) + " $ ||");
            default:
                throw new Error();
        }
        return "";
    }

    @Override
    public void options(String fullName, String kindeOfPay, int sum, boolean haveKids) {
        this.haveKids = haveKids;
        System.out.println(payer(fullName, kindeOfPay));
        if(payer == "Ставка") {
            System.out.println("|| " + fullName + " ||   " + procent + "   ||  " + sumForLine + "  $ || " + (sumForLine - (int)(sumForLine * (procent * 0.01))) + " $ ||");
        }
    }
}
