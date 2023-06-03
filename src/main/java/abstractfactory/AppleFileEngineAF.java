package abstractfactory;

import documents.*;
import documents.apple.*;

import static utils.RandomSubTypeGenerator.getRandomSubType;

public class AppleFileEngineAF implements IFileEngineAF {

    @Override
    public IDoc createDoc() {
        return new AppleDoc();
    }

    @Override
    public ITableAF createTable() {
        return getRandomSubType(ITableAF.class);
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
