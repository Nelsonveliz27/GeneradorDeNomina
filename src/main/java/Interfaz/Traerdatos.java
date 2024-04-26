/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;

/**
 *
 * @author nvelizl
 */
public class Traerdatos {
    private String datosFilat1;
    private String datosFilat2;
    private String datosFilat3;
    private String datosFilat4;
    private String datosFilat5;

    public Traerdatos(String datosFilat1, String datosFilat2, String datosFilat3, String datosFilat4,  String datosFilat5) {
        this.datosFilat1= datosFilat1;
        this.datosFilat2= datosFilat2;
        this.datosFilat3= datosFilat3;
        this.datosFilat4= datosFilat4;
        this.datosFilat5= datosFilat5;
    }
    
    public String getDatosFilat1() {
        return datosFilat1;
    }

    public String getDatosFilat2() {
        return datosFilat2;
    }

    public String getDatosFilat3() {
        return datosFilat3;
    }

    public String getDatosFilat4() {
        return datosFilat4;
    }

    public String getDatosFilat5() {
        return datosFilat5;
    } 
}
