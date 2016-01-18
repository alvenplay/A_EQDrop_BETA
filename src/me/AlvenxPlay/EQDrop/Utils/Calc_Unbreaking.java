package me.AlvenxPlay.EQDrop.Utils;

import java.util.Random;

public class Calc_Unbreaking {
    public static int Calc(int level) {
        int percentage = (100/(level + 1));
        int chance = new Random().nextInt(100);
        if(percentage > chance) {
            return 0;
        }else {
            return 1;
        }
    }
}
