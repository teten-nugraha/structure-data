/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structuredata.o1.Vectore;

import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Teten Nugraha
 */
public class CobaVector {
    
    static int ukuranVector;
    static Vector<Integer> vector;
    
    public static void main(String[] args) {
        System.out.print("Berapa ukuran Vector ? ");
        ukuranVector = inputData();
        buatVector();
        bacaData();
        tulisData();
    }
    
    private static int inputData() {
        int data = Integer.valueOf(JOptionPane.showInputDialog(null,"Berapa nilai vector ?"));
        return data;
    }
    
    private static void buatVector() {
        vector = new Vector<Integer>(ukuranVector);
    }
    
    private static void bacaData() {
        
        for (int i = 0; i < ukuranVector; i++) {
            int data = Integer.valueOf(JOptionPane.showInputDialog(null,"Berapa nilai vector  ke "+(i+1)+"?"));
            vector.add(data);
        }
        
    }
    
    private static void tulisData() {
        for (int i = ukuranVector-1; i >= 0; i--) {
            System.out.println("Data ke +"+(i+1)+" = "+vector.get(i));
        }
    }
    
}
