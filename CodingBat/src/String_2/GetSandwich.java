package String_2;

public class GetSandwich {
    public static void main(String[] args){
        String str = "breadjambread";
        System.out.println(getWordBetweenBread(str));
    }
    public static String getWordBetweenBread(String str){
        if(str.indexOf("bread") != str.lastIndexOf("bread")){
            int firstIndex = str.indexOf("bread");
            int lastIndex = str.lastIndexOf("bread");
            str = str.substring(firstIndex + "bread".length(),lastIndex);
            return str;
        }else{
            return "";
        }
    }
}
