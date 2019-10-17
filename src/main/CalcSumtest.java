package main;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalcSumtest {
    Calculator calculator;
    String numFilepath;

    @Before public void setUp() {
        this.calculator = new Calculator();
        this.numFilepath = getClass().getResource("/main/resources/memters.txt").getPath();
    }

    @Test
    public void sumOfNumbers() throws IOException{
        assertThat(calculator.calcSum(this.numFilepath), is(10));
    }

    @Test
    public void multiplyOfNumbers() throws IOException{
        assertThat(calculator.calcMultiply(this.numFilepath), is(24));
    }


    @Test
    public void concatOfNumbers() throws IOException{
        assertThat(calculator.concatenate(this.numFilepath), is("01234"));
    }
}
