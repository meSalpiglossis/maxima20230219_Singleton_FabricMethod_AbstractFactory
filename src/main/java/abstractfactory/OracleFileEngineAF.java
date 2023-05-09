package abstractfactory;

import documents.*;
import documents.ms.MSTableComplex;
import documents.ms.MSTableHierarchical;
import documents.ms.MSTableSimple;
import documents.oracle.*;
import utils.Randomiser;

public class OracleFileEngineAF implements IFileEngineAF {

    @Override
    public IDoc createDoc() {
        return new OracleDoc();
    }

    @Override
    public ITable createTable() {
        switch (Randomiser.getRandomTableType()) {
            case 0 -> {
                return new OracleTableComplex();
            }
            case 1 -> {
                return new OracleTableHierarchical();
            }
            default -> {
                return new OracleTableSimple();
            }
        }
    }

    @Override
    public IEmail createEmail() {
        return new OracleEmail();
    }

    @Override
    public IMsg createMsg() {
        return new OracleMsg();
    }

    @Override
    public IAVMsg createAVMsg() {
        return new OracleAVMsg();
    }
}
