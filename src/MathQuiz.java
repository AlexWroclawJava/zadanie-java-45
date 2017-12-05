public class MathQuiz {

    private double wynikMnozenia;
    private double poleKwadratu;
    private double pierwiastekKwadratowy;


    public boolean question1(double wynikMnozenia){
            if(wynikMnozenia == 15){
                return true;
            } else {
                return false;
            }
    }

    public boolean question2(double poleKwadratu){
            if(poleKwadratu == 144){
                return true;
            } else {
                return false;
            }
    }

    public boolean question3(double pierwiastekKwadratowy){
            if(pierwiastekKwadratowy == 123){
                return true;
            } else {
                return false;
            }
        }


    public double getWynikMnozenia() {
        return wynikMnozenia;
    }

    public void setWynikMnozenia(double wynikMnozenia) {
        this.wynikMnozenia = wynikMnozenia;
    }

    public double getPoleKwadratu() {
        return poleKwadratu;
    }

    public void setPoleKwadratu(double poleKwadratu) {
        this.poleKwadratu = poleKwadratu;
    }

    public double getPierwiastekKwadratowy() {
        return pierwiastekKwadratowy;
    }

    public void setPierwiastekKwadratowy(double pierwiastekKwadratowy) {
        this.pierwiastekKwadratowy = pierwiastekKwadratowy;
    }
}
