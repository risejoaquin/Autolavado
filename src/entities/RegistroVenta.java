/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author compu
 */
public class RegistroVenta {


    /**
     * @return the iva
     */
    public double getIva() {
        return iva;
    }

    /**
     * @param iva the iva to set
     */
    public void setIva(double iva) {
        this.iva = iva;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * @return the subtotal
     */
    public double getSubtotal() {
        return subtotal;
    }

    /**
     * @param subtotal the subtotal to set
     */
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

   
    /**
     * @return the costos
     */
    public ActualizacionPrecios getCostos() {
        return costos;
    }

    /**
     * @param costos the costos to set
     */
    public void setCostos(ActualizacionPrecios costos) {
        this.costos = costos;
    }

    private double iva = 0;
    private double total = 0;
    private double subtotal = 0;
    private ActualizacionPrecios costos = new ActualizacionPrecios();

    
    
}
