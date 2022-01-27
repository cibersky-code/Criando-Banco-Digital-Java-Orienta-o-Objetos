package com.dio.gftstart3;

public interface IConta {
    void sacar (double valor);
    void depositar (double valor);
    void transferi (double valor, IConta contaDestino);
    void imprimirExtrato();

}
