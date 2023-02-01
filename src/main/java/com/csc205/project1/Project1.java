package com.csc205.project1;

/**
 * Driver class used to test Point implementation for Project 1.
 *Point class implemented into this tester.
 * @author Ray Hedgecock, Talon K. Widmer
 * @version 1.1, 1.2
 */
class Point{

    //Name the variables within this particular class
    private double x,y;

    //Name the base constructor for this class

    public Point(){

        x=y=0;
    }

    //Name the new Parameterized constructor within this class
    public Point(double x, double y){

        this.x = x;
        this.y = y;
    }

    //Find the distance between the base point and the new point that will be used
    public double distance(Point p){

        return Math.sqrt( Math.pow((this.x - p.getX()), 2) + Math.pow((this.y - p.getY()), 2));
    }

    //Create the aspect that calls upon X in the program
    public double getX() {
        return x;
    }

    //Create the aspect that calls upon Y in the program
    public double getY() {
        return y;
    }
    //Create the aspect that puts the Y value into its place in the program

    //Now, change initial values of X and Y to new values
    public void setPoint(double new_x, double new_y) {
        this.x = new_x;
        this.y = new_y;
    }
    //Change the X distance that is provided by the tester
    public void shiftX(double dist) {
        this.x+= dist;
    }
    //Change the Y distance that is provided by the tester
    public void shiftY(double dist) {
        this.y+=dist;
    }

    //Take points and rotate them by the angles provided in the tester within radian notation
    public void rotate(double radian) {
        this.x = (x * (Math.cos(radian))) - (y * (Math.sin(radian)));
        this.y = (x * (Math.cos(radian))) - (y * (Math.sin(radian)));
    }
    //Make a new implementation that takes over for the toString in the tester
    public String toString() {
        return "Point{" +
                "x = " + x +
                ", y = " + y +
                '}';
    }
}

public class Project1 {

    public static void main(String[] args) {

        System.out.println("Project 1 : Point Tester\n");

        Point a = new Point(3.0, 1.0);
        Point b = new Point();
        b.setPoint(6.0, 5.0);

        System.out.println("Point 1: " + a);
        System.out.println("Point 2: " + b);

        System.out.println("\nDistance: " + a.distance(b));

        double rotation = Math.PI / 2.0;
        a.rotate(rotation);
        System.out.println("\nRotated a " + rotation + ": " + a);

        Point b2 = new Point(b.getX(), b.getY());
        b.shiftX(4);
        b.shiftY(-2);
        System.out.println("Shifted b " + b.distance(b2) + " away from original position: " + b);

    }
}
