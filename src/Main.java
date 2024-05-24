
// paquetes o librerias
import java.lang.*;
import java.io.*;

//inicio de la clase NodoVertice
class NodoVertice{

    //atributos
    String nombrev = new String("");
    NodoVertice sigv;// puntero al siguiente vertice
    NodoArista siga;// puntero a la lista de aristas del vertice

    //metodos
    NodoVertice(){}

} //fin de la clase NodoVertice
//inicio de la clase NodoArista
class NodoArista{

    //atributos
    double distancia;
    NodoVertice sigv;// puntero al vertice (destino)
    NodoArista siga;// puntero a la siguiente arista del vertice

    //metodos
    NodoArista(){}
}//fin de la clase NodoArista
//inicio de la clase Grafos
class Grafos{

    //atributos;
    private static double matriz_distancia[][];
    NodoVertice cabv, movilv;
    NodoArista caba, movila;

    //metodos
    Grafos(){}

    public void inicializar_grafo(){
        cabv=null; // inicializando lista de vertices
        caba=null; // inicializando lista de aristas
    }
    public static void inicializar_matriz_de_adyacencia_distancias(){

        matriz_distancia = new double[12][12];

        // origen Armenia
        matriz_distancia[0][0] = 0;      // Armenia
        matriz_distancia[0][1] = 6.8;    // Calarcá
        matriz_distancia[0][2] = 12;     // Circasia
        matriz_distancia[0][3] = 40;     // Córdoba
        matriz_distancia[0][4] = 29;     // Filandia
        matriz_distancia[0][5] = 17.9;   // La Tebaida
        matriz_distancia[0][6] = 12.3;   // Montenegro
        matriz_distancia[0][7] = 33;     // Pijao
        matriz_distancia[0][8] = 22.7;   // Quimbaya
        matriz_distancia[0][9] = 25;     // Salento
        matriz_distancia[0][10] = 29.6;  // Buenavista
        matriz_distancia[0][11] = 54;    // Génova

        // origen Calarcá
        matriz_distancia[1][0] = 6.8;    // Armenia
        matriz_distancia[1][1] = 0;      // Calarcá
        matriz_distancia[1][2] = 13.1;   // Circasia
        matriz_distancia[1][3] = 40;     // Córdoba
        matriz_distancia[1][4] = 30;     // Filandia
        matriz_distancia[1][5] = 24.2;   // La Tebaida
        matriz_distancia[1][6] = 17.9;   // Montenegro
        matriz_distancia[1][7] = 33.3;   // Pijao
        matriz_distancia[1][8] = 28.3;   // Quimbaya
        matriz_distancia[1][9] = 33.1;   // Salento
        matriz_distancia[1][10] = 29.5;  // Buenavista
        matriz_distancia[1][11] = 57.8;  // Génova

        // origen Circasia
        matriz_distancia[2][0] = 12;     // Armenia
        matriz_distancia[2][1] = 13.1;   // Calarcá
        matriz_distancia[2][2] = 0;      // Circasia
        matriz_distancia[2][3] = 54;     // Córdoba
        matriz_distancia[2][4] = 18.9;   // Filandia
        matriz_distancia[2][5] = 30.7;   // La Tebaida
        matriz_distancia[2][6] = 15.9;   // Montenegro
        matriz_distancia[2][7] = 46.9;   // Pijao
        matriz_distancia[2][8] = 26.8;   // Quimbaya
        matriz_distancia[2][9] = 15.2;   // Salento
        matriz_distancia[2][10] = 43.6;  // Buenavista
        matriz_distancia[2][11] = 67.7;  // Génova

        // origen Córdoba
        matriz_distancia[3][0] = 40;     // Armenia
        matriz_distancia[3][1] = 40;     // Calarcá
        matriz_distancia[3][2] = 54;     // Circasia
        matriz_distancia[3][3] = 0;      // Córdoba
        matriz_distancia[3][4] = 70.8;   // Filandia
        matriz_distancia[3][5] = 46.2;   // La Tebaida
        matriz_distancia[3][6] = 49.2;   // Montenegro
        matriz_distancia[3][7] = 12;     // Pijao
        matriz_distancia[3][8] = 59.6;   // Quimbaya
        matriz_distancia[3][9] = 67.1;   // Salento
        matriz_distancia[3][10] = 18.9;  // Buenavista
        matriz_distancia[3][11] = 55.5;  // Génova

        // origen Filandia
        matriz_distancia[4][0] = 29;     // Armenia
        matriz_distancia[4][1] = 30;     // Calarcá
        matriz_distancia[4][2] = 18.9;   // Circasia
        matriz_distancia[4][3] = 70.8;   // Córdoba
        matriz_distancia[4][4] = 0;      // Filandia
        matriz_distancia[4][5] = 47.6;   // La Tebaida
        matriz_distancia[4][6] = 19.2;   // Montenegro
        matriz_distancia[4][7] = 64;     // Pijao
        matriz_distancia[4][8] = 17;     // Quimbaya
        matriz_distancia[4][9] = 20.5;   // Salento
        matriz_distancia[4][10] = 60.4;  // Buenavista
        matriz_distancia[4][11] = 84.8;  // Génova

        // origen La Tebaida
        matriz_distancia[5][0] = 17.9;   // Armenia
        matriz_distancia[5][1] = 24.2;   // Calarcá
        matriz_distancia[5][2] = 30.7;   // Circasia
        matriz_distancia[5][3] = 46.2;   // Córdoba
        matriz_distancia[5][4] = 47.6;   // Filandia
        matriz_distancia[5][5] = 0;      // La Tebaida
        matriz_distancia[5][6] = 19.8;   // Montenegro
        matriz_distancia[5][7] = 39.4;   // Pijao
        matriz_distancia[5][8] = 30.1;   // Quimbaya
        matriz_distancia[5][9] = 43.9;   // Salento
        matriz_distancia[5][10] = 35.6;  // Buenavista
        matriz_distancia[5][11] = 60.1;  // Génova

        // origen Montenegro
        matriz_distancia[6][0] = 12.3;   // Armenia
        matriz_distancia[6][1] = 17.9;   // Calarcá
        matriz_distancia[6][2] = 15.9;   // Circasia
        matriz_distancia[6][3] = 49.2;   // Córdoba
        matriz_distancia[6][4] = 19.2;   // Filandia
        matriz_distancia[6][5] = 19.8;   // La Tebaida
        matriz_distancia[6][6] = 0;      // Montenegro
        matriz_distancia[6][7] = 42.4;   // Pijao
        matriz_distancia[6][8] = 11;     // Quimbaya
        matriz_distancia[6][9] = 38.3;   // Salento
        matriz_distancia[6][10] = 38.5;  // Buenavista
        matriz_distancia[6][11] = 63.2;  // Génova

        // origen Pijao
        matriz_distancia[7][0] = 33;     // Armenia
        matriz_distancia[7][1] = 33.3;   // Calarcá
        matriz_distancia[7][2] = 46.9;   // Circasia
        matriz_distancia[7][3] = 12;     // Córdoba
        matriz_distancia[7][4] = 64;     // Filandia
        matriz_distancia[7][5] = 39.4;   // La Tebaida
        matriz_distancia[7][6] = 42.4;   // Montenegro
        matriz_distancia[7][7] = 0;      // Pijao
        matriz_distancia[7][8] = 52.8;   // Quimbaya
        matriz_distancia[7][9] = 60.7;   // Salento
        matriz_distancia[7][10] = 12.1;  // Buenavista
        matriz_distancia[7][11] = 24.7;  // Génova

        // origen Quimbaya
        matriz_distancia[8][0] = 22.7;   // Armenia
        matriz_distancia[8][1] = 28.3;   // Calarcá
        matriz_distancia[8][2] = 26.8;   // Circasia
        matriz_distancia[8][3] = 59.6;   // Córdoba
        matriz_distancia[8][4] = 17;     // Filandia
        matriz_distancia[8][5] = 28.9;   // La Tebaida
        matriz_distancia[8][6] = 11;     // Montenegro
        matriz_distancia[8][7] = 52.8;   // Pijao
        matriz_distancia[8][8] = 0;      // Quimbaya
        matriz_distancia[8][9] = 36.4;   // Salento
        matriz_distancia[8][10] = 48.9;  // Buenavista
        matriz_distancia[8][11] = 73.6;  // Génova

        // origen Salento
        matriz_distancia[9][0] = 25;     // Armenia
        matriz_distancia[9][1] = 33.1;   // Calarcá
        matriz_distancia[9][2] = 15.2;   // Circasia
        matriz_distancia[9][3] = 67.1;   // Córdoba
        matriz_distancia[9][4] = 20.5;   // Filandia
        matriz_distancia[9][5] = 43.9;   // La Tebaida
        matriz_distancia[9][6] = 38.3;   // Montenegro
        matriz_distancia[9][7] = 60.7;   // Pijao
        matriz_distancia[9][8] = 36.4;   // Quimbaya
        matriz_distancia[9][9] = 0;      // Salento
        matriz_distancia[9][10] = 56.7;  // Buenavista
        matriz_distancia[9][11] = 81.1;  // Génova

        // origen Buenavista
        matriz_distancia[10][0] = 29.6;  // Armenia
        matriz_distancia[10][1] = 29.5;  // Calarcá
        matriz_distancia[10][2] = 43.6;  // Circasia
        matriz_distancia[10][3] = 18.9;  // Córdoba
        matriz_distancia[10][4] = 60.4;  // Filandia
        matriz_distancia[10][5] = 35.6;  // La Tebaida
        matriz_distancia[10][6] = 38.5;  // Montenegro
        matriz_distancia[10][7] = 12.1;  // Pijao
        matriz_distancia[10][8] = 48.9;  // Quimbaya
        matriz_distancia[10][9] = 56.7;  // Salento
        matriz_distancia[10][10] = 0;    // Buenavista
        matriz_distancia[10][11] = 33.9; // Génova

        // origen Génova
        matriz_distancia[11][0] = 54;    // Armenia
        matriz_distancia[11][1] = 57.8;  // Calarcá
        matriz_distancia[11][2] = 67.7;  // Circasia
        matriz_distancia[11][3] = 55.5;  // Córdoba
        matriz_distancia[11][4] = 84.8;  // Filandia
        matriz_distancia[11][5] = 60.1;  // La Tebaida
        matriz_distancia[11][6] = 63.2;  // Montenegro
        matriz_distancia[11][7] = 24.7;  // Pijao
        matriz_distancia[11][8] = 73.6;  // Quimbaya
        matriz_distancia[11][9] = 81.1;  // Salento
        matriz_distancia[11][10] = 33.9; // Buenavista
        matriz_distancia[11][11] = 0;    // Génova
    }
    public void ingresar_vertice(){

        //vertice armenia
        NodoVertice nuevo= new NodoVertice();
        nuevo.nombrev=new String("Armenia");
        nuevo.siga=null;
        nuevo.sigv=cabv;
        cabv=nuevo;

        //vertice calarca
        nuevo= new NodoVertice();
        nuevo.nombrev=new String("Calarca");
        nuevo.siga=null;
        nuevo.sigv=cabv;
        cabv=nuevo;

        //vertice circasia
        nuevo= new NodoVertice();
        nuevo.nombrev=new String("Circasia");
        nuevo.siga=null;
        nuevo.sigv=cabv;
        cabv=nuevo;

        //vertice filandia
        nuevo= new NodoVertice();
        nuevo.nombrev=new String("Filandia");
        nuevo.siga=null;
        nuevo.sigv=cabv;
        cabv=nuevo;

        //vertice cordoba
        nuevo= new NodoVertice();
        nuevo.nombrev=new String("Córdoba");
        nuevo.siga=null;
        nuevo.sigv=cabv;
        cabv=nuevo;

        //vertice la tebaida
        nuevo= new NodoVertice();
        nuevo.nombrev=new String("La Tebaida");
        nuevo.siga=null;
        nuevo.sigv=cabv;
        cabv=nuevo;

        //vertice montenegro
        nuevo= new NodoVertice();
        nuevo.nombrev=new String("Montenegro");
        nuevo.siga=null;
        nuevo.sigv=cabv;
        cabv=nuevo;

        //vertice Pijao
        nuevo= new NodoVertice();
        nuevo.nombrev=new String("Pijao");
        nuevo.siga=null;
        nuevo.sigv=cabv;
        cabv=nuevo;

        //vertice Quimbaya
        nuevo= new NodoVertice();
        nuevo.nombrev=new String("Quimbaya");
        nuevo.siga=null;
        nuevo.sigv=cabv;
        cabv=nuevo;

        //vertice Salento
        nuevo= new NodoVertice();
        nuevo.nombrev=new String("Salento");
        nuevo.siga=null;
        nuevo.sigv=cabv;
        cabv=nuevo;

        //vertice Buenavista
        nuevo= new NodoVertice();
        nuevo.nombrev=new String("Buenavista");
        nuevo.siga=null;
        nuevo.sigv=cabv;
        cabv=nuevo;

        //vertice Génova
        nuevo= new NodoVertice();
        nuevo.nombrev=new String("Génova");
        nuevo.siga=null;
        nuevo.sigv=cabv;
        cabv=nuevo;
    }

