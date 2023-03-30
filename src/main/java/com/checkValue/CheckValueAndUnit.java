package com.checkValue;

public class CheckValueAndUnit {

    private final int valueOfSize;

    private final String unitOfValue;

    public CheckValueAndUnit(int valueOfSize,String unitOfValue){
        this.valueOfSize = valueOfSize;
        this.unitOfValue = unitOfValue;
    }

    public boolean CheckWhetherTheGivenInputIsMatching(int valueOfSize,String unitOfValue){
        return (this.valueOfSize == valueOfSize && this.unitOfValue.equals(unitOfValue)) ? true : false;
    }
}
