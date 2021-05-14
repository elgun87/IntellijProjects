package ArrayPractice1;
public class ShortestAndLongestWord {
    public static void main(String[] args){
        String str [] = {"Hello World","Cybertek","Pittsburgh","SanFransisco","Mapple"};
        System.out.println(longestShortest(str));
    }
    public static String longestShortest(String [] str){
        String shortest = str[0];
        String longest = str[0];
        for(String item : str){
            if(item.length() > longest.length()){
                longest = item;
            }
            if(item.length() < shortest.length()){
                shortest = item;
            }
        }
        return "Shortest word is: " + shortest + "\n" + "Longest word is: " + longest;
    }
}
