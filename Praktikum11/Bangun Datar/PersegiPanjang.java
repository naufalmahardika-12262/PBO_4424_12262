public class PersegiPanjang extends BangunDatar implements Resizeable{
    int panjang, lebar;

    public PersegiPanjang(int sisi, int panjang, int lebar){
        super(sisi);
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public void draw(){

    }

    @Override
    public void resize(){

    }

    @Override
    public int getJumlahSisi(){
        return this.getJumlahSisi();
    }

    @Override
    public double getLuas(){
        return this.panjang * this.lebar;
    }

    @Override
    public double getKeliling(){
        return (this.panjang * 2) + (this.lebar * 2);
    }

    @Override
    public void resize(double x){

    }

//    @Override
//    public void resize(double x){
//        this.panjang = (int) (this.panjang * x);
//        this.lebar  = (int) (this.lebar * x);
//    }

}