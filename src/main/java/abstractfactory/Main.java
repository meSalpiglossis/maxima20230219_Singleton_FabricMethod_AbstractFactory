package abstractfactory;

import documents.*;

public class Main {
    public static void main(String[] args) {

        IFileEngineAF fileEngineAF = ConfigurationEngine.createFileEngineAF();

        IDoc docForNewEmployeeConsistent      = fileEngineAF.createDoc();
        ITable tableForNewEmployeeConsistent  = fileEngineAF.createTable();
        IEmail emailForNewEmployeeConsistent  = fileEngineAF.createEmail();
        IMsg msgForNewEmployeeConsistent      = fileEngineAF.createMsg();
        IAVMsg avmsgForNewEmployeeConsistent  = fileEngineAF.createAVMsg();

        System.out.println(docForNewEmployeeConsistent);
        System.out.println(tableForNewEmployeeConsistent);
        System.out.println(emailForNewEmployeeConsistent);
        System.out.println(msgForNewEmployeeConsistent);
        System.out.println(avmsgForNewEmployeeConsistent);
    }
}
