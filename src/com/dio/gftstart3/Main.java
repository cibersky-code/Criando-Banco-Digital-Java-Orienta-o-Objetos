package com.dio.gftstart3;


public class Main {

    public static void main(String[] args){

    Banco banco = new Banco();

    Cliente bruno = new Cliente();
    bruno.setNome("Bruno");

    Conta ccorrente = new ContaCorrente(bruno);
    ccorrente.depositar(100);

    Conta cpoupanca = new ContaPoupanca(bruno);
    cpoupanca.depositar(200);
    cpoupanca.transferi(100, ccorrente);

    banco.ImprimirDados();
    ccorrente.imprimirExtrato();
    cpoupanca.imprimirExtrato();

    }
}
