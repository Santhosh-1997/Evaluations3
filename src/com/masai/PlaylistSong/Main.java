package com.masai.PlaylistSong;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i = 1;

        ArrayList<Song> user = new ArrayList<>();

        while(true){

            System.out.println("Enter song " + i++);

            System.out.println("Enter song Name");
            String song = input.nextLine();

            //input.nextLine();

            System.out.println("Enter movie name");
            String movie = input.nextLine();

            //input.nextLine();

            //PlayList pl = new PlayList();

            user.add(new Song(movie,song));
            //pl.addSong(new Song(movie,song));

            if(i==5)
                break;

        }

        PlayList pl = new PlayList();
        for(Song el:user){
            pl.addSong(el);
        }

    }
}
