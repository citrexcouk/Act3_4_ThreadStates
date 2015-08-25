/*
 * CarParkControl.java
 *
 * Created on 01 December 2006, 18:32
 * Revised 26 February 2007.
 * Revised 1/8/2007
 *
 * A class to control the  parking of cars in a carpark, through methods depart and arrive.
 * As described in the unit.
 *
 * @author M362 Course Team.
 */

package carparkproblem2;



public class CarParkControl
{
    protected CarParkCounter spaces;
    protected int capacity;
    
    CarParkControl(int n)
    {
        capacity = n;
        spaces = new CarParkCounter(capacity);
    }
    
    public synchronized void arrive() throws InterruptedException
    {
        while (spaces.getCount() == 0)
        {
            this.wait();
        }
        
        Thread.sleep(100);
        
        spaces.decreaseByOne();
        System.out.println("Arrived - free spaces = " + spaces.getCount());

        this.notifyAll();
    }
    
    public synchronized void depart() throws InterruptedException
    {
        while (spaces.getCount() == capacity)      
        {
            this.wait();
        }

        Thread.sleep(100);

        spaces.increaseByOne();
        System.out.println("        Departed - free spaces = " + spaces.getCount());
        
        this.notifyAll();
    }       
}
