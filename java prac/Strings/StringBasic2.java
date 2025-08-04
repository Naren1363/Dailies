
    public class StringBasic2{
        //number of consonants
        public static void main (String []args){
            String s=("hello World");
            int count = 0;
            for ( int i =0 ; i< s.length();i++) {
                char ch = s.charAt(i);
                ch=Character.toLowerCase(ch);
                if(ch>='a'&& ch<='z'){
                if(ch!='a'||ch!='e'||ch!='i'||ch!='o'||ch!='u'){
                    count++;
                }
                }
            }
                
         System.out.println("Number of consonants"+ count);
        }
    }
