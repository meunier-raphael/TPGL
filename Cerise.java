
public class Cerise {
    private double prix;
    private String origine;
	
    public Cerise() 
    {
        this.prix = 0.5;  //prix en euros
        this.origine="Espagne";
    }
    
    public Cerise(double prix, String origine) 
    {
        if(prix < 0)
            this.prix = -prix;  //une solution possible pour interdire les prix negatifs
        else
            this.prix = prix;

        if(origine.equals(""))
            this.origine = "Espagne";  //Espagne par défaut
        else
            this.origine = origine;   
    }

    public double getPrix(){
	    return prix;
    }

    public void setPrix(double prix){
	    this.prix=prix;
    }

    public String getOrigine(){
	    return origine;
    }
 
    public void setOrigine(String origine){
	    this.origine=origine;
    }

    @Override
    public String toString(){
        return "Cerise de " + origine + " a " + prix + " euros";
    }

    @Override
    public boolean equals(Object o){  //predicat pour tester si 2 oranges sont equivalentes
        if(o != null && getClass() == o.getClass()){
            Cerise or = (Cerise) o;
            return (prix == or.prix && origine.equals(or.origine));
        }
        return false;
    }

    public boolean isSeedless() {  //predicat indiquant qu'une orange a des pepins
        return true;
    }


    public static void main (String[] args){
        //Ecrire ici vos tests
        System.out.println("-- premier test Cerise: ");
        Cerise cerise1 = new Cerise(1.2, "Italie");
        Cerise cerise2 = new Cerise();
        System.out.println("Cerise 1 : " + cerise1.toString());
        System.out.println("Cerise 2 : " + cerise2.toString());
   }
}
