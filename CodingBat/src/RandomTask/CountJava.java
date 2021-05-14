package RandomTask;

public class CountJava {
    public static void main(String[] args) {
//        String str = "we java stduy python,python not java python java java";
//        String word1 = "java";
//        String word2 = "python";
//
//        int count1 = 0;
//        int count2 = 0;

//        System.out.println(str.length());

//        for(int i = 0; i <= str.length(); i++) {
//            String strJava ="";
//            int num1 = 0;
//            while(num1 <= word1.length()-1){
//                strJava +="" + str.charAt(i + num1);
//                num1++;
//            }

//            String strPython ="";
//            int num2 = 0;
//            while(num2 <= word2.length()-1){
//                if(i + word2.length() > str.length()-1){
//                    System.out.println(i);
//                    break;
//                }
//                strPython +="" + str.charAt(i + num2);
//                num2++;
//            }
//            if(strPython.equals(word2)){
//                count2++;
//            }

//            System.out.println(strJava);
//            System.out.println(strPython);

//        }
//        System.out.println(count1);
//        System.out.println(count2);


        String str = "we java stduy python,python not java python";
        String word1 = "java";
        String word2 = "python";

        int count1 = 0;
        int count2 = 0;

        while(str.contains(word1) || str.contains(word2)){
            if(str.contains(word1)){
                count1++;
                str = str.replaceFirst(word1,"");
            }
            if(str.contains(word2)){
                count2++;
                str = str.replaceFirst(word2,"");
            }
        }
        if(count1 == count2){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
