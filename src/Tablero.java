public class Tablero{
    private Opciones[][] tablero;
    public void Tablero(){
        tablero = llenarTablero()
    }

    public Opciones[][] llenarTablero(){
                return new Opciones{
                    [Opciones.VACIO, Opciones.VACIO, Opciones.VACIO]
                    [Opciones.VACIO, Opciones.VACIO, Opciones.VACIO]
                    [Opciones.VACIO, Opciones.VACIO, Opciones.VACIO]    
                };
            }

    public void mostrarTablero(){
        for(int i = 0;i<3;i++){
            for(int j = 0; j<3; j++){
                System.out.println(tablero[i][j].parseString());
            }
             System.out.println(" "+ i+1 + "\n");
        }
    }

    public void colocarPieza(int[2] lugar, Opciones pieza){
        tablero[lugar[0]][lugar[1]] = pieza;
    }

}