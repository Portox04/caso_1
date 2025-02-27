package caso_1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author porto
 */
public class Agente {

    //Atributos de Agente
    private String nameAgent;
    private int id;
    private String jobCode;
    private String office;
    private String transport;

    public Agente(String nameAgent, int id, String jobCode, String office, String transport) {
        this.nameAgent = nameAgent;
        this.id = id;
        this.jobCode = jobCode;
        this.office = office;
        this.transport = transport;
    }

    @Override
    public String toString() {
        return "Agente" + " = " + nameAgent + "\nid=" + id + "\njobCode=" + jobCode + "\noffice=" + office + "\ntransport=" + transport;
    }

}
