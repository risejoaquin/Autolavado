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
     * @return the Turno
     */
    public int getTurno() {
        return Turno;
    }

    /**
     * @param Turno the Turno to set
     */
    public void setTurno(int Turno) {
        this.Turno = Turno;
    }

    /**
     * @return the totalTurnos
     */
    public int getTotalTurnos() {
        return totalTurnos;
    }

    /**
     * @param totalTurnos the totalTurnos to set
     */
    public void setTotalTurnos(int totalTurnos) {
        this.totalTurnos = totalTurnos;
    }

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
     * @return the totalDineroCaja
     */
    public double getTotalDineroCaja() {
        return totalDineroCaja;
    }

    /**
     * @param totalDineroCaja the totalDineroCaja to set
     */
    public void setTotalDineroCaja(double totalDineroCaja) {
        this.totalDineroCaja = totalDineroCaja;
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

    /**
     * @return the servicios
     */
    public AltaServicios getServicios() {
        return servicios;
    }

    /**
     * @param servicios the servicios to set
     */
    public void setServicios(AltaServicios servicios) {
        this.servicios = servicios;
    }


    /**
     * @return the temporada
     */
    public Temporada getTemporada() {
        return temporada;
    }

    /**
     * @param temporada the temporada to set
     */
    public void setTemporada(Temporada temporada) {
        this.temporada = temporada;
    }

    
    private int Turno = 0;
    private int totalTurnos = 0;
    private double iva = 0;
    private double total = 0;
    private double subtotal = 0;
    private double totalDineroCaja = 0;
    private ActualizacionPrecios costos = new ActualizacionPrecios();
    private AltaServicios servicios = new AltaServicios();
    private Temporada temporada = new Temporada();
    
}
