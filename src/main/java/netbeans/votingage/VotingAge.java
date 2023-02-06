
package netbeans.votingage;

/**
 *
 * @author halfrikan
 */
public class VotingAge {

    public static void main(String[] args) {
        int age = 19;
        String results = "";
        
        results = (age >= 18) ? "You can vote!" : "You can not vote yet";
        System.out.println(results);
    }
}
