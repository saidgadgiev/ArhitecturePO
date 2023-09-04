package srt.Rewards.Ruby;

import srt.Abstractions.IGameItem;

public class RubyRewards implements IGameItem {
    /**
     * открывать и возвращать содержимое сундука
     *
     * return
     */
    @Override
    public String open() {
        return "Ruby";
    }
    
}
