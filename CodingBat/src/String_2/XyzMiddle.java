package String_2;

public class XyzMiddle {
    public static void main(String[] args) {
        String str = "xyzz";
        System.out.println(xyzMiddle(str));
    }
    public static boolean xyzMiddle(String str) {
        if(str.length() < 3){
            return false;
        }else{
            int middle = ((str.length()-1)/2)-1;
            int differMostOne = ((str.length())/2)-1;
            if(str.substring(middle,middle + "xyz".length()).equals("xyz")){
                return true;
            }else if(str.substring(differMostOne,differMostOne + "xyz".length()).equals("xyz")){
                return true;
            }else{
                return false;
            }
        }

    }

}
