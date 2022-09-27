public class Ch_03_02_strings_method {
    public static void main(String args[]){
        String name = "Hello World";
        String name1 = "               Hello World                   ";
        String name2 = "Harryrry";
        System.out.println(name);
        /*  INDEX STARTS WITH 0      */

        int value = name.length();
        String valuelow = name.toLowerCase();
        String valueup = name.toUpperCase();

        System.out.println(value);// gives a value how many space string used

        System.out.println(valuelow);// make all letter lowercase
        System.out.println(valueup);// make all letter uppercase

        System.out.println(name1.trim());// trim the blank space

        System.out.println(name.substring(4));
        System.out.println(name.substring(1,8));

        System.out.println(name2.replace('r','p'));// harry will become happy 'r'-->'p'
        System.out.println(name2.replace("rry","ier"));

        System.out.println(name2.startsWith("Har"));
        System.out.println(name2.endsWith("ry"));

        System.out.println(name2.charAt(4));
        String modifiedName = "Harryrryrry";
        System.out.println(modifiedName.indexOf("r"));
        System.out.println(modifiedName.indexOf("rry",4));
        System.out.println(modifiedName.lastIndexOf("rry",7));


        System.out.println(name.equals("Hello World"));// case sensitive
        System.out.println(name.equalsIgnoreCase("HeLlo worLd")); // case doesn't matter

        System.out.println("I am escape sequence \"double quote\"");
        System.out.println("I am escape sequence \\double quote\\");
        System.out.println("I am escape sequence \ndouble quote");
        System.out.println("I am escape sequence \tdouble quote");












    }
}
