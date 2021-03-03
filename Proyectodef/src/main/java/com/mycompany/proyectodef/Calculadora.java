/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectodef;

public class Calculadora {
    private String operador1; /* @param Elemento que forma parte del cálculo y que combinándose con el otro operador muestran un resultado dependiendo de las circunstancias presentes*/
    private String operador2; /* @param Componente de la operación que se combina con el otro operador para mostrar un resultado*/
    private String operacion; /* @return Resultado de la combinacion de los operadores que nos proporciona una información o dato*/

   
    public String getOperador1() {
        return operador1;
    }

    
    public void setOperador1(String operador1) {
        this.operador1 = operador1;
    }

    
    public String getOperador2() {
        return operador2;
    }

    
    public void setOperador2(String operador2) {
        this.operador2 = operador2;
    }

    
    public String getOperacion() {
        return operacion;
    }

   
    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
}
