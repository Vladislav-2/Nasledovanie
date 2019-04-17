package Nasledovanie;

public class Task_6 extends Task_5 {

    @Override
    public void options(String fullName, String kindeOfPay, int sum, boolean haveKids, boolean offshore) {
        if (offshore) {
            offshore(fullName);
            return;
        } else if (workTime >= 200 && kindeOfPay == HOURLY) {
            sumForLine += 200;
            sum += 200;
        }
        this.haveKids = haveKids;
        System.out.println(payer(fullName, kindeOfPay));
        if (payer == "Ставка") {
            System.out.println("|| " + fullName + " ||   " + procent + "   ||  " + sumForLine + "  $ || " + (sumForLine - (int) (sumForLine * (procent * 0.01))) + " $ ||");
        }
    }
}
