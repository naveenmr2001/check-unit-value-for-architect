package com.checkValue;

public class Length {
    private final double magnitude;

    public Length(double magnitude){
        this.magnitude = magnitude;
    }

    @Override
    public boolean equals(Object object){
        if(this == object){
            return true;
        }
        if(object.getClass() != getClass()){
            return false;
        }
        Length that = (Length) object;
        return this.magnitude == that.magnitude;
    }

    public static Length conversionKmToCentimeter(double magnitude){
        return new Length(magnitude*100000);
    }

    public static Length conversionMeterToCentimeter(double magnitude){
        return new Length(magnitude*100);
    }
}
