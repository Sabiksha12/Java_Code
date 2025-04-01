class Main {
    
    public static String palindrome(String str){
        int left=0;
        int right=str.length()-1;
        //Here String is converted into StringBuilder 
        StringBuilder revStr=new StringBuilder(str);
        while(left<right){
            char temp=revStr.charAt(left);
            revStr.setCharAt(left,revStr.charAt(right));
            revStr.setCharAt(right,temp);
            left++;
            right--;
        }
        // Convert the stringBuilder to String 
        return revStr.toString();
    }
    
    public static void main(String[] args) {
       
       String str1="online";
       System.out.println(palindrome(str1));
       String str2="Hello Everyone";
       System.out.println(palindrome(str2));
    }
}
