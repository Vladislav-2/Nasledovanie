package Nasledovanie;

public class Task_1 {

    public final String IVANOV_NAME = "Иванов";
    public final String SYDOROV_NAME = "Сидорв";
    public final String PETROV_NAME = "Петров";
    public final String INAKENTEVICH_NAME = "Инакентьевичь";
    public final String SERGEEVICH_NAME = "Сергеевичь";
    public final String RATE = "rate";
    public final String HOURLY = "hourly";
    public final String PIECEWORK = "piecework";
    protected int sum;
    protected int sumForLine;
    protected int quantityOfPay;
    protected String payer;
    protected int workTime;

    public int sum(int workTime, int quantityOfPay){
        sumForLine = workTime * quantityOfPay;
        this.quantityOfPay = quantityOfPay;
        sum += sumForLine;
        this.workTime = workTime;
        return sumForLine;
    }

    protected String payer(String fullName, String kindeOfPay) {
        switch (kindeOfPay) {
            case RATE:
                payer = "Ставка";
                break;
            case HOURLY:
                payer = "Почасовая";
                break;
            case PIECEWORK:
                payer = "Сдельная";
                return ("|| " + fullName + " || " + payer + " || " + quantityOfPay + " $ ||");
            default:
                throw new Error();
        }
        return null;
    }

    public void options(String fullName, String kindeOfPay, int sum) {
        if (kindeOfPay == PIECEWORK) {
            System.out.println(payer(fullName, kindeOfPay));
        } else {
            payer(fullName, kindeOfPay);
        }
        System.out.println("|| " + fullName + " || " + payer + " || " + sumForLine + " $ ||");
    }

    public void headOfTab(){
        line();
        System.out.println("||  ФИО  ||  Вид оплаты  ||  Сумма  ||");
        line();
    }

    public void line(){
        System.out.println("______________________________________");
    }

    public void totalOfTab(){
        System.out.println("||  Итого =                  " + sum + " $ ||");
        line();
    }

}