/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso_1;

/**
 *
 * @author porto
 */
public class Facturas {

    private String nameClient;
    private String idClient;
    private int code;
    private double mount;
    private int month;
    private int electrical;
    private int motors;
    private int builds;
    private int points;
    private double bonus;
    private Agente nameAgent;
    private Agente jobCode;
    private Agente transport;
    private Agente office;

    public Facturas(String nameClient, String idClient, int code, int month, int electrical, int motors, int builds) {
        this.nameClient = nameClient;
        this.idClient = idClient;
        this.code = code;
        this.month = month;
        this.electrical = electrical;
        this.motors = motors;
        this.builds = builds;
    }

    public String meses(int mes) {
        String meses = "";
        if (mes == 1)meses = "Enero";
        else if (mes ==2) meses = "Febrero";
        else if (mes ==3) meses = "Marzo";
        else if (mes ==4) meses = "Abril";
        else if (mes ==5) meses = "Mayo";
        else if (mes ==6) meses = "Junio";
        else if (mes ==7) meses = "Julio";
        else if (mes ==8) meses = "Agosto";
        else if (mes ==9) meses = "Septiembre";
        else if (mes ==10) meses = "Octubre";
        else if (mes ==11) meses = "Noviembre";
        else if (mes ==12) meses = "Diciembre";
        return meses;
    }
    public void setMount(double mount) {
        this.mount = +mount;
    }

    
    public void bonusCalculate(double newMount, int electrical, int motors, int builds) {
        double bonusCalculates = 0;
        if (electrical >= 1 && motors >= 1 && builds >= 1) {
            bonusCalculates = newMount * 0.1;
            points = +3;
            if (newMount < 50000) {
                bonusCalculates = bonusCalculates * 0.5;
                points = +1;
            }
        } else if (electrical >= 3) {
            bonusCalculates = newMount * 0.1;
            points = +3;
        }

        this.points = points;
        this.bonus = bonusCalculates;
    }

    @Override
    public String toString() {
        return "El Agente Vendedor" + nameAgent + " codigo: " + jobCode + "en el mes de " + meses(month) + "\nVendio en total de = " + mount + "\nObtuvo un total en comiciones" + bonus + "\nEl agente __ logro" + "\nPuntos obtenidos = " + points + "\n El agente tiene " + transport + " transporte" + "\n Sucursal =" + office ;
    }
    
    
}
