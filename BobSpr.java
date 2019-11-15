package lab3;

import java.util.Base64;

public class BobSpr {
	
	String zdanie = "Braaaaawo! Widze ze udalo Ci sie rozszyfrowac tekst zaszyfrowany pojedynczym bajtem. No dobra, flaga to: ROZWAL_{SingleXorByteCipher}";
	char[] znaki = zdanie.toCharArray();
	
	public  void liczenie() {
		int[] liczby = new int[znaki.length];
		char[] wynik = new char[znaki.length];
		char znaczek = 'Z';
		int z = (int)znaczek;
		
		for(int i = 0; i<znaki.length; i++){
            liczby[i]=(int)znaki[i];
            wynik[i]=(char)(liczby[i]^z);
		   }
		
		String string = new String(wynik);
		
		   String zakodowane = Base64.getEncoder().encodeToString(string.getBytes()); 
		   String wzor = "GCg7Ozs7Oy01e3oNMz4gP3ogP3ovPjs2NXoZM3opMz96KDUgKSAjPCg1LTs5ei4/MSkueiA7KSAjPCg1LTs0I3oqNTA/PiM0OSAjN3o4OzAuPzd0ehQ1ej41OCg7dno8Njs9O3ouNWB6CBUADRsWBSEJMzQ9Nj8CNSgYIy4/GTMqMj8oJw==";
		   
		   if (zakodowane.equals(wzor))
		      {
			   System.out.println("Udalo sie!");
			    }
		     else
		      {
			      System.out.println("Cos poszlo zle.");
		      }
		
	  }
	
	public static void main(String[] args)
	{
		BobSpr bobspr=new BobSpr();
        bobspr.liczenie();
	}

}
