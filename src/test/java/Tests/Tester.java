package Tests;

import Nasledovanie.*;
import org.junit.Test;

public class Tester {

    @Test
    public void testTask_1(){
        Task_1 ts = new Task_1();
        ts.headOfTab();
        ts.options(ts.SERGEEVICH_NAME, ts.PIECEWORK, ts.sum(24, 14));
        ts.line();
        ts.options(ts.PETROV_NAME, ts.HOURLY, ts.sum(4, 14));
        ts.line();
        ts.options(ts.INAKENTEVICH_NAME, ts.RATE, ts.sum(24, 14));
        ts.line();
        ts.totalOfTab();
    }

    @Test
    public void testTask_2(){
        Task_2 ts = new Task_2();
        ts.headOfTab();
        ts.options(ts.SERGEEVICH_NAME, ts.PIECEWORK, ts.sum(4, 405));
        ts.line();
        ts.options(ts.PETROV_NAME, ts.HOURLY, ts.sum(42, 14));
        ts.line();
        ts.options(ts.INAKENTEVICH_NAME, ts.RATE, ts.sum(24, 24));
        ts.line();

    }

    @Test
    public void testTask_3(){
        Task_3 ts = new Task_3();
        ts.headOfTab();
        ts.options(ts.SERGEEVICH_NAME, ts.PIECEWORK, ts.sum(4, 405), true);
        ts.line();
        ts.options(ts.PETROV_NAME, ts.HOURLY, ts.sum(42, 14), false);
        ts.line();
        ts.options(ts.INAKENTEVICH_NAME, ts.RATE, ts.sum(24, 24), true);
        ts.line();
    }

    @Test
    public void testTask_4(){
        Task_4 ts = new Task_4();
        ts.headOfTab();
        ts.options(ts.SERGEEVICH_NAME, ts.PIECEWORK, ts.sum(4, 405), true);
        ts.line();
        ts.options(ts.PETROV_NAME, ts.HOURLY, ts.sum(42, 14), false);
        ts.line();
        ts.options(ts.INAKENTEVICH_NAME, ts.RATE, ts.sum(24, 24), true);
        ts.line();
    }

    @Test
    public void testTask_5(){
        Task_5 ts = new Task_5();
        ts.headOfTab();
        ts.options(ts.SERGEEVICH_NAME, ts.PIECEWORK, ts.sum(4, 405), true, true);
        ts.line();
        ts.options(ts.PETROV_NAME, ts.HOURLY, ts.sum(42, 14), false, true);
        ts.line();
        ts.options(ts.INAKENTEVICH_NAME, ts.RATE, ts.sum(24, 24), true, false);
        ts.line();
    }

    @Test
    public void testTask_6(){
        Task_6 ts = new Task_6();
        ts.headOfTab();
        ts.options(ts.SERGEEVICH_NAME, ts.PIECEWORK, ts.sum(4, 405), true, true);
        ts.line();
        ts.options(ts.PETROV_NAME, ts.HOURLY, ts.sum(200, 10), false, false);
        ts.line();
        ts.options(ts.INAKENTEVICH_NAME, ts.RATE, ts.sum(24, 24), true, false);
        ts.line();
    }
}
