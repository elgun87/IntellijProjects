package random;
import java.util.*;
public class ChooseMe {
    public static void main(String[] args) throws InterruptedException{

        List<String> names = new ArrayList<>();
        String studentNames[] = {"Elgun","Rasim","Aygun","Behruz","Suleyman","Kamran","Orxan","Elvin","Aytac"};
        for(int i = 0;i < studentNames.length;i++){
            names.add(studentNames[i]);
        }

        System.out.println(names);

        while(true){
            if(names.size() == 0){
                break;
            }
            Scanner input = new Scanner(System.in);
            System.out.println("To choose a student name please press 1,else press 2");
            int play = input.nextInt();
            if(play == 1){
                Thread.sleep(2000);
                printLucckyStudentName(names);
            }else if(play == 2){
                break;
            }
        }
    }
    public static List<String> studentNames(){
        List<String> names = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Please add student name");
        String studentName = input.next();
        names.add(studentName);

        boolean stopWhile = true;
        while(stopWhile){
            System.out.println("Would you like to add more student?To add press 1 else press 2");
            int addStudentOrNot = input.nextInt();
            if(addStudentOrNot == 1 ){
                System.out.println("Please add student name");
                input.nextLine();
                studentName = input.nextLine();
                names.add(studentName);
            }else if(addStudentOrNot == 2){
                stopWhile = false;
            }
        }
        return names;
    }

    public static void printLucckyStudentName(List<String> str){
        Random random = new Random();
        int num = random.nextInt(str.size());
        for(int i = 0;i < str.size();i++){
            System.out.println(str.get(num).toUpperCase() + " come on show us what you got...");
            str.remove(str.get(num));
            break;
        }
    }
}
