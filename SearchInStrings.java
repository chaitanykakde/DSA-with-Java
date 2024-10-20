public class SearchInStrings {
    public static void main(String[] args) {
        String str="chaitany";
        System.out.println(search(str,'x')) ;
    }
    static boolean search(String str,char target){
        if(str.length()==0){return false;}
        System.out.println(str.toCharArray());
        for(char ch:str.toCharArray()){
            if(ch==target){return true;}
        }     
return false;
    }
    
}
