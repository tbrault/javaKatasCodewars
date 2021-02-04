package stringskatas;

/*ce kata consiste à creer une methode 
 * comptant le nombre de voyelles 
 * dans une chaine de caractere*/
public class VowelCount {

	//Supprime les consonnes et renvoie la longueur de la nouvelle chaine
	public static int getCount(String stringToReplace) {
        return stringToReplace.replaceAll("(?i)[^aeiou]", "").length();
    }
}
