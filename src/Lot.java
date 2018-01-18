/**
 * Created by Emeric on 01/04/2017.
 */
public class Lot extends Couvert,Casserole {
    protected String ref;
    protected String descriptif;
    protected String marque;
    protected double prixUnitaire;
    protected int tempMax;
    protected int qtt;
    protected String matiere;
    private double prixTotal;

    public Lot(String ref, String descriptif, String marque, double prixUnitaire, int tempMax, int qtt){
        this.ref = ref;
        this.descriptif = descriptif;
        this.marque = marque;
        this.prixUnitaire= prixUnitaire;
        this.tempMax = tempMax;
        this.qtt = qtt;
    }


    public void PrixLot(){
        if (qtt>1){
            prixTotal = prixUnitaire * qtt;
            prixTotal = prixTotal * (1-.20);
            System.out.println("Le prix de lot est de :" + prixTotal);
        }

    }

}