    public   void ingresar_arista_vertice(){
        int ban=0; //0 falso y 1 verdadero
        // en esta parte se retoman los valores de la matriz de adyacencia
        // se crean las aristas para cada vertice

        //vertice armenia ******************************************************************************************
        caba=null;
        ban=0;
        if (matriz_distancia[0][0]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[0][0];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Armenia")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        ban=0;
        if (matriz_distancia[0][1]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[0][1];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Calarcá")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        ban=0;
        while(movila!=null){
            System.out.println(movila.distancia);
            movila=movila.siga;
        }



        if (matriz_distancia[0][2]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[0][2];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Circasia")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        ban=0;
        if (matriz_distancia[0][6]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[0][6];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Montenegro")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        ban=0;
        if (matriz_distancia[0][5]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[0][5];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("La Tebaida")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        //buscar ciudad en la lista de vertices
        movilv=cabv;
        ban=0;
        while((ban==0)&&(movilv!=null)){
            if(movilv.nombrev.equals("Armenia")){
                ban=1;
                //codigo para enlazar el vertice a la lista de aristas
                movilv.siga=caba;
            }
            movilv=movilv.sigv;
        }
        // termina vertice armenia *********************************************************************************
        //vertice calarca *********************************************************************************************

        caba=null;
        ban=0;
        if (matriz_distancia[1][0]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[1][0];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Armenia")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        ban=0;
        while(movila!=null){
            System.out.println(movila.distancia);
            movila=movila.siga;
        }

        if (matriz_distancia[1][3]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[1][3];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Córdoba")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        ban=0;
        if (matriz_distancia[1][9]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[1][9];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Salento")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        //buscar ciudad en la lista de vertices
        movilv=cabv;
        ban=0;
        while((ban==0)&&(movilv!=null)){
            if(movilv.nombrev.equals("Calarcá")){
                ban=1;
                //codigo para enlazar el vertice a la lista de aristas
                movilv.siga=caba;
            }
            movilv=movilv.sigv;
        }

        // termina vertice calarca
        //vertice circasia *********************************************************************************************

        caba=null;
        ban=0;
        if (matriz_distancia[2][0]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[2][0];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Armenia")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }


        ban=0;
        while(movila!=null){
            System.out.println(movila.distancia);
            movila=movila.siga;
        }

        if (matriz_distancia[2][2]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[2][2];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Circasia")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        ban=0;
        if (matriz_distancia[2][4]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[2][4];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Filandia")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        ban=0;
        if (matriz_distancia[2][6]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[2][6];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Montenegro")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        ban=0;
        if (matriz_distancia[2][8]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[2][8];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Quimbaya")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        ban=0;
        if (matriz_distancia[2][9]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[2][9];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Salento")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        //buscar ciudad en la lista de vertices
        movilv=cabv;
        ban=0;
        while((ban==0)&&(movilv!=null)){
            if(movilv.nombrev.equals("Circasia")){
                ban=1;
                //codigo para enlazar el vertice a la lista de aristas
                movilv.siga=caba;
            }
            movilv=movilv.sigv;
        }

        // termina vertice circasia
        //vertice cordoba *********************************************************************************************

        caba=null;
        ban=0;
        if (matriz_distancia[3][1]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[3][1];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Calarcá")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        ban=0;
        if (matriz_distancia[3][3]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[3][3];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Córdoba")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        ban=0;
        if (matriz_distancia[3][7]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[3][7];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Pijao")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        ban=0;
        while(movila!=null){
            System.out.println(movila.distancia);
            movila=movila.siga;
        }

        if (matriz_distancia[3][10]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[3][10];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Buenavista")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }


        //buscar ciudad en la lista de vertices
        movilv=cabv;
        ban=0;
        while((ban==0)&&(movilv!=null)){
            if(movilv.nombrev.equals("Córdoba")){
                ban=1;
                //codigo para enlazar el vertice a la lista de aristas
                movilv.siga=caba;
            }
            movilv=movilv.sigv;
        }

        // termina vertice Filandia
        //vertice ibague *********************************************************************************************

        caba=null;
        ban=0;
        if (matriz_distancia[4][2]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[4][2];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Circasia")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        ban=0;
        if (matriz_distancia[4][4]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[4][4];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Filandia")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        ban=0;
        if (matriz_distancia[4][8]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[4][8];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Quimbaya")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        ban=0;
        while(movila!=null){
            System.out.println(movila.distancia);
            movila=movila.siga;
        }

        if (matriz_distancia[4][9]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[4][9];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Salento")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        //buscar ciudad en la lista de vertices
        movilv=cabv;
        ban=0;
        while((ban==0)&&(movilv!=null)){
            if(movilv.nombrev.equals("Filandia")){
                ban=1;
                //codigo para enlazar el vertice a la lista de aristas
                movilv.siga=caba;
            }
            movilv=movilv.sigv;
        }

        // termina vertice filandia
// inicio vertice la tebaida
        caba=null;
        ban=0;
        if (matriz_distancia[5][0]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[5][0];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Armenia")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        ban=0;
        if (matriz_distancia[5][5]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[5][5];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("La Tebaida")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        ban=0;
        if (matriz_distancia[5][6]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[5][6];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Montenegro")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        ban=0;
        while(movila!=null){
            System.out.println(movila.distancia);
            movila=movila.siga;
        }

        if (matriz_distancia[5][10]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[5][10];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Buenavista")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        //buscar ciudad en la lista de vertices
        movilv=cabv;
        ban=0;
        while((ban==0)&&(movilv!=null)){
            if(movilv.nombrev.equals("La Tebaida")){
                ban=1;
                //codigo para enlazar el vertice a la lista de aristas
                movilv.siga=caba;
            }
            movilv=movilv.sigv;
        }
        // termina vertice la tebaida

        //vertice montenegro *********************************************************************************************

        caba=null;
        ban=0;
        if (matriz_distancia[6][0]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[6][0];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Armenia")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        ban=0;
        if (matriz_distancia[6][3]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[6][3];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Circasia")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        if (matriz_distancia[6][5]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[6][5];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("La Tebaida")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        ban=0;
        if (matriz_distancia[6][6]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[6][6];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Montenegro")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        ban=0;
        while(movila!=null){
            System.out.println(movila.distancia);
            movila=movila.siga;
        }

        if (matriz_distancia[6][8]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[6][8];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Quimbaya")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }


        //buscar ciudad en la lista de vertices
        movilv=cabv;
        ban=0;
        while((ban==0)&&(movilv!=null)){
            if(movilv.nombrev.equals("Montenegro")){
                ban=1;
                //codigo para enlazar el vertice a la lista de aristas
                movilv.siga=caba;
            }
            movilv=movilv.sigv;
        }
        // termina vertice  montenegro
        // incio vertice pijao ***********************************************++
        caba=null;
        ban=0;
        if (matriz_distancia[7][3]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[5][0];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Córdoba")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        ban=0;
        if (matriz_distancia[7][7]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[7][7];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Pijao")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        ban=0;
        while(movila!=null){
            System.out.println(movila.distancia);
            movila=movila.siga;
        }

        ban=0;
        if (matriz_distancia[7][11]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[5][6];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Génova")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }



        //buscar ciudad en la lista de vertices
        movilv=cabv;
        ban=0;
        while((ban==0)&&(movilv!=null)){
            if(movilv.nombrev.equals("Pijao")){
                ban=1;
                //codigo para enlazar el vertice a la lista de aristas
                movilv.siga=caba;
            }
            movilv=movilv.sigv;
        }
        // termina vertice pijao

        // incio vertice quimbaya ***********************************************++
        caba=null;
        ban=0;
        if (matriz_distancia[8][2]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[8][2];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Circasia")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        ban=0;
        if (matriz_distancia[8][4]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[8][4];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Filandia")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        ban=0;
        while(movila!=null){
            System.out.println(movila.distancia);
            movila=movila.siga;
        }

        ban=0;
        if (matriz_distancia[8][6]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[8][6];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Montenegro")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        ban=0;
        if (matriz_distancia[8][8]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[8][8];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Quimbaya")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }



        //buscar ciudad en la lista de vertices
        movilv=cabv;
        ban=0;
        while((ban==0)&&(movilv!=null)){
            if(movilv.nombrev.equals("Quimbaya")){
                ban=1;
                //codigo para enlazar el vertice a la lista de aristas
                movilv.siga=caba;
            }
            movilv=movilv.sigv;
        }
        // termina vertice quimbaya

        // incio vertice salento ***********************************************++
        caba=null;
        ban=0;
        if (matriz_distancia[9][1]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[9][1];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Calarcá")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        ban=0;
        if (matriz_distancia[9][2]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[9][2];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Circasia")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        ban=0;
        while(movila!=null){
            System.out.println(movila.distancia);
            movila=movila.siga;
        }

        ban=0;
        if (matriz_distancia[9][4]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[9][4];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Filandia")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }



        //buscar ciudad en la lista de vertices
        movilv=cabv;
        ban=0;
        while((ban==0)&&(movilv!=null)){
            if(movilv.nombrev.equals("Salento")){
                ban=1;
                //codigo para enlazar el vertice a la lista de aristas
                movilv.siga=caba;
            }
            movilv=movilv.sigv;
        }
        // termina vertice salento

        // incio vertice buenavista ***********************************************++
        caba=null;
        ban=0;
        if (matriz_distancia[10][3]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[10][3];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Córdoba")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        ban=0;
        if (matriz_distancia[10][5]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[10][5];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("La Tebaida")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        ban=0;
        if (matriz_distancia[10][7]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[10][7];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Pijao")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        ban=0;
        while(movila!=null){
            System.out.println(movila.distancia);
            movila=movila.siga;
        }

        ban=0;
        if (matriz_distancia[10][10]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[10][10];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Buenavista")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }



        //buscar ciudad en la lista de vertices
        movilv=cabv;
        ban=0;
        while((ban==0)&&(movilv!=null)){
            if(movilv.nombrev.equals("Buenavista")){
                ban=1;
                //codigo para enlazar el vertice a la lista de aristas
                movilv.siga=caba;
            }
            movilv=movilv.sigv;
        }
        // termina vertice buenavista

        // incio vertice genova ***********************************************++
        caba=null;
        ban=0;
        if (matriz_distancia[11][7]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[10][7];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Pijao")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        ban=0;
        while(movila!=null){
            System.out.println(movila.distancia);
            movila=movila.siga;
        }

        ban=0;
        if (matriz_distancia[11][11]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[11][11];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Génova")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }



        //buscar ciudad en la lista de vertices
        movilv=cabv;
        ban=0;
        while((ban==0)&&(movilv!=null)){
            if(movilv.nombrev.equals("Génova")){
                ban=1;
                //codigo para enlazar el vertice a la lista de aristas
                movilv.siga=caba;
            }
            movilv=movilv.sigv;
        }
        // termina vertice genova


    }
    public  void imprimir_vertices(){
        movilv=cabv;
        while(movilv!=null){
            System.out.println(movilv.nombrev);
            movilv=movilv.sigv;
        }

    }
    public  void imprimir_aristas_vertice()throws IOException{
        int ban=0;
        BufferedReader Teclado;
        Teclado=new BufferedReader(new InputStreamReader(System.in));
        String Vertice=new String("");
        System.out.println("Digite el nombre del vertice");
        Vertice=Teclado.readLine();
        movilv=cabv;
        while((ban==0)&&(movilv!=null)){
            if(movilv.nombrev.equals(Vertice)){
                ban=1;
                movila=movilv.siga;
                while (movila!=null && movila.sigv != null){
                    System.out.println("A " + movila.sigv.nombrev + " distancia = " + movila.distancia);
                    movila=movila.siga;
                }
            }
            movilv=movilv.sigv;
        }
    }
    public void consultar_distancia_origen_destino()throws IOException{
        int ban=0;
        BufferedReader Teclado;
        Teclado=new BufferedReader(new InputStreamReader(System.in));
        String VerticeOrigen=new String("");
        String VerticeDestino=new String("");
        System.out.println("Digite el nombre del vertice de Origen");
        VerticeOrigen=Teclado.readLine();
        System.out.println("Digite el nombre del vertice de Destino");
        VerticeDestino=Teclado.readLine();
        movilv=cabv;
        while((ban==0)&&(movilv!=null)){
            if(movilv.nombrev.equals(VerticeOrigen)){
                ban=1;
                movila=movilv.siga;
                while (movila!=null && movila.sigv != null){
                    if (VerticeDestino.equals(movila.sigv.nombrev))
                        System.out.println("De " + movilv.nombrev + " A " + movila.sigv.nombrev + " distancia = " + movila.distancia);
                    movila=movila.siga;
                }
            }
            movilv=movilv.sigv;
        }
    }
    public  void destruir_grafo(){
        NodoVertice borrav;
        NodoArista borraa;
        borrav = cabv;
        movilv = cabv;
        while(movilv != null){
            movilv = movilv.sigv;
            borraa = borrav.siga;
            movila = borrav.siga;
            while(movila != null){
                movila = movila.siga;
                borraa = null;
                borraa = movila;
            }
            borrav = null;
            borrav = movilv;
        }
    }
}// //fin de la clase Grafos
//inicio de la clase TestGrafos
class TestGrafos{

    public static void main(String arg[])throws IOException{
        String opc = "";
        BufferedReader Teclado;
        Teclado=new BufferedReader(new InputStreamReader(System.in));
        Grafos F= new Grafos();
        F.inicializar_grafo();
        F.inicializar_matriz_de_adyacencia_distancias();
        F.ingresar_vertice();
        F.ingresar_arista_vertice();

        do{ //menu principal
            System.out.println("1. Imprimir Vertices");
            System.out.println("2. Imprimir Aristas de Vertice");
            System.out.println("3. Consultar Distancia entre dos Vertices");
            System.out.println("4. Salir");
            System.out.println("digite la opcion");
            opc= Teclado.readLine();
            switch(opc){
                case "1": F.imprimir_vertices();
                    break;
                case "2": F.imprimir_aristas_vertice();
                    break;
                case "3": F.consultar_distancia_origen_destino();
                    break;
            }
        }while(opc!="4");
        F.destruir_grafo();
    }
}//fin de la clase TestGrafos