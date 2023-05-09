package factorymethod;

import documents.*;
import documents.apple.*;
import documents.google.*;
import documents.ibm.*;
import documents.ms.*;
import documents.oracle.*;
import utils.Randomiser;

public class FileEngine {

    private static FileEngine instance;

    private FileEngine() {
    }

    public static FileEngine getInstance() {
        if (instance == null) {
            instance = new FileEngine();
        }
        return instance;
    }

    //Factory method #1
    public IDoc createDoc() {
        switch (Randomiser.getRandomSystem()) {
            case 0 -> {
                return new AppleDoc();
            }
            case 1 -> {
                return new GoogleDoc();
            }
            case 2 -> {
                return new IBMDoc();
            }
            case 3 -> {
                return new MSDoc();
            }
            default -> {
                return new OracleDoc();
            }
        }
    }

    //Factory method #2
    public ITable createTable() {
        switch (Randomiser.getRandomTable()) {
            case 0 -> {
                return new AppleTableComplex();
            }
            case 1 -> {
                return new AppleTableHierarchical();
            }
            case 2 -> {
                return new AppleTableSimple();
            }
            case 3 -> {
                return new GoogleTableComplex();
            }
            case 4 -> {
                return new GoogleTableHierarchical();
            }
            case 5 -> {
                return new GoogleTableSimple();
            }
            case 6 -> {
                return new IBMTableComplex();
            }
            case 7 -> {
                return new IBMTableHierarchical();
            }
            case 8 -> {
                return new IBMTableSimple();
            }
            case 9 -> {
                return new MSTableComplex();
            }
            case 10 -> {
                return new MSTableHierarchical();
            }
            case 11 -> {
                return new MSTableSimple();
            }
            case 12 -> {
                return new OracleTableComplex();
            }
            case 13 -> {
                return new OracleTableHierarchical();
            }
            default -> {
                return new OracleTableSimple();
            }
        }
    }

    //Factory method #3
    public IEmail createEmail() {
        switch (Randomiser.getRandomSystem()) {
            case 0 -> {
                return new AppleEmail();
            }
            case 1 -> {
                return new GoogleEmail();
            }
            case 2 -> {
                return new IBMEmail();
            }
            case 3 -> {
                return new MSEmail();
            }
            default -> {
                return new OracleEmail();
            }
        }
    }

    //Factory method #4
    public IMsg createMsg() {
        switch (Randomiser.getRandomSystem()) {
            case 0 -> {
                return new AppleMsg();
            }
            case 1 -> {
                return new GoogleMsg();
            }
            case 2 -> {
                return new IBMMsg();
            }
            case 3 -> {
                return new MSMsg();
            }
            default -> {
                return new OracleMsg();
            }
        }
    }

    //Factory method #5
    public IAVMsg createAVMsg() {
        switch (Randomiser.getRandomSystem()) {
            case 0 -> {
                return new AppleAVMsg();
            }
            case 1 -> {
                return new GoogleAVMsg();
            }
            case 2 -> {
                return new IBMAVMsg();
            }
            case 3 -> {
                return new MSAVMsg();
            }
            default -> {
                return new OracleAVMsg();
            }
        }
    }

}
