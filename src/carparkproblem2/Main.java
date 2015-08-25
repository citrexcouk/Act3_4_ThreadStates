/*
 * Main.java
 *
 *
 * This class has a main method to create threads for the CarParkControl class and set them running.
 * To be completed.
 *
 * Created on 18 December 2006, 23:04
 * Revised 26 February 2007
 * Revised 1/8/2007
 *
 * @author M362 Course Team.
 */

package carparkproblem2;

public class Main
{
    public static void main(String[] args)
    {
        CarParkControl carpark = new CarParkControl(2);
        
        Thread t1 = new Departures(carpark);
        Thread t2 = new Departures(carpark);
        Thread t3 = new Departures(carpark);
        Thread t4 = new Departures(carpark);
        
        Thread t5 = new Arrivals(carpark);
        Thread t6 = new Arrivals(carpark);
        Thread t7 = new Arrivals(carpark);
        Thread t8 = new Arrivals(carpark);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
    }
}
