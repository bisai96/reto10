/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agencia;

/**
 *
 * @author bisai
 */
public class motor {
     private String numero_serie;
    private int potencia;
    private int numero_cilindro;

    public motor() {
    }

    public motor(String numero_serie, int numero_cilindro, int potencia) {
        this.numero_serie = numero_serie;
        this.numero_cilindro = numero_cilindro;
        this.potencia = potencia;
    }

    public String getNumero_serie() {
        return numero_serie;
    }

    public void setNumero_serie(String numero_serie) {
        this.numero_serie = numero_serie;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getNumero_cilindro() {
        return numero_cilindro;
    }

    public void setNumero_cilindro(int numero_cilindro) {
        this.numero_cilindro = numero_cilindro;
    }
}
