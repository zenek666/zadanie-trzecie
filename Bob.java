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
	        try{
			
			FileWriter fileWriter = new FileWriter("C:/Users/DELL/Desktop/zenek.txt");
			PrintWriter printWriter = new PrintWriter(fileWriter);
	        for (int a=0;a<256;a++) {
	  
	    	   int[] tabelka = new int[s.length()];
	    	   char[] wynik = new char[s.length()];
	    	
	    	   printWriter.println(a);
	    	
		    for(int b = 0; b<s.length(); b++){
		    	tabelka[b] = liczby[b]^a; 	
		     }
		    
		    
		    for(int j = 0; j<s.length(); j++){
		    	wynik[j] = (char)tabelka[j];
		    	printWriter.print(wynik[j]);
		    }
		    
		    printWriter.print("\n");
		    
		    }
	  
	        printWriter.close();
		  } catch (Exception e) {
			e.printStackTrace();
		   }
	    
	    }
	
	
	public static void main(String[] args)
	{
		Bob bob=new Bob();
        bob.liczenie();
	}
	 
}  


