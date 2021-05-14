package day_22;
public class SmsPart {
    public static void main(String[] args) {
        String message = "Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}";

        int initialIndexOfSenderName = message.indexOf("<");
        int lastIndexOfSenderName = message.indexOf(">");
        String senderName = message.substring(initialIndexOfSenderName + 1,lastIndexOfSenderName);

        int indexOfPhoneNumber = message.indexOf("[");
        int lastIndexOfPhoneNumber = message.indexOf("]");
        String phoneNumber = message.substring(indexOfPhoneNumber + 1,lastIndexOfPhoneNumber);

        int indexOfEmptySpace = message.lastIndexOf("{");
        String messageContent = message.substring(indexOfEmptySpace + 1,message.length() - 1);

        String result = "Sender: " + ": " + senderName + "\n" + "Number: " + ": " + phoneNumber + "\n" +
                "Message: " + ": " + messageContent;
        System.out.println(result);

    }
}
