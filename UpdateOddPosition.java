import java.util.Scanner;
class UpdateOddPosition {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.nextLine();
        sc.close();
        char[] charArray = s.toCharArray(); 
        for(int i = 1; i<charArray.length;i+=2){
            charArray[i] = '#';
        }
        String updatedString = new String(charArray);
        System.out.println("updated String" + updatedString);
    }
}