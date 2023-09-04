package srt.Rewards.Gold;

import srt.Abstractions.IGameItem;
import srt.Abstractions.ItemGenerator;

public class GoldGenerator extends ItemGenerator {
    /**
     * Метод создания экземпляра продукта
     *
     * return экземпляр продукта
     */
    @Override
    public IGameItem createItem() {
        return new GoldRewards();
    }
}