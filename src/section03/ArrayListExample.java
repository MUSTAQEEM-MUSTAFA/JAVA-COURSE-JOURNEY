package section03;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();

        nameList.add("MUSTAQEEM");
        nameList.add("MUSTAFA");
        nameList.add("ABRAR");
        nameList.add("OWAIS");
        nameList.add("HASNAIN");

//        for (int i = 0; i < nameList.size(); i++) {
//            System.out.println(nameList.get(i));
//        }

        for (String name : nameList) {
            System.out.println(name);
        }
    }

}
