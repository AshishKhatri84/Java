import java.util.*;

public class Salary{
    // Function-based salary calculation
    public static int dailySalary(int hours) {
        if (hours > 8) {
            return (8 * 100) + ((hours - 8) * 115); // Base + Overtime pay
        }
        return hours * 100; // Normal pay
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter working hours for Sunday to Saturday:");

        int su = sc.nextInt();
        int m = sc.nextInt();
        int tu = sc.nextInt();
        int w = sc.nextInt();
        int th = sc.nextInt();
        int f = sc.nextInt();
        int sa = sc.nextInt();

        // Function-Based Calculation
        int ssFunc = dailySalary(su);
        int msFunc = dailySalary(m);
        int tsFunc = dailySalary(tu);
        int wsFunc = dailySalary(w);
        int thsFunc = dailySalary(th);
        int fsFunc = dailySalary(f);
        int sasFunc = dailySalary(sa);

        ssFunc *= 1.5; // Apply Sunday 50% bonus

        int functionSalary = ssFunc + msFunc + tsFunc + wsFunc + thsFunc + fsFunc + sasFunc;
        System.out.println("Salary (Function Calculation): " + functionSalary);

        // Manual Calculation
        int ss, ms, ts, ws, ths, fs, sas;

        ss = (su > 8) ? (8 * 100) + ((su - 8) * 115) : su * 100;
        ss *= 1.5; // 50% Sunday bonus

        ms = (m > 8) ? (8 * 100) + ((m - 8) * 115) : m * 100;
        ts = (tu > 8) ? (8 * 100) + ((tu - 8) * 115) : tu * 100;
        ws = (w > 8) ? (8 * 100) + ((w - 8) * 115) : w * 100;
        ths = (th > 8) ? (8 * 100) + ((th - 8) * 115) : th * 100;
        fs = (f > 8) ? (8 * 100) + ((f - 8) * 115) : f * 100;
        sas = (sa > 8) ? (8 * 100) + ((sa - 8) * 115) : sa * 100;

        int manualSalary = ss + ms + ts + ws + ths + fs + sas;
        System.out.println("Salary (Manual Calculation) : " + manualSalary);
    }
}}