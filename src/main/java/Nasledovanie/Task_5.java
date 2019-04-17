package Nasledovanie;

import Nasledovanie.Task_4;

public class Task_5 extends Task_4 {
    public void options(String fullName, String kindeOfPay, int sum, boolean haveKids, boolean offshore) {
        if (offshore){
            offshore(fullName);
            return;
        }
        this.haveKids = haveKids;
        System.out.println(payer(fullName, kindeOfPay));
        if(payer == "Ставка") {
            System.out.println("|| " + fullName + " ||   " + procent + "   ||  " + sumForLine + "  $ || " + (sumForLine - (int)(sumForLine * (procent * 0.01))) + " $ ||");
        }
    }

    protected void offshore(String fullName){
        System.out.println("|| " + fullName + " ||   офшор   ||  " + sumForLine + "  $ || " + sumForLine + " $ ||");
    }

}
