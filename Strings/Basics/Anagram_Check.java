import java.util.Arrays;

class Main {
    public static boolean anagram(String str1,String str2){
        char[] st1=str1.toCharArray();
        char[] st2=str2.toCharArray();
        
        if(st1.length != st2.length){
            return false;
        }
        // we can't straight away sort the string
        Arrays.sort(st1);
        Arrays.sort(st2);
        
        for(int i=0;i<st1.length;i++){
            if(st1[i]!=st2[i]){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        String str1="listen";
        String str2="silent";
        if(anagram(str1,str2)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
