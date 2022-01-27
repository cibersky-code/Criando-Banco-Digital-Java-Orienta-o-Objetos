package com.dio.gftstart3;

public class Banco{
    protected final String nome = "Banco Brasil azul";
    protected final String endereco = "Rua sem saida, lote 00, avenida redonda, Setealem-ZZ";
    protected final int agencia = Conta.AGENCIA_PADRAO;


    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void ImprimirDados() {
         System.out.println("\n");
         System.out.println("----------------------------------------------------------------------");
         System.out.println("Banco: " + getNome());
         System.out.println("Endereço: " + getEndereco()+ ";");
         System.out.println("Agencia: " + agencia + ";" );
         System.out.println("-----------------------------------------------------------------------");
         System.out.println("\n");
         }
    }