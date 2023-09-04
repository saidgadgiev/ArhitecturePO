package srt.Rewards.Tree;

import srt.Abstractions.IGameItem;
import srt.Abstractions.ItemGenerator;

public class TreeGenerator extends ItemGenerator{
    /**
     * Метод создания экземпляра продукта
     *
     * return экземпляр продукта
     */
    @Override
    public IGameItem createItem() {
        return new TreeRewards();
    }
    
}
