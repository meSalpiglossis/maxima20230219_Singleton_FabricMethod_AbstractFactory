package factorymethod;

import documents.*;

public class Main {
    public static void main(String[] args) {

        IDoc docForNewEmployee      = FileEngine.getInstance().createDoc();
        ITable tableForNewEmployee  = FileEngine.getInstance().createTable();
        IEmail emailForNewEmployee  = FileEngine.getInstance().createEmail();
        IMsg msgForNewEmployee      = FileEngine.getInstance().createMsg();
        IAVMsg avmsgForNewEmployee  = FileEngine.getInstance().createAVMsg();

        System.out.println(docForNewEmployee);
        System.out.println(tableForNewEmployee);
        System.out.println(emailForNewEmployee);
        System.out.println(msgForNewEmployee);
        System.out.println(avmsgForNewEmployee);

    }
}
