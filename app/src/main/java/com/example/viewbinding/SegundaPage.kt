package com.example.viewbinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso

class SegundaPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.segunda_page)


        var img: ImageView = findViewById(R.id.imageView)

        var resul: TextView = findViewById(R.id.txtResul)

        var dato: Double = intent.extras!!.get("imc").toString().toDouble()


        if((dato<=18.5) ){
            resul.setText("\n"+"PESO BAJO!!:  "+dato+"\n"+
                    " Riesgo: bajo" );
            Picasso.get().load("https://amhigo.com/images/mi_diagnostico/masacorporal.jpg").into(img);
        }else if((dato>=18.5) && (dato<=24.9)){
            resul.setText("\n"+"Ideal:  "+dato+"\n"+
                    " Riesgo: Promedio" );
            Picasso.get().load("https://amhigo.com/images/mi_diagnostico/masacorporal.jpg").into(img);
        }else if ((dato>=25) && (dato<=29.9)){
            resul.setText("Sobrepeso:  "+dato+"\n"+
                    " Riesgo: Aumentado" );
            Picasso.get().load("https://amhigo.com/images/mi_diagnostico/masacorporal.jpg").into(img);
        }else if ((dato>=30) && (dato<=34.9)){
            resul.setText("Obesidad:  "+dato+"\n"+
                    " Riesgo: Moderado" );
            Picasso.get().load("https://amhigo.com/images/mi_diagnostico/masacorporal.jpg").into(img);
        }else if ((dato>=35) && (dato<=39.9)){
            resul.setText("Obesidad Severa:  "+dato+"\n"+
                    " Riesgo: Severo" );
            Picasso.get().load("https://amhigo.com/images/mi_diagnostico/masacorporal.jpg").into(img);
        }else if (dato>34) {
            resul.setText("Obesidad Morbida:  "+dato+"\n"+
                    " Riesgo: Muy severo" );
            Picasso.get().load("https://amhigo.com/images/mi_diagnostico/masacorporal.jpg").into(img);
        }




    }
}