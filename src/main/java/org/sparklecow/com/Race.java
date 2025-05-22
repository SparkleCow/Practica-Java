package org.sparklecow.com;

/*A runner has run a race that had 42195 kilometers. He did it in 2 hours and 25 minutes.
 * How many kilometers did he run per minute ? */
public class Race {

    private final static Integer MINUTES = (2*60)+25;
    private final static Integer METERS = 42195;


    public static double getKilometersPerMinute() {
        double kilometers = METERS / 1000.0; // Convert meters to kilometers
        return kilometers / MINUTES;
    }
}
