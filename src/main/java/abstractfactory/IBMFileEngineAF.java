package abstractfactory;

import documents.*;
import documents.ibm.*;

import static utils.RandomSubTypeGenerator.getRandomSubType;

public class IBMFileEngineAF implements IFileEngineAF {

    @Override
    public IDoc createDoc() {
        return new IBMDoc();
    }

    @Override
    public ITableAF createTable() {
        return getRandomSubType(ITableIBM.class);
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
