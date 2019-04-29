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
public class persona {
    private String nombre;
    private String numero_licencia;
    private String numero_telefono;
    private String direccion;
    private String tipo_sangre;

    public persona(){
    }

    public persona(String nombre, String numero_licencia, String numero_telefono, String direccion, String tipo_sangre){
        this.nombre = nombre;
        this.numero_licencia = numero_licencia;
        this.numero_telefono = numero_telefono;
        this.direccion = direccion;
        this.tipo_sangre = tipo_sangre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero_licencia() {
        return numero_licencia;
    }

    public void setNumero_licencia(String numero_licencia) {
        this.numero_licencia = numero_licencia;
    }

    public String getNumero_telefono() {
        return numero_telefono;
    }

    public void setNumero_telefono(String numero_telefono) {
        this.numero_telefono = numero_telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipo_sangre() {
        return tipo_sangre;
    }

    public void setTipo_sangre(String tipo_sangre) {
        this.tipo_sangre = tipo_sangre;
    }
}
