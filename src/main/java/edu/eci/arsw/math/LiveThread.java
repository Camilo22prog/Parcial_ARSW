package edu.eci.arsw.math;

import static edu.eci.arsw.math.Main.bytesToHex;

public class LiveThread extends Thread{
    private final int a;
    private final int b;
    private static StringBuilder res;


    public LiveThread (int a, int b) {

        this.a = a;
        this.b = b;

    }

    @Override
    public void run() {
        for (int i = a; i <= b; i++) {
            int d = Integer.parseInt(bytesToHex(PiDigits.getDigits(a, b)));
            res = new StringBuilder(Integer.toHexString(d));

        }


    }

    public static StringBuilder getRes() {
        return res;
    }
}

