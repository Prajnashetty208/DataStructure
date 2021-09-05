package collections.maps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapColl {
    public static void main(String[] args){
        List<Hosting> list = new ArrayList<>();
        list.add(new Hosting(1, "liquidweb.com", 80000));
        list.add(new Hosting(2, "linode.com", 90000));
        list.add(new Hosting(3, "digitalocean.com", 120000));
        list.add(new Hosting(4, "aws.amazon.com", 200000));
        list.add(new Hosting(5, "mkyong.com", 1));

        Map<Integer, String> result1 = new HashMap<>();

        for(Hosting h : list){

        }

        Map<Integer, String> result2 = list.stream()
                .collect(Collectors
                        .toMap(Hosting::getId, Hosting::getName));

        System.out.println(result2);

    }

}

class Hosting {

    private int Id;
    private String name;
    private long websites;

    public Hosting(int id, String name, long websites) {
        Id = id;
        this.name = name;
        this.websites = websites;
    }

    public int getId() {
        return this.Id;
    }

    public String getName() {
        return this.name;
    }

    //getters, setters and toString()
}


