package org.niit.model;

public class Cab {

    private int cabnumber;
    private  String drivername;
    private float cabprice;
    private int destinationkm;
    private Commuter commuter;

    public  void display()
    {
        System.out.println("CAB Number: "+cabnumber);
        System.out.println("Driver Name: "+drivername);
        System.out.println("Cab price: "+cabprice);
        System.out.println("destination in km: "+destinationkm);
        System.out.println("Name of Commurter: "+commuter.getCommuterName());
        System.out.println("Age of Commuter: "+commuter.getAge());
        System.out.println("location of Commuter:"+commuter.getLocation());
    }

    public Cab(int cabnumber, String drivername, float cabprice, int destinationkm, Commuter commuter) {
        this.cabnumber = cabnumber;
        this.drivername = drivername;
        this.cabprice = cabprice;
        this.destinationkm = destinationkm;
        this.commuter = commuter;
    }

    public Commuter getCommuter() {
        return commuter;
    }

    public void setCommuter(Commuter commuter) {
        this.commuter = commuter;
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
