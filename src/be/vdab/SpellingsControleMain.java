package be.vdab;
public class SpellingsControleMain {
    public static void main(String[] args) {
        SpellingsControleAdapter controle = new SpellingsControleAdapter();
        //OudeSpellingsControle controle = new OudeSpellingsControle();
        controle.setTaal("nl");
        controle.setTekst("Ik kom onmidelijk met een paralelogram");
        controle.controleerSpelling();
        int aantalFouten = controle.getAantalFouten();
        for (int index = 0; index != aantalFouten; index++){
            System.out.println(controle.getFout(index));
        }
    }    
}
