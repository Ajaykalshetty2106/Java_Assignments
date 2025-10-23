package sample;

public class palindrome {
    public static void main(String[] args) {
        int num =525;
        int original=num;
        int rev=0;
        int digit;
        while(num!=0)
        {
            digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        if(original==rev)
        {
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
        
    }

}
    


