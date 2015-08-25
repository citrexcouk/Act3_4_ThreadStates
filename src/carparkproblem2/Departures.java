/*
 * Departures.java
 *
 * Created on 21 December 2006, 21:57
 *
 * @author M362 Course Team.
 */

package carparkproblem2;


class Departures extends Thread 
{

    CarParkControl carpark;

    Departures(CarParkControl c) 
    {
        carpark = c;
    }

    public void run() 
    {
        try
        {   
            carpark.depart();
        }
        catch(InterruptedException e)
        {
            System.out.println("Thread interrupted: exiting without performing depart");
        }
     }     
 }
