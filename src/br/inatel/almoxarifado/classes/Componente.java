package br.inatel.almoxarifado.classes;

import javax.swing.JOptionPane;

/**
 *
 * @author Bruno, Flávio e Gustavo
 */
public class Componente implements Comparable<Componente>{
    
    private String valor;
    private String tipo;
    private int quantidade;

    /**
     * 
     * @return Retorna o valor do componente 
     */
    public String getValor() {
        return valor;
    }

    /**
     * 
     * @param valor Seta o valor do componente 
     */
    public void setValor(String valor) {
        this.valor = valor;
    }

    /**
     * 
     * @return Retorna o tipo do componente 
     */
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * 
     * @param o objeto Componente a ser comparado
     * @return inteiro para validação de dados
     */
    @Override
    public int compareTo(Componente o) {
        
        if(valor.equals(o.valor) && tipo.equals(o.tipo))
        {
            JOptionPane.showMessageDialog(null, "Componente já existente!");
            return -1;
        }
        return 0;
        
    }
    
    
    
}
