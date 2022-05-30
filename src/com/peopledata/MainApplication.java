package com.peopledata;

public class MainApplication extends GetAllData{
    private static MainApplication main = new MainApplication();
    public static void main(String[] args) {
        WestBengalPeople gopi = new WestBengalPeople("India",123,"West Bengal",4321,"etc","Gopi Bhowmick",22,"Post Graduation","Etc Bhowmick","Etc Bhowmick",20000,70026);
        main.getAllData(gopi);
        BangalorePeople suman = new BangalorePeople("India",123,"Bangalore",4321,"etc","Suman  Nayak",21,"Post Graduation","Etc Nayak","Etc Nayak",30000,70036);
        main.getAllData(suman);
    }
}
