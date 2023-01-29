/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Angel D Gomez
 */
public class EnvioIndustrial extends Envio {

    public EnvioIndustrial() {
        this.material = new ArrayList<>();
        this.material.add("Computador");
        this.material.add("Mouse");
        this.saludoDirector = "Jenny envia saludos";
    }
}
