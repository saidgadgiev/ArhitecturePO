package srt.Rewards.Ruby;

import srt.Abstractions.IGameItem;
import srt.Abstractions.ItemGenerator;

public class RubyGenerator extends ItemGenerator{
    /**
     * Метод создания экземпляра продукта
     *
     * return экземпляр продукта
     */
    @Override
    public IGameItem createItem() {
        return new RubyRewards();
    }
    
}
