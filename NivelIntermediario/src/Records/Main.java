package Records;

public class Main {
    static void main(String[] args) {

        Ninja cadastro = new Ninja("Naruto", "naruto@email.com", 99999999);
        System.out.println("cadastro = " + cadastro);

        NinjaRecord cadastroUsandoRecord = new NinjaRecord("Sasuke", "sasuke@email.com", 99999999);
        System.out.println("cadastroUsandoRecord = " + cadastroUsandoRecord);
        System.out.println("Email Caixa Alta: " + cadastroUsandoRecord.emailUpperCase());


    }



}
