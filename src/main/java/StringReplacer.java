public class StringReplacer implements StringTransformer{
      char a;
      char b;

    StringReplacer(char a1,char  b2){
        a=a1;
        b=b2;
    }

    @Override
    public void execute(StringDrink drink) {
        String str = drink.getText();
         String replaced = str.replace(a,b);


        drink.setText(replaced);
    }
}
