package abstractfactory;

public class ConfigurationEngine {

    private static IFileEngineAF fileEngineInstance;

    private ConfigurationEngine() {
        System.out.println("ConfigurationEngine default constructor");
    }

    public static IFileEngineAF createFileEngineAF() {

        if (fileEngineInstance == null) {
            fileEngineInstance = new MSFileEngineAF();
        }
        return fileEngineInstance;
    }
}
