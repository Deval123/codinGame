package main.java;

class Player {
    public static String solve(int width, int height, int length, int mass) {
        int volume = width * height * length;

        if (volume >= 1000000 || width >= 150 || height >= 150 || length >= 150) {
            if (mass >= 20) {
                return "REJECTED";
            } else {
                return "SPECIAL";
            }
        } else if (mass >= 20) {
            return "SPECIAL";
        } else {
            return "STANDARD";
        }
    }

}
