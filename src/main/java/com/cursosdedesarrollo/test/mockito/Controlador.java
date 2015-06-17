package com.cursosdedesarrollo.test.mockito;

import java.util.List;

/**
 * Created by pepesan on 15/6/15.
 */
public class Controlador {
    public Modelo model;

    Controlador(){
        model=new Modelo();
    }

    public List<String> list(){
        List<String> listado=model.list();
        for (int i=0;i<listado.size();i++){
            imprime(listado.get(i));
        }
        return listado;
    }

    public void imprime(String s) {
        System.out.println(s);
    }
}
