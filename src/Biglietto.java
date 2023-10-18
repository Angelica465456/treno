public class Biglietto {
    private int par;
    private int arr;
    private double prezzo;


    public Biglietto(int par, int arr,double prezzp){
        this.par = par;
        this.arr = arr;
        this.prezzo = prezzp;
    }

    public Biglietto(Biglietto that){
        this.par = that.par;
        this.arr = that.arr;
        this.prezzo = that.prezzo;
    }

    public Biglietto(){
        this.par = 1;
        this.arr = 10;
        this.prezzo = 2.50;
    }


    public int getPar(){
        return this.par;
    }

    public int getArr(){
        return this.arr;
    }

    public double getPrezzo(){
        return this.prezzo;
    }


    public void setPar(int par){
        this.par = par;
    }

    public void setArr(int arr){
        this.arr = arr;
    }

    public void setPrezzo(double prezzo){
        this.prezzo = prezzo;
    }
}