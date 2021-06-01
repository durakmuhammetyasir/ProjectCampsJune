package playlist.day1Homework3Video5_23;

public class Video19RecapStringBuilder {
    public static void main(String[] args) {
        // Create an empty StringNuffer
        StringBuilder sb = new StringBuilder();
        printDetails(sb);
        // Append "blessings"
        sb.append("kutlu olsun");
        printDetails(sb);
        // Insert "Good " in the beginning
        sb.insert(0, "Ramazan bayramin ");
        printDetails(sb);
        // Delete the first o
        sb.deleteCharAt(15);
        printDetails(sb);
        // Append " be with you"
        sb.append(" tum islam aleminin");
        printDetails(sb);
        // Set the length to 3
        sb.setLength(3);
        printDetails(sb);
        // Reverse the content
        sb.reverse();
        printDetails(sb);
    }
    public static void printDetails(StringBuilder sb) {
        System.out.println("Content: \"" + sb + "\"");
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());
        // Print an empty line to separate results
        System.out.println();

    }
}
