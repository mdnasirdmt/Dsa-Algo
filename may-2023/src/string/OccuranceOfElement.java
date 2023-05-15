package string;

import java.util.ArrayList;


public class OccuranceOfElement {

	public static void main(String[] args) {
		
		String str="aabcdde";
		
		ArrayList<Occur> ocList= new ArrayList<>();
		
		
		for(int i=0;i<str.length();i++) {
			boolean f=false;
			char c= str.charAt(i);
			for(Occur o:ocList) {
				if(o.ch==c) {
					o.oc+=1;
					f=true;
				}
			}
			if(f==false) {
				Occur occur= new Occur(c, 1);
				ocList.add(occur);
			}
			
			
		}
		
		for(Occur o: ocList) {
			System.out.println(o.ch+"-> "+ o.oc);
		}

	}

}

class Occur{
	char ch;
	int oc;
	
	public Occur(char ch, int oc){
		this.ch=ch;
		this.oc=oc;
	}
}