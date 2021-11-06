package org.niit.model;

public class Cab {

    private int cabnumber;
    private  String drivername;
    private float cabprice;
    private int destinationkm;

    public  void display()
    {
        System.out.println("CAB Number: "+cabnumber);
        System.out.println("Driver Name: "+drivername);
        System.out.println("Cab price: "+cabprice);
        System.out.println("destination in km: "+destinationkm);
    }

    public int getCabnumber() {
        return cabnumber;
    }

    public void setCabnumber(int cabnumber) {
        this.cabnumber = cabnumber;
    }

    public String getDrivername() {
        return drivername;
    }

    public void setDrivername(String drivername) {
        this.drivername = drivername;
    }

    public float getCabprice() {
        return cabprice;
    }

    public void setCabprice(float cabprice) {
        this.cabprice = cabprice;
    }

    public int getDestinationkm() {
        return destinationkm;
    }

    public void setDestinationkm(int destinationkm) {
        this.destinationkm = destinationkm;
    }
}
