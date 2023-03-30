package com.checkValue;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;


public class CheckValueForArchitectTest {

    @Nested
    class CheckValue{

        CheckValueAndUnit valueOf1Cm = new CheckValueAndUnit(1,"cm");

        @Test
        void ToCheckIfEqualForInputFor1Cm(){

            Boolean actualValue = valueOf1Cm.CheckWhetherTheGivenInputIsMatching(1,"cm");

            assertThat(actualValue,is(equalTo(true)));

        }

        @Test
        void ToCheckIfNotEqualsForInputFor2Cm(){

            Boolean actualValue = valueOf1Cm.CheckWhetherTheGivenInputIsMatching(2,"cm");

            assertThat(actualValue,is(not(equalTo(true))));

        }

    }

}

