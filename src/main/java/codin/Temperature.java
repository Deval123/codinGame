package main.java.codin;

public class Temperature {
    static double closestToZero(double[] ts){
        if(ts.length == 0) return 0;
            double closest = ts[0];
            for (double i : ts){
                double abs = Math.abs(i);
                double absClosest = Math.abs(closest);
                if(abs < absClosest){
                    closest = i;
                } else if (abs == absClosest && closest < 0) {
                    closest = i;
                }
            }
            return closest;
    }
}
