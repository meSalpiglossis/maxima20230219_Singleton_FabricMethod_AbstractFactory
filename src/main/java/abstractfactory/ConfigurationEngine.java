package abstractfactory;

import documents.apple.AppleDoc;
import documents.google.GoogleDoc;
import documents.ibm.IBMDoc;
import documents.ms.MSDoc;
import documents.oracle.OracleDoc;
import utils.Randomiser;

public class ConfigurationEngine {

    private static IFileEngineAF fileEngineInstance;

    private ConfigurationEngine() {
        System.out.println("ConfigurationEngine default constructor");
    }

    public static IFileEngineAF createFileEngineAF() {
        if (fileEngineInstance == null) {
            switch (Randomiser.getRandomSystem()) {
                case 0 -> {
                    fileEngineInstance =  new AppleFileEngineAF();
                }
                case 1 -> {
                    fileEngineInstance =  new GoogleFileEngineAF();
                }
                case 2 -> {
                    fileEngineInstance =  new IBMFileEngineAF();
                }
                case 3 -> {
                    fileEngineInstance =  new MSFileEngineAF();
                }
                default -> {
                    fileEngineInstance =  new OracleFileEngineAF();
                }
            }
        }
        return fileEngineInstance;
    }
}
