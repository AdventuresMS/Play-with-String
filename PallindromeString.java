import java.util.Scanner;
 class PallindromeString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        sc.close();
        int i,j,flag;
        i =0;
        flag = 0;
         j = s.length()-1;
         while(i<j ){
            if(s.charAt(i)!=s.charAt(j)){
               
                flag = 1;
                break;
            }
            i = i+1;
            j = j-1;
        }
            if(flag==0){
                System.out.println("palindrome");
            }
            else{
                System.out.println("Not palindrome");
            }
         }


        
    }
