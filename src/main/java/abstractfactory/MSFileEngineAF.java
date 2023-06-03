package abstractfactory;

import documents.*;
import documents.ms.*;

import static utils.RandomSubTypeGenerator.getRandomSubType;

public class MSFileEngineAF implements IFileEngineAF {

    @Override
    public IDoc createDoc() {
        return new MSDoc();
    }

    @Override
    public ITableAF createTable() {
        return getRandomSubType(ITableMS.class);
    }

    @Override
    public IEmail createEmail() {
        return new MSEmail();
    }

    @Override
    public IMsg createMsg() {
        return new MSMsg();
    }

    @Override
    public IAVMsg createAVMsg() {
        return new MSAVMsg();
    }
}
