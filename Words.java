import java.util.*;

public class Words {
    private String inputWord;
    private String outputWord;
    

    public void sorted(){
        Map<String, String> words = new HashMap<>();
        HashSet<String> alfawords  = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int antallOrd = sc.nextInt();

        for (int i = 0; i < antallOrd; i++) {
            inputWord = sc.next();
            outputWord = SortWords.sortString(inputWord);
            words.put(inputWord, outputWord);
            alfawords.add(outputWord);
        }

        if (alfawords.size() == words.size()){
            System.out.println("no dupes");
        }else {
            System.out.println("dupes");
        }
        words.forEach((inputWord, outputWord) ->System.out.println(inputWord + " " + outputWord)) ;
    }
}
