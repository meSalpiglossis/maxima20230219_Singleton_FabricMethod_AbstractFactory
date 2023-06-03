package abstractfactory;

import static utils.RandomSubTypeGenerator.getRandomSubType;

public class ConfigurationEngine {

    private static IFileEngineAF fileEngineInstance;

    public static IFileEngineAF createFileEngineAF() {
        if (fileEngineInstance == null) {
            fileEngineInstance = getRandomSubType(IFileEngineAF.class);
        }
        return fileEngineInstance;

    }
}
