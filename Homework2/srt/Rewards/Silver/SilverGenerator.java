package srt.Rewards.Silver;

import srt.Abstractions.IGameItem;
import srt.Abstractions.ItemGenerator;

public class SilverGenerator extends ItemGenerator{
    /**
     * Метод создания экземпляра продукта
     *
     * return экземпляр продукта
     */
    @Override
    public IGameItem createItem() {
        return new SilverRewards();
    }

    
}
