package Records;

public record NinjaRecord(String nome, String email, int telefone) {

    //Tudo do código ninja, resumido em apenas uma linha com Records, mas com uma desvantagem

    // Por padrão os atributos em Records são FINAL
    // Records não tem ‘SETTER’
    // Quando criamos um record, ele cria todos os metodos build como Constructor, Getter, ToString e etc

    public String emailUpperCase(){
        return email.toUpperCase();
    }


}
