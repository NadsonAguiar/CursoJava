package DesafioCinco;

public class ContaPoupanca extends ContaBancaria
{
    double saldoAnterior = saldo;



    public ContaPoupanca(TipoConta tipoConta, double saldo) {
        super(tipoConta, saldo);
    }

    public ContaPoupanca() {
    }

    @Override
    public void consultarSaldo() {
        {
            System.out.println("==== SALDO BANCÁRIO =====");
            System.out.println("Saldo anterior: " + saldoAnterior);
            System.out.println("Tipo de Conta: " + tipoConta);
            System.out.println("Saldo: " + saldo);
            System.out.println("=========================");
        }
    }

    @Override
    public void depositarSaldo(double valor) {
        System.out.println("!!! AVISO !!!");
        System.out.println("Cobramos 1% de taxa sobre o valor do deposito");
        System.out.println("Valor depositado: " + valor);
        this.saldo += valor - (((double) 1/100 ) * valor);

    }
}
