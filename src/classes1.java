public class classes1 {
    public static void main (String[] args) {
        String firstname = "Alifer";
        String lastname = "Rabelo";

        String fullname = fullname (firstname, lastname);
        System.out.println(fullname);
    }

    public static String fullname (String firstname, String lastname) {
        return "Esse é o meu nome e sobrenome: " + firstname + " " + lastname;
    }

}