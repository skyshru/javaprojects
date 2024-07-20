public class StringMethods {
    public static void main(String[] args) {
        //strings are immutable
        String og="  Hey whats up Harry?  ";

        System.out.println(og.toLowerCase());//just type tlc for short form
        System.out.println(og.trim());//removes leading and trailing spaces
        System.out.println(og.substring(4));//from beginning index to last index
        System.out.println(og.substring(4,9));
        System.out.println(og.replace('H','M'));
        System.out.println(og.replace("r","uiuou"));
        System.out.println(og.charAt(4));
        System.out.println(og.indexOf('u'));
        System.out.println(og.indexOf('H',5));///finds the occurance starting from index specified
        System.out.println(og.lastIndexOf('H'));

        String name="Terry";
        System.out.println(name.equals("terry"));
        System.out.println(name.equalsIgnoreCase("TERRy"));//to ignore case sensitiveness
    }
}
