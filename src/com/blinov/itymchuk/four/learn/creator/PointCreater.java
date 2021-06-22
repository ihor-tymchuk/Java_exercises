package com.blinov.itymchuk.four.learn.creator;

import com.blinov.itymchuk.four.learn.point.Point1D;
import com.blinov.itymchuk.four.learn.point.Point2D;
import com.blinov.itymchuk.four.learn.point.Point3D;

import java.util.ArrayList;

class Point1DCreater {
    public Point1D createPoint() {
        System.out.println("Point1D");
        return new Point1D(1);
    }
}

class Point2DCreate extends Point1DCreater {
    @Override
    public Point2D createPoint() { // метод підстановка
        System.out.println("Point2D");
        return new Point2D(2,5);
    }

    public void smile(){
        System.out.println("smile 2D");
    }

    public void smile2(){
        System.out.println("smile 2D not override");

    }
}

class Point3DCreate extends Point2DCreate {
    @Override
    public Point3D createPoint() {// метод підстановка
        System.out.println("Point3D");
        return new Point3D(3, 7, 8);
    }

//    @Override
    public void smile(){
        System.out.println("smile 3D");
    }

    public void smile3(){
        System.out.println("smile 3D not override");
    }
}

class BuildRunner {
    public static void main(String[] args) {
        Point2DCreate br = new Point3DCreate();
        // Point3D p3 = br.createPoint(); // помилка компіляції
        Point2D p2 = br.createPoint();
        Point1D p1 = br.createPoint();
        Point1D d1 = new Point3D(2, 4, 6);
        System.out.println(br.createPoint().x);
        System.out.println(br.createPoint().y);
        System.out.println(p1);
        System.out.println(p2);
        br.smile();
        br.smile2();
        // System.out.println(br.createPoint().z);
    }
}
