package br.com.digitalhouse;

public static void main(String[] args) {

public class Principal {

    public static String maeDe(Filho novoFilho) {
        return novoFilho.getMae();
    }



    public static String paiDe(Filho novoFilho) {
        return novoFilho.getPai();
    }

    public static boolean mesmaMae(Filho filhoUm, Filho filhoDois){
        return true;
    }

    public static boolean mesmoPai(Filho filhoUm, Filho filhoDois) {
        if (paiDe(filhoUm) == (filhoDois)) {
            return true;
        } else {
            return false;
        }
    }


}



/*
    public static void main(String[] args) {

        //Instanciando objetos
        Filho robson = new Filho();
        Filho jaqueline = new Filho();
        Filho julio = new Filho();
        Filho michele = new Filho();

        //
        robson.setMae("Ana");
        jaqueline.setMae("Ana");
        julio.setMae("Cristina");
        michele.setMae("Ana");

        //
        robson.setPai("José");
        jaqueline.setPai("José");
        julio.setPai("José");
        michele.setPai("José");

        //




    }
}
