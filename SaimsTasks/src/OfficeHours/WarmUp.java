package OfficeHours;

public class WarmUp {
    public static void main(String[] args) {
        String str = "xxxbreadjambreadbread";
        str = str.substring(str.indexOf("bread") + "bread".length(),str.lastIndexOf("bread")).replace("bread","");
        System.out.println(str);
    }
}
