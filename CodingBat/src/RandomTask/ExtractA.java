package RandomTask;

public class ExtractA {
    public static void main(String[] args) {
//        String str = "a2b5c7a9f0dafa2s6a8d5a";
//        String resultForA  = "";
        String restChars = "";
        String combine = "";
//        if(str.startsWith("a")) {
//            for(int i = 0;i < str.length();i++) {
//                if(str.charAt(i) == 'a') {
//                    resultForA += str.charAt(i);
//                }else {
//                    restChars += str.charAt(i);
//                }
//            }
//        }
//        combine = resultForA + restChars;
//        System.out.println(combine);

        String str = "a2b5c7a9f0dafa2s6a8d5a";
        String resultForA  = "";
        while(str.contains("a")){
            resultForA += "a";
            str = str.replaceFirst("a","");
        }
        System.out.println(resultForA + str);
    }
}
