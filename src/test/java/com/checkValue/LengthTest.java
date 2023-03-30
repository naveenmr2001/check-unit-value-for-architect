package com.checkValue;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static com.checkValue.Centimeter.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;


public class CheckValueForArchitectTest {

    @Nested
    class CheckValue{

        @Test
        void ToCheckIfEqualForInputFor1Cm(){

            Centimeter oneCentimeter = new Centimeter(1);

            Centimeter anotheroneCentimeter = new Centimeter(1);

            assertThat(oneCentimeter,is(equalTo(anotheroneCentimeter)));

        }

        @Test
        void ToCheckIfNotEqualsForInputFor2Cm(){

            Centimeter oneCentimeter = new Centimeter(1);

            Centimeter anotheroneCentimeter = new Centimeter(2);

            assertThat(oneCentimeter,is(not(equalTo(anotheroneCentimeter))));
        }

        @Test
        void toCheckIf1MeterIsEqualTo100Centimeter(){

            Centimeter oneMeter = conversionMeterToCentimeter(1);

            Centimeter _100Centimeter = new Centimeter(100);

            assertThat(oneMeter,is(equalTo(_100Centimeter)));
        }

        @Test
        void toCheckIf100CentimeterIsEqualTo0Point1Km(){

            Centimeter _100Centimeter = new Centimeter(100);

            Centimeter conversionKmToCm = conversionKmToCentimeter(0.1);

            assertThat(conversionKmToCm,is(not(equalTo(_100Centimeter))));
        }

        @Test
        void toCheckIf1MeterIsEqualTo1000Centimeter(){

            Centimeter oneMeter = conversionMeterToCentimeter(1);

            Centimeter _100Centimeter = new Centimeter(1000);

            assertThat(oneMeter,is(not(equalTo(_100Centimeter))));
        }

        @Test
        void toCheckIf100CentimeterIsNotEqualTo0Point1Km(){

            Centimeter oneMeter = conversionKmToCentimeter(1);

            Centimeter _100000Centimeter = new Centimeter(100000);

            assertThat(oneMeter,is(equalTo(_100000Centimeter)));
        }
    }

}

