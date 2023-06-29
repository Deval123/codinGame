package main.java.codin;

public class Approximate {
    /*
    * Approximate pi using the given points
    * */
    static double approx(double[][] pts){
        int pointsInside = 0;
        int totalPoints = pts.length;

        for (int i=0; i<totalPoints; i++){
            double x = pts[i][0];
            double y = pts[i][1];
            double distanceSquared = x*x + y*y;

            if(distanceSquared <= 1){
                pointsInside++;
            }
        }
        double ratio = (double) pointsInside/ totalPoints;
        double approximatePi = ratio * 4;
        return approximatePi;
    }


}
