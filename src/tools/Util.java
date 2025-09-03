/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import java.util.Date;
import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

/**
 *
 * @author u06769516195
 */
public class Util {

    public static void habilitar(boolean valor, JComponent... componentes) {
        for (int i = 0; i < componentes.length; i++) {
            componentes[i].setEnabled(valor);

        }
    }

    public static void limpar(JComponent... componentes) {
        for (int i = 0; i < componentes.length; i++) {
            if (componentes[i] instanceof JTextField) {
                ((JTextField) componentes[i]).setText("");
            } else if (componentes[i] instanceof JComboBox) {
                ((JComboBox) componentes[i]).setSelectedIndex(-1);
            } else if (componentes[i] instanceof JCheckBox) {
                ((JCheckBox) componentes[i]).setSelected(false);
            } else if (componentes[i] instanceof JFormattedTextField) {
                ((JFormattedTextField) componentes[i]).setText("");
            } else if (componentes[i] instanceof JPasswordField) {
                ((JPasswordField) componentes[i]).setText("");
            }
        }
    }
    
    public static void mensagem (String cad) {
        JOptionPane.showMessageDialog(null, cad);
    }
    public static boolean pergunta(String cad) {
        JOptionPane.showConfirmDialog(null, cad);
        return true;
    }
    public static int strToInt (String num) {
        return Integer.valueOf(num);
    }
    public static String atrToInt (String num) {
        return String.valueOf(num);
    }
    public static double strToDouble (String num) {
        return 0.0;
    }
    public static String doubleToStr (String num) {
        return "";
    }
    public static Date strToDate (String data) {
        return null;
    }
    public static String strToStr (Date data) {
        return "";
    }
  
}
