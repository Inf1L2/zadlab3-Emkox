package pl.edu.ur.POLab3;

import java.util.Scanner;

/**
 *
 * @author Emek
 */
public class Main {
    public static void main(String args[]){
        
    System.out.print("===========ZAD1.4===========");    
    int x;
    x=24;
    System.out.println("\nx = "+x);
    System.out.print("00000000 00000000 00000000 00011000");
    System.out.println("<-- liczbę x = 24 przesuwamy w prawo o 3");
    System.out.print("00000000 00000000 00000000 00000011");
    System.out.println("<-- w wyniku otrzymujemy liczbę 3");
    System.out.println("x = "+(x>>3));
    
    x=1;
    System.out.println("\nx = "+x);
    System.out.print("00000000 00000000 00000000 00000001");
    System.out.println("<-- liczbę x = 24 przesuwamy w lewo o 3");
    System.out.print("00000000 00000000 00000000 00001000");
    System.out.println("<-- w wyniku otrzymujemy liczbę 8");
    System.out.println("x = "+(x<<3));
    
    x=-4;
    System.out.println("\nx = "+x);
    System.out.print("11111111 11111111 11111111 11111100");
    System.out.println("<-- liczbę x = -4 przesuwamy w prawo o 2");
    System.out.print("00111111 11111111 11111111 11111111");
    System.out.println("<-- w wyniku otrzymujemy liczbę 1073741823 ze zmienionym znakiem");
    System.out.println("x = "+(x>>>2));

    x=4;
    System.out.println("\nx = "+x);
    System.out.print("00000000 00000000 00000000 00000100");
    System.out.println("<-- liczbę x = 4 przesuwamy w prawo o 2");
    System.out.print("00000000 00000000 00000000 00000001");
    System.out.println("<-- w wyniku otrzymujemy liczbę 1");
    System.out.println("x = "+(x>>>2));
    
    System.out.println("\n===========ZAD1.7===========");  
    byte a,b,c,d;
    a = 1;
    b = 2;
    c = 1;
    d = 2;
    boolean e=  true;
    System.out.println("--------XOR operator \"^\"--------");
    System.out.println("a = "+a);
    System.out.println("b = "+b);
    System.out.println("c = "+c);
    System.out.println("d = "+d);
    System.out.println("a^b= "+(a^b));
    System.out.println("a^c= "+(a^c));
    System.out.println("b^d= "+(b^d));
    System.out.println("--------NOT operator \"!\"--------");
    System.out.println("e = "+e);
    System.out.println("!e = "+!e);
    
    System.out.println("\n===========ZAD2.2===========");  
    
    System.out.println("\nchar[] toCharArray() - zamienia lancuch znakow na tablice z poszczegolnymi znakami");
        String str="Emanuel";  
        char[] tab = str.toCharArray();  
        for (int i = 0; i<tab.length; i++){  
        System.out.println(tab[i]);  
        }  
    System.out.println("\n============================"); 
    System.out.println("\nbyte[] getBytes() - ???");
    System.out.println("\n============================"); 
    System.out.println("\nboolean equals(String str) - porównanie dwóch stringów, działa tak samo jak ==,\njeśli są one wpisane w programie jednakże jesli będą pobierane z klawiatury == zwróci fałsz a equals() prawdę");
        String pierwszy= "Napis";
        String drugi = "Napis";
        System.out.println(pierwszy == drugi); //celowo
        System.out.println(pierwszy.equals(drugi));
    System.out.println("\n============================");     
    System.out.println("\nboolean equalsIgnoreCase(String str) - jak wyżej + ignporuje wielkość liter");  
    System.out.println("\n============================"); 
    System.out.println("\nint campareTo(String str) - Funkcja porównuje dwa stringi, zwraca 0 jeśli takie same");
        String str1 ="Ala ma kota";
        String str2 ="Ala ma kota";
        String str3 ="Kot ma Ale";
        System.out.println("Porównanie \""+str1+"\" z \""+ str2+"\"");
        System.out.println(str1.compareTo( str2 ));
        System.out.println("Porównanie \""+str1+"\" z \""+ str3+"\"");
        System.out.println(str1.compareTo( str3 ));
    System.out.println("\n============================"); 
    System.out.println("\nint campareToIgnoreCase(String str) - Jak wyżej + ignoruje wielkość znaków");
        String str4="ALA MA KOTA";
        System.out.println("Porównanie \""+str1+"\" z \""+ str2+"\"");
        System.out.println(str1.compareToIgnoreCase( str2 ));
        System.out.println("Porównanie \""+str1+"\" z \""+ str3+"\"");
        System.out.println(str1.compareToIgnoreCase( str3 ));
        System.out.println("Porównanie \""+str1+"\" z \""+ str4+"\"");
        System.out.println(str1.compareToIgnoreCase( str4 ));
    System.out.println("\n============================"); 
    System.out.println("\nint indexOf(int i) - ??? ");
    System.out.println("\n============================"); 
    
    System.out.println("\nint indexOf(String str) - Zwraca indeks wyszukiwanego ciągu znaków");
        String tekst = "Tekst";
        System.out.println("Index elementu t: " + tekst.indexOf("kst"));
    System.out.println("\n============================");     
    System.out.println("\nint lastIndexOf(int i) - ???");

    System.out.println("\n============================"); 
    System.out.println("\nint lastIndexOf(String str) - Zwraca ostatni indeks podciągu ciągu");
        tekst="ala";
        System.out.println(""+tekst.lastIndexOf("a"));
        
    System.out.println("\n============================");     
    System.out.println("\nString substring(int startString) - Zwraca łańcuch znaków począwszy od indeksu=4");
        tekst ="Ala ma kota a kot ma ale";
        System.out.println("Przed:"+tekst);
        System.out.println("Po:" + tekst.substring(14));
        
    System.out.println("\n============================");     
    System.out.println("\nString substring(int startString, int stopString) - Zwraca łańcuch znaków od indeksu=4 do indeksu=10");
        tekst="Kocham programować w javie  a nadewszystko siebie :D";
        System.out.println("Przed:"+tekst);
        System.out.println("Po:" + tekst.substring(0,7) + tekst.substring(30, tekst.length()));
        
    System.out.println("\n============================");     
    System.out.println("\nString replace(char orginal, char zamiennik) - Zamienia wszystkie znaki w stringu");
        tekst = "lufa";
        System.out.println("Przed:"+tekst);
        System.out.println("Wynik: " + tekst.replace("l","p"));
        
    System.out.println("\n============================"); 
    System.out.println("\nString trim() - Usuwa białe znaki z poczatku i końca");
        tekst = "    P a n d     a 5 ; - ;        ";
        System.out.println("Przed:"+tekst);
        System.out.println("Po:" + tekst.trim());
        
    System.out.println("\n============================"); 
    System.out.println("\nString toLowerCase() - Zamienia litery z dużych na małe");
        tekst ="WYŁĄCZ TEGO CAPSLOCK'A!";
        System.out.println("Przed:"+tekst);
        System.out.println("Po:" + tekst.toLowerCase());
        
    System.out.println("\n============================"); 
    System.out.println("\nString toUpperCase() - Zamienia litery z małych na duże");
        tekst ="jak chcesz krzzyczeć w internecie to włącz capslock'a";
        System.out.println("Przed:"+tekst);
        System.out.println("Po:" + tekst.toUpperCase());
        
    System.out.println("\n============================"); 
    System.out.println("\nString[] split(String regex, int limit) - Dzieli tekst w miejscu wskazanym przez 1 parametr\n w tym przypadku na 2 części");
        tekst = "rain-deszcz-kupa";
        String[] czesci = tekst.split("-",2);
        System.out.println("Przed:"+tekst);
        System.out.println("Po:");
        System.out.println("Część1:"+czesci[0]);
        System.out.println("Część2:"+czesci[1]);
        
    System.out.println("\n============================"); 
    System.out.println("\nString[] split(String regex) - Tak jak wyżej tyle że bez ograniczenia");
        tekst = "rain-deszcz-kupa";
        czesci = tekst.split("-");
        System.out.println("Przed:"+tekst);
        System.out.println("Po:");
        System.out.println("Część1:"+czesci[0]);
        System.out.println("Część2:"+czesci[1]);
        System.out.println("Część3:"+czesci[2]);

    
    System.out.println("\n===========ZAD3.3===========");  
     
    System.out.println("Podstawa 2, wykładnik 9 = "+Funkcje.pow(2,9));
    
    
    System.out.println("\n===========ZAD3.4===========");  
     
    System.out.println("fibi(0) = "+Funkcje.fib(0));
    System.out.println("fibi(1) = "+Funkcje.fib(1));
    System.out.println("fibi(2) = "+Funkcje.fib(2));
    System.out.println("fibi(10) = "+Funkcje.fib(10));
    } 



}
