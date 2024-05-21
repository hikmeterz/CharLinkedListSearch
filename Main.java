import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		
		LinkedList list = new LinkedList();//liste olusturuldu.
	
		Scanner k= new Scanner(System.in);
		
		//System.out.println("Ornek Girdi:");
		
		String s=k.nextLine();	
		boolean hataliMi=false;
		String aranan_metin="";
		int i_tut=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==' ' && s.charAt(i+1)=='|' && s.charAt(i+2)==' ') {//Eger ayrilan isaretten ise donguden cik.
				i_tut=i;
				break;
			}else{//Eger ayrilan isaretlerden degilse  ekle.
				list.addLast(s.charAt(i));
			}
		}	
			
		if(i_tut==0)
			hataliMi=true;
		
		if(hataliMi==false) {//Aranan metine bak
		
			for(int i=i_tut+3;i<s.length();i++) {
					
				aranan_metin+=s.charAt(i);
					
			}//Aranan metini ekledik.
					
			
			list.bul(aranan_metin);//Linked Listteki fonksiyona gidecek.
		}else {
			System.exit(0);
		}
	
				
		
		
		
	}
	
}