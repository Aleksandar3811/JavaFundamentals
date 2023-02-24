package objectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class songs_04 {
    static class Song {
        String typeList;
        String name;
        String time;

        public Song(String typeList, String name, String time) {
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }

        public String getName() {
            return this.name;
        }

        public String getTypeList() {
            return this.typeList;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberSongs = Integer.parseInt(scanner.nextLine());
        List<Song> songList = new ArrayList<>();
        for (int i = 1; i <= numberSongs; i++) {
            String input = scanner.nextLine();
            String[] inputSongArr = input.split("_");
            String typeListInput = inputSongArr[0];
            String nameInput = inputSongArr[1];
            String timeInput = inputSongArr[2];
            Song currentSong = new Song(typeListInput, nameInput, timeInput);
            songList.add(currentSong);
        }
        String command = scanner.nextLine();
        if (command.equals("all")) {
            for (Song song : songList) {
                System.out.println(song.getName());
            }
        } else {
            for (Song song : songList) {
                if (song.getTypeList().equals(command)) {

                    System.out.println(song.getName());
                }
            }
        }
    }
}
