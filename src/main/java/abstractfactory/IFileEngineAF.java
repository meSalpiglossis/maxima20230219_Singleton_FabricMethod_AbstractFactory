package abstractfactory;

import documents.*;

public interface IFileEngineAF {

    IDoc createDoc();

    ITable createTable();

    IEmail createEmail();

    IMsg createMsg();

    IAVMsg createAVMsg();

}
