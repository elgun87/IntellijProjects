package String_3;

public class GetSandwich {
    public static void main(String[] args) {
        String str = "breadjambread";

        int fisrtIndex = str.indexOf("bread");
        int lastIndex = str.lastIndexOf("bread");

        System.out.println(fisrtIndex);
        System.out.println(lastIndex);

        String result = "";

        if(fisrtIndex != lastIndex){
            result = str.substring(fisrtIndex + "bread".length(),lastIndex);
        }else{
            result = "nothing";
        }
        System.out.println(result);

    }
}
