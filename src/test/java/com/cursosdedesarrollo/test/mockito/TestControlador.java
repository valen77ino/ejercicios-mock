package com.cursosdedesarrollo.test.mockito;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
/**
 * Created by pepesan on 15/6/15.
 */
public class TestControlador {
    public Controlador controlador;

    @Before
    public void setUp(){
        controlador=new Controlador();
    }

    @Test
    public void testNotNull(){
        assertThat(controlador,notNullValue());
    }
    @Test
    public void testModelNotNull(){
        assertThat(controlador.model,notNullValue());
    }
    @Test
    public void testListNotNull(){
        List<String> listado=controlador.list();
        assertThat(listado,notNullValue());
    }


}
