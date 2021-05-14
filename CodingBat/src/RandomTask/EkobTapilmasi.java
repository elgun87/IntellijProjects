package RandomTask;

import java.util.*;

public class EkobTapilmasi {
    public static void main(String[] args) {
        int num = 65;
        int num2 = 36;
        int result = ekob(num, num2);
        System.out.println(result + " en kicik ortaq bolunen");

    }

    public static int ekob(int num, int num2) {

        Integer max = Math.max(num, num2);

        //create list array to store deviders
        List<Integer> num1Devider = new ArrayList<>();
        List<Integer> num2Devider = new ArrayList<>();

        //call method to get deviders
        num1Devider = getNumberDevider(num);
        num2Devider = getNumberDevider(num2);

        if(num > num2){
            if(num2Devider.size() > num1Devider.size()){
                for(int i = 0;i < num2Devider.size();i++){
                    if(i < num1Devider.size()){
                        if(num2Devider.get(i) != num1Devider.get(i)){
                            max *= num2Devider.get(i);
                        }
                    }else{
                        max *= num2Devider.get(i);
                    }
                }
            }else{
                for(int i = 0;i < num2Devider.size();i++){
                    if(num2Devider.get(i) != num1Devider.get(i)){
                        max *= num2Devider.get(i);
                    }
                }
            }
        }else if(num2 > num){
            if(num1Devider.size() > num2Devider.size()){
                for(int i = 0;i < num1Devider.size();i++){
                    if(i < num2Devider.size()){
                        if(num1Devider.get(i) != num2Devider.get(i)){
                            max *= num1Devider.get(i);
                        }
                    }else{
                        max *= num1Devider.get(i);
                    }
                }
            }else{
                for(int i = 0;i < num1Devider.size();i++){
                    if(num1Devider.get(i) != num2Devider.get(i)){
                        max *= num1Devider.get(i);
                    }
                }
            }
        }
        return max;
    }

    public static List<Integer> getNumberDevider(int num) {
        List<Integer> list = new ArrayList<>();
        int a = num;
        for (int i = 2; i < a; i++) {
            if (num % i == 0) {
                list.add(i);
                num /= i;
                i = 1;
            }
        }
        System.out.println(a + " ededinin bolunenleri " + list);
        return list;
    }
}

