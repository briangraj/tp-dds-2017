package model.metodologia.condiciones;

public class LessAndEqualThan implements BooleanCondition{
	public boolean comparar(Integer valorUno, Integer valorDos){
		return valorUno <= valorDos;
	}
}
