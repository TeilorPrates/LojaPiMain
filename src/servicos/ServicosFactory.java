/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicos;

/**
 *
 * @author 182120011
 */
public class ServicosFactory {
     private static PessoaServicos pessoaS = new PessoaServicos();
   

    public static PessoaServicos getPessoaServicos() {
        return pessoaS;
    }
    public static void main(String[] args){
    }
   
    
}
