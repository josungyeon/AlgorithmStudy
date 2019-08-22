package codility;

import java.util.*;

/**
 *
 * Created by sungyeonjo on 2019. 8. 21..
 */
public class WooWaTest2 {
    String[] musicList = {".mp3", ".acc", ".flac"};
    String[] imageList = {".jpg", ".bmp", ".gif"};
    String[] movieList = {".mp4", ".avi", ".mkv"};

    public String solution(String S) {
        String result = "";

        String[] receiveList = S.split("\n");
        int musicSize = 0;
        int imageSize = 0;
        int movieSize = 0;
        int otherSize = 0;
        for (int i = 0; i < receiveList.length; i++) {
            String[] typeAndByte = receiveList[i].split(" ");
            Integer size = Integer.parseInt(typeAndByte[1].substring(0, typeAndByte[1].length() - 1));

            if (Arrays.asList(musicList).contains(extractPostfix(typeAndByte[0]))) {
                musicSize += size;
            } else if (Arrays.asList(imageList).contains(extractPostfix(typeAndByte[0]))) {
                imageSize += size;
            } else if (Arrays.asList(movieList).contains(extractPostfix(typeAndByte[0]))) {
                movieSize += size;
            } else {
                otherSize += size;
            }
        }

        result += "music " + musicSize + "b\n";
        result += "images " + imageSize + "b\n";
        result += "movies " + movieSize + "b\n";
        result += "other "  + otherSize + "b";

        return result;
    }

    private static String extractPostfix(String str) {
        return str.substring(str.lastIndexOf("."));
    }
}
