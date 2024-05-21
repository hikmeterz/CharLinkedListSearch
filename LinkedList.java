
public class LinkedList {
	
	private Node head;
	
	public LinkedList() {
		
		head=null;
	}

	public void addLast(char harf) {
		Node gez=head;
		
		Node n = new Node(harf);
		
		if(gez==null) {
			
			n.setNext(null);
			head=n;
			
		}else{
			
			while(gez.getNext()!=null){
				gez=gez.getNext();
			}	
			
			gez.setNext(n);
			
			
		}
			
	}
	public void bul(String input){//Aranan kelime
		//System.out.println("Ornek cikti:");
		Node iterator=head;
		String arama="";
		boolean bulundu=false;
		if(head==null) {
			System.out.println("Liste bos.");
			
		}
		
		
		while(iterator != null){
			if(iterator==head&&iterator.getHarf()==input.charAt(0)) {
				Node iterator1=iterator;
				int i=0;
				while(iterator1!=null && i<input.length()){
					
					arama+=iterator1.getHarf();
					iterator1=iterator1.getNext();
					i++;
				}
				if(input.equals(arama)){
					System.out.print("$"+"-");
					if(iterator1!=null)
						System.out.println(iterator1.getHarf());
					else
						System.out.println("$");
					bulundu=true;
					break;
					
				}else {
					
					arama="";
					iterator1=null;
					
				}
				
			}else if(iterator.getNext()!=null && iterator.getNext().getHarf()==input.charAt(0)) {//ilk harfler esitse arama yapilmali.
			
				Node iterator1=iterator.getNext();
				int i=0;
				while(iterator1!=null && i<input.length()){
					
					arama+=iterator1.getHarf();
					iterator1=iterator1.getNext();
					i++;
				}
				if(input.equals(arama)){
					System.out.print(iterator.getHarf()+"-");
					if(iterator1!=null)
						System.out.println(iterator1.getHarf());
					else
						System.out.println("$");
					bulundu=true;
					break;
					
				}else {
					
					arama="";
					iterator1=null;
					
				}
				
			}
				
			iterator=iterator.getNext();
				
			
			
		}
		
		
		if(bulundu==false)
			System.out.println("String bulunamadi.");
		
		
		
	}
	
	
	
	
	
	
	
}