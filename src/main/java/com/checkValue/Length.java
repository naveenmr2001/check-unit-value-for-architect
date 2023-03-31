package com.checkValue;

public class Length {

    private static class Unit{
        static final Unit cm = new Unit(0.01);
        static final Unit m = new Unit(1);

        static final Unit km = new Unit(1000);
        private final double baseFactor;

        private Unit(double baseFactor){
            this.baseFactor = baseFactor;
        }
    }

    private final double magnitude;

    private final Unit unit;

    public static Length meter(double magnitude){
        return new Length(magnitude,Unit.m);
    }

    public static Length kilometer(double magnitude){
        return new Length(magnitude,Unit.km);
    }

    public static Length centimeter(double magnitude){
        return new Length(magnitude,Unit.cm);
    }


    public Length(double magnitude,Unit unit){
        this.magnitude = magnitude;
        this.unit = unit;
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
//        double check1 = this.Conversion(Unit.m);
//        double check2 = that.Conversion(Unit.m);
//        System.out.println(check1+" "+check2);
        return this.Conversion(Unit.m) == that.Conversion(Unit.m);
    }

    public double Conversion(Unit unitObj){
        return this.magnitude * (unit.baseFactor/unitObj.baseFactor);
    }

    public Length arithmetic(Length secondObjectToAdd){
        return new Length(this.magnitude + secondObjectToAdd.Conversion(unit),unit);
    }
}