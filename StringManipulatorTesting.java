public class StringManipulatorTesting {
    public static void main(String[] args){
    
    StringManipulator manipulator = new StringManipulator();

    String trimmed = manipulator.trimAndConcat("     Hello     ", "      World      ");
    System.out.println(trimmed);

    Integer indNull = manipulator.getIndexOrNull("Coding", 'o');
    System.out.println(indNull);

    Integer strIndNull = manipulator.getIndexOrNull("Hello", "llo");
    Integer secondstrIndNull = manipulator.getIndexOrNull("Hello", "world");
    System.out.println(strIndNull);
    System.out.println(secondstrIndNull);

    String cSubstring = manipulator.concatSubstring("Hello", 1, 2, "world");
    System.out.println(cSubstring);
    
    }
}