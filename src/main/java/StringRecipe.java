import java.util.ArrayList;
import java.util.List;

public class StringRecipe implements StringTransformer{

    List<StringTransformer> transformers1 = new ArrayList<>();


    StringRecipe(List<StringTransformer> transformers){
    transformers1 = transformers;

    }

    public void mix(StringDrink drink) {
        for (StringTransformer stringTransformer : transformers1) {
            stringTransformer.execute(drink);
        }
    }

    @Override
    public void execute(StringDrink drink) {
    }
}
