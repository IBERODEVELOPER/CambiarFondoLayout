package com.informatico.ibero.cambiarfondo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    /*Seamos una variable de arreglo de integer*/
    private int[] arciIris;
    /*Creamos un objeto de la clase Random*/
    private Random random;
    /*Creamos un objeto del layout por  la utlizaremos
    debido a que trabajaremos con el fondo*/
    private ConstraintLayout fondoActividad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*Instanciamos al control con la variable del Layout*/
        fondoActividad=(ConstraintLayout)findViewById(R.id.actividadfondo);
        /*Instanciamos el arreglo de colores*/
        arciIris=new int[]{Color.BLACK,Color.CYAN,Color.DKGRAY,Color.GRAY,Color.MAGENTA,Color.RED,Color.WHITE,Color.YELLOW};
        /*Instanciamos al objeto random*/
        random=new Random();
        /*Indicamos un color de fondo del layout*/
        fondoActividad.setBackgroundColor(Color.WHITE);
    }
    /*Creamos un metodo para el boton en el onclick
    del boton indicamos este metodo*/
    public void OnclicCambiarFondo(View v){
        /*creamos una variable integer y instanciamos con el objeto random
        y le indicamos que capture el sieguiente valor */
        int color=random.nextInt(10);
        /*Lanzamos al layout el arreglo de colores*/
        fondoActividad.setBackgroundColor(arciIris[color]);
    }
}