package replaceandmodify.replacemultipleblankspace;

public class ReplaceAndModifyStrings {
    public static String modifyString(String text){
        return text.replaceAll("\\s+"," ");
    }

    public static void main(String[] args) {
        String text = "This    is  an     example   with  multiple spaces.";
        System.out.println(text);
        System.out.println("After Modifying");
        System.out.println(modifyString(text));
    }
}
