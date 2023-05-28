package factorymethod;

import documents.*;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            IDoc docForNewEmployee = FileEngine.getInstance().createDoc();
            System.out.println(docForNewEmployee);
        }

        for (int i = 0; i < 15; i++) {
            ITable tableForNewEmployee = FileEngine.getInstance().createTable();
            System.out.println(tableForNewEmployee);
        }

        for (int i = 0; i < 5; i++) {
            IEmail emailForNewEmployee = FileEngine.getInstance().createEmail();
            System.out.println(emailForNewEmployee);
        }

        for (int i = 0; i < 5; i++) {
            IMsg msgForNewEmployee = FileEngine.getInstance().createMsg();
            System.out.println(msgForNewEmployee);
        }

        for (int i = 0; i < 5; i++) {
            IAVMsg avmsgForNewEmployee = FileEngine.getInstance().createAVMsg();
            System.out.println(avmsgForNewEmployee);
        }
    }
}
