import java.util.List;
import java.util.Stack;

public class ASA implements Parser{
    private int i = 0;
    private boolean hayErrores = false;
    private final List<Token> tokens;

    Object simb;

    Stack<Integer> estados = new Stack<>();
    

    public ASA(List<Token> tokens){
        this.tokens = tokens;
    }

    @Override
    public boolean parse() {
        estados.push(0);

        simb = tokens.get(i).tipo;

        while(!hayErrores){
             

            
        }
        if(hayErrores){
            System.out.println("Se encontraron errores sintacticos");
            return false;
        }
        else{
            System.out.println("La sintaxis es correcta");
            return true;
        }
    }
}
