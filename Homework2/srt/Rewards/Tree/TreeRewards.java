package srt.Rewards.Tree;

import srt.Abstractions.IGameItem;

public class TreeRewards implements IGameItem{
    /**
     * открывать и возвращать содержимое сундука
     *
     * return
     */
    @Override
    public String open() {
        return "Tree";
    }
    
}
