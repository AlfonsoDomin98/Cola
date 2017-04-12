package Models;

import java.util.Arrays;

public class Cola_Autoredimensional<T> {
	// ATRIBUTOS
    private T[] elementos;
    // CONSTRUCTOR VACÍO
    	public Cola_Autoredimensional(){
    		//Reservará memoria para un elemento.
    	}
    	//MÉTODOS
    	public void push(T element ){
    		this.elementos = Arrays.copyOf(this.elementos, this.elementos.length+1);
    		this.elementos[this.elementos.length-1]=element;
    	}
    	
    	public void remove(T element){
    			this.elementos=Arrays.copyOf(this.elementos, this.elementos.length-1);
    			this.elementos[this.elementos.length+1]=element;	
    	}
    	public void pop(){
    		this.elementos=Arrays.copyOf(this.elementos, this.elementos.length - 1);
    		this.elementos[this.elementos.length-1] = this.elementos[0];

    		
    		}
    	public void clear(){
    		this.elementos= Arrays.copyOf(this.elementos, this.elementos.length - this.elementos.length);
    		}
    	public boolean contains(Object o){
    		boolean Contener = false;
    		if(this.elementos == o){
    			Contener = Contener;
    		}
    		else{
			return false;
    		}
    		return Contener;
    		
    		}
  	    public boolean isEmpty(){
  	    	boolean Vacio = false;
  	    	if(this.elementos.length == 0){
  	    		Vacio = Vacio;
  	    	}
  	    	else{
  	    		Vacio= !Vacio;
  	    	}
  	    	return Vacio;
  	    	
			
    		          
    		}
  	    public int size(){
			return this.elementos.length;
    		          //Devuelve el tamaño de la cola.
    		}

	}
