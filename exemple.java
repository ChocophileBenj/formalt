public class LoL {
	
	
	public static void main (String args[]){
	
 
	  chercheCubes(100009) //différence des cubes de 57 et 44 (en effet 57^3 = 185193 et 44^3 = 85184, et c'est le seul couple dont la somme ou la différence des cubes fait 100009)
	
	}	
		
  //Cette fonction renvoie, pour un nombre donné n, les couples (a,b) tels que a^3 + b^3 = n ou a^3-b^3=n
  
	public static void chercheCubes(int argument){
		
		int midA = argument/2;
		int e = 0;
		int e3 = 0;
		int c=0;
		
		//Math.pow(ee.doubleValue(),(double) 1/3);
		
		do{	
			c = racineCubique(argument-e3);
			if (c != -1)
				System.out.println("Somme cubes de " + e + " et " + c);
			e++;
			e3 = e*e*e;
		}while (e3 <= midA);
		
		e = 0;
		e3 = 0;
		int ePrec = -1;
		
		do{
			c = racineCubique(argument+e3);
			if (c != -1)
				System.out.println("Distance cubes de " + c + " et " + e);
			ePrec = e3;
			e++;
			e3 = e*e*e;
		}while (e3-ePrec <= midA);
		
		System.out.println("C'est tout pour " + argument);
		
	}
	
	//Précondition : e positif
	//Postcondition : si e cube d'un entier, racine cubique. Sinon -1
	public static int racineCubique(int e){
		Integer ee = new Integer(e);
		double ef = Math.pow(ee.doubleValue(),(double) 1/3)+0.0000001;
		int reponse = -1;
		if (Math.abs(ef-Math.floor(ef)) < 0.0000002)
			reponse = (int) Math.floor(ef);
		return reponse;
	}
	
	
}
