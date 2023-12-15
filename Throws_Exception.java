// TUMULAK, IVAN STEIVEN A. - ACTIVITY 39

public class Throws_Exception {
    public void nameDisplay(int nameLength) throws NullPointerException {
        System.out.println("Your name length is: " + nameLength);
    }

    public static void main(String[] args) {
        Throws_Exception te = new Throws_Exception();
        
        try {
            String name = null;
            int str = name.length();
            te.nameDisplay(str);
        } catch (NullPointerException e) {
            System.out.println("Name value cannot be null.");
        }

        System.out.println("Rest of the code...");
    }
}