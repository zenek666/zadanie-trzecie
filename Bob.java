package lab3;

import java.util.Base64;

public class Bob {
	
	String zakodowane  = "GCg7Ozs7Oy01e3oNMz4gP3ogP3ovPjs2NXoZM3opMz96KDUgKSAjPCg1LTs5ei4/MSkueiA7KSAjPCg1LTs0I3oqNTA/PiM0OSAjN3o4OzAuPzd0ehQ1ej41OCg7dno8Njs9O3ouNWB6CBUADRsWBSEJMzQ9Nj8CNSgYIy4/GTMqMj8oJw=="; 
    byte[] zdekodowane = Base64.getDecoder().decode(zakodowane); 
    String s = new String(zdekodowane); 
	char[] znaki = s.toCharArray();
	
	
	    public  void liczenie() {
		int[] liczby = new int[znaki.length];
		for(int i = 0; i<znaki.length; i++){
            liczby[i] = (int)znaki[i];
		   }
	    for (int a=0;a<256;a++) {
		    int[] tabelka = new int[znaki.length];
		    for(int b = 0; b<znaki.length; b++){
		    	tabelka[b] = liczby[b]^a; 	
		     }
		    
		    char[] wynik = new char[znaki.length];
		    for(int j = 0; j<znaki.length; j++){
		    	wynik[j] = (char)tabelka[j];
                System.out.print(wynik[j]);
             }
		    System.out.println("\n");
		}
	    
	    }
	
	
	public static void main(String[] args)
	{
		Bob bob=new Bob();
        bob.liczenie();
	}
	 
}  


