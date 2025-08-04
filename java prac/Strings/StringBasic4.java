public class StringBasic4 {
    //words length
    public static void main(String[] args) {
        String s = " Hello World ";
        String[]words= s.trim().split("\\s+");
        for(String word:words){
        System.out.println(word);
    }
    System.out.println("Number of words"+ words.length);
}
}