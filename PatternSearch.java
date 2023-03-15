public class PatternSearch {
    public static void main(String[] args) {
        String txt = "geeksforgeeks";
        String pat = "eks";

        for(int i = 0; i <= txt.length() - pat.length(); i++){
            int temp = i;
            for(int j = 0; j < pat.length(); j++, temp++){
                if(pat.charAt(j) != txt.charAt(temp)){
                    break;
                }
                if(j == pat.length()-1){
                    System.out.println(i + " ");
                }
            }
        }
    }
}
