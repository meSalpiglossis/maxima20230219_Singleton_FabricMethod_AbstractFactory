package abstractfactory;

public class MSFileEngineAF implements IFileEngineAF {
    @Override
    public IDoc createDoc() {
        return new MSDoc();
    }

    @Override
    public ITable createTable() {
        return new MSTableComplex();
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
