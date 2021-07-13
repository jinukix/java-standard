package ch10;

import java.text.MessageFormat;
import java.text.*;

public class MessageFormatEx {
    public static void main(String[] args) throws ParseException {
        String tableName = "CUST_INFO";
        String msg = "INSERT INTO "+ tableName +" VALUES (''{0}'',''{1}'',{2},''{3}'');";

        Object[][] arguments = {
                {"전화번호1","02-123-1234", "27", "07-09"},
                {"전화번호2","032-333-1234", "33", "10-07"},
        };

        for(int i=0; i < arguments.length;i++) {
            String result = MessageFormat.format(msg, arguments[i]);
            System.out.println(result);
        }

        String[] data = {
                "INSERT INTO CUST_INFO VALUES ('전화번호1', '02-123-1234', 27, '07-09');",
                "INSERT INTO CUST_INFO VALUES ('전화번호2', '032-333-1234', 33, '10-07');"
        };
        String pattern = "INSERT INTO CUST_INFO VALUES ({0},{1},{2},{3});";
        MessageFormat mf = new MessageFormat(pattern);

        for (int i=0; i < data.length;i++) {
            Object[] objs = mf.parse(data[i]);
            for (int j=0; j < objs.length; j++) {
                System.out.print(objs[j] + ",");
            }
            System.out.println();
        }
    }
}
