package ru.patterns.creational.singleton;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 04.10.2020
 */

public class AnalysisProgram {
    private static AnalysisProgram analysisProgram;
    private static String analysisFile = "Results of analysis: \n\n";

    public AnalysisProgram() {
    }

    public static synchronized AnalysisProgram getAnalysisProgram() {
        if (analysisProgram == null) {
            analysisProgram = new AnalysisProgram();
        }
        return analysisProgram;
    }

    public synchronized void addDataToAnalysisFile(String data) {
        analysisFile += data + "\n";
    }

    public String showAnalysisFile() {
        return analysisFile;
    }
}
