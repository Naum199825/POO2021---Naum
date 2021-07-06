package br.edu.ifnmg.poo.sobrecarga;

/**
 *
 * @author fried
 */
public class OperacaoAritmetica {
    private float operandoA;
    private float operandoB;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    

    public OperacaoAritmetica() {
    }

    public OperacaoAritmetica(float operandoA, float operandoB) {
        this.operandoA = operandoA;
        this.operandoB = operandoB;
    }   
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    

    public float getOperandoA() {
        return operandoA;
    }

    public void setOperandoA(float operandoA) {
        this.operandoA = operandoA;
    }

    public float getOperandoB() {
        return operandoB;
    }

    public void setOperandoB(float operandoB) {
        this.operandoB = operandoB;
    }
    //</editor-fold>

    public float calcularSoma(){
        return operandoA + operandoB;    
    }
    
    public float calcularSoma(float operandoC){
        //return operandoA + operandoB+ operandoC;
        return calcularSoma() + operandoC;
    }
    @Override
    public String toString() {
        return "OperacaoAritmetica{" + "operandoA=" + operandoA + ", operandoB=" + operandoB + '}';
    }
    
}
