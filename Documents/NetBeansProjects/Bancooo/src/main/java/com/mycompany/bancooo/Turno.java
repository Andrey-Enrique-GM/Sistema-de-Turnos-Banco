
package com.mycompany.bancooo;

// @author Andrey

public class Turno {
    
    private String numero;
    private String cliente;

    public Turno(String numero, String cliente) {
        this.numero = numero;
        this.cliente = cliente;
    }
    
    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the cliente
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    
    
}
