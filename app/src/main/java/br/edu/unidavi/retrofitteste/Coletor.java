package br.edu.unidavi.retrofitteste;

/**
 * Created by shelajev on 16/12/15.
 */
public class Coletor {

    String coletor;
    String dados;

    @Override
    public String toString() {
        return coletor + " (" + dados + ")";
    }
}
