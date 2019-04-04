package cn.mwxu.strategyPattern.bestPractice;

/**
 * 富士康生产车间
 */
public class FoxconnProducer {

    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void toProduce(){
        strategy.printBrand();
    }
}
