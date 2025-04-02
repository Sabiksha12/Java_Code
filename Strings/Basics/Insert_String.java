class Main {
    public static String insertString(String original,String newstr,int index){
        String newString=new String();
        for(int i=0;i<original.length();i++){
            newString+=original.charAt(i);
            
            if(i==index){
                newString+=newstr;
            }
        }
        return newString;
    }
    
    public static void main(String[] args) {
        String str1="Hello one";
        String str2="Every";
        int index=5;
        
        System.out.println(insertString(str1,str2,index));
    }
}
