public class StringBasic3 {
    //both vowels + consonants
    public static void main(String[] args) {
        String s= "Hello World";
      int   vowel = 0 ;
      int   con=0;
      for (int i =0 ; i<s.length();i++){
        char ch = s.charAt(i) ;
        ch= Character.toLowerCase(ch);
        if (ch>='a'&& ch<='z'){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowel++;
            }
           else {
                con++;} }
           }
                System.out.println("no of vowels " + vowel); 
                System.out.println("no of consonants " + con);
    }
}
