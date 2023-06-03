package abstractfactory;

import documents.*;
import documents.oracle.*;

import static utils.RandomSubTypeGenerator.getRandomSubType;

public class OracleFileEngineAF implements IFileEngineAF {

    @Override
    public IDoc createDoc() {
        return new OracleDoc();
    }

    @Override
    public ITableAF createTable() {
        return getRandomSubType(ITableOracle.class);
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
