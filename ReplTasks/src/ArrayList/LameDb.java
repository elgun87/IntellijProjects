package ArrayList;
import java.util.*;
public class LameDb {
    public static void main(String[] args){
        lameDb("1etsy#2wooden#3spoon","edit","2","bbb");
    }
    public static void lameDb(String db, String op, String id, String data){
        List <String> convertOList = Arrays.asList(db.split("#"));
        List<String> list = new ArrayList<>(convertOList);
        String result = "";

        if(op.equals("add")){
            result = addItemToList(list,id,data);

        }else if(op.equals("edit")){
            result = modifyTheList(list,id,data);

        }else if(op.equals("delete")){
            result = modifyTheList(list,id);
        }

        System.out.println(result);
    }
    public static String addItemToList(List<String> list,String id, String data ){
        String result = "";
        boolean check = false;
        int num = Integer.parseInt(id);
        for(int i = 0;i < list.size();i++){
            if(Character.isDigit(list.get(i).charAt(0))){
                String digitChar = String.valueOf(list.get(i).charAt(0));
                int number = Integer.parseInt(digitChar);

                if(num <= number){
                    String modify = num + data;
                    check = true;
                    list.add(i,modify);
                    for(int j = i + 1;j < list.size();j++){
                        String elementModify = (j + 1) + list.get(j).substring(1);
                        list.set(j,elementModify);
                    }
                    break;
                }
                if(!check && i == list.size()-1){
                    String modify = num + data;
                    list.add(modify);
                    break;
                }
            }
        }
        for(int i = 0;i< list.size();i++){
            if(i > 0){
                result += "#" + list.get(i);
            }else{
                result += list.get(i);
            }
        }
        return result;

    }
    public static String modifyTheList(List<String> list,String id){
        String result = "";
        int num = Integer.parseInt(id);
        for(int i = 0;i < list.size();i++){
            if(Character.isDigit(list.get(i).charAt(0))){
                String digitChar = String.valueOf(list.get(i).charAt(0));
                int number = Integer.parseInt(digitChar);
                if(num == number){
                    list.remove(i);
                    break;
                }
            }
        }
        for(int i = 0;i< list.size();i++){
            if(list.get(i).contains("1")){
                result += list.get(i);
            }else{
                result += "#" + list.get(i);
            }
        }
        return result;
    }
    public static String modifyTheList(List<String> list,String id,String data){
        String result = "";
        int num = Integer.parseInt(id);
        for(int i = 0;i < list.size();i++){
            if(Character.isDigit(list.get(i).charAt(0))){
                String digitChar = String.valueOf(list.get(i).charAt(0));
                int number = Integer.parseInt(digitChar);
                if(num == number){
                    String modify = list.get(i).substring(0,1) + data;
                    list.set(i,modify);
                    break;
                }
            }
        }
        for(int i = 0;i< list.size();i++){
            if(i > 0){
                result += "#" + list.get(i);
            }else{
                result += list.get(i);
            }
        }
        return result;
    }
}
