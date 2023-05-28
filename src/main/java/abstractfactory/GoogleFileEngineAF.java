package abstractfactory;

import documents.*;
import documents.google.*;

import static utils.RandomSubTypeGenerator.getRandomSubType;

public class GoogleFileEngineAF implements IFileEngineAF {

    @Override
    public IDoc createDoc() {
        return new GoogleDoc();
    }

    @Override
    public ITableAF createTable() {
        return getRandomSubType(ITableGoogle.class);
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
