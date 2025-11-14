package Abstracao;

import DesafioCinco.ContaCorrente;
import DesafioCinco.ContaPoupanca;
import DesafioCinco.TipoConta;

public class Main {
    static void main(String[] args)
    {

        ContaCorrente contaCorrente = new ContaCorrente(TipoConta.CORRENTE,500);
        contaCorrente.depositarSaldo(1000);
        contaCorrente.consultarSaldo();

        ContaPoupanca contaPoupanca = new ContaPoupanca(TipoConta.POUPANCA, 1000);
        contaPoupanca.depositarSaldo(1000);
        contaPoupanca.consultarSaldo();

    }
}
