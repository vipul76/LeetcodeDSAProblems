package streams_interview;

import java.util.List;
import java.util.stream.Collectors;

public class CricketTeam {
    public static void main(String[] args) {
        //cricketTeam.
        List<String> playerName = List.of("Sachin Tendulkar",
                "Gautam Gambhir",
                "Ricky Ponting",
                "Shahid Afridi",
                "MS Dhoni");
        CricketTeam cricketTeam = new CricketTeam();
        List<String> result = cricketTeam.sortPlayerName(playerName);
        result.forEach(System.out::println);
    }

    private List<String> sortPlayerName(List<String> playerName) {
        return playerName.stream().sorted((name1,name2)->{
            String lastName1 = name1.substring(name1.lastIndexOf(' ')+1);
            String lastName2 = name2.substring(name2.lastIndexOf(' ')+1);
            return lastName1.compareTo(lastName2);
        }).collect(Collectors.toList());
    }
}
