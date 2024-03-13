package junit5test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTests {

    @ParameterizedTest(name = "Run: {index} - value: {arguements}") // TO make it human-readable at the console add (name = "Run: {index} - value: {arguements}")
    @ValueSource(ints = {1,3,5})
    void intValues(int theParam){

        System.out.println("theParam = " + theParam);
    }

    @ParameterizedTest
    @EmptySource // Use to parse in empty parameter
    @NullSource // Use to parse in null value
    @NullAndEmptySource // Use to get null and empty value
    @ValueSource(strings = {"firstString", "secondString"})
    void stringValues(String theParam){
        System.out.println("theParam = " + theParam);
    }
}
