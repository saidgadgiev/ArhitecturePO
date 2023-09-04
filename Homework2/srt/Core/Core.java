package srt.Core;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import srt.Abstractions.ItemGenerator;
import srt.Rewards.Gold.GoldGenerator;
import srt.Rewards.Ruby.RubyGenerator;
import srt.Rewards.Silver.SilverGenerator;
import srt.Rewards.Tree.TreeGenerator;

public class Core {
    private Random rnd = new Random();
    /**
     * Логика игры
     */
    public void run(){
        List<ItemGenerator> generatorList = new ArrayList<>();
        generatorList.add(new GoldGenerator());
        generatorList.add(new SilverGenerator());
        generatorList.add(new RubyGenerator());
        generatorList.add(new TreeGenerator());
        ItemGenerator myGenerator = generatorList.get(rnd.nextInt(0,generatorList.size()));

        System.out.println(myGenerator.openReward());
    }
}
