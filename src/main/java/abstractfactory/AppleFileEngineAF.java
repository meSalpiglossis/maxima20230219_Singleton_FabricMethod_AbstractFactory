package abstractfactory;

import documents.*;
import documents.apple.*;
import documents.google.GoogleTableComplex;
import documents.google.GoogleTableHierarchical;
import documents.google.GoogleTableSimple;
import utils.Randomiser;

public class AppleFileEngineAF implements IFileEngineAF {

    @Override
    public IDoc createDoc() {
        return new AppleDoc();
    }

    @Override
    public ITable createTable() {
        switch (Randomiser.getRandomTableType()) {
            case 0 -> {
                return new AppleTableComplex();
            }
            case 1 -> {
                return new AppleTableHierarchical();
            }
            default -> {
                return new AppleTableSimple();
            }
        }
    }

    @Override
    public IEmail createEmail() {
        return new AppleEmail();
    }

    @Override
    public IMsg createMsg() {
        return new AppleMsg();
    }

    @Override
    public IAVMsg createAVMsg() {
        return new AppleAVMsg();
    }
}
