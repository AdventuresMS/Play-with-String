import java.util.Arrays;

public class FindingAnagram {
    public static void main(String[] args) {
        String s = "heart";
        String m  = "earth";
        char [] c1 = s.toCharArray();
        char [] c2 = m.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(Arrays.equals(c1, c2)==true){
            System.out.println("Its a Anagram");
        }
        else{
            System.out.println("Not a Anagram");
        }
    }
    
}
