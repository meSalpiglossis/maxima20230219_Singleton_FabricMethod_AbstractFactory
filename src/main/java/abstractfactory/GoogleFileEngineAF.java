package abstractfactory;

import documents.*;
import documents.google.*;
import documents.ibm.IBMTableComplex;
import documents.ibm.IBMTableHierarchical;
import documents.ibm.IBMTableSimple;
import utils.Randomiser;

public class GoogleFileEngineAF implements IFileEngineAF {

    @Override
    public IDoc createDoc() {
        return new GoogleDoc();
    }

    @Override
    public ITable createTable() {
        switch (Randomiser.getRandomTableType()) {
            case 0 -> {
                return new GoogleTableComplex();
            }
            case 1 -> {
                return new GoogleTableHierarchical();
            }
            default -> {
                return new GoogleTableSimple();
            }
        }
    }

    @Override
    public IEmail createEmail() {
        return new GoogleEmail();
    }

    @Override
    public IMsg createMsg() {
        return new GoogleMsg();
    }

    @Override
    public IAVMsg createAVMsg() {
        return new GoogleAVMsg();
    }
}
