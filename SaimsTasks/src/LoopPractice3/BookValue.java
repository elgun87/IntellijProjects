package LoopPractice3;

public class BookValue {
    public static void main(String[] args) {

        String book = "Java textbook By Murodil. Chapter 1 datatypes and variables." +
                "Chapter 2 conditional statements. chapter 3 String manipulation." +
                "Chapter 4 Loops. Chapter 5 Arrays. Chapter 6 Methods. chapter 7 ArrayList." +
                "chapter 8 instance and static. Chapter 9 Constructors." +
                "Chapter 10 Encapsulation and Inheritance. Chapter 11 Abstraction and Polymorphism." +
                "Chapter 12 Exceptions. Chapter 13 Collections. Chapter 14 Learn more.";
        int count = 0;
        String report = "";
        for (int i = 0; i < book.length(); i++) {
            if(i + "Chapter".length() > book.length() - 1){
                break;
            }
            if (book.substring(i,i+ "Chapter".length()).equalsIgnoreCase("Chapter")){
                count++;
            }
        }
        report = count + " Chapters -> value of the book: " + (count * 10);
        System.out.println(report);

    }
}

