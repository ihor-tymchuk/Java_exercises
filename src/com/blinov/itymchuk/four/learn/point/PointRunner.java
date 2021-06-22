package com.blinov.itymchuk.four.learn.point;

public class PointRunner {
    public static void main(String[] args) {
        Point1D p1 = new Point1D(4);
        System.out.println("length p1 = " + p1.length() + " "+ p1);

        Point2D p2 = new Point2D(-3, 4);
        System.out.println("length p2 = " + p2.length() + " "+ p2);

        Point3D p3 = new Point3D(-3, 4, 2);
        System.out.println("length p3 = " + p3.length() + " "+ p3);

        Point3D pd = new Point3D();
        System.out.println("length pd = " + pd.length() + " "+ pd);
    }
}
