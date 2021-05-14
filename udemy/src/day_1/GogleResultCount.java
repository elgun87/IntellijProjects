package day_1;

public class GogleResultCount {
    public static void main(String[] args){
        String message = resultCount("About 691,000,000 results (0.49 seconds)");
        System.out.println(message);
    }
    public static String resultCount(String str){
        String new_str[] = str.split((" "));
        String result ="";
        for(int i = 0;i < new_str[1].length();i++){
            if(new_str[1].charAt(i) == (',')){
                continue;
            }else{
                result += new_str[1].charAt(i);
            }
        }
        return result;
    }
    public static String resultCount(String str,int num){
        String new_str[] = str.split((" "));
        String result ="";
        for(int i = 0;i < new_str[num].length();i++){
            if(new_str[i].charAt(i) == (',')){
                continue;
            }else{
                result += new_str[1].charAt(i);
            }
        }
        return result;
    }
}
