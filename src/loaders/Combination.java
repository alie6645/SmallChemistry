package loaders;

public class Combination {
    private String material1;
    private String material2;
    private String product;

    public Combination(String material1, String material2, String product) {
        this.material1 = material1;
        this.material2 = material2;
        this.product = product;
    }

    public boolean check(String mat1, String mat2){
        if (mat1.equalsIgnoreCase(material1)&&mat2.equalsIgnoreCase(material2)){
            return true;
        }
        if (mat2.equalsIgnoreCase(material1)&&mat1.equalsIgnoreCase(material2)){
            return true;
        }
        return false;
    }
}
