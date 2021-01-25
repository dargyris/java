package org.example.a._junit.utilities;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/* Parameterized Test Highlights
/  - Annotation of test class: @RunWith(Parameterized.class)
/  - Instantiation of the class which contains the method to be tested.
/  - Private fields for the input and output values.
/  - Constructor of the testing class. Assigning only the input and output vars.
/  - Annotation of the testConditions method: @Parameterized.Parameters
/  - Test method declaration:
     public static Collection<Object[]> testConditions() {
/        return Arrays.asList(new Object[][] {
         {,,}, {,,}, {,,}, ... {,,}
/    )};
/    }
**/

@RunWith(Parameterized.class)
public class UtilitiesTestParameterized {
    private Utilities util;

    private String input;
    private String output;

    public UtilitiesTestParameterized(String input, String output) {
        this.input = input;
        this.output = output;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions() {
        return Arrays.asList(new Object[][] {
                {"ABCDEFF", "ABCDEF"},
                {"AB88EFFG", "AB8EFG"},
                {"112233445566", "123456"},
                {"ZYZQQB", "ZYZQB"},
                {"A", "A"}
        });
    }

    @Test
    public void removePairsRemovesOneCharacterOfAnyConsecutiveCharPairs() {
        assertEquals(output, util.removePairs(input));
    }
}
