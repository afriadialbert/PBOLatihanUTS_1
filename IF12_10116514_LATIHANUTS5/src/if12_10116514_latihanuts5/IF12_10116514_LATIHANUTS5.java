/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if12_10116514_latihanuts5;

/**
 *
 * @author Acer
 */
public class IF12_10116514_LATIHANUTS5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JajarGenjang jg = new JajarGenjang(50, 60, 70, 80, 100, 120);
        Segitiga sg = new Segitiga(50, 60, 70, 100, 120);
        
        jg.hitungKeliling();
        jg.hitungLuas();
        sg.hitungKeliling();
        sg.hitungLuas();
    }
    
}
