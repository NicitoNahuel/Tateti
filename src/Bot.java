public class Bot{
    private Opciones opc;
    private Opciones rival;
    private int[][] tableroPuntuado = new int[3][3];
    private Random r = new Random();

    public void bot(Opciones o){
        this.opc = o;
        this.rival = Opciones.contrario(o);
    }

    public int[] colocarPieza(int[][] tablero){  
        //como primer movimiento si la casilla del medio esta vacia poner ahi
        if (tablero[1][1] == Opciones.VACIO){
            return {1 , 1}
        }

        valorar() //valorar Tablero
        return recorrerTablero(-> int[] casillaMax = new int[2];
                recorrerTablero(-> if (i == 0 && j == 0) {casillaMax = tableroPuntuado[i][j]})
                recorrerTablero(-> if (tableroPuntuado[i][j] > tableroPuntuado[casillaMax[0]][casillaMax[1]]){
                    casillaMax[0] = i; casillaMax[1] = j; 
                })
                return casillaMax;
        ) //devuelve donde colocar la pieza
    }

    public int[] valorar(int[][] tablero){
        recorrerTablero()//recorrido inicial

        for (int i = 0; i<tablero[0].lenght; i++){
            for(int j = 0; j<tablero[1].lenght; j++)
            {       
                if (tableroPuntuado[i][j] != 0){ //valorar individualmente las casillas vacias
                    //mirar las casillas de al rededor a la casilla vacia
                    valorarCasilla(i, j);
                } 
            }
        }
        /*
         0 1 2
        [][][] 0
        [][][] 1
        [][][] 2
        */
    }

    private Opciones consultarCasilla(int i, int j){
        return tablero[i][j];
    }

    public Opciones getPiezaBot(){
        return opc;
    }

    private void ValorarCasilla(int i, int j){
                     if(tableroPuntuado[i+2][j]){

                    }
                    if(tableroPuntuado[i+2][j+1])
                    if(tableroPuntuado[i+2][j-1])
                    if(tableroPuntuado[i][j+1])
                    if(tableroPuntuado[i][j-1])
                    if(tableroPuntuado[i][j])
                    if(tableroPuntuado[i-1][j])
                    if(tableroPuntuado[i-1][j-1])
                    if(tableroPuntuado[i-1][j+1])
                    
                    //si fuera la del medio
                    
                    if(tableroPuntuado[i+1][j]){

                    }
                    if(tableroPuntuado[i+1][j+1])
                    if(tableroPuntuado[i+1][j-1])
                    if(tableroPuntuado[i][j+1])
                    if(tableroPuntuado[i][j-1])
                    if(tableroPuntuado[i][j])
                    if(tableroPuntuado[i-1][j])
                    if(tableroPuntuado[i-1][j-1])
                    if(tableroPuntuado[i-1][j+1])
    } 

    public void recorrerTablero(Consumer<Opciones o> funcion){
        for (int i = 0; i<tablero[0].lenght; i++){
            for(int j = 0; j<tablero[1].lenght; j++)
            {
                if(funcion != null)  {
                    funcion;
                } else {
                    //recorrido inicial
                    if (!consultarCasilla[i][j].equals(Opciones.VACIO)){
                        tableroPuntuado[i][j] = 0;
                    } else {
                        tableroPuntuado[i][j] = 1;
                    }
                }
            }
        }
    }

}
