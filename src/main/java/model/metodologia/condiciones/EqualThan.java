package model.metodologia.condiciones;

public class EqualThan implements BooleanCondition{
	public boolean comparar(Integer valorUno, Integer valorDos){
		return valorUno == valorDos;
	}
}
