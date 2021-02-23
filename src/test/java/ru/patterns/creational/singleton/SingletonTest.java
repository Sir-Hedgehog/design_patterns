package ru.patterns.creational.singleton;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 04.10.2020
 */

public class SingletonTest {
    @Test
    public void checkSinglePresentOfAnalysisProgram() {
        String singlePresent1 = AnalysisProgram.getAnalysisProgram().toString();
        String singlePresent2 = AnalysisProgram.getAnalysisProgram().toString();
        String singlePresent3 = AnalysisProgram.getAnalysisProgram().toString();
        String singlePresent4 = AnalysisProgram.getAnalysisProgram().toString();
        String singlePresent5 = AnalysisProgram.getAnalysisProgram().toString();
        assertEquals(singlePresent1, singlePresent2);
        assertEquals(singlePresent2, singlePresent3);
        assertEquals(singlePresent3, singlePresent4);
        assertEquals(singlePresent4, singlePresent5);
    }

    @Test
    public void checkResultOfSingleObject() {
        AnalysisProgram.getAnalysisProgram().addDataToAnalysisFile("Memory cache: 16128Mb");
        AnalysisProgram.getAnalysisProgram().addDataToAnalysisFile("Stack: 10Mb");
        AnalysisProgram.getAnalysisProgram().addDataToAnalysisFile("Work time: 131 days 13 hours 7 minutes 14 seconds");
        String result = AnalysisProgram.getAnalysisProgram().showAnalysisFile();
        String expected = "Results of analysis: \n\n" + "Memory cache: 16128Mb\n" + "Stack: 10Mb\n" + "Work time: 131 days 13 hours 7 minutes 14 seconds\n";
        assertEquals(result, expected);
    }
}
