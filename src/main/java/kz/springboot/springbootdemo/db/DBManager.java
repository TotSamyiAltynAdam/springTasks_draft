package kz.springboot.springbootdemo.db;

import java.util.ArrayList;

public class DBManager {
    private static ArrayList<Items> items = new ArrayList<>();
    static {
        items.add(new Items(1L,"IPhone 11 PRO","8 GB RAM, 256 GB SSD, Intel Core i7",400000));
        items.add(new Items(2L,"Samsung Galaxy A71","8 GB RAM, 256 GB SSD, Intel Core i7",175000));
        items.add(new Items(3L,"XIAOMI REDMI Note 9","8 GB RAM, 256 GB SSD, Intel Core i7",120000));
        items.add(new Items(4L,"Nokia 3110","8 GB RAM, 256 GB SSD, Intel Core i7",15000));
    }
    private static Long id = 5L;
    public static ArrayList<Items> getItems(){
        return items;
    }
    public static void addItem(Items item){
        item.setId(id);
        items.add(item);
        id++;
    }
    public static Items getItem(Long id){
        for(Items it: items){
            if(it.getId().equals(id)) return it;
        }
        return null;
    }
}
