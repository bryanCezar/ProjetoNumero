
package br.ulbra.entity;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Compra {
    public ArrayList compras;
    public Compra(){
        compras= new ArrayList();
    }
    //create - add
    public void salvar(String item){
        compras.add(item);
        JOptionPane.showMessageDialog(null, "Salvo com Sucesso!");
    }
    //read - listar
    public String Listar(){
        String res = "";
    
    if(!compras.isEmpty()){
        for(int i = 0; i < compras.size(); i++){
            res+=  (i+1)+ " - "+compras.get(i)+
                    "\n";
        }
        }else{
                res = "lista vazia!";
                }
        return res;
    }
    public void excluir(int indice){
        if(!compras.isEmpty()){
          if(indice > 0 && indice < compras.size()){
              compras.remove(indice - 1);
              JOptionPane.showMessageDialog(null, "excluído com sucesso!!");
          }  else{
              JOptionPane.showMessageDialog(null, "Código não Exite!");
          }
        }else{
            JOptionPane.showMessageDialog(null, "impossivel excluir, lista está vazia!");
        }
     
        
    }
      public void alterar(int indice, String elemento){
        if(!compras.isEmpty()){
          if(indice > 0 && indice < compras.size()){
              compras.set(indice - 1,  elemento);
              JOptionPane.showMessageDialog(null, "alterado com sucesso!!");
          }  else{
              JOptionPane.showMessageDialog(null, "Código não Exite!");
          }
        }else{
            JOptionPane.showMessageDialog(null, "impossivel alterar"
                    + ", lista está vazia!");
        }
         
        
    }
}
