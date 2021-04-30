package mx.tecnm.tepic.ladm_u2_practica2_juego_topo

import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.MotionEvent
import android.view.View
import androidx.appcompat.app.AlertDialog
import java.lang.Exception
import java.util.*


class Lienzo(p:MainActivity): View(p) {
    var hilo = Hilo(this)
    var contador = 60
    var pausa= false
    var pos=0
    var r = Random()
    var valor=0
    var puntuacion=0
    var contacto=0
    var golpe=false
    var nivel =1
    var topo1 = Imagen(this, R.drawable.topo, 180f, 460f)
    var topo2 = Imagen(this, R.drawable.topo, 580f, 460f)
    var topo3 = Imagen(this, R.drawable.topo, 980f, 460f)
    var topo4 = Imagen(this, R.drawable.topo, 1380f, 460f)
    var topo5 = Imagen(this, R.drawable.topo, 1780f, 460f)
    var topo6 = Imagen(this, R.drawable.topo, 380f, 160f)
    var topo7 = Imagen(this, R.drawable.topo, 780f, 160f)
    var topo8 = Imagen(this, R.drawable.topo, 1180f, 160f)
    var topo9 = Imagen(this, R.drawable.topo, 1580f, 160f)
    var topog1 = Imagen(this, R.drawable.topog, 180f, 480f)
    var topog2 = Imagen(this, R.drawable.topog, 580f, 480f)
    var topog3 = Imagen(this, R.drawable.topog, 980f, 480f)
    var topog4 = Imagen(this, R.drawable.topog, 1380f, 480f)
    var topog5 = Imagen(this, R.drawable.topog, 1780f, 480f)
    var topog6 = Imagen(this, R.drawable.topog, 380f, 180f)
    var topog7 = Imagen(this, R.drawable.topog, 780f, 180f)
    var topog8 = Imagen(this, R.drawable.topog, 1180f, 180f)
    var topog9 = Imagen(this, R.drawable.topog, 1580f, 180f)
    var menu = BitmapFactory.decodeResource(this.resources, R.drawable.menu)
    var tocar = Imagen(this, R.drawable.tocar,950f,500f)


    /* var topo1 = Imagen(this,R.drawable.topo,180f,460f)
    var topo2 = Imagen(this,R.drawable.topo,180f,460f)
    var topo3 = Imagen(this,R.drawable.topo,180f,460f)
    var topo4 = Imagen(this,R.drawable.topo,180f,460f)
    var topo5 = Imagen(this,R.drawable.topo,180f,460f)
    var topo6 = Imagen(this,R.drawable.topo,180f,460f)
    var topo7 = Imagen(this,R.drawable.topo,180f,460f)
    var topo8 = Imagen(this,R.drawable.topo,180f,460f)
*/
    override fun onDraw(c: Canvas) {
        super.onDraw(c)
        val p = Paint()
        c.drawColor(Color.rgb(50, 141, 216))

        when(pos) {
    0->{
        c.drawBitmap(menu,-600f,-500f,p)
        tocar.pintar(c)

        invalidate()

    }
    1-> {
        p.color = Color.rgb(238, 208, 157)
        c.drawCircle(1120f, 1500f, 1300f, p)
        p.color = Color.rgb(161, 130, 98)
        c.drawOval(200f, 700f, 500f, 800f, p)
        c.drawOval(600f, 700f, 900f, 800f, p)
        c.drawOval(1000f, 700f, 1300f, 800f, p)
        c.drawOval(1400f, 700f, 1700f, 800f, p)
        c.drawOval(1800f, 700f, 2100f, 800f, p)

        c.drawOval(400f, 400f, 700f, 500f, p)
        c.drawOval(800f, 400f, 1100f, 500f, p)
        c.drawOval(1200f, 400f, 1500f, 500f, p)
        c.drawOval(1600f, 400f, 1900f, 500f, p)

        when (valor) {
            1 -> {
                if (golpe == false &&  contador<=60) {
                    topo1.pintar(c)
                } else if(golpe == true &&  contador<=60){
                    topog1.pintar(c)
                }
                contacto = 1
            }
            2 -> {
                if (golpe == false&&  contador<=60) {
                    topo2.pintar(c)
                } else if(golpe == true &&  contador<=60){
                    topog2.pintar(c)
                }
                contacto = 2

            }
            3 -> {
                if (golpe == false&& contador<=60) {
                    topo3.pintar(c)
                } else if(golpe == true &&  contador<=60){
                    topog3.pintar(c)
                }
                contacto = 3

            }
            4 -> {
                if (golpe == false&& contador<=60) {
                    topo4.pintar(c)
                } else if(golpe == true &&  contador<=60){
                    topog4.pintar(c)
                }
                contacto = 4

            }
            5 -> {
                if (golpe == false&&  contador<=60) {
                    topo5.pintar(c)
                } else if(golpe == true &&  contador<=60){
                    topog5.pintar(c)
                }
                contacto = 5
            }
            6 -> {
                if (golpe == false&&  contador<=60) {
                    topo6.pintar(c)
                } else if(golpe == true &&  contador<=60){
                    topog6.pintar(c)
                }
                contacto = 6
            }
            7 -> {
                if (golpe == false&& contador<=60) {
                    topo7.pintar(c)
                } else if(golpe == true &&  contador<=60){
                    topog7.pintar(c)
                }
                contacto = 7
            }
            8 -> {
                if (golpe == false&&  contador<=60) {
                    topo8.pintar(c)
                } else if(golpe == true &&  contador<=60){
                    topog8.pintar(c)
                }
                contacto = 8
            }
            9 -> {
                if (golpe == false&& contador<=60) {
                    topo9.pintar(c)
                } else if(golpe == true &&  contador<=60){
                    topog9.pintar(c)
                }
                contacto = 9
            }
        }


        if (puntuacion == 50&& nivel==1) {
           nivel=2
            contador=65
            puntuacion=0


        }
        if (puntuacion == 28&& nivel==2) {
            nivel=3
            contador=70
            puntuacion=0

        }
        if (puntuacion == 15&& nivel==3) {
            pausa = true
            puntuacion = 0
            pos=2
            nivel=1
            contador=75

        }
        if (contador <= 0) {
            pausa = true
            puntuacion = 0
            pos=3
            nivel=1
            contador=65

        }

        invalidate()
        p.color = Color.BLACK
        p.textSize = 39f
        c.drawText("puntuacion: ${puntuacion}", 50f, 50f, p)
        p.textSize = 39f
        c.drawText("tiempo: ${contador}", 1000f, 50f, p)
        p.textSize = 39f
        c.drawText("Nivel: ${nivel}", 1500f, 50f, p)
        c.drawText("valor: ${valor}", 1800f, 50f, p)

    }
            2->{
                p.textSize = 100f

                p.color=Color.GREEN
                c.drawText("A ganado,quiere jugar de nuevo?",400f,400f,p)
                    tocar.pintar(c)

                    invalidate()


            }
            3->{
                p.textSize = 100f
                p.color=Color.GREEN
                c.drawText("A perdido,quiere jugar de nuevo?",400f,400f,p)

                tocar.pintar(c)

                invalidate()


            }

}
        try {
            hilo.start()

        } catch (e: Exception) {

        }
    }


