package satyam.mandal;

public class Word_to_vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String str="I have learnt loops, opps concepts, inheritance, exception handling, arraylist and string handling";
			char[] c=str.toCharArray();
			int pos1=0,pos2=0;
			int len=str.length();
			for(int i=0;i<len-1;i++) {
				if(c[i]==' ') {
					pos2=i;
					
					
					getVowels(pos1,pos2,c);
					pos1=i+1;
					System.out.print("\t ");
				}
			}
	}

	private static void getVowels(int pos1, int pos2, char[] c) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=pos1;i<pos2;i++) {
			if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'||c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U') {
				count++;
			}
		}
		if(count>=3) {
			for(int i=pos1;i<pos2;i++) {
				System.out.print(c[i]);
			}
		}
		
		
	}

}
