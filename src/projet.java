/**
 * Created by Emeric on 01/04/2017.
 */
public class projet {
    public static void main(String[] args){
        Lot cass1 = new Lot("azerty", "Casserole haute King Size","“T-Fale",45,250, 45);
        Couvert Couv1 = new Couvert("dthx", "couteau à poisson","Fish",12,"inox", 14);
        cass1.getProp();
        Couv1.getProp();
        cass1.PrixLot();
    }
}
