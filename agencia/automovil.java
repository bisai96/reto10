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
public class automovil {
    
    private int idautomovil;
    private String identificador;
    private String tipo_automovil;
    private double precio_renta_diario;
    private int status;
    private motor tipo_motor;
    private llanta llantas_auto[];
    private faros faros_auto[];

    public automovil(){
    }

    public automovil(int idautomovil, String identificador, String tipo_automovil, double precio_renta_diario, int status, motor tipo_motor, llanta[] llantas_auto, faros[] faros_auto) {
        this.idautomovil = idautomovil;
        this.identificador = identificador;
        this.tipo_automovil = tipo_automovil;
        this.precio_renta_diario = precio_renta_diario;
        this.status = status;
        this.tipo_motor = tipo_motor;
        llantas_auto = new llanta[4];
        faros_auto = new faros[2];
    }

    public automovil(int idautomovil, String identificador, String tipo_automovil, double precio_renta_diario, int status, motor tipo_motor) {
        this.idautomovil = idautomovil;
        this.identificador = identificador;
        this.tipo_automovil = tipo_automovil;
        this.precio_renta_diario = precio_renta_diario;
        this.status = status;
        this.tipo_motor = tipo_motor;
        this.llantas_auto = llantas_auto;
        this.faros_auto = faros_auto;
    }

    public int getIdautomovil() {
        return idautomovil;
    }

    public void setIdautomovil(int idautomovil) {
        this.idautomovil = idautomovil;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getTipo_automovil() {
        return tipo_automovil;
    }

    public void setTipo_automovil(String tipo_automovil) {
        this.tipo_automovil = tipo_automovil;
    }

    public double getPrecio_renta_diario() {
        return precio_renta_diario;
    }

    public void setPrecio_renta_diario(double precio_renta_diario) {
        this.precio_renta_diario = precio_renta_diario;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public motor getTipo_motor() {
        return tipo_motor;
    }

    public void setTipo_motor(motor tipo_motor) {
        this.tipo_motor = tipo_motor;
    }

    public llanta[] getLlantas_auto() {
        return llantas_auto;
    }

    public void setLlantas_auto(llanta[] llantas_auto) {
        this.llantas_auto = llantas_auto;
    }

    public faros[] getFaros_auto() {
        return faros_auto;
    }

    public void setFaros_auto(faros[] faros_auto) {
        this.faros_auto = faros_auto;
    }

} 

