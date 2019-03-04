package 建造者模式.通用代码;

/**
 * 导演类
 *
 * 导演类起到封装的作用，避免高层模块深入到建造者内部的实现类。当然，在建造者模
 * 式比较庞大时，导演类可以有多个
 */
public class Director {
    private Builder builder = new ConcreteProduct();
    //构建不同的产品
    public Product getAProduct(){
        builder.setPart();
        /*
         * 设置不同的零件，产生不同的产品
         */
        return builder.buildProduct();
    }
}
