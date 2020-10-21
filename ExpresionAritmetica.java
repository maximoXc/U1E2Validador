package programacionlogica;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import static programacionlogica.expresion_aritmetica.lbl1;
import static programacionlogica.expresion_aritmetica.lbl2;

public class ExpresionAritmetica {
    Stack pilaOperaciones = new Stack();
    Stack pilaFinal = new Stack();
    
    public ExpresionAritmetica() {
        separar("(6+2)*3/2^2-4"); //infija
    }
    
    private void separar(String operacion) {
        String prefijo = "(?=[-+*/^()])";
        String sufijo = "(?<=[-+*/^()])";
	String simbolos = "(?=[-+*/^()])|(?<=[-+*/^()])";
        String []arreglo = operacion.split(simbolos);
        SeparaExpresion(arreglo);
    }
    
    private void SeparaExpresion(String[] arreglo) {
        List cadena = new ArrayList();
        
        for (int i = 0; i < arreglo.length; i++) {
            if(isNumeric(arreglo[i])) {
                cadena.add(arreglo[i]);
                if (i == arreglo.length-1) {
                    while(!pilaOperaciones.empty()){
                        cadena.add(pilaOperaciones.peek());
			pilaOperaciones.pop();
                    }
		}
            }else {
                int prioridad = prioridad(arreglo[i]);
                switch (prioridad) {
                    case 0:
                        if(!pilaOperaciones.empty()) {
                            int prioridadPila = prioridad((String) pilaOperaciones.peek());
                            if(prioridadPila == prioridad) {
                                cadena.add(pilaOperaciones.peek());
                                pilaOperaciones.pop();
                            }else if(prioridadPila>prioridad) {
                                while(!pilaOperaciones.empty()){
                                    cadena.add(pilaOperaciones.peek());
                                    pilaOperaciones.pop();
                                }
                            }
                        }
                        pilaOperaciones.push(arreglo[i]);
                        
                        break;
                    case 1:
                        if(!pilaOperaciones.empty()) {
                            int prioridadPila = prioridad((String) pilaOperaciones.peek());
                            if(prioridadPila == prioridad) {
                                cadena.add(pilaOperaciones.peek());
				pilaOperaciones.pop();
                            }else if(prioridadPila<prioridad) {
                                while(!pilaOperaciones.empty()){
                                    cadena.add(pilaOperaciones.peek());
                                    pilaOperaciones.pop();
                                }
                            }
                        }
                        pilaOperaciones.push(arreglo[i]);
                        break;
                    case 2:
                        pilaOperaciones.push(arreglo[i]);
                        break;
                    case 3:
                        while(!pilaOperaciones.empty()){
                            cadena.add(pilaOperaciones.peek());
                            pilaOperaciones.pop();
                        }
                        break;
                    default:
                        break;
                }
            }
        }
        System.out.println(cadena);
        lbl1.setText(""+cadena);
        combierteeInsertaenPila(cadena);
    }
    
    private void combierteeInsertaenPila(List cadena) {
        for (int i = 0; i < cadena.size(); i++) {
            System.out.println(cadena.get(i)+ " es de tipo: " +  ((Object)cadena.get(i)).getClass().getSimpleName());
            try {
                int numero = Integer.parseInt((String) cadena.get(i));
                pilaFinal.push(numero);
		System.out.println("Numero en pila: "+pilaFinal.peek());
            }catch (NumberFormatException e){
                pilaFinal.push(cadena.get(i));
            }
        }
        
        Operaciones(cadena);
	//System.out.println("El resultado es: "+pilaFinal);		

    }
    
    private void Operaciones(List lista) {
        double op1 = 0, op2 = 0, resultado=0;
        String operador,s1,s2;
        
        for (int i = 0; i < lista.size(); i++) {
            if (isNumeric((String) lista.get(i))) {
                pilaFinal.push(lista.get(i));
            } else {
                operador = (String)lista.get(i);
                op2 =Double.parseDouble(pilaFinal.pop().toString());
                op1 =Double.parseDouble(pilaFinal.pop().toString());
                
                switch (operador) {
                    case "+":
                        resultado = op1 + op2;
                        pilaFinal.push(resultado);
                        break;
                    case "-":
                        resultado = op1 - op2;
                        pilaFinal.push(resultado);
                        break;
                    case "*":
                        resultado = op1* op2;
                        pilaFinal.push(resultado);
                        break;
                    case "/":
                        resultado = op1/ op2;
                        pilaFinal.push(resultado);
                        break;
                        case "^":
                    resultado = Math.pow(op1, op2);
                    pilaFinal.push(resultado);
                    break;
                }
            }
        }
        System.out.println("El resultado de la expresion es "+resultado);
        lbl2.setText("El resultado de la expresion es: "+resultado);
    }
    private int prioridad(String arreglo) {
        if (arreglo.equals("+") || arreglo.equals("-"))
            return 0;
        else if (arreglo.equals("*") || arreglo.equals("/"))
            return 1;
        else if (arreglo.equals("^"))
            return 2;
        else if (arreglo.equals(")"))
            return 3;
        return -1;
	} //Fin de la funcion prioridad

    private boolean isNumeric(String string) {
        try{
            double d = Double.parseDouble(string);
            return true;
        }catch(NumberFormatException nfe){
            return false;
        }
    }
}
