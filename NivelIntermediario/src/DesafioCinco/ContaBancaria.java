package DesafioCinco;

abstract class ContaBancaria implements Conta{

    //Atributos
    double saldo;
    TipoConta tipoConta;

    //Construtores
    public ContaBancaria()
    {}
    public ContaBancaria(TipoConta tipoConta, double saldo)
    {
        this.tipoConta = tipoConta;
        this.saldo = saldo;
    }



    @Override
    public abstract void consultarSaldo();

    @Override
    public abstract void depositarSaldo(double valor);


}
