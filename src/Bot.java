public class Bot{
    private opc;
    private rival;
    public void bot(Opciones o){
        this.opc = o;
        rival = Opciones.contrario(o);
    }

    public int[] colocarPieza(int[][] tablero){  
        
    }

    public int[] valorar(int[][] tablero){
        if (tablero[1][1] == Opciones.VACIO){
            return {1 , 1}
        }

        new int[][] tableroPuntuado = new int[3][3];

        for (int i = 0; i<tablero[0].lenght; i++){
            for(int j = 0; j<tablero[1].lenght; j++)
            {
                if (tablero[i][j] != Opciones.VACIO){
                    tableroPuntuado[i][j] = 0;
                } else {
                recorrerTablero()
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

    public Opciones consultarCasilla(int i, int j){
        return tablero[i][j];
    }

    public void recorrerTablero(Consumer<> funcion){
        for (int i = 0; i<tablero[0].lenght; i++){
            for(int j = 0; j<tablero[1].lenght; j++)
            {
                if()
                funcion;
            }
        }
    }

}