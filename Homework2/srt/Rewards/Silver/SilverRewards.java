package srt.Rewards.Silver;

import srt.Abstractions.IGameItem;

public class SilverRewards implements IGameItem{
    /**
     * открывать и возвращать содержимое сундука
     *
     * return
     */
    @Override
    public String open() {
        return "Silver";
    }
    
}
