package com.checkValue;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static com.checkValue.Length.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;


public class LengthTest {

    @Nested
    class CheckValue{

        @Test
        void ToCheckIfEqualForInputFor1Cm(){

            Length oneCentimeter = centimeter(1.0);

            Length anotherCentimeter = centimeter(1);

            assertThat(oneCentimeter,is(equalTo(anotherCentimeter)));

        }

        @Test
        void ToCheckIfNotEqualsForInputFor2Cm(){

            Length oneCentimeter = centimeter(1.0);

            Length anotherCentimeter = centimeter(2.0);

            assertThat(oneCentimeter,is(not(equalTo(anotherCentimeter))));
        }

        @Test
        void toCheckIf1MeterIsEqualTo100Centimeter(){

            Length oneMeter = meter(1.0);

            Length _100Centimeter = centimeter(100);

            assertThat(oneMeter,is(equalTo(_100Centimeter)));
        }

        @Test
        void toCheckIf100CentimeterIsEqualTo0Point1Km(){

            Length _100Centimeter = centimeter(100);

            Length conversionKmToCm = kilometer(0.1);

            assertThat(conversionKmToCm,is(not(equalTo(_100Centimeter))));
        }

        @Test
        void toCheckIf1MeterIsEqualTo1000Centimeter(){

            Length oneMeter = meter(1);

            Length _100Centimeter = centimeter(100);

            assertThat(oneMeter,is(equalTo(_100Centimeter)));
        }

        @Test
        void toCheckIf100CentimeterIsNotEqualTo0Point1Km(){

            Length oneMeter = kilometer(1);

            Length _100000Centimeter = centimeter(100000);

            assertThat(oneMeter,is(equalTo(_100000Centimeter)));
        }

        @Test
        void toCheckIf1MeterPlus100CentimeterTo2Meter(){

            Length oneMeter = kilometer(1);

            Length _100Centimeter = centimeter(100);

            Length twoMeter = meter(2);

            assertThat(oneMeter.arithmetic(_100Centimeter),is(not(equalTo(twoMeter))));

        }

        @Test
        void toCheckIf200CentiMeterPlus1KilometerTo100200Meter(){

            Length _200CentiMeter = centimeter(200);

            Length _1Kilometer = kilometer(1);

            Length _1LakhsTwoThousandMeter = centimeter(100200);

            assertThat(_200CentiMeter.arithmetic(_1Kilometer),is(equalTo(_1LakhsTwoThousandMeter)));
        }
    }
}

