package javaapplication1;

import javaapplication1.geometria.Forma;
import javaapplication1.geometria.Rettangolo;
import javaapplication1.geometria.Cerchio;
import javaapplication1.geometria.CerchioIntf;

/**
 *
 * @author utente
 */
public class JavaApplication1 {
    /**
     * 
     * @param a
     * @param b
     * @return 
     */
    static int m3(int a, int b) {
        int c= a*a+b*b;
        return c;
    }
    
    
    // la stringa è IMMMMMUTABILE.
    
    public static void main(String[] args) {
        // Qua richiamiamo il metodo di cui sopra
//        Integer i= new Integer (m3(11,11));
//        if(!(i>100)){
//            System.out.println("Belìn siamo " + i.toString());
//        }else{
//            System.out.println("Hai " + i.toString() +" carie");
//        }
        Forma cerchi[] = new Forma[5];
        for(int i=0;i<cerchi.length;i++){
            cerchi[i] = new Cerchio(Math.random()*10);
        }
        
        for(int i=0;i<cerchi.length;i++){
            String nano = "";
            switch(i){
                
                case 0 : nano="Eolo"; 
                case 1 : nano="Pisolo"; break;
                case 2 : nano="Dotto"; break;
                case 3 : nano="Brontolo"; break;
                case 4 : nano="Cucciolo"; break;
                                    
                default : nano="Mignolo"; break;
            }            
            System.out.println("Il nano è:"+nano);
            //sto dicendo che 78 è un double, codice meno ambiguo possibile, evito la conversione.
            if(cerchi[i].area()<78d){ 
                String s = String.format("Il cerchio %d è piccolo e la sua area è %f", i, cerchi[i].area());
                System.out.println(s);
            } else {
                String s = String.format("Il cerchio %d è grande e la sua area è %f", i, cerchi[i].area());
                System.out.println(s);
            }
        }
        Forma rotondo = new Cerchio(44);
        Forma palla = new Cerchio(5);
        
        Forma cerchietti[]=new Forma[2]; 
        cerchietti[0]=rotondo;
        cerchietti[1]=palla;
        
        
        
        Forma cerchis[] = new Forma[] {rotondo, palla};
        
        for(int i=0;i<cerchis.length;i++){
            
            
            System.out.println("Area cerchio["+i+"]:"+cerchis[i].area());
        }
        int j=0;
        while(j<cerchis.length){
            System.out.println("Area cerchio["+j+"]:"+cerchis[j].area());            
            j++;
        }
        
        
        //System.out.println(rotondo.getR() + "La metà della circonferenza panza di Caria è: ");
        Forma storto = new Rettangolo(8,7);
//        storto.setB(25);
//        System.out.println("La base di Caria è: " + storto.getB());
//        storto.setH(35);
//        System.out.println("L'altezza di Caria è: " + storto.getH());
//        System.out.println("Caria occupa " + storto.area(5,10) + " ettari");
//        System.out.println("Posizione " + storto);
            //System.out.println("Area rotondo:" + rotondo.area());
            //System.out.println("Area palla:" + palla.area());
            //System.out.println("Area storto:" + storto.area());
    }    
    
}
