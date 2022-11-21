package week4.d221121.mission1_6;

public class GenericPrinter<T extends Material> {
    private T material;


    public void setMaterial(T material){
        this.material = material;
    }

    public T getMaterial(){
        return this.material;
    }

    @Override
    public String toString() {
        return "재료는 "+material.showIngredient()+"입니다.";
    }

}
