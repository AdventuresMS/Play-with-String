import java.util.Scanner;
class CountConsonant{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        sc.close();
        int count = 0;
        String vowels = "aeiouAEIOU";

        for(int i = 0; i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLetter(ch) && vowels.indexOf(ch) == -1){
                count++;
            }
        }
        System.out.println("number of consonanats:" + count);
    }
}
