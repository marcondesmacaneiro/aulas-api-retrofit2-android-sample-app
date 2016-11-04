package br.edu.unidavi.retrofitteste;

public class Coletor {

    String coletor;
    String dados;

    @Override
    public String toString() {
        return coletor + " (" + dados + ")";
    }
}
