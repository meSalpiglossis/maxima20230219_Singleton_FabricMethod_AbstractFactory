package factorymethod;

import documents.*;

public class FileEngine {

    private static FileEngine instance;

    private FileEngine() {
        System.out.println("FileEngine default constructor");
    }

    public static FileEngine getInstance() {
        System.out.println("FileEngine getInstance");

        if (instance == null) {
            instance = new FileEngine();
        }
        return instance;
    }

    //Factory method #1
    public IDoc createDoc() {
        //TODO: Add complex logic
        return new OracleDoc();
    }

    //Factory method #2
    public ITable createTable() {
        //TODO: Add complex logic
        return new IBMTableComplex();
    }

    //Factory method #3
    public IEmail createEmail() {
        //TODO: Add complex logic
        return new MSEmail();
    }

    //Factory method #4
    public IMsg createMsg() {
        //TODO: Add complex logic
        return new MSMsg();
    }

    //Factory method #5
    public IAVMsg createAVMsg() {
        //TODO: Add complex logic
        return new MSAVMsg();
    }

}
