class Main {
    public static void printWords(String str){
        for(String w:str.split(" ")){
            if(w.length()%2==0){
                System.out.println(w);
            }
        }
    }
    
    public static void main(String[] args) {
        String str="i am interested in working with backend core java";
        printWords(str);
    }
}
