package com.dio.gftstart3;


public abstract class Conta implements IConta{

    //COSTANTE
    public static int AGENCIA_PADRAO = 350;
    private static int SEQUENCIAL = 350;

    //ATRIBUTOS
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;


    //CONSTRUTOR
    public Conta(Cliente cliente) {

        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;

        }


    //IMPLEMENTO
    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferi(double valor, IConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    //GET

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirComum() {
        System.out.println("----------------------------------------------------------------------");
        System.out.printf("titular: %s%n", this.cliente.getNome());
        System.out.printf("Agencia: %d%n", this.agencia);
        System.out.printf("Conta: %d%n", this.numero);
        System.out.println();
        System.out.printf("Saldo: %.2f%n", this.saldo);
        System.out.println("-----------------------------------------------------------------------");
    }

}
