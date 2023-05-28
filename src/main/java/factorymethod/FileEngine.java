package factorymethod;

import documents.*;

import static utils.RandomSubTypeGenerator.getRandomSubType;

public class FileEngine {

    private static FileEngine instance;

    public static FileEngine getInstance() {
        if (instance == null) {
            instance = new FileEngine();
        }
        return instance;
    }

    //Factory method #1
    public IDoc createDoc() {
        return getRandomSubType(IDoc.class);
    }

    //Factory method #2
    public ITable createTable() {
        return getRandomSubType(ITable.class);
    }

    //Factory method #3
    public IEmail createEmail() {
        return getRandomSubType(IEmail.class);
    }

    //Factory method #4
    public IMsg createMsg() {
        return getRandomSubType(IMsg.class);
    }

    //Factory method #5
    public IAVMsg createAVMsg() {
        return getRandomSubType(IAVMsg.class);
    }
}
