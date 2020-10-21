package programacionlogica;

import static programacionlogica.expresion_logica.*;
/**
 * @author oscar
 */
public class ExpresionLogica {
    String p[] = {"verdadero", "verdadero", "falso", "falso"};
    String q[] = {"verdadero", "falso", "verdadero", "falso"};
    String aux="";
    String con1[] = new String[4];
    String cj[] = new String[4];
    String con2[] = new String[4];
    String exp = "[(p->q)^p]->q";
    
    ExpresionLogica(){
        char arr[] = exp.toCharArray();
        for(int i=0; i<exp.length(); i++){
            if(arr[i]=='(' | arr[i]!=')'){
                    aux+=arr[i];
                    i++;
            }
        }
        
        System.out.println("[(p->q)");
        condicional.setText("[(p->q)");
        char v1, v2;
        v1=aux.charAt(1);
        v2=aux.charAt(4);
        Condicional(v1, v2);
           
        for(int i=0; i<exp.length(); i++){
               if(arr[i]=='^' | arr[i]!=']'){
                       aux+=arr[i];
                       i++;
               }
        }
        System.out.println("[(p->q)^q]");
        conjuncion.setText("[(p->q)^q]");
        char v3;
            v3=aux.charAt(1);
            Conjuncion(v3);

        System.out.println("[(p->q)^q]->q]");
        condicional2.setText("Final: [(p->q)^q]->q]");
        Condicion2();
    }
   
    private void Condicional(char v1, char v2){
        for(int i=0; i<p.length; i++){
            if(p[i]=="verdadero" && q[i]=="falso"){
                con1[i]="falso";
            }else{
                con1[i]="verdadero";
            }
        }
        
        c1.setText(""+con1[0]);
        c2.setText(""+con1[1]);
        c3.setText(""+con1[2]);
        c4.setText(""+con1[3]);
        for(int i=0; i<con1.length; i++){
            System.out.println(con1[i]);
        }
    }
    
    private void Conjuncion(char v3){
        for(int i=0; i<p.length; i++){
            if(con1[i]=="verdadero" && p[i]=="verdadero"){
            	cj[i]="verdadero";
            }else{
            	cj[i]="falso";
            }
        }
        
        cj1.setText(""+cj[0]);
        cj2.setText(""+cj[1]);
        cj3.setText(""+cj[2]);
        cj4.setText(""+cj[3]);
        for(int i=0; i<cj.length; i++){
            System.out.println(cj[i]);
        }
    }
    
    private void Condicion2(){
        for(int i=0; i<q.length; i++){
            if(cj[i]=="verdadero" && q[i]=="falso"){
            	con2[i]="falso";
            }else{
            	con2[i]="verdadero";
            }
        }
        c21.setText(""+con2[0]);
        c22.setText(""+con2[1]);
        c23.setText(""+con2[2]);
        c24.setText(""+con2[3]);
        for(int i=0; i<con2.length; i++){
            System.out.println(con2[i]);
        }
    }
}