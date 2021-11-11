public class Partida {
    private Time timeA;
    private Time timeB;
    private int nGolsTimeA = 0;
    private int nGolsTimeB = 0;
    private boolean foiFinalizada = false;

    public void marcaGolTimeA() { nGolsTimeA++; }
    public void marcaGolTimeB() { nGolsTimeB++; }
    public int getTotalGols() { return nGolsTimeA+nGolsTimeB; } 
    
    public Time getTimeA() {
        return timeA;
    }
    public boolean isFoiFinalizada() {
        return foiFinalizada;
    }
    public void setFoiFinalizada(boolean foiFinalizada) {
        this.foiFinalizada = foiFinalizada;
    }
    public int getnGolsTimeB() {
        return nGolsTimeB;
    }
    public void setnGolsTimeB(int nGolsTimeB) {
        this.nGolsTimeB = nGolsTimeB;
    }
    public int getnGolsTimeA() {
        return nGolsTimeA;
    }
    public void setnGolsTimeA(int nGolsTimeA) {
        this.nGolsTimeA = nGolsTimeA;
    }
    public Time getTimeB() {
        return timeB;
    }
    public void setTimeB(Time timeB) {
        this.timeB = timeB;
    }
    public void setTimeA(Time timeA) {
        this.timeA = timeA;
    }
    
}
