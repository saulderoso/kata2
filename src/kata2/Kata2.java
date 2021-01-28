/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;

import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author sauld
 */
public class Kata2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[] data = {3,2,3,4,5,3,1,4,5,2,2,1,4,5,3};
        String[] data2 = {"JUAN", "JUAN", "LAURA", "ROSA", "JUAN", "LAURA", "ROSA", "LAURA"};
        Histogram histogram = new Histogram(data2);
        Iterator <Map.Entry<String,Integer>> entries = histogram.getHistogram().entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String,Integer> entry = entries.next();
            System.out.println("Nombre: " + entry.getKey() + " => Valor: " + entry.getValue());
        }  
    }
    
}
