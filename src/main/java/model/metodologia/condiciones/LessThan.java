package model.metodologia.condiciones;

public class LessThan implements BooleanCondition{
	public boolean comprar(Integer valorUno, Integer valorDos){
		return valorUno < valorDos;
	}
}
