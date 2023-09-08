public class Lamparita {
    //Atributo de la clase

    //defino atributo del estado
    private boolean estado;

    //defino un cosntructor para que el estado este sea apagado
    //en java uns constructor no necesita el tipo que devueve porque tiene devovler de la misma clase que pertence

    public Lamparita(){
        this.estado = false;
        //implicitamente devuelve return this
    }
    

    public void encender(){
        //Si es void procedimiento
        // el this == self en python
        this.estado = true;
    }

    public void apagar(){
        this.estado = false;
    }

    //Funcion que devuelve el estado de mi lamparaita
    public boolean estado(){
        return estado;
    }
    
    public static void main(String[] args) throws Exception {
        System.out.println("Vamos a programar una lamparita! ");
        //Aca inicia toto
        

    }
        
    }

