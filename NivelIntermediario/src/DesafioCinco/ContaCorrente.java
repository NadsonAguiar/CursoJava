package DesafioCinco;

public class ContaCorrente extends ContaBancaria
{
    double saldoAnterior = saldo;

    public ContaCorrente() {
    }

    public ContaCorrente(TipoConta tipoConta, double saldo)
    {
        super(tipoConta, saldo);
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
        this.saldo += valor;

    }
}

