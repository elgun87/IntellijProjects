package Hackerrank;

public class SuperReducedString {
    public static void main(String[] args) {
        String s = "baabdffdc";

//        int count = 1;
//        String result = "";

        for(int i = 0;i < s.length()-1;i++){
            int count = 1;
            String result = "";
            if(s.charAt(i) == s.charAt(i+1)){
                count++;
                if(count % 2 == 0){
                    for(int j = 0;j < count;j++){
                        result+=s.charAt(i);
                    }
                    s = s.replace(result,"");
                    i = -1;
                    count = 0;
                    //result = "";
                }
            }
        }
        System.out.println(s);
//        if(s.equals(c)){
//            System.out.println(true);
//        }else{
//            System.out.println(false);
//        }
//        System.out.println(s.length());

    }
}
