package Principal;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Prova {

    public void inici() {
        String filename = "prova.X68";
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(filename);
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);

            String s = "*-----------------------------------------------------------\n" +
                    "* Title      : Compilador\n" +
                    "* Written by : Pere Joan Vives Morey\n" +
                    "* Date       : 2/02/2024\n" +
                    "* Description: \n" +
                    "*-----------------------------------------------------------\n" +
                    "          ORG    $1000";

            dataOutputStream.writeBytes(s);

            // Close the streams to flush and release resources
            dataOutputStream.close();
            fileOutputStream.close();

        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }

    public Integer prova() {
        return 0;
    }

    Integer a = 5 + prova();

    public static void main(String[] args) {
        int a = 3;
        System.out.println(a);
    }
}
