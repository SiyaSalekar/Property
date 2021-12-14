package com.dkit.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Property
{
    private int propertyID;
    private String owner;
    private String postcode;
    private double sellingPrice;
    private double area;
    private List<String> facilities;

    public Property(int propertyID, String owner, String postcode, double sellingPrice, double area)
    {
        this.propertyID = propertyID;
        this.owner = owner;
        this.postcode = postcode;
        this.sellingPrice = sellingPrice;
        this.area = area;
        this.facilities = new ArrayList<>();
    }
    public Property(int propertyID, String owner, String postcode, double area)
    {
        this.propertyID = propertyID;
        this.owner = owner;
        this.postcode = postcode;
        this.sellingPrice = 120;
        this.area = area;
        this.facilities = new ArrayList<>();
    }

    public int getPropertyID()
    {
        return propertyID;
    }

    public void setPropertyID(int propertyID)
    {
        this.propertyID = propertyID;
    }

    public String getOwner()
    {
        return owner;
    }

    public void setOwner(String owner)
    {
        this.owner = owner;
    }

    public String getPostcode()
    {
        return postcode;
    }

    public void setPostcode(String postcode)
    {
        this.postcode = postcode;
    }

    public double getSellingPrice()
    {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice)
    {
        this.sellingPrice = sellingPrice;
    }

    public double getArea()
    {
        return area;
    }

    public void setArea(double area)
    {
        this.area = area;
    }

    public void addFacility(String facility){
        this.facilities.add(facility);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Property)) return false;
        Property property = (Property) o;
        return getPropertyID() == property.getPropertyID() && Objects.equals(getOwner(), property.getOwner());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPropertyID(), getOwner());
    }

    @Override
    public String toString() {
        return "Property{" +
                "propertyID=" + propertyID +
                ", owner='" + owner + '\'' +
                ", postcode='" + postcode + '\'' +
                ", sellingPrice=" + sellingPrice +
                ", area=" + area +
                ", facilities=" + facilities +
                '}';
    }

    public void removeFacility(String facility){
        this.facilities.remove(facility);
    }
    public double calculateTax(){
        return ((this.area*2.2)+15);
    }

}
