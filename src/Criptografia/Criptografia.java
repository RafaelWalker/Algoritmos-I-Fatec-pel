
package Criptografia;

/**
 *
 * @author Rafael Walker
 */
public class Criptografia {
    
    private String palavra; 
    void Criptografia(String palavra){
        this.palavra = palavra;
    }
    
    public static void cesar(String palavra){
        char novaPalavra[] = new char[palavra.length()];
        for(int i = 0; i < palavra.length();i++){
            novaPalavra[i] = (char) (( palavra.charAt(i))+3); 
            if(novaPalavra[i] >= 123){    
            System.out.print((char)(novaPalavra[i]-26));
            }else if (novaPalavra[i] == 35){
                System.out.print(" ");
            }else{
                System.out.print((char)(novaPalavra[i]));
            }
        }
            System.out.println("");
    }
    
    public static void albam(String palavra){
        char novaPalavra[] = new char[palavra.length()];
        for(int i = 0; i < palavra.length();i++){
            novaPalavra[i] = (char) (( palavra.charAt(i))+13); 
            if(novaPalavra[i] >= 123){    
            System.out.print((char)(novaPalavra[i]-26));
            }else if (novaPalavra[i] == 45){
                System.out.print(" ");
            }else{
                System.out.print((char)(novaPalavra[i]));
            }
            }
            System.out.println("");
        }
    }
