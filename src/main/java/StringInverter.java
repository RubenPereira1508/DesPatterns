

public class StringInverter implements StringTransformer{

    @Override
    public void execute(StringDrink drink) {
        String str = drink.getText();
        String reversed = "";
        for(int i=str.length()-1;i>=0;i--){
            reversed += str.charAt(i);
        }

        drink.setText(reversed);
    }


}
