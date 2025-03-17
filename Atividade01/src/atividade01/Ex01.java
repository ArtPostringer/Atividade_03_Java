
package atividade01;

class Ex01 {
    private String palavra;

    public Ex01() {
    }

    public Ex01(String palavra) {
        this.palavra = palavra;
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }
    
    public int ContarPalavra(){
        return palavra.length();
    }
    public void Testar(){
        System.out.println("Teste");
    }
}
