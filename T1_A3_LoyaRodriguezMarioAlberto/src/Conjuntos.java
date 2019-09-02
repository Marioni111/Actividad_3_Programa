import java.util.Arrays;

public class Conjuntos{

	int [] Final;
    int [] ConjuntoA;
    int [] ConjuntoB;
    
    public void obtenerPrimosYDivisores(){
         
    	short contPrimos = 0;
    	
        for(int i = 1; i <=100; i++ ){ 
                
            int divisores = 0;
            int numeroActual = 0;
                
            for(int j = 1; j <= i; j++){ 
                    
                numeroActual = j;
                	
                if((i % j) == 0){
                	divisores++; 
                }
                if(divisores == 2){
                    break;
                } 
            }
            if(numeroActual == i && i != 1){ 
                    
                	contPrimos++;
                }
            }
            ConjuntoA = new int[contPrimos];
            
            contPrimos = 0;
            
            for(int i = 1; i <= 100; i++){ 
               
            	int divisores = 0; 
                int numeroActual = 0;
                
                for(int j = 1; j <= i; j++){ 
                    
                	numeroActual = j;
                    
                	if ( (i % j) == 0) {
                		divisores++; 
                	}
                    if (divisores == 2)  {
                        break;
                    } 
                }
                if (numeroActual == i && i != 1) { 
                   
                	ConjuntoA[contPrimos]=i;
                    contPrimos++;
                }
            }
            
            short cont = 0;
        
            for(int j = 1; j <= 350; j++){
                
            	if(350 % j == 0){
                    cont++;
                }
            }
        
        ConjuntoB = new int[cont];
        
        cont = 0;
            
        for(int j = 1; j <= 350; j++){
                
        	if(350 % j == 0){
        		ConjuntoB[cont] = j;
                cont++;
            }
        }
    }
    
    public void Union(){
    	
    	int a[] = new int[ConjuntoA.length + ConjuntoB.length];
    	
    	System.arraycopy(ConjuntoA, 0, a, 0, ConjuntoA.length);
    	System.arraycopy(ConjuntoB, 0, a, ConjuntoA.length, ConjuntoB.length);
    	Arrays.sort(a);
		
    	for(int i = 0; i < a.length; i++){
			
    		for (int j = 0; j < a.length; j++) {
				
    			if (a[i] == a[j]) {
					a[i] = 0;
				}
			}
			a[i] = i;
		}
		for (int i = 0; i < a.length; i++) {
			
			if (a[i]!=0) {
				System.out.print(a[i] + ",");
			}
		}
    }
    public void Intersection(){
    	
    	for(int i = 0; i < ConjuntoA.length; i++){
			
    		for(int j = 0; j < ConjuntoB.length; j++){
				
    			if (ConjuntoA[i] == ConjuntoB[j]) {
					
    				System.out.print(ConjuntoA[i] + " ");
					break;
				}
			}
		}
    }
    public void diferencia(){
    	
    	for(int i = 0; i < ConjuntoA.length; i++){
			
    		for(int j = 0; j < ConjuntoB.length; j++){
				
    			if(ConjuntoA[i] != ConjuntoB[j]){
					
    				System.out.print(ConjuntoA[i] + " ");
					break;
				}
			}
		}
    	
    }
}