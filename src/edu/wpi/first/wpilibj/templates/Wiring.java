package edu.wpi.first.wpilibj.templates;

/**
 *
 * @author jeremy
 */
public class Wiring {

    public static double radianWrap(double d) {
        return (d > Math.PI) ? d - 2 * Math.PI : (d < -Math.PI) ? d + 2 * Math.PI : d;
    }

    static final int SAMPLE_RATE = 0;
    static final double SENSOR_SCALE = 1;
    static double dt = 0.01;

    //K is for PID control
    //P is proportion, D is derivative
    static double KpR = 14.39 * dt;
    static double KiR = 0;//38.68 * dt;
    static double KpY = 0.0987 * dt;
    static double KdY = 0;
    static double KpX = 0.0127 * dt;
    static double KdX = 0;

    //T is for THB control
    //P is proportion  
    static double TpY = 1.37 * dt;
    static double TpX = .31 * dt;
    
    static final double MAX_XY = 132;
    static final double A_SCALE = 32.174 * 12 * .004;
    static final double G_SCALE = Math.PI / (180 * 14.375);
    static final long DRIVE_POLL_RATE = 10;
    static final int PID_C = 0;
    static final int THB_C = 1;
    static final int OPEN_C = 2;
}
