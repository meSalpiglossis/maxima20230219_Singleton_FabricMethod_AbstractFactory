package abstractfactory;

import documents.*;
import documents.ibm.*;
import documents.oracle.OracleTableComplex;
import documents.oracle.OracleTableHierarchical;
import documents.oracle.OracleTableSimple;
import utils.Randomiser;

public class IBMFileEngineAF implements IFileEngineAF {

    @Override
    public IDoc createDoc() {
        return new IBMDoc();
    }

    @Override
    public ITable createTable() {
        switch (Randomiser.getRandomTableType()) {
            case 0 -> {
                return new IBMTableComplex();
            }
            case 1 -> {
                return new IBMTableHierarchical();
            }
            default -> {
                return new IBMTableSimple();
            }
        }
    }

    @Override
    public IEmail createEmail() {
        return new IBMEmail();
    }

    @Override
    public IMsg createMsg() {
        return new IBMMsg();
    }

    @Override
    public IAVMsg createAVMsg() {
        return new IBMAVMsg();
    }

}
