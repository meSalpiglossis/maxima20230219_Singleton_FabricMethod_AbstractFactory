package abstractfactory;

import documents.*;

public interface IFileEngineAF {

    IDoc createDoc();

    ITableAF createTable();

    IEmail createEmail();

    IMsg createMsg();

    IAVMsg createAVMsg();

}
