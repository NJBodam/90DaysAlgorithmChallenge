import javax.swing.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlgorithmChallenge {

    public static boolean match(String str1, String str2) {

        int count = 0;
        for(int i = 0; i < str1.length(); i++) {
            if (Character.getNumericValue(str1.charAt(i)) ==
                    Character.getNumericValue(str2.charAt(i)) - 1 ||
                    Character.getNumericValue(str1.charAt(i)) ==
                            Character.getNumericValue(str2.charAt(i)) + 1) {
                count++;
            }
        }
        return count == str1.length();
    }

    public static int countFamilyLogins(List<String> logins) {

        int num = logins.size();
        int familyLogins = 0;

        for (int i = 0; i < num; i++) {
            for (int j = i + 1; j < num; j++)
            if (match(logins.get(i), logins.get(j))) {
                familyLogins++;
            }
        }
        return familyLogins;
    }


    public static void main(String[] args) {

//        List<String> logins = new ArrayList<>(Arrays.asList("cbu", "bat", "cbu", "eqtp", "corn"));
//        System.out.println(countFamilyLogins(logins));

        ArrayList<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
        // write your code here
        nameList.forEach(System.out::println);
        int k = 7;

        int[] a = {10,9,13,1,13,2,8,5,7,1,20,6,4,18,19,17,5,19,9,18};
        boolean f = false;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == k) {
                f = true;
                if (f==true) {
                    System.out.println("quack");
                } else {
                    System.out.println("wave");
                }
            }

        }



//
//
//        //Password App
//        final JPasswordField jpf = new JPasswordField();
//        final JTextField filenameField = new JTextField();
//
//        JOptionPane jop = new JOptionPane(jpf, JOptionPane.QUESTION_MESSAGE,
//                JOptionPane.OK_CANCEL_OPTION);
//
//        JDialog dialog = jop.createDialog("Password:");
//        dialog.addComponentListener(new ComponentAdapter() {
//            @Override
//            public void componentShown(ComponentEvent e) {
//                SwingUtilities.invokeLater(new Runnable() {
//                    @Override
//                    public void run() {
//                        jpf.requestFocusInWindow();
//                    }
//                });
//            }
//        });
//        dialog.setVisible(true);
//        int result = (Integer) jop.getValue();
//        dialog.dispose();
//        char[] password = null;
//        if (result == JOptionPane.OK_OPTION) {
//            password = jpf.getPassword();
//        }
//        if (password != null)
//
//           // jpf.setText();
//            System.out.println("your password: " + new String(password));
    }

}