    override fun onTouchEvent(event: MotionEvent): Boolean {
        when(event.action) {
            MotionEvent.ACTION_DOWN -> {
                if (tocar.estaEnArea(event.x, event.y)&&pos==0) {
                   pos=1
                    contador=65
                    puntuacion=0
                }
                if (tocar.estaEnArea(event.x, event.y)&&pos==2) {
                    pos=1
                    contador=65
                    pausa=false
                    puntuacion=0


                }
                if (tocar.estaEnArea(event.x, event.y)&&pos==3) {
                    pos=1
                    contador=65
                    pausa=false
                    puntuacion=0

                }
                if (topo1.estaEnArea(event.x, event.y)&&contacto==1 && golpe==false) {
                    puntuacion++
                    golpe=true

                }
                if (topo2.estaEnArea(event.x, event.y)&&contacto==2&& golpe==false) {
                    puntuacion++
                    golpe=true

                }
                if (topo3.estaEnArea(event.x, event.y)&&contacto==3&& golpe==false) {
                    puntuacion++
                    golpe=true

                }
                if (topo4.estaEnArea(event.x, event.y)&&contacto==4&& golpe==false) {
                    puntuacion++
                    golpe=true
                }
                if (topo5.estaEnArea(event.x, event.y)&&contacto==5&& golpe==false) {
                    puntuacion++
                    golpe=true
                }
                if (topo6.estaEnArea(event.x, event.y)&&contacto==6&& golpe==false) {
                    puntuacion++
                    golpe=true
                }
                if (topo7.estaEnArea(event.x, event.y)&&contacto==7&& golpe==false) {
                    puntuacion++
                    golpe=true
                }
                if (topo8.estaEnArea(event.x, event.y)&&contacto==8&& golpe==false) {
                    puntuacion++
                    golpe=true
                }
                if (topo9.estaEnArea(event.x, event.y)&&contacto==9&& golpe==false) {
                    puntuacion++
                    golpe=true
                }

            }
        }
        return true
    }
}
    class Imagen(l:Lienzo, im:Int,posx:Float,posy:Float) {
        var x = posx
        var y = posy
        var imagen = BitmapFactory.decodeResource(l.resources, im)
        var invisible = false

        fun pintar(c: Canvas) {
            if (invisible) return
            c.drawBitmap(imagen, x, y, Paint())
        }

        fun estaEnArea(toqueX: Float, toqueY: Float): Boolean {
            var x2 = x + imagen.width
            var y2 = y + imagen.height

            if (toqueX >= x && toqueX <= x2) {
                if (toqueY >= y && toqueY <= y2) {
                    return true
                }
            }
            return false
        }//estaArea
    }


    class Hilo(p: Lienzo) : Thread() {
        var puntero = p//Existe solo en esta linea.

        override fun run() {
            super.run()
            //Realmente se ejecuta una vez en segundo plano.
            while (true) {
                //puntero.text_1.text = "Hilo: " + puntero.contadorHilo
                puntero.run {
                    if (true) {
                        while (pausa==false) {
                            when(nivel){
                               1->{
                                   sleep(1000)
                                   contador--
                                   golpe=false
                                   valor=r.nextInt(11 - 2)+1
                               }
                                2->{
                                    sleep(700)
                                    contador=contador-2
                                    golpe=false
                                    valor=r.nextInt(11 - 2)+1
                                }
                                3->{
                                    sleep(500)
                                    contador=contador-3
                                    golpe=false
                                    valor=r.nextInt(11 - 2)+1
                                }
                            }

                        }



                    }
                }


            }
            sleep(1000)
        }
    }




